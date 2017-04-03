package br.com.cesed.banco.contatos;

public class ContatoPessoal {
	private String email;
	private String numero;
	
	
	
	public String getEmail() {
		return email;
	}
	
	public void setEmail(String email) {
		this.email = email;
	}
	
	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	public ContatoPessoal(String email, String numero) {
		super();
		this.email = email;
		this.numero = numero;
	}

	@Override
	public String toString() {
		return "ContatoPessoal [email=" + email + ", numero=" + numero + "]";
	}
	

}
