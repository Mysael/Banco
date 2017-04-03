package br.com.cesed.banco.conta;
import br.com.cesed.banco.pessoa.*;
import java.util.Scanner;


public class Conta {
	private int numero;
	private double saldo;
	private Pessoas usuario;
	
	
	public Conta(int numero, double saldo, Pessoas usuario) {
		super();
		this.numero = numero;
		this.saldo = saldo;
		this.usuario = usuario;
	}
	
	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		
		this.numero = numero;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public Pessoas getUsuario() {
		return usuario;
	}

	public void setUsuario(Pessoas usuario) {
		this.usuario = usuario;
	}
	
	
}
