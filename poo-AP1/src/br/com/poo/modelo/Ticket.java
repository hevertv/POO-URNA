package br.com.poo.modelo;

//CLASS
public class Ticket {
	// ATTRIBUTES
	private int cont;
	private Show show;
	private double preco;

	// CONSTRUCTOR
	public Ticket(Show show, double preco) {
		this.show = show;
		this.preco = preco;
	}

	// GETTERS

	public Show getShow() {
		return show;
	}

	public int getCont() {
		return cont;
	}

	public double getPreco() {
		return preco;
	}

	// SETTERS
	public void setShow(Show show) {
		this.show = show;
	}

	public void setCont(int cont) {
		this.cont = cont;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}

	// METHODS

	public void adicionar(int quantidade) {
		if (cont + quantidade > show.getCampo().getCapacidade()) {
			throw new IllegalArgumentException("Os ingressos excederiam a capacidade.");
		} else {
			cont = cont + quantidade;
		}
	}
	
	public String toString() {
		return show + "Valor do Ingresso: R$" + preco;
	}
}
