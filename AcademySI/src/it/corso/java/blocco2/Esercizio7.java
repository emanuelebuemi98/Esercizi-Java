package it.corso.java.blocco2;

import java.util.Scanner;

/*
 * 
  L’utente deve scegliere una password. Il sistema risponderà “PASSWORD CREATA” 
  se la password rispetta i seguenti requisiti (ENTRAMBI):
   - Contiene almeno un carattere tra i seguenti: &, $, @
   - È di lunghezza almeno 8 caratteri
N.B.
Non si possono utilizzare le regex, ma solo la logica di programmazione

Lorenzo consiglia di utilizzare il do while()

*/

public class Esercizio7 {
	
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String password;
        
        //NOTA!!!
        /* Utilizzo un do while perché devo entrare almeno una volta per scrivere la password
         * e finche non inserisco una password valita rieseguo il ciclo while*/
        try {
        	do {
        		System.out.print("Inserisci la password: ");
        		password = scanner.nextLine();
        		
        		if (passwordValida(password)) {
        			System.out.println("Password creata!!!");
        			break; //pw è stata creata --> chiudiamo
        		} else {
        			System.out.println("La password non rispetta i requisiti. RIPROVA!!!");
        		}
        		
        	} while (!passwordValida(password));
        	//Finche la password non è valida mi riesegui il codice e mi rifai inserire nuovamente una password
        	
        } catch (Exception e) {
        	e.printStackTrace();
        }finally {
        	scanner.close(); 	
        }
    }
    
    public static boolean passwordValida(String pw) {
    	
    	//1) VERIDICA: la password deve essere lunga almeno 8 caratteri
    	if (pw.length() > 8) { //se passa il primo controllo andiamo avanti
    		boolean controlloCarratteriSpeciali = false;
    		for (int i = 0; i < pw.length(); i++) {
    			char c = pw.charAt(i);
    			
    			//2) VERIFICA: la password contiene almeno uno tra questi caratteri -> &, $, @
    			if (c == '&' || c == '$' || c == '@') { //se passa anche il 2° controllo mettiamo il check a true
    				controlloCarratteriSpeciali = true;
    			}
    		}
    		return controlloCarratteriSpeciali;
    	} 
    	return false;
    }

}