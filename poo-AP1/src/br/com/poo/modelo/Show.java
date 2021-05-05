package br.com.poo.modelo;

import java.time.LocalDateTime;

//CLASS
public class Show {
	// ATTRIBUTES
	private String artista;
	private LocalDateTime dateTime;
	private String nome;
	private Campo campo;

	// CONSTRUCTOR
	public Show(String nome, LocalDateTime dateTime, String artista, Campo campo) {
		this.artista = artista;
		this.nome = nome;
		this.campo = campo;
		this.dateTime = dateTime;

	}

	// GETTERS
	public String getArtista() {
		return artista;
	}

	public LocalDateTime getDateTime() {
		return dateTime;
	}

	public String getNome() {
		return nome;
	}

	public Campo getCampo() {
		return campo;
	}

	// SETTERS
	public void setArtista(String artista) {
		this.artista = artista;
	}

	public void setDateTime(LocalDateTime dateTime) {
		this.dateTime = dateTime;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public void setCampo(Campo campo) {
		this.campo = campo;
	}
	
	//METHOD toString
	public String toString() {
		StringBuilder dados = new StringBuilder();
		dados.append("Nome: ");
		dados.append(nome);
		dados.append("\n");
		dados.append("Artista: ");
		dados.append(artista);
		dados.append("\n");
		dados.append("Campo: ");
		dados.append(campo);
		dados.append("\n");
		dados.append("Horario: ");
		dados.append(dateTime);
		dados.append("\n");
		return dados.toString();
	}
}
