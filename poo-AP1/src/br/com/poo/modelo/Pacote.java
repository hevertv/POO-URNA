package br.com.poo.modelo;

//CLASS
public class Pacote {

	// ATRIBUTTES
	private int quantidade;
	private Ticket ticket;

	// CONSTRUCTORS
	public Pacote(Ticket ticket) {
		this.quantidade = 1;
		this.ticket = ticket;
	}

	public Pacote(int quantidade, Ticket ticket) {
		this.quantidade = quantidade;
		this.ticket = ticket;
	}

	// METHODS
	public double custo() {
		return ticket.getPreco() * quantidade;
	}

}
