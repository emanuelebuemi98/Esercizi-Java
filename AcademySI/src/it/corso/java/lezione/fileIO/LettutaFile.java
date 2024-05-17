package it.corso.java.lezione.fileIO;
import java.io.*;


public class LettutaFile {

	public static void main(String[] args) {
		
		//Creazione dell'array di byte di 100 elementi per memorizzare i dati letti dal file.
		byte [] array = new byte[100];
		
		try {
			//Apertura del file con InputStream e lettura dei dati
			/*Il percorso del file è preso dalla proprietà di sistema "user.home" 
			 *(che rappresenta la directory home dell'utente corrente) e concatenato con "/Downloads/file.txt".*/
			InputStream input = new FileInputStream((System.getProperty("user.home") + "/Downloads/file.txt"));
			System.out.print("Byle disponibile nel file: " + input.available()); //Il metodo available() restituisce il n° di byte disponibili nel file
			
			//Il metodo read() dell'InputStream permette di leggere il contenuto del file nell'array di byte 
			int bytesRead = input.read(array);
			System.out.println("\nI dati vengono letti nel file: ");
			
			//Conversione dei dati in stringa e stampa
			/* I byte letti vengono convertiti in una stringa utilizzando il costruttore di Stringa appropriato, 
			 * che prende l'array di byte, l'offset e la lunghezza. 
			 * La lunghezza qui è il numero effettivo di byte letti dal file.
			 */
			String data = new String(array,0,bytesRead);
			System.out.println(data);
			
			//Chiusura dello stream di input
			input.close();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		/*
		 * BufferedReader vs InputStream
		 * bufferedReader è una scelta più conveniente quando si tratta di leggere righe di testo da un file.
		 * Questo perchè InputStream legge byte per byte, BufferReader legge le righe di testo per intero, semplificando il processo di letture 
		 * e analisi di dati testuali. BufferedReader fornisce metodi utili come readline() che legge una riga intera dal flusso di input, 
		 * rendendo più semplice il processo di elaborazione.
		 * In termini di prestazioni leggere l'intera riga per volta può essere più efficente rispetto alla lettura byte per byte, perchè Buffered utilizza 
		 * un baffer interno per ridurre il n° di chiamate di sistema necessarie per leggere i dati. */

	}

}
