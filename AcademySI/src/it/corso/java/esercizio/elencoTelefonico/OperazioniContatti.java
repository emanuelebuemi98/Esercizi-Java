package it.corso.java.esercizio.elencoTelefonico;

import java.util.LinkedList;

/**
 * Classe OperazioniContattii: rappresentano le possibili operazioni effettuate per la gestione di un sistema telefonico.
 */


public class OperazioniContatti {
	
	   private LinkedList<Contatto> elenco;

	    public OperazioniContatti() {
	        elenco = new LinkedList<>();
	    }

	    //Metodo per aggiungere un contatto
	    public void addContatto(Contatto c) {
	        elenco.add(c);
	        System.out.print("Contatto " + c.getNomeContatto() + " aggiunto\n");
	    }

	    //Metodo per ricercare un contatto per nome
	    public Contatto ricercaContatto(String nome) {
	        for (Contatto c : elenco) {
	            if (c.getNomeContatto().equals(nome)) {
	                return c;
	            }
	        }
	        return null;
	    }

	    //Metodo per eliminare un contatto in base al numero telefonico
	    public void deleteContatto(String telefono) {
	        Contatto contatto = null;
	        for (Contatto c : elenco) {
	            if (c.getNumeroTelefono().equals(telefono)) {
	                contatto = c;
	                break;
	            }
	        }
	        if (contatto != null) {
	            elenco.remove(contatto);
	            System.out.println("Contatto di "+ contatto.getNomeContatto() + " con numero di telefono " + contatto.getNumeroTelefono() 
	            + " eliminato con successo");
	        } else {
	            System.out.println("Contatto telefonico inesistente!");
	        }
	    }

}
