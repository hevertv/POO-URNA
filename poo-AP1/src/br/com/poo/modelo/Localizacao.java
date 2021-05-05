package br.com.poo.modelo;

//CLASS
public class Localizacao {
	// ATTRIBUTES
	private String pais;
	private String estado;
	private String cidade;
	private String bairro;
	private String rua;
	private int numero;

	// CONSTRUCTOR
	public Localizacao(String pais, String estado, String cidade, String bairro, String rua, int numero) {
		this.pais = pais;
		this.estado = estado;
		this.cidade = cidade;
		this.bairro = bairro;
		this.rua = rua;
		this.numero = numero;
	}

	// GETTERS
	public String getPais() {
		return pais;
	}

	public String getEstado() {
		return estado;
	}

	public String getCidade() {
		return cidade;
	}

	public String getBairro() {
		return bairro;
	}

	public String getRua() {
		return rua;
	}

	public int getNumero() {
		return numero;
	}

	// SETTERS
	public void setPais(String pais) {
		this.pais = pais;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	public void setCidade(String cidade) {
		this.cidade = cidade;
	}

	public void setBairro(String bairro) {
		this.bairro = bairro;
	}

	public void setRua(String rua) {
		this.rua = rua;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	//METHOD toString
	@Override
	public String toString() {
		return pais + estado + cidade + bairro + rua + numero;
	}

}
