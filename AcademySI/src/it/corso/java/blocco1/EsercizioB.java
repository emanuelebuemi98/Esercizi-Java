package it.corso.java.blocco1;

/* 
 * Creare un comando for che usa un range di numeri da 1 a 1000(inclusi)
 * Sommare tutti i numeri che possono essere divisi sia con il 3 che con il 5
 * 
 * I numeri che soddisfano tali requisiti, devono essere stampati. 
 * Il loop deve fermarsi quando sono stati trovati 5 numeri che rispettano le condizioni suddette.
 * 
 * Quando il ciclo viene interrotto stampare la somma dei numeri ottenuti.
*/

public class EsercizioB {

	public static void main(String[] args) {
		
		int count = 0; 
        int sum = 0; 
        
        for (int i = 1; i <= 1000; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.println("Il numero " + i + " è un divisibile per 3 e 5");
                sum += i; 
                count++;         
            }
            if (count == 5) {
            	break;
            }
        }
        System.out.println("");
        System.out.println("Somma dei primi 5 numeri divisibili per 3 o 5 è: " + sum);
	}

}