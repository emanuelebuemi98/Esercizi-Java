package it.corso.java.esercizio.elencoTelefonico;

/**
 * Classe ContattoLavoro: rappresenta un contatto di lavoro.
 */

public class ContattoLavoro  extends Contatto {
	
    private String posizioneLavorativa;

    /**
     * @param nomeContatto Nominativo del contatto della persona
     * @param numerotelefonico Numero telefonico della persona
     * @param etichetta Etichetta che ci dice la tipologia di contatto: personale o lavorativo
     * @param posizioneLavorativa Posizione lavorativa della persona
     */
    public ContattoLavoro(String nome, String numeroTelefono, String etichetta, String posizioneLavorativa) {
        super(nome, numeroTelefono, etichetta);
        this.posizioneLavorativa = posizioneLavorativa;
    }

    /**
     * @return getPosizioneLavorativa Metodo getter per accedere alla variabile di istanza posizione lavorativa
     */
	public String getPosizioneLavorativa() {
		return posizioneLavorativa;
	}

	 /**
     * @param setPosizioneLavorativa Metodo setter per settare un valore alla variabile di istanza posizione lavorativa
     */
	public void setPosizioneLavorativa(String posizioneLavorativa) {
		this.posizioneLavorativa = posizioneLavorativa;
	}
}

