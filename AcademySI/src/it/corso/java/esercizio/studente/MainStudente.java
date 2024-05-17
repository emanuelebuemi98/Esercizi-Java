package it.corso.java.esercizio.studente;

/*
 *  Scrivere una classe Studente per gli studenti universitari, in cui oggetti sono caratterizzati semplicemente da nome, cognome e matricola.
 *  Definire i costruttori della classe ed i metodi per restituire i valori delle variabili di istanza e le informazioni relative 
 *  ad uno studente. Scrivere un breve programma di prova che illustri l'uso della classe Studente e dei suoi metodi.
 */

//alt + shift + s

public class MainStudente {

	public static void main(String[] args) {
		
		//STUDENTE 1 CON NOME, COGNOME E MATRICOLA
		Studente s1 = new Studente("Mario", "Rossi", 11111);
        System.out.println("1 dato - 1° studente: " + s1.getNome());
        System.out.println("2 dato - 1° studente: " + s1.getCognome());
        System.out.println("3 dato - 1° studente: " + s1.getMatricola());
        System.out.println("Informazioni dello studente:\n" + s1.toString());
        
        System.out.println("");
        
        //STUDENTE 2 CON COGNOME E MATRICOLA
		Studente s2 = new Studente("Verdi", 22222);
        System.out.println("1 dato - 2° studente: " + s2.getCognome());
        System.out.println("2 dato - 2° studente: " + s2.getMatricola());
        System.out.println("Informazioni dello studente:\n" + s2.toString());
        
        //CAMBIO DATI
        s1.setCognome("Gialli");
        s2.setMatricola(33333);
        System.out.println("");
        System.out.println("Informazioni dello studente:\n" + s1.toString());
        System.out.println("");
        System.out.println("Informazioni dello studente:\n" + s2.toString());

	}

}
