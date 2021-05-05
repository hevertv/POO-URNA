package br.com.poo.modelo;

import java.util.ArrayList;

//CLASS
public class Bilheteria {
	// ATRIBUTTE
	private ArrayList<Ticket> tickets;

	// CONSTRUCTOR
	public Bilheteria() {
		tickets = new ArrayList<Ticket>();
	}

	// METHOD
	public void addTicket(Ticket ticket) {
		tickets.add(ticket);
	}

}
