package it.corso.java.blocco2;

import java.util.Scanner;

public class EsercizioPalindromo {
	
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Inserisci una parola: ");
        String parola = scanner.nextLine();

        if (isPalindromo(parola)) {
            System.out.println("La parola " + "'" + parola + "'"  + " è un palindromo.");
        } else {
        	System.out.println("La parola " + "'" + parola + "'"  + " non è un palindromo.");
        }

        scanner.close();
	}
	
	
    public static boolean isPalindromo(String p) {
        p = p.toLowerCase();
        
        int lunghezza = p.length();
        for (int i = 0; i < lunghezza /2; i++) {
            if (p.charAt(i) != p.charAt(lunghezza - 1 - i)) {
                return false;
            }
        }
        return true;
    }

}
