package it.corso.java.blocco2;
/*
 * Scrivere un programma Java che chiede all’utente di inserire due stringhe e che visualizza all’utente 
 * true se le stringhe sono uguali e false se sono diverse
 * */

import java.util.Scanner;

public class Esercizio1 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		try {
			System.out.print("Inserisci la prima stringa: ");
	        String firstString = scanner.nextLine();

	        System.out.print("Inserisci la seconda stringa: ");
	        String secondString = scanner.nextLine();
	        
	        System.out.println("Le due stringhe sono uguali? " + isEqual(firstString, secondString));
			
		} catch (Exception e ) {
			e.printStackTrace();
		}
		finally {
			scanner.close();
		}
	}
	
	public static boolean isEqual(String s1, String s2) {
		boolean TrueOrFalse = false;
        if (s1.equals(s2)) {
        	TrueOrFalse = true;
        }
		return TrueOrFalse;
	}

}
