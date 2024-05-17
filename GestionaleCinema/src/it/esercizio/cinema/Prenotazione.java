package it.esercizio.cinema;

import java.util.Date;

/**
 * La classe Prenotazione rappresenta una prenotazione di posti al cinema.
 */

/* Crea un sistema di prenotazioni per un cinema. Introduci l'ereditarietà con una classe base Prenotazione e due classi derivate, 
 * PrenotazioneSingola e PrenotazioneGruppo . Ogni prenotazione ha un identificatore univoco, il nome del cliente e la data della 
 * prenotazione. PrenotazioneSingola tiene traccia del numero di posti prenotati, mentre PrenotazioneGruppo tiene traccia del numero 
 * totale di posti e del numero di adulti e bambini. Implementa operazioni come l'aggiunta di prenotazioni, la visualizzazione di 
 * tutte le prenotazioni per una data specifica e la cancellazione di una prenotazione in base all'identificatore*/

public class Prenotazione {

	private int id;
	private String nomeCliente;
	private Date dataPrenotazione;

	/**
	 * Costruttore della classe Prenotazione.
	 * 
	 * @param id               L'identificatore univoco della prenotazione
	 * @param nomeCliente      Il nome del cliente che ha effettuato la prenotazione
	 * @param dataPrenotazione La data della prenotazione
	 */
	public Prenotazione(int id, String nomeCliente, Date dataPrenotazione) {
		this.id = id;
		this.nomeCliente = nomeCliente;
		this.dataPrenotazione = dataPrenotazione;
	}

	/**
	 * Restituisce l'ID della prenotazione.
	 * 
	 * @return L'ID della prenotazione
	 */
	public int getId() {
		return id;
	}

	/**
	 * Imposta l'ID della prenotazione.
	 * 
	 * @param id L'ID della prenotazione da impostare
	 */
	public void setId(int id) {
		this.id = id;
	}

	/**
	 * Restituisce il nome del cliente che ha effettuato la prenotazione.
	 * 
	 * @return Il nome del cliente
	 */
	public String getNomeCliente() {
		return nomeCliente;
	}

	/**
	 * Imposta il nome del cliente che ha effettuato la prenotazione.
	 * 
	 * @param nomeCliente Il nome del cliente da impostare
	 */
	public void setNomeCliente(String nomeCliente) {
		this.nomeCliente = nomeCliente;
	}

	/**
	 * Restituisce la data della prenotazione.
	 * 
	 * @return La data della prenotazione
	 */
	public Date getDataPrenotazione() {
		return dataPrenotazione;
	}

	/**
	 * Imposta la data della prenotazione.
	 * 
	 * @param dataPrenotazione La data della prenotazione da impostare
	 */
	public void setDataPrenotazione(Date dataPrenotazione) {
		this.dataPrenotazione = dataPrenotazione;
	}

}
