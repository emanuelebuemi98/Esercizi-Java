package it.esercizio.negozio;

/**
 * La classe ProdottoElettronico rappresenta un prodotto elettronico in un
 * inventario.
 */

public class ProdottoElettronico extends Prodotto {

	private int garanziaMesi;

	/**
	 * Costruttore della classe ProdottoElettronico.
	 * 
	 * @param codice       Il codice del prodotto
	 * @param descrizione  La descrizione del prodotto
	 * @param quantita     La quantità disponibile del prodotto
	 * @param prezzo       Il prezzo del prodotto
	 * @param garanziaMesi Il numero di mesi di garanzia del prodotto elettronico
	 */
	public ProdottoElettronico(String codice, String descrizione, int quantita, double prezzo, int garanziaMesi) {
		super(codice, descrizione, quantita, prezzo);
		this.garanziaMesi = garanziaMesi;
	}

	/**
	 * Restituisce il numero di mesi di garanzia del prodotto elettronico.
	 * 
	 * @return Il numero di mesi di garanzia
	 */
	public int getGaranziaMesi() {
		return garanziaMesi;
	}

	/**
	 * Imposta il numero di mesi di garanzia del prodotto elettronico.
	 * 
	 * @param garanziaMesi Il numero di mesi di garanzia da impostare
	 */
	public void setGaranziaMesi(int garanziaMesi) {
		this.garanziaMesi = garanziaMesi;
	}

}
