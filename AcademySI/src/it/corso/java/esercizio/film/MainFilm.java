package it.corso.java.esercizio.film;

public class MainFilm {

	public static void main(String[] args) {
		
		
		//Creazione e modifica del titolo di un film
		Film f1 = new Film("Il bambino", "Marco Verdi", "Italiano", 1967, "IT");
        System.out.println("Descrizione del film 1 :\n" + f1.descrizioneFilm());
        f1.setTitoloFilm("Il bambino con il pigiama a righe");
        System.out.println("--------------------------------------------------------");
        System.out.println("Nuova titolo: " + f1.getTitoloFilm());
        
        System.out.println("--------------------------------------------------------");
        
        //Creazione di un film in DVD con aggiunta delle lingue relative all'audio e ai sottotitoli
        FilmDVD f2DVD = new FilmDVD("La vita è bella", "Luca Neri", "Italiano", 1990, "IT", 3, 4);
        f2DVD.aggLinguaAudio("Inglese");
        f2DVD.aggLinguaSottotitoli("Inglese ");
        System.out.println("Descrizione del film 2 in DVD:\n" + f2DVD.descrizioneFilm());
        
        System.out.println("--------------------------------------------------------");
        
        //Creazione di una videoteca e aggiunta del film in DVD con verifica della presenza o meno del film
        Videoteca v1 = new Videoteca("VideoClub", "Via Roma 123", "Claudio Rossi", 10);
        v1.aggFilmDVD(f2DVD);
        System.out.println("La videoteca contiene il film DVD cercato? " + v1.esisteFilmDVD(f2DVD));
        System.out.println("La videoteca contiene il film DVD cercato? " + v1.esisteFilmDVD(f1));

        // Descrizione dei film in DVD disponibili nella videoteca
        String[] titoliEsistenti = v1.titoliFilmInDvdDisponibili();
        System.out.println("Film in DVD disponibili nella videoteca:");
        for (String titolo : titoliEsistenti) {
            System.out.println("Titolo del film: " + titolo);
        }
	}

}
