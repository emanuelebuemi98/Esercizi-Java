package it.corso.java.blocco1;

/*
 *  Esercizio E
 *  Estendere l'esercizio D facendo in modo che la stampa avvenga per lettere doppie che non siano necessariamente vicine.
 */

public class EsercizioE {

	public static void main(String[] args) {
	    String stringa = "tassa";
		//String stringa = "gatta";
		
        for (int i = 0; i < stringa.length() -1; i++) {
            for (int j = i + 1; j < stringa.length(); j++) {
            	char currentChar = stringa.charAt(i);
                char nextChar = stringa.charAt(j);

                if (currentChar == nextChar) {
                    if (currentChar != 'p' && currentChar != 's') {
                        System.out.println("Le lettere ripetute sono " + currentChar + nextChar);
                        continue;
                    }
                    System.out.println("Non possiamo stampare la p o la s");
                }
            }
        }

	}

}