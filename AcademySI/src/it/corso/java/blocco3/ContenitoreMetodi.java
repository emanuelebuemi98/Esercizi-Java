package it.corso.java.blocco3;

public class ContenitoreMetodi {

	// Metodo per verificare la presenza carattere in nella stringa tramite un
	// vero/falso
	public static boolean firstMethod(char c, String s) {
		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) == c) {
				return true;
			}
		}
		return false;
	}

	// Metodo per verificare il numero di volte in cui appare un carattere nella
	// stringa
	public static int secondMethod(char c, String s) {
		int count = 0;
		char[] character = s.toCharArray();
		for (int i = 0; i < character.length; i++) {
			if (character[i] == c) {
				count++;
			}
		}
		return count;
	}

	// Metodo per verificare la posizione della prima occorrenza del carattere
	// passato
	public static int thirdMethod(char c, String s) {
		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) == c) {
				return i;
			}
		}
		return -1;
	}

	// Metodo per alternare una stringa a un carattere
	public static String fourthMethod(char c, String s) {
		StringBuilder result = new StringBuilder();
		
		for (int i = 0; i<s.length() - 1; i++) {
			result.append(s.charAt(i));
			result.append(c);
		}
		result.append(s.charAt(s.length()-1));
		
		return result.toString();
		
	}

	private int number;

	public ContenitoreMetodi(int n) {
		this.number = n;
	}
	
	public int getNumber() {
		return number;
	}

	// Metodo Fibonacci
	public int fiveMethod() {
		if (number < 0) {
			return -1;
		}
		else if (number == 0 || number == 1) {
			return 1;
		} else {
			//Queste rappresentano rispettivamente il valore di Fibonacci al passo n-1 e n-2 ed n
			int fib1 = 1; 
            int fib2 = 1; 
            int fibN = 0; 

            // Calcolo fib(n) utilizzando la definizione ricorsiva di Fibonacci
            for (int i = 2; i <= number; i++) {
                fibN = fib1 + fib2;
                fib2 = fib1;
                fib1 = fibN;
            }
            return fibN;
		}
		
	}

}
