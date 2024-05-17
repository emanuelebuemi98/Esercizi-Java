package it.corso.java.blocco3;

public class Main {

	public static void main(String[] args) {

		char carattere = 'a';
		String stringa = "Camera da letto";

		System.out.println("Carattere presente? " + ContenitoreMetodi.firstMethod(carattere, stringa));
		System.out.println("Il carattere " + carattere + " appare " + ContenitoreMetodi.secondMethod(carattere, stringa) + " volte");
		System.out.println("La posizione della 1° occorrenza del carattere è " + ContenitoreMetodi.thirdMethod(carattere, stringa));
		
		char c = '-';
		String s = "alloro";
		System.out.println(ContenitoreMetodi.fourthMethod(c, s));
		
		int n = 5;
		ContenitoreMetodi p = new ContenitoreMetodi(n);
        System.out.println("Metodo di Fibonacci " + p.fiveMethod());
	}

}
