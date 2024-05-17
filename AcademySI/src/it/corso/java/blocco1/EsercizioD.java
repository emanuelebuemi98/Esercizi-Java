package it.corso.java.blocco1;

/*  Esercizio D
 *  Scrivere un programma che stampi tutti i caratteri doppi di una stringa fatta eccezione se i
 *  caratteri sono una p o una s. 
 *  Ho verificato anche se la stringa ha doppie o no
 */

public class EsercizioD {

	public static void main(String[] args) {
		String stringa = "casa";
		//String stringa = "gatta";
		//String stringa = "tassa";
		boolean areDoppie = true;

		for (int i = 0; i < stringa.length() - 1; i++) {
			char currentChar = stringa.charAt(i);
			char nextChar = stringa.charAt(i + 1);
			
			if (currentChar == nextChar) {
				if (currentChar != 'p' && currentChar != 's') {
					System.out.println("Doppie: " + currentChar + nextChar );
					continue;
				} else {
					System.out.println("Non possiamo stampare le p o le s");
				}
			} else {
				areDoppie = false;
			}
		}
		if (!areDoppie) {
			System.out.println("Non ci sono doppie nella stringa");
		}
	}
}