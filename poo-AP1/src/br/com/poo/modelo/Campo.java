package br.com.poo.modelo;

//CLASS
public class Campo {
	// ATTRIBUTES
	private int capacidade;
	private Localizacao localizacao;

	// CONSTRUCTOR
	public Campo(int capacidade, Localizacao localizacao) {
		this.capacidade = capacidade;
		this.localizacao = localizacao;
	}

	// GETTER
	public int getCapacidade() {
		return capacidade;
	}

	public Localizacao getLocalizacao() {
		return localizacao;
	}

	// SETTER
	public void setCapacidade(int capacidade) {
		this.capacidade = capacidade;
	}

	public void setLocalizacao(Localizacao localizacao) {
		this.localizacao = localizacao;
	}
	//METODO toString
	public String toString() {
		return " Capacidade de " + capacidade + " Pessoas, " + localizacao;
	}

}
