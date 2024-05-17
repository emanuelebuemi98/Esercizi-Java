package it.esercizio.università;

import java.util.ArrayList;
import java.util.List;

/**
 * Classe Professore: costruisce la figura di una professore universitario.
 * 
 * @author Emanuele Buemi
 * @version 1.0
 */
public class Professore {
	private String nome;
	private String cognome;
	private int idProf;
	private List<Corso> corsiInsegnati;

	/**
	 * Costruttore della classe Professore.
	 * 
	 * @param nome    Nome del professore
	 * @param cognome Cognome del professore
	 * @param id      ID univoco del professore
	 */
	public Professore(String nome, String cognome, int id) {
		this.nome = nome;
		this.cognome = cognome;
		this.idProf = id;
		this.corsiInsegnati = new ArrayList<>();
	}

	/**
	 * Restituisce il nome del professore.
	 * 
	 * @return Nome del professore
	 */
	public String getNome() {
		return nome;
	}

	/**
	 * Imposta il nome del professore.
	 * 
	 * @param nome Nome del professore da impostare
	 */
	public void setNome(String nome) {
		this.nome = nome;
	}

	/**
	 * Restituisce il cognome del professore.
	 * 
	 * @return Cognome del professore
	 */
	public String getCognome() {
		return cognome;
	}

	/**
	 * Imposta il cognome del professore.
	 * 
	 * @param cognome Cognome del professore da impostare
	 */
	public void setCognome(String cognome) {
		this.cognome = cognome;
	}

	/**
	 * Restituisce l'ID univoco del professore.
	 * 
	 * @return ID univoco del professore
	 */
	public int getId() {
		return idProf;
	}

	/**
	 * Imposta l'ID univoco del professore.
	 * 
	 * @param id ID univoco del professore da impostare
	 */
	public void setId(int id) {
		this.idProf = id;
	}

	/**
	 * Restituisce la lista dei corsi insegnati dal professore.
	 * 
	 * @return Lista dei corsi insegnati dal professore
	 */
	public List<Corso> getCorsiInsegnati() {
		return corsiInsegnati;
	}

	/**
	 * Imposta la lista dei corsi insegnati dal professore.
	 * 
	 * @param corsiInsegnati Lista dei corsi insegnati dal professore da impostare
	 */
	public void setCorsiInsegnati(List<Corso> corsiInsegnati) {
		this.corsiInsegnati = corsiInsegnati;
	}

	/**
	 * Metodo per aggiungere un professore a un corso insegnato.
	 * 
	 * @param corso Corso da assegnare alla lista dei corsi insegnati dal professore
	 */
	public void assegnazioneCorsoProfessore(Corso corso) {
		if (!corsiInsegnati.contains(corso)) {
			corsiInsegnati.add(corso);
			corso.setProfTitolare(this);
		}
	}

	/**
	 * Metodo per rimuovere un professore da un corso insegnato.
	 * 
	 * @param corso Corso da rimuovere dalla lista dei corsi insegnati dal
	 *              professore
	 */
	public void rimozioneCorsoProfessore(Corso corso) {
		if (corsiInsegnati.contains(corso)) {
			corsiInsegnati.remove(corso);
			corso.deleteProfessore();
		}
	}

}
