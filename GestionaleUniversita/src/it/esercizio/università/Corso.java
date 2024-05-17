package it.esercizio.università;

import java.util.ArrayList;
import java.util.List;

/**
 * Classe Corso: rappresenta un corso universitario.
 * 
 * @author Emanuele Buemi
 * @version 1.0
 */

public class Corso {
	private String titolo;
	private int codiceCorso;
	private Professore profTitolare;
	private List<Studente> studIscritti;
	private int numMaxStudenti;

	/**
	 * Costruttore della classe Corso.
	 * 
	 * @param titolo         Titolo del corso
	 * @param codiceCorso    Codice identificativo del corso
	 * @param prof           Professore titolare del corso
	 * @param numMaxStudenti Numero massimo di studenti ammessi al corso
	 */
	public Corso(String titolo, int codiceCorso, Professore prof, int numMaxStudenti) {
		this.titolo = titolo;
		this.codiceCorso = codiceCorso;
		this.profTitolare = prof;
		this.studIscritti = new ArrayList<>();
		this.numMaxStudenti = numMaxStudenti;
	}

	/**
	 * Restituisce il titolo del corso.
	 * 
	 * @return Titolo del corso
	 */
	public String getTitolo() {
		return titolo;
	}

	/**
	 * Imposta il titolo del corso.
	 * 
	 * @param titolo Titolo del corso da impostare
	 */
	public void setTitolo(String titolo) {
		this.titolo = titolo;
	}

	/**
	 * Restituisce il codice identificativo del corso.
	 * 
	 * @return Codice identificativo del corso
	 */
	public int getCodiceCorso() {
		return codiceCorso;
	}

	/**
	 * Imposta il codice identificativo del corso.
	 * 
	 * @param codiceCorso Codice identificativo del corso da impostare
	 */
	public void setCodiceCorso(int codiceCorso) {
		this.codiceCorso = codiceCorso;
	}

	/**
	 * Restituisce il professore titolare del corso.
	 * 
	 * @return Professore titolare del corso
	 */
	public Professore getProfTitolare() {
		return profTitolare;
	}

	/**
	 * Restituisce la lista degli studenti iscritti al corso.
	 * 
	 * @return Lista degli studenti iscritti al corso
	 */
	public List<Studente> getStudIscritti() {
		return studIscritti;
	}

	/**
	 * Imposta la lista degli studenti iscritti al corso.
	 * 
	 * @param studIscritti Lista degli studenti iscritti al corso da impostare
	 */
	public void setStudIscritti(List<Studente> studIscritti) {
		this.studIscritti = studIscritti;
	}

	/**
	 * Restituisce il numero massimo di studenti ammessi al corso.
	 * 
	 * @return Numero massimo di studenti ammessi al corso
	 */
	public int getNumMaxStudenti() {
		return numMaxStudenti;
	}

	/**
	 * Metodo per impostare il numero massimo di studenti ammessi al corso.
	 * 
	 * @param numMaxStudenti Numero massimo di studenti ammessi al corso da
	 *                       impostare
	 */
	public void setNumMaxStudenti(int numMaxStudenti) {
		this.numMaxStudenti = numMaxStudenti;
	}

	/**
	 * Metodo per aggiungere uno studente alla lista degli studenti iscritti al
	 * corso.
	 * 
	 * @param studente Studente da aggiungere al corso
	 */
	public void addStudente(Studente studente) {
		if (studIscritti.size() < numMaxStudenti && !studIscritti.contains(studente)) {
			studIscritti.add(studente);
		}
	}

	/**
	 * Meroto per rimuovere uno studente dalla lista degli studenti iscritti al
	 * corso.
	 * 
	 * @param studente Studente da rimuovere dal corso
	 */
	public void deleteStudente(Studente studente) {
		studIscritti.remove(studente);
	}

	/**
	 * Imposta il professore titolare del corso e aggiunge il corso alla lista dei
	 * corsi insegnati dal professore.
	 * 
	 * @param prof Professore titolare del corso da impostare
	 */
	// Si assume che un professore possa insegnare insegnare solo in un corso per
	// volta --> controllo fatto nella classe Università
	public void setProfTitolare(Professore prof) {
		this.profTitolare = prof;
	}

	/**
	 * Metodo per rimuove il professore da un corso.
	 */
	public void deleteProfessore() {
		this.profTitolare = null;
	}

}
