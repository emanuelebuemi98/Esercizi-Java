package it.corso.java.esercizio.film;

/*
 * Una videoteca può essere caratterizzata tramite il nome, l’indirizzo, il nome del proprietario e l’elenco dei 
 * film in dvd che possono essere noleggiati. Scrivere una classe Videoteca, il cui costruttore imposta il numero massimo di 
 * film in dvd che possono essere gestiti. Oltre ai metodi che restituiscono i valori delle variabili istanza, definire
 * i seguenti metodi:
 * - un metodo che aggiunge un film in dvd nell’elenco dei dvd di una videoteca;
 * - un metodo che restituisce true se, dato un film f, esiste nella videoteca il dvd di f,
 * altrimenti il metodo restituisce false;
 * - un metodo che restituisce l’ elenco dei titoli dei film in dvd disponibili in una videoteca
*/

public class Videoteca {
	private String nomeVideoteca;
    private String indirizzo;
    private String nomeProprietario;
    private FilmDVD[] elencoFilmDVD;
    private int numFilmDVD;
    
	public Videoteca(String nome, String indirizzo, String proprietario, int numMaxFilmDVD) {
		this.nomeVideoteca = nome;
		this.indirizzo = indirizzo;
		this.nomeProprietario = proprietario;
		this.elencoFilmDVD = new FilmDVD[numMaxFilmDVD];
		this.numFilmDVD = 0;
	}

	public String getNomeVideoteca() {
		return nomeVideoteca;
	}

	public String getIndirizzo() {
		return indirizzo;
	}

	public String getNomeProprietario() {
		return nomeProprietario;
	}

	public FilmDVD[] getElencoFilmDVD() {
		return elencoFilmDVD;
	}

	public int getNumFilmDVD() {
		return numFilmDVD;
	}
	
	// Un metodo che aggiunge un film in dvd nell’elenco dei dvd di una videoteca
    public void aggFilmDVD(FilmDVD film) {
        if (numFilmDVD < elencoFilmDVD.length) {
            elencoFilmDVD[numFilmDVD] = film;
            numFilmDVD++;
        } else {
            System.out.println("La videoteca ha raggiunto il numero massimo di DVD gestibili.");
        }
    }

    //Un metodo che restituisce true se, dato un film f, esiste nella videoteca il dvd di f, 
    //altrimenti il metodo restituisce false;
    public boolean esisteFilmDVD(Film f) {
        for (FilmDVD film : elencoFilmDVD) {
            if (film != null && film.eq(f)) {
                return true;
            }
        }
        return false;
    }
	
	//Un metodo che restituisce l’ elenco dei titoli dei film in dvd disponibili in una videoteca
    public String[] titoliFilmInDvdDisponibili() {
        String[] titoli = new String[numFilmDVD];
        for (int i = 0; i < numFilmDVD; i++) {
            titoli[i] = elencoFilmDVD[i].getTitoloFilm();
        }
        return titoli;
    }

}