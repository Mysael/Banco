package br.com.cesed.banco.contatos;

public class Endereco {
	private String rua;
	private int numero;
	private String bairro;
	private String cidade;
	private String país;
	private String cep;
	
	public Endereco(String rua, int numero, String bairro, String cidade, String país, String cep) {
		super();
		this.rua = rua;
		this.numero = numero;
		this.bairro = bairro;
		this.cidade = cidade;
		this.país = país;
		this.cep = cep;
	}
	
	public String getRua() {
		return rua;
	}
	
	public void setRua(String rua) {
		this.rua = rua;
	}
	
	public int getNumero() {
		return numero;
	}
	
	public void setNumero(int numero) {
		this.numero = numero;
	}
	
	public String getBairro() {
		return bairro;
	}
	
	public void setBairro(String bairro) {
		this.bairro = bairro;
	}
	
	public String getCidade() {
		return cidade;
	}
	
	public void setCidade(String cidade) {
		this.cidade = cidade;
	}
	
	public String getPaís() {
		return país;
	}
	
	public void setPaís(String país) {
		this.país = país;
	}
	
	public String getCep() {
		return cep;
	}
	
	public void setCep(String cep) {
		this.cep = cep;
	}

	@Override
	public String toString() {
		return "Endereco [rua=" + rua + ", numero=" + numero + ", bairro=" + bairro + ", cidade=" + cidade + ", país="
				+ país + ", cep=" + cep + "]";
	}


	
	

}
