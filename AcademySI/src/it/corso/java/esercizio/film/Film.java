package it.corso.java.esercizio.film;

/*
 * 
NUM 1
Un film può essere caratterizzato dal titolo, il nome del regista, la lingua originale,
l'anno e la nazione di produzione. Scrivere una classe Film con gli opportuni costruttori
ed i metodi che restituiscono i valori delle variabili istanza.
Inoltre, definire un metodo per modificare il titolo di un film ed un metodo che restituisce 
una stringa che descrive un film
 * */

public class Film {
	private String titoloFilm;
	private String nomeRegista;
	private String linguaOriginale;
	private int annoUscita;
	private String nazioneProduzione;

	public Film(String titolo, String nome, String lingua, int anno, String nazione) {
		super();
		this.titoloFilm = titolo;
		this.nomeRegista = nome;
		this.linguaOriginale = lingua;
		this.annoUscita = anno;
		this.nazioneProduzione = nazione;
	}

	// Metodi gettere per accedere alle variabili di istanza
	public String getTitoloFilm() {
		return titoloFilm;
	}

	public String getNomeRegista() {
		return nomeRegista;
	}

	public String getLinguaOriginale() {
		return linguaOriginale;
	}

	public int getAnnoUscita() {
		return annoUscita;
	}

	public String getNazioneProduzione() {
		return nazioneProduzione;
	}

	// Metodo setter per modificare il titolo
	public void setTitoloFilm(String titolo) {
		this.titoloFilm = titolo;
	}

	public String descrizioneFilm() {
		return "Titolo del film: " + titoloFilm + "\nNome del regista: " + nomeRegista + "\nLingua Originale del film: "
				+ linguaOriginale + "\nAnno di uscita del film: " + annoUscita + "\nNazione di Produzione del film: "
				+ nazioneProduzione;
	}

}