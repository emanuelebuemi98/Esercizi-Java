package it.corso;

import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		try {
			System.out.println("Inserisci il primo numero:");
			int num1 = scanner.nextInt();
			
			System.out.println("Inserisci il secondo numero:");
			int num2 = scanner.nextInt();
			
			boolean risultato = controllaNumeri(num1, num2);
			System.out.println("Il risultato del controllo \n" + risultato);        	
		} catch (Exception e) {
			System.err.println("Si è verificato un errore: " + e.getMessage());
		} finally {
			scanner.close();
		}	
	}

	
    public final static boolean controllaNumeri(int num1, int num2) {
        boolean num1Pari = num1 % 2 == 0;
        boolean num2Pari = num2 % 2 == 0;

        if (num1Pari && num2Pari) {
            return true;
        } else if (!num1Pari && !num2Pari) {
            return false;  
        } /*else if ((num1Pari && !num2Pari) || (!num1Pari && num2Pari) ) {
        	return true;
        }
        if (num1 > num2){
            return true;
        } else {
        	return false;
        }*/ else {
        	return num1 > num2;
        }
    }

}
