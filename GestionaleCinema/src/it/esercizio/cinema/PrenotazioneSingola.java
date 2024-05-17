package it.esercizio.cinema;

import java.util.Date;

/**
 * La classe PrenotazioneSingola rappresenta una prenotazione di un singolo
 * posto in un cinema.
 */
public class PrenotazioneSingola extends Prenotazione {

	private int numeroPosto;

	/**
	 * Costruttore della classe PrenotazioneSingola.
	 * 
	 * @param id               L'identificatore univoco della prenotazione
	 * @param nomeCliente      Il nome del cliente che ha effettuato la prenotazione
	 * @param dataPrenotazione La data della prenotazione
	 * @param numeroPosto      Il numero del posto assegnato al cliente
	 */
	public PrenotazioneSingola(int id, String nomeCliente, Date dataPrenotazione, int numeroPosto) {
		super(id, nomeCliente, dataPrenotazione);
		this.numeroPosto = numeroPosto;
	}

	/**
	 * Restituisce il numero del posto assegnato al cliente.
	 * 
	 * @return Il numero del posto assegnato al cliente
	 */
	public int getNumeroPosto() {
		return numeroPosto;
	}

	/**
	 * Imposta il numero del posto assegnato al cliente.
	 * 
	 * @param numeroPosto Il numero del posto da impostare
	 */
	public void setNumeroPosto(int numeroPosto) {
		this.numeroPosto = numeroPosto;
	}

}
