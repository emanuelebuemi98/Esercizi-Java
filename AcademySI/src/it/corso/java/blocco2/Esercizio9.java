package it.corso.java.blocco2;

import java.util.Scanner;

/*
 * Scrivi un programma Java che richieda all'utente di inserire un numero e generi un numero intero compreso tra 1 e 7, 
 * quindi visualizzi il nome del giorno della settimana corrispondente
 * */

public class Esercizio9 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		try {
			System.out.print("Inserisci un numero tra 1 e 7: ");
			int num = scanner.nextInt();

			// Controllo che il n° sia tra 1 e 7
			if (num >= 1 && num <= 7) {
				String day = dayWeek(num);
				System.out.println("Il giorno corrispondente al numero " + num + " è " + day);
			} else {
				System.out.println("Errore: numero non corretto");
			}
		} catch (Exception e) {
			System.out.print("Devi inserire un numero, non una lettera!!!");
		} finally {
			scanner.close();
		}
	}

	public static String dayWeek(int num) {
		String dayName = "";
		switch (num) {
		    case 1:
			    dayName = "Lunedì";
			    break;
			case 2:
			    dayName = "Martedì";
			    break;
		    case 3:
			    dayName = "Mercoledì";
			    break;
		    case 4:
			    dayName = "Giovedì";
			    break;
		    case 5:
			    dayName = "Venerdì";
			    break;
		    case 6:
			    dayName = "Sabato";
			    break;
		    case 7:
			   dayName = "Domenica";
			   break;
	   	}
		return dayName;
	}

}