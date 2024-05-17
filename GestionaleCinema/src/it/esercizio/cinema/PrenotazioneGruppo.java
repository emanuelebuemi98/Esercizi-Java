package it.esercizio.cinema;

import java.util.Date;

/**
 * La classe PrenotazioneGruppo rappresenta una prenotazione di un gruppo di
 * posti in un cinema.
 */

public class PrenotazioneGruppo extends Prenotazione {
	private int postiTotali;
	private int adulti;
	private int bambini;

	/**
	 * Costruttore della classe PrenotazioneGruppo.
	 * 
	 * @param id               L'identificatore univoco della prenotazione
	 * @param nomeCliente      Il nome del cliente che ha effettuato la prenotazione
	 * @param dataPrenotazione La data della prenotazione
	 * @param adulti           Il numero di adulti per quella prenotazione
	 * @param bambini          Il numero di bambini per quella prenotazione
	 */
	public PrenotazioneGruppo(int id, String nomeCliente, Date dataPrenotazione, int adulti, int bambini) {
		super(id, nomeCliente, dataPrenotazione);
		this.postiTotali = adulti + bambini;
		this.adulti = adulti;
		this.bambini = bambini;
	}

	/**
	 * Restituisce il numero totale di posti occupati dal cliente.
	 * 
	 * @return Il numero totale di posti occupati
	 */
	public int getPostiTotali() {
		return postiTotali;
	}

	/**
	 * Imposta il numero totale di posti occupati dal cliente.
	 * 
	 * @param postiTotali Il numero totale di posti occupati da impostare
	 */
	public void setPostiTotali(int postiTotali) {
		this.postiTotali = postiTotali;
	}

	/**
	 * Restituisce il numero di adulti per questa prenotazione.
	 * 
	 * @return Il numero di adulti
	 */
	public int getAdulti() {
		return adulti;
	}

	/**
	 * Imposta il numero di adulti per questa prenotazione.
	 * 
	 * @param adulti Il numero di adulti da impostare
	 */
	public void setAdulti(int adulti) {
		this.adulti = adulti;
	}

	/**
	 * Restituisce il numero di bambini per questa prenotazione.
	 * 
	 * @return Il numero di bambini
	 */
	public int getBambini() {
		return bambini;
	}

	/**
	 * Imposta il numero di bambini per questa prenotazione.
	 * 
	 * @param bambini Il numero di bambini da impostare
	 */
	public void setBambini(int bambini) {
		this.bambini = bambini;
	}

}
