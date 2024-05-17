package it.corso.java.blocco2;

import java.util.Random;

/*
 * Scrivere un programma Java che simuli il lancio di un dado a sei facce e fornisca alcune 
 * informazioni sul risultato del lancio.*/

public class Esercizio6 {

	public static void main(String[] args) {
		for (int i = 1; i<10; i++) {
			int risultato = lancioDadi();
			System.out.print("Risultato " + i + "° lancio "+ risultato);
			if (risultato % 2 == 0) {
				System.out.println(" --> Il numero è pari");
			} else {
				System.out.println(" --> Il numero è dispari");
			}
		}

	}
	
	public static int lancioDadi() {
		int facceDado = 6;
		Random r = new Random();
		int lancioRandom = r.nextInt(facceDado)+1;
		return lancioRandom;
	}

}