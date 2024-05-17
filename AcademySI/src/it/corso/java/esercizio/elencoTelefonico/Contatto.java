package it.corso.java.esercizio.elencoTelefonico;

/**
 * Classe Contatto: costruisce di un contatto in riferimento a una persona.
 */

public class Contatto {
    private String nomeContatto;
    private String numeroTelefono;
    private String etichetta;
    
    /**
     * @param nomeContatto Nominativo del contatto della persona
     * @param numerotelefonico Numero telefonico della persona
     * @param etichetta Etichetta che ci dice la tipologia di contatto: personale o lavorativo
     */
    public Contatto(String nome, String numeroTelefono, String etichetta) {
        this.nomeContatto = nome;
        this.numeroTelefono = numeroTelefono;
        this.etichetta = etichetta;
    }

	public String getNomeContatto() {
		return nomeContatto;
	}

	public void setNomeContatto(String nomeContatto) {
		this.nomeContatto = nomeContatto;
	}

	public String getNumeroTelefono() {
		return numeroTelefono;
	}

	public void setNumeroTelefono(String numeroTelefono) {
		this.numeroTelefono = numeroTelefono;
	}

	public String getEtichetta() {
		return etichetta;
	}

	public void setEtichetta(String etichetta) {
		this.etichetta = etichetta;
	}
    
}