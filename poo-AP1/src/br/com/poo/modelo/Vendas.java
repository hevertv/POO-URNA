package br.com.poo.modelo;

import java.util.ArrayList;

//CLASS
public class Vendas {

	// ATRIBUTTES
	private Bilheteria bilheteria;
	private ArrayList<Pacote> pacotes;

	// CONSTRUCTOR
	public Vendas(Bilheteria bilheteria) {
		pacotes = new ArrayList<Pacote>();
		this.bilheteria = bilheteria;

	}

	// METHODS
	public void addTicket(Ticket ticket) {
		addTickets(ticket, 1);
	}

	public void addTickets(Ticket ticket, int quantidade) {
		ticket.adicionar(quantidade);
		pacotes.add(new Pacote(quantidade, ticket));
	}

	public ArrayList<Pacote> compra(double dinheiro) {
		if (dinheiro < custo()) {
			throw new IllegalArgumentException("DINHEIRO INSULFICIENTE");
		}
		return pacotes;
	}

	public double custo() {
		double custo = 0.0;
		for (Pacote pacote : pacotes) {
			custo = custo + pacote.custo();
		}
		return custo;
	}

}
