package it.esercizio.università;

/**
 * Classe MainUniversita: rappresenta il programma principale per la gestione
 * dell'università. Questo programma dimostra l'utilizzo delle classi
 * Universita, Studente, Professore e Corso. Viene creata un'istanza
 * dell'università, vengono aggiunti studenti e professori, creati corsi,
 * iscritti studenti ai corsi e assegnati professori ai corsi. Infine, vengono
 * stampati gli studenti iscritti a ciascun corso.
 * 
 * @author Emanuele Buemi
 * @version 1.0
 */

public class MainUniversita {

	/**
	 * Metodo main: punto di ingresso del programma.
	 * 
	 * @param args Argomenti passati da linea di comando.
	 */
	public static void main(String[] args) {
		// Creazione di un'istanza dell'università
		Universita uni = new Universita();

		// Creazione dei studenti e dei professori
		System.out.println("     REGISTRAZIONE STUDENTI/PROFESSORI     ");
		Studente stud1 = new Studente("Samuele", "Bianchi", 11111, 2020);
		Studente stud2 = new Studente("Filippo", "Violi", 11111, 2022);
		Studente stud3 = new Studente("Luca", "Violi", 11112, 2022);
		Studente stud4 = new Studente("Emanuele", "Rossi", 11113, 2019);
		Studente stud5 = new Studente("Mattia", "Casti", 11114, 2020);
		Studente stud6 = new Studente("Marco", "Peri", 11115, 2023);
		Studente stud7 = new Studente("Giuseppe", "Azzuri", 11116, 2018);

		Professore prof1 = new Professore("Carlo", "Gialli", 1);
		Professore prof2 = new Professore("Flavio", "Neri", 2);
		Professore prof3 = new Professore("Flavio", "Neri", 2);
		;

		// Registrazione dei studenti e dei professori all'università
		uni.registrazioneStudente(stud1);
		uni.registrazioneStudente(stud2);
		uni.registrazioneStudente(stud3);
		uni.registrazioneStudente(stud4);
		uni.registrazioneStudente(stud5);
		uni.registrazioneStudente(stud6);
		uni.registrazioneStudente(stud7);
		uni.registrazioneProfessore(prof1);
		uni.registrazioneProfessore(prof2);
		uni.registrazioneProfessore(prof3);

		System.out.println("--------------------------------------------------");

		// Creazione dei corsi
		System.out.println("     CREAZIONE DEI CORSI     ");
		Corso corso1 = new Corso("Programmazione Java", 1, prof1, 20);
		Corso corso2 = new Corso("Basi di dati", 2, prof2, 3);
		Corso corso3 = new Corso("Matematica", 3, prof1, 0); // Corso con 0 studenti
		Corso corso4 = new Corso("Inglese", 2, prof1, 10); // Corso con un codice già esistente
		uni.creazioneCorso(corso1);
		uni.creazioneCorso(corso2);
		uni.creazioneCorso(corso3);
		uni.creazioneCorso(corso4);

		System.out.println("--------------------------------------------------");

		// Iscrizione di studenti ai corsi
		System.out.println("    ISCRIZIONE DEGLI STUDENTI AI CORSI     ");
		uni.iscrizioneStudenteCorso(stud1, corso1);
		uni.iscrizioneStudenteCorso(stud2, corso1);
		uni.iscrizioneStudenteCorso(stud3, corso1); // studente 3 inscritto sia al corso 1 che al corso 2
		uni.iscrizioneStudenteCorso(stud3, corso2);
		uni.iscrizioneStudenteCorso(stud4, corso1); // studente 4 inscritto sia al corso 1 che al corso 2
		uni.iscrizioneStudenteCorso(stud4, corso2);
		uni.iscrizioneStudenteCorso(stud5, corso2); // Marco Peri non si può iscrivere al corso 2 perche il n° max è
													// stato raggiunto
		uni.iscrizioneStudenteCorso(stud6, corso2);

		System.out.println("--------------------------------------------------");

		// Assegnazione di un professore a un corso
		System.out.println("    ASSEGNAZIONE DEI PROFESSORI AI CORSI     ");
		uni.assegnazioneProfessoreCorso(prof1, corso1);
		uni.assegnazioneProfessoreCorso(prof2, corso2);

		System.out.println("--------------------------------------------------");

		// Stampa degli studenti iscritti al corso1 e corso 2
		System.out.println("    INFORMAZIONI SUL CORSI     ");
		System.out.println("Studenti iscritti al corso di " + corso1.getTitolo());
		for (Studente studente : corso1.getStudIscritti()) {
			System.out.println("- " + studente.getNome() + " " + studente.getCognome());
		}
		System.out.println("Studenti iscritti al corso di " + corso2.getTitolo());
		for (Studente studente : corso2.getStudIscritti()) {
			System.out.println("- " + studente.getNome() + " " + studente.getCognome());
		}

	}

}
