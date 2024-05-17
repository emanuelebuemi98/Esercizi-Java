package it.corso.java.esercizio.elencoTelefonico;

/**
 * Classe ContattoPersonale: rappresenta un contatto personale.
 */

public class ContattoPersonale extends Contatto {
	
    private String indirizzo;
    
	 /**
	 * @param nomeContatto Nominativo del contatto della persona
     * @param numerotelefonico Numero telefonico della persona
     * @param etichetta Etichetta che ci dice la tipologia di contatto: personale o lavorativo
     * @param indirizzo Indirizzo di casa della persona di riferimento
     */
    public ContattoPersonale(String nomeContatto, String numeroTelefono, String etichetta, String indirizzo) {
		super(nomeContatto, numeroTelefono, etichetta);
		this.indirizzo = indirizzo;
	}

    /**
     * @return getIndirizzo Metodo getter per accedere alla variabile di istanza indirizzo
     */
	public String getIndirizzo() {
		return indirizzo;
	}

	/**
     * @param setIndirizzo Metodo setter per settare un valore alla variabile di istanza indirizzo
     */
	public void setIndirizzo(String indirizzo) {
		this.indirizzo = indirizzo;
	}

}
