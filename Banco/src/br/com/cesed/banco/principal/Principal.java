package br.com.cesed.banco.principal;
import br.com.cesed.banco.*;
import br.com.cesed.banco.conta.Conta;
import br.com.cesed.banco.conta.ContaPoupanca;
import br.com.cesed.banco.contatos.ContatoPessoal;
import br.com.cesed.banco.contatos.Endereco;
import br.com.cesed.banco.pessoa.Pessoas;


public class Principal {
	public static void main(String[] args) {
		
		Endereco enderecoPessoa01 = new Endereco("Antônio Borges da Costa", 240, "Centro", "João Pessoa", "Brasil", "58117-000");
		ContatoPessoal contatoPessoa01 = new ContatoPessoal("pessoa01Teste@gmail.com", "988295574");
		Pessoas pessoa01 = new Pessoas("João", 32, "111", enderecoPessoa01, contatoPessoa01);
		System.out.println(pessoa01.toString());
		ContaPoupanca conta01 = new ContaPoupanca(00122, 450, pessoa01);
		conta01.atualizaSaldo();
		
		
		
		
	}

}
