package it.esercizio.negozio;

/**
 * La classe Prodotto rappresenta un prodotto in un inventario.
 */

/* Crea un sistema per il controllo delle scorte di un negozio. Introduci l'ereditarietà con una classe base Prodotto e due classi 
 * derivate ProdottoAlimentare e Prodotto Elettrico. Ogni prodotto ha un codice unico, una descrizione, la quantità disponibile
 * e il prezzo unitario. ProdottoAlimentare tiene traccia della data di scadenza, mentre ProdottoElettrico tiene traccia 
 * dellagaranzia in mesi. Implementa operazioni come l'aggiunta di nuovi prodotti, la modifica della quantità disponibile, 
 * la visualizzazione dell'elenco dei prodotti e la rimozione di un prodotto in base al codice*/

public class Prodotto {

	private String codice;
	private String descrizione;
	private int quantita;
	private double prezzo;

	/**
	 * Costruttore della classe Prodotto.
	 * 
	 * @param codice      Il codice del prodotto
	 * @param descrizione La descrizione del prodotto
	 * @param quantita    La quantità disponibile del prodotto
	 * @param prezzo      Il prezzo del prodotto
	 */
	public Prodotto(String codice, String descrizione, int quantita, double prezzo) {
		this.codice = codice;
		this.descrizione = descrizione;
		this.quantita = quantita;
		this.prezzo = prezzo;
	}

	/**
	 * Restituisce il codice del prodotto.
	 * 
	 * @return Il codice del prodotto
	 */
	public String getCodice() {
		return codice;
	}

	/**
	 * Imposta il codice del prodotto.
	 * 
	 * @param codice Il codice del prodotto da impostare
	 */
	public void setId(String codice) {
		this.codice = codice;
	}

	/**
	 * Restituisce la descrizione del prodotto.
	 * 
	 * @return La descrizione del prodotto
	 */
	public String getDescrizione() {
		return descrizione;
	}

	/**
	 * Imposta la descrizione del prodotto.
	 * 
	 * @param descrizione La descrizione del prodotto da impostare
	 */
	public void setDescrizione(String descrizione) {
		this.descrizione = descrizione;
	}

	/**
	 * Restituisce la quantità disponibile del prodotto.
	 * 
	 * @return La quantità disponibile del prodotto
	 */
	public int getQuantita() {
		return quantita;
	}

	/**
	 * Imposta la quantità disponibile del prodotto.
	 * 
	 * @param quantita La quantità disponibile del prodotto da impostare
	 */
	public void setQuantita(int quantita) {
		this.quantita = quantita;
	}

	/**
	 * Restituisce il prezzo del prodotto.
	 * 
	 * @return Il prezzo del prodotto
	 */
	public double getPrezzo() {
		return prezzo;
	}

	/**
	 * Imposta il prezzo del prodotto.
	 * 
	 * @param prezzo Il prezzo del prodotto da impostare
	 */
	public void setPrezzo(double prezzo) {
		this.prezzo = prezzo;
	}

}
