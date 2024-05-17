package it.corso.java.esercizio.elencoTelefonico;

/**
 * Classe MainElencoTelefonico: rappresenta la classe main del sistema di controllo di un elenco telefonico.
 * @author Emanuele Buemi
 * @version 1.0
 */

public class MainElencoTelefonico {

	public static void main(String[] args) {
	       OperazioniContatti oc = new OperazioniContatti();

	        //Creazione dei contatti
	        ContattoPersonale c1 = new ContattoPersonale("Jannik Sinner", "3637873728", "Contatto personale", "Via Olimpia 22");
	        ContattoPersonale c2 = new ContattoPersonale("Lorenzo Musetti", "4628282638", "Contatto personalee", "Via Tasso 11");
	        ContattoLavoro c3 = new ContattoLavoro("Matteo Arnaldi", "4826892648", "Contatto di lavoro", "Programmatore");
	        ContattoLavoro c4 = new ContattoLavoro("Matteo Berrettini", "1637487389", "Contatto di lavoro", "Tester");
	        
	        //Aggiunta contatti
	        oc.addContatto(c1);
	        oc.addContatto(c2);
	        oc.addContatto(c3);
	        oc.addContatto(c4);

	        //Ricerca di un contatto per nome
	        Contatto contattoRicercato = oc.ricercaContatto("Jannik Sinner");
	        if (contattoRicercato != null) {
	            System.out.println("\nContatto di " + contattoRicercato.getNomeContatto() + " trovato");
	        } else {
	            System.out.println("\nContatto non trovato.");
	        }

	        //Eliminazione di un contatto per numero di telefono
	        oc.deleteContatto("4628282638");

	}

}
