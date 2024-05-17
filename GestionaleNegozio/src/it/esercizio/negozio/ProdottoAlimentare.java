package it.esercizio.negozio;

import java.util.Date;

/**
 * La classe ProdottoAlimentare rappresenta un prodotto alimentare in un
 * inventario.
 */

public class ProdottoAlimentare extends Prodotto {

	private Date dataScadenza;

	/**
	 * Costruttore della classe ProdottoAlimentare.
	 * 
	 * @param codice       Il codice del prodotto
	 * @param descrizione  La descrizione del prodotto
	 * @param quantita     La quantità disponibile del prodotto
	 * @param prezzo       Il prezzo del prodotto
	 * @param dataScadenza La data di scadenza del prodotto alimentare
	 */
	public ProdottoAlimentare(String codice, String descrizione, int quantita, double prezzo, Date dataScadenza) {
		super(codice, descrizione, quantita, prezzo);
		this.dataScadenza = dataScadenza;
	}

	/**
	 * Restituisce la data di scadenza del prodotto alimentare.
	 * 
	 * @return La data di scadenza del prodotto alimentare
	 */
	public Date getDataScadenza() {
		return dataScadenza;
	}

	/**
	 * Imposta la data di scadenza del prodotto alimentare.
	 * 
	 * @param dataScadenza La data di scadenza del prodotto alimentare da impostare
	 */
	public void setDataScadenza(Date dataScadenza) {
		this.dataScadenza = dataScadenza;
	}

}
