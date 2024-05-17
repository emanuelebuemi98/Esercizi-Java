package it.corso.java.blocco1;

/*
 * Stampare i primi 150 numeri pari, e insieme al numero, per ogni stampa associare e stampare la somma di tutti i numeri 
 * contati precedentemente.
 * 
 * Interrompere il programma quando la somma raggiunge un valore dispari > di 6000.
 * 
 * Se la somma raggiunge un numero > di 4000, rendere dispari la somma, una sola volta.
 * 
 * 
 * */

public class EsercizioC {

	public static void main(String[] args) {
		int sum = 0;
		boolean sumDispari = false;
		int count = 0;
		int numPari = 0;
		
        while (count < 150) {
        	if (numPari % 2 == 0) {
        		sum += numPari;
        		numPari += 2;
        		count++;
        	}
            if (sum > 4000 && !sumDispari) {
            	System.out.println("La somma diventa dispari perche superiore a 4000");
                sum ++; // Rendiamo dispari la somma una sola volta
                sumDispari = true;
            }
            if (sum > 6000) { 
            	System.out.println("La somma si blocca all'indice " + count + " del conteggio " + numPari + " perchè " + sum + " è > di 6000");
                break; // Interrompiamo il programma 
            }
            System.out.println(count + "° numero - " + "Contatore pari: " + numPari + " - Somma: " + sum);
        }
        System.out.println("Contatore arrivato all'indice numero " + count );

	}
}