package it.corso.java.esercizio.letturaFile;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/* Si desidera creare un programma Java che legga un file di testo e calcoli alcune statistiche sui contenuti del file. 
 * Le statistiche richieste sono: il numero totale di parole del file, il numero totale di caratteri nel file (escludendo gli spazi), 
 * la larghezza media delle parole nel file. Il programma deve utilizzare un BufferedReader per leggere righe di testo dal file 
 * di input e quindi elaborare ciascuna riga per contare le parole e i caratteri.  Le parole sono definite come sequenze di caratteri
 * delimitate da spazi, tabulazioni o altri caratteri di spaziatura. Il conteggio dei caratteri deve escludere gli spazi. 
 * In caso di eccezioni durante la lettura del file, il programma deve gestire l'eccezione e visualizzare un messaggio di errore 
 * appropriato. Una volta elaborato il file, il programma deve stampare i risultati delle statistiche calcolate, inclusi il numero 
 * totale di parole, il numero totale di caratteri e la lunghezza media delle parole. */

public class EsercizioFile {
	
	public static void main(String[] args) {
        String percorsoFile = "/Users/Asus/Downloads/file.txt";

        try {
        	//Creazione di un oggetto di tipo BufferedReader per leggere il file
            BufferedReader lettore = new BufferedReader(new FileReader(percorsoFile));
        	//BufferedReader lettore = new BufferedReader(new FileReader(System.getProperty("user.home") + "/Downloads/file.txt"));
        	
            int totParole = 0;
            int totCaratteri = 0;
            double lunghezzaMediaParole = 0;
            int countRighe = 0;
            String righe;
            
            //Iterazione sulle righe del file diverse da null con metodo readLine
            while ((righe = lettore.readLine()) != null) {
            	countRighe++;
                //Divisione della riga in parole in base agli spazi utilizzando il medoto split 
                String[] parole = righe.split("\\s+");
                totParole += parole.length; 

                /*for (String parola : parole) {
                    totCaratteri += parola.length();
                }*/
                //sommo la lunghezza di tutte le righe delle parole escudendo gli spazi e le righe vuote
                totCaratteri += righe.replaceAll("\\s+", "").length();
            }

            //Chiusura del baffer
            lettore.close();

            if (countRighe == 0) {
                System.out.println("Il file di testo è vuoto!!!");
            } else {
                lunghezzaMediaParole = (double)  totCaratteri / totParole;
                System.out.println("N° di parole totali nel file: " + totParole);
                System.out.println("N° di caratteri totali nel file: " + totCaratteri);
                System.out.println("Larghezza media delle parole nel file: " + lunghezzaMediaParole);
            }

        } catch (IOException e) {
            System.err.println("Errore durante la lettura del file: " + e.getMessage());
        }
	}

}
