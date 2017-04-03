package br.com.cesed.banco.pessoa;

import br.com.cesed.banco.contatos.*;

public class Pessoas {

	private String nome;
	private int idade;
	private String cpf;
	private Endereco endereco;
	private ContatoPessoal contato;

	public Pessoas(String nome, int idade, String cpf, Endereco endereco, ContatoPessoal contato) {
		super();
		this.nome = nome;
		this.idade = idade;
		this.cpf = cpf;
		this.endereco = endereco;
		this.contato = contato;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		if (validaCPF(cpf) == true) {
			this.cpf = cpf;
			formataCPF();
		}
	}

	public Endereco getEndereco() {
		return endereco;
	}

	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}

	public ContatoPessoal getContato() {
		return contato;
	}

	public void setContato(ContatoPessoal contato) {
		this.contato = contato;
	}

	public boolean validaCPF(String cpf) {
		if (cpf.length() != 11) {
			return false;
		} else
			return true;
	}
	public void formataCPF(){
		cpf = (cpf.charAt(0)+""+cpf.charAt(1)+cpf.charAt(2)+"."+cpf.charAt(3)+""+
				cpf.charAt(4)+""+cpf.charAt(5)+"."+cpf.charAt(6)+""+cpf.charAt(7)+""+cpf.charAt(8)+"-"
				+cpf.charAt(9)+""+cpf.charAt(10));
	}

	@Override
	public String toString() {
		return "Pessoas [nome=" + nome + ", idade=" + idade + ", cpf=" + cpf + ", endereco=" + endereco.toString() + ", contato="
				+ contato.toString() + "]";
	}
	
	
	
}
