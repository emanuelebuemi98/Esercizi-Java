package it.esercizio.negozio;

import java.util.Calendar;
import java.util.Date;

/**
 * La classe MainNegozio rappresenta la classe main del sistema di gestione di un negozio.
 * @author Emanuele Buemi
 * @version 1.0
 */

public class MainNegozio {

	public static void main(String[] args) {
		
        Calendar cal = Calendar.getInstance();
        cal.set(2024, Calendar.MAY, 24);
        Date data1 = cal.getTime();

        cal.set(2024, Calendar.APRIL, 11);
        Date data2 = cal.getTime();

        cal.set(2024, Calendar.OCTOBER, 21);
        Date data3 = cal.getTime();
		
        ProdottoAlimentare p1Alimentare = new ProdottoAlimentare("PA1", "Salsa", 10, 1.5, data1);
        ProdottoAlimentare p2Alimentare = new ProdottoAlimentare("PA2", "Latte", 5, 2.5, data2);
        ProdottoAlimentare p3Alimentare = new ProdottoAlimentare("PA1", "Salsa", 1, 1.5, data3);
        ProdottoElettronico p1Elettrico = new ProdottoElettronico("PE1", "Smartphone", 1, 500, 24);
        ProdottoElettronico p2Elettrico = new ProdottoElettronico("PE2", "Tablet", 3, 200, 12);


        OperazioniNegozio on = new OperazioniNegozio();

        //Aggiunti dei prodotti
        on.addProdotto(p1Alimentare);
        on.addProdotto(p2Alimentare);
        on.addProdotto(p3Alimentare);
        on.addProdotto(p1Elettrico);
        on.addProdotto(p2Elettrico);
        
        System.out.println("--------------------------------------------------");

        //Modicica del prodotto con codice PA1
        on.editQuantita(p1Alimentare, 5);

        System.out.println("--------------------------------------------------");
        
        //Visualizzazione dei prodotti con la modifica già fatta al prodotto con PA1
        on.viewProdotti();

        System.out.println("--------------------------------------------------");
        
        //Eliminazione del prodotto con codice PE2
        on.deleteProdotto("PE2");
        on.deleteProdotto("PE3");
        
        System.out.println("--------------------------------------------------");

        //Visualizzazione dei prodotti dopo l'eliminazione del prodotto con id PE2
        on.viewProdotti();

	}

}
