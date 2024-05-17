package it.corso.java.blocco1;

/*
 * Scrivere un frammento di codice che stampi un numero in lettere maiuscone se il valore 
 * di quel numero è compreso tra 0 e 9  "OTHER" altrimenti.*/

public class EsercizioA {

	public static void main(String[] args) {
		int num = 5;
        String[] arrNumLetter = {"ZERO", "UNO", "DUE", "TRE", "QUATTRO", "CINQUE", "SEI", "SETTE", "OTTO", "NOVE"};

        String numLetter = num >= 0 && num <= 9 ? arrNumLetter[num] : "OTHER";
        System.out.println(numLetter);

		//Lorenzo consiglia di usare lo switch case nonostante comporta di scrivere molte più linee di codice
//		int num = 5;
//		String numLetter;
//		switch (num) {
//		    case 0: 
//			    numLetter = "ZERO";
//			    break;
//		    case 1: 
//		    	numLetter = "UNO";
//		    	break;
//		    case 2: 
//			    numLetter = "DUE";
//			    break;
//		    case 3: 
//		    	numLetter = "TRE";
//		    	break;
//		    case 4: 
//			    numLetter = "QUATTRO";
//			    break;
//		    case 5: 
//		    	numLetter = "CINQUE";
//		    	break;
//		    case 6: 
//			    numLetter = "SEI";
//			    break;
//		    case 7: 
//		    	numLetter = "SETTE";
//		    	break;
//		    case 8: 
//			    numLetter = "OTTO";
//			    break;
//		    case 9: 
//		    	numLetter = "NOVE";
//		    	break;
//		    default: 
//			    numLetter = "OTHER";
//		}
//		System.out.println(numLetter);
	}
}