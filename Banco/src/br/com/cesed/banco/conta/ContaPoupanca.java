package br.com.cesed.banco.conta;
import br.com.cesed.banco.pessoa.Pessoas;
import java.time.LocalDate;
import java.time.Month;
import java.time.Period;

public class ContaPoupanca extends Conta{
	
	//private final double JUROS = 0.05;
	private final LocalDate criacao = LocalDate.now();
	private LocalDate agora;
	private int diferencaMeses;
	
	public LocalDate dataAtual(){
		agora = LocalDate.now();
		return agora;
	}
	
	public int getDiferencaMeses(){
		Period diferencaDatas = Period.between(agora, criacao);
		diferencaMeses = diferencaDatas.getMonths();
		return diferencaMeses;
	}
	public void atualizaSaldo(){
		int tempoInicial = 0;
		double saldoLocal = getSaldo();
		if (tempoInicial<diferencaMeses){
			saldoLocal = saldoLocal + (saldoLocal * 0.05);
			setSaldo(saldoLocal);
			tempoInicial ++;
		}
	}
	
	//private Period diferencaMeses = Period.between(criacao, this.criacao);

	public ContaPoupanca(int numero, double saldo, Pessoas usuario) {
		super(numero, saldo, usuario);
	}
	
}
