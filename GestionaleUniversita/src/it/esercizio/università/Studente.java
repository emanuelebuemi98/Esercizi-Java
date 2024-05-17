package it.esercizio.università;

import java.util.ArrayList;
import java.util.List;

/**
 * Classe Studente: costruisce la figura di una studente universitario.
 * 
 * @author Emanuele Buemi
 * @version 1.0
 */

public class Studente {
	
	private String nome;
	private String cognome;
	private int matricola;
	private int annoImmatricolazione;
	private List<Corso> corsiIscritti;

	/**
	 * @param nome                 Nome di uno studente
	 * @param cognome              Cognome di uno studente
	 * @param matricola            Codice identificativo di uno studente
	 * @param annoImmatricolazione Definisce l'anno di immatricolazione di uno
	 *                             studente
	 * @param corsiInscritto       Lista dei corsi in cui è inscritto uno studente
	 */
	public Studente(String nome, String cognome, int matricola, int annoImmatricolazione) {
		this.nome = nome;
		this.cognome = cognome;
		this.matricola = matricola;
		this.annoImmatricolazione = annoImmatricolazione;
		this.corsiIscritti = new ArrayList<>();
	}

	/**
	 * Restituisce il nome dello studente.
	 * 
	 * @return Nome dello studente.
	 */
	public String getNome() {
		return nome;
	}

	/**
	 * Imposta il nome dello studente.
	 * 
	 * @param Nome dello studente da impostare
	 */
	public void setNome(String nome) {
		this.nome = nome;
	}

	/**
	 * Restituisce il cognome dello studente.
	 * 
	 * @return Cognome dello studente.
	 */
	public String getCognome() {
		return cognome;
	}

	/**
	 * Imposta il cognome dello studente.
	 * 
	 * @param Cognome dello studente da impostare
	 */
	public void setCognome(String cognome) {
		this.cognome = cognome;
	}

	/**
	 * Restituisce la matricola dello studente.
	 * 
	 * @return Matricola dello studente.
	 */
	public int getMatricola() {
		return matricola;
	}

	/**
	 * Imposta il nome dello studente.
	 * 
	 * @param matricola Matricola dello studente da impostare
	 */
	public void setMatricola(int matricola) {
		this.matricola = matricola;
	}

	/**
	 * Restituisce l'anno di immatricolazione dello studente.
	 * 
	 * @return Anno di immatricolazione dello studente.
	 */
	public int getAnnoImmatricolazione() {
		return annoImmatricolazione;
	}

	/**
	 * Imposta il nome dello studente.
	 * 
	 * @param annoImmatricolazione Anno di immatricolazione dello studente da
	 *                             impostare
	 */
	public void setAnnoImmatricolazione(int annoImmatricolazione) {
		this.annoImmatricolazione = annoImmatricolazione;
	}

	/**
	 * Restituisce l'elenco dei corsi in cui è inscritto uno studente
	 * 
	 * @return Lista dei corsi inscritti dello studente.
	 */
	public List<Corso> getCorsiIscritto() {
		return corsiIscritti;
	}

	/**
	 * Imposta il nome dello studente.
	 * 
	 * @param corsiIscritti Lista dei corsi iscritti dello studente da impostare
	 */
	public void setCorsiIscritto(List<Corso> corsiIscritti) {
		this.corsiIscritti = corsiIscritti;
	}

	/**
	 * Metodo per aggiungere uno studente ad un corso
	 * 
	 * @param corso Corso che permette a uno studente di iscriversi a un corso
	 */
	public void iscrizioneCorsoStudente(Corso corso) {
		if (!corsiIscritti.contains(corso)) {
			corsiIscritti.add(corso);
			corso.addStudente(this);
		}
	}

	/**
	 * Metodo per rimuovere uno studente da un corso
	 * 
	 * @param corso Corso che permette a uno studente di rimuoversi da un corso
	 */
	public void rimozioneCorsoStudente(Corso corso) {
		if (corsiIscritti.contains(corso)) {
			corsiIscritti.remove(corso);
			corso.deleteStudente(this);
		}
	}

}
