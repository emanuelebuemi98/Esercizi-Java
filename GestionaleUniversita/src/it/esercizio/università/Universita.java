package it.esercizio.università;

import java.util.ArrayList;
import java.util.List;

/**
 * Classe Universita: rappresenta un'istituzione universitaria. Contiene metodi
 * per la gestione degli studenti, professori e corsi.
 * 
 * @author Emanuele Buemi
 * @version 1.0
 */

public class Universita {
	private List<Studente> listaStudenti;
	private List<Professore> listaProfessori;
	private List<Corso> listaCorsi;

	/**
	 * Costruttore della classe Universita. Inizializza le liste degli studenti,
	 * professori e corsi.
	 */
	public Universita() {
		this.listaStudenti = new ArrayList<>();
		this.listaProfessori = new ArrayList<>();
		this.listaCorsi = new ArrayList<>();
	}

	/**
	 * Metodo per registrare un nuovo studente all'università.
	 * 
	 * @param studente Studente da registrare
	 */
	public void registrazioneStudente(Studente studente) {
		// Controllo se uno studente si è gia registrato utilizzando la sua matricola
		int matricola = studente.getMatricola();
		for (Studente s : listaStudenti) {
			if (s.getMatricola() == matricola) {
				System.out.println("Studente già registrato");
				return;
			}
		}
		listaStudenti.add(studente);
		System.out.println("Studente con matricole " + studente.getMatricola() + " registrato con successo");
	}

	/**
	 * Metodo per registrare un nuovo professore all'università.
	 * 
	 * @param professore Professore da registrare
	 */
	public void registrazioneProfessore(Professore professore) {
		// Controllo se il professore si è già registrato utilizzando il suo id
		int idProfessore = professore.getId();
		for (Professore p : listaProfessori) {
			if (p.getId() == idProfessore) {
				System.out.println("Professore già registrato");
				return;
			}
		}
		listaProfessori.add(professore);
		System.out.println("Professore con id " + professore.getId() + " registrato con successo");
	}

	/**
	 * Metodo che crea un nuovo corso all'università e lo aggiunge alla lista dei
	 * corsi.
	 * 
	 * @param titolo         Titolo del corso
	 * @param codiceCorso    Codice identificativo del corso
	 * @param profTitolare   Professore titolare del corso
	 * @param numMaxStudenti Numero massimo di studenti ammessi al corso
	 */
	public void creazioneCorso(Corso corso) {
		// Controllo presenza degli studenti
		if (corso.getNumMaxStudenti() <= 0) {
			System.out.println("Impossibile creare il corso di " + corso.getTitolo() + " perchè frequentato da "
					+ corso.getNumMaxStudenti() + " studenti");
			return;
		}
		// Controllo corsi duplicati
		for (Corso c : listaCorsi) {
			if (c.getCodiceCorso() == corso.getCodiceCorso()) {
				System.out.println("Impossibile creare il corso di " + corso.getTitolo()
						+ " perchè il corso con il codice " + c.getCodiceCorso() + " esiste già");
				return;
			}
		}
		// Creazione del corso e aggiunta alla lista
		listaCorsi.add(corso);
		System.out.println("Creazione del corso " + corso.getTitolo() + " effettuata con successo");
	}

	/**
	 * Metodo per iscrivere uno studente a un corso.
	 * 
	 * @param studente Studente da iscrivere al corso
	 * @param corso    Corso a cui iscrivere lo studente
	 */
	public void iscrizioneStudenteCorso(Studente studente, Corso corso) {
		// Controllo dei se il corso ha raggiunto il numero massimo di studenti
		if (corso.getStudIscritti().size() >= corso.getNumMaxStudenti()) {
			System.out.println(studente.getNome() + " " + studente.getCognome() + " ci dispiace ma il corso di "
					+ corso.getTitolo() + " ha raggiunto il n° massimo di studenti");
			return;
		}
		studente.iscrizioneCorsoStudente(corso);
		System.out.println("Lo studente " + studente.getNome() + " " + studente.getCognome()
				+ " si è inscritto al corso di " + corso.getTitolo());

	}

	/**
	 * Metodo per assegnare un professore a un corso.
	 * 
	 * @param professore Professore da assegnare al corso
	 * @param corso      Corso a cui assegnare il professore
	 */
	public void assegnazioneProfessoreCorso(Professore professore, Corso corso) {
		// Verifica se il professore non sia già assegnato ad un altro corso
		if (professore.getCorsiInsegnati().isEmpty()) {
			corso.setProfTitolare(professore);
			System.out.println("Il corso " + corso.getCodiceCorso() + " è assegnato al professore " + professore.getCognome());
		} 
	}

}
