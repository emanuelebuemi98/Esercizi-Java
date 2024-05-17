package it.corso.java.esercizio.film;
/*
NUM 2
Un film in dvd è un film caratterizzato anche da un elenco di lingue disponibili per
l'audio, un elenco di lingue disponibili per i sottotitoli e la presenza o meno di bonus.
Scrivere una classe FilmDVD, il cui costruttore imposta i numeri massimi per le lingue
disponibili per l’audio e per i sottotitoli. Oltre ai metodi che restituiscono i valori delle
variabili istanza, definire i seguenti metodi:
- un metodo che aggiunge una lingua all’elenco di lingue per l’audio di un film in dvd;
- un metodo che aggiunge una lingua all ’elenco di lingue per i sottotitoli di un film in dvd;
- un metodo che restituisce una stringa che descrive un film in dvd;
- un metodo eq che, dato un film f, è tale che d.eq(f) restituisce true se d è il dvd di f
*/

public class FilmDVD extends Film {
    private String[] elencoLingueAudio;
    private String[] elencoLingueSottotitoli;
    private boolean bonus;

    public FilmDVD(String titolo, String nome, String lingua, int anno, String nazione, int maxLingueAudio, int maxLingueSottotitoli) {
        super(titolo, nome, lingua, anno, nazione);
        this.elencoLingueAudio = new String[maxLingueAudio];
        this.elencoLingueSottotitoli = new String[maxLingueSottotitoli];
        this.bonus = false;
    }

    public String[] getLingueAudio() {
    	return elencoLingueAudio;
    }
    
    public String[] getLingueSottotitoli() {
    	return elencoLingueSottotitoli;
    }
    
    public boolean isBonus() {
    	return bonus;
    }   
    
    // Metodo che mi aggiunge una lingua all'elenco di lingue per l'audio di un film in dvd
    public boolean aggLinguaAudio(String lingua) {
        for (int i = 0; i < elencoLingueAudio.length; i++) {
            if (elencoLingueAudio[i] == null) {
                elencoLingueAudio[i] = lingua;
                return true; 
            }
        }
        return false;
    }
    
    // Metodo che aggiunge una lingua all ’elenco di lingue per i sottotitoli di un film in dvd
    public boolean aggLinguaSottotitoli(String lingua) {
        for (int i = 0; i < elencoLingueSottotitoli.length; i++) {
            if (elencoLingueSottotitoli[i] == null) {
                elencoLingueSottotitoli[i] = lingua;
                return true; 
            }
        }
        return false;
    }

    // Metodo che restituisce una stringa che descrive un film in dvd
    @Override
    public String descrizioneFilm() {
    	//Creazione oggetto sb con l'inizio della descrizione del film presa da metodo della superclasse
        StringBuilder sb = new StringBuilder(super.descrizioneFilm());
        
        //Aggiunta dell'elenco delle lingue disponibili per l'audio e i sottotitoli 
        //scorrendo attraverso gli array di stringhe "lingueAudio" e "lingueSottotitoli" 
        sb.append("\nEcco le lingue disponibili per l'audio:\n");
        for (String lingua : elencoLingueAudio) {
            sb.append(lingua).append(" ");       
        }
        sb.append("\nEcco le lingue disponibili per i sottotitoli:\n");
        for (String lingua : elencoLingueSottotitoli) {
            sb.append(lingua).append(" ");
        }
        //Descrizione aggiuntiva che ci dice se è presente o no il bonus DVD
        sb.append("\nDescrizione bonus: ").append(bonus ? "SI" : "NO");
        return sb.toString();
    }

    // Metodo che verifica se un film esiste o no
    public boolean eq(Film f) {
        return this.getTitoloFilm().equals(f.getTitoloFilm()) && 
        		this.getNomeRegista().equals(f.getNomeRegista()) && 
        		this.getAnnoUscita() == f.getAnnoUscita();
    }
}