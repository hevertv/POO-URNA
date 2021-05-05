package br.com.poo;

import java.time.LocalDateTime;

import br.com.poo.modelo.Bilheteria;
import br.com.poo.modelo.Campo;
import br.com.poo.modelo.Localizacao;
import br.com.poo.modelo.Show;
import br.com.poo.modelo.Ticket;
import br.com.poo.modelo.Vendas;

public class MaquinaDeTickets {

	public static void main(String[] args) {

		// LOCAL DATAS
		Localizacao festival_verao = new Localizacao("Brazil -", "Bahia -", "Salvador -", "Nazare -",
				"Ladeira da Fonte das Pedras, ", 0);
		Localizacao rock_in_rio = new Localizacao("Brazil -", "Rio de Janeiro -", "Rio de Janeiro -",
				"Barra da Tijuca -", "Av. Salvador Allende, ", 6500);
		Localizacao sao_joao = new Localizacao("Brazil -", "Bahia -", "Irece -", "Centro -", "R. São Paulo, ", 66);

		// FIELD DATAS
		Campo arena_fonte_nova = new Campo(300, festival_verao);
		Campo parque_olimpico = new Campo(400, rock_in_rio);
		Campo praca_sj = new Campo(500, sao_joao);

		// TICKET DATAS
		Ticket muvuca = new Ticket(
				new Show("Pagodao Fest", LocalDateTime.of(2022, 2, 6, 17, 20), "Parangole", arena_fonte_nova), 170);
		Ticket master_of_puppets = new Ticket(
				new Show("Heavy Metal", LocalDateTime.of(2021, 9, 25, 20, 30), "Metallica", parque_olimpico), 250);
		Ticket juninas_party = new Ticket(
				new Show("Forrozin extourado", LocalDateTime.of(2021, 6, 23, 18, 30), "Mastruz com Leite", praca_sj),
				50);

		// TICKETS ADDED
		Bilheteria bilheteria = new Bilheteria();
		bilheteria.addTicket(muvuca);
		bilheteria.addTicket(master_of_puppets);
		bilheteria.addTicket(juninas_party);

		// SALE OF TICKET QUANTITIES 
		Vendas venda = new Vendas(bilheteria);
		venda.addTicket(juninas_party);
		venda.addTicket(muvuca);
		venda.addTickets(juninas_party, 2);

		// TOTAL PRICE 

		System.out.println("***********************************");
		System.out.println("*********                 *********");
		System.out.println("*********   BILHETERIA    *********");
		System.out.println("*********                 *********");
		System.out.println("***********************************");
		System.out.println(juninas_party.toString());
		System.out.println("***********************************");
		System.out.println(muvuca.toString());
		System.out.println("***********************************");
		System.out.println(master_of_puppets.toString());
		System.out.println("***********************************");
		System.out.println("\tVALOR TOTAL: R$" + venda.custo());
		System.out.println("***********************************");
		venda.compra(1000);

	}

}
