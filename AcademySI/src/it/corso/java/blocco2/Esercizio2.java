package it.corso.java.blocco2;

import java.util.Scanner;

/*
 * Scrivere un programma  in Java che fa inserire all’utente una frase f ed una stringa s, e che visualizza all’utente true
 * se s è una sottostringa di f e false altrimenti. Il programma deve inoltre visualizzare all’utente una frase equivalente ad f 
 * ma in cui tutte le lettere sono in maiuscolo.*/

public class Esercizio2 {

	public static void main(String[] args) {
		
		// Parole --> cocca - albicocca;
		
		Scanner scanner = new Scanner(System.in);
		
		try {
			System.out.print("Inserisci una frase f: ");
	        String f = scanner.nextLine();

	        System.out.print("Inserisci una stringa s: ");
	        String s = scanner.nextLine();
	  
	        System.out.println("La stringa s è contenuta dentro la frase f? " + isSubstring(f,s));
	        System.out.println("Stampa della frase f in maiuscolo: " + f.toUpperCase());
	        
		} catch (Exception e ) {
			e.printStackTrace();
		}
		finally {
			scanner.close();
		}

	}
	
	public static boolean isSubstring(String frase, String stringa) {
//		boolean isTrueOrFalse = false;
//        if (frase.contains(stringa)) {
//        	isTrueOrFalse = true;
//        }
		boolean isTrueOrFalse = frase.contains(stringa);
		return isTrueOrFalse;
	}

}
