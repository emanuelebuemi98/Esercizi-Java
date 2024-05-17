package it.corso.java.lezione.collections;

import java.util.*;

public class MainArrayList {

	public static void main(String[] args) {
		
		//Inizializzazione dell'arraylist che è un'implimentazione dell'interfaccia List
		ArrayList<String> lista1 = new ArrayList<>();
		
		//aggiuta elementi
		lista1.add("elemento 1");
		lista1.add("elemento 2");
		lista1.add(1, "elemento inserito in una posizione specifica");
		
		//System.out.println(lista1);
		
		System.out.println("Utilizzo ciclo for classico");
		for (int i = 0; i <lista1.size(); i++) {
			String valore = lista1.get(i);
			System.out.println("Elemento posizione " + i + " valore: " + valore);
		}
		
		System.out.println("");
		
		//ciclo for-each
		System.out.println("Utilizzo ciclo for each");
		for (String elementoLista : lista1) {
			System.out.println(elementoLista);
		}
		
		System.out.println("");
		
		//metodo foreach utilizzando un espressione lambda
		System.out.println("Utilizzo metodo forEach");
		lista1.forEach(u -> System.out.println(u));
		
		System.out.println("");
		
		//eliminare un elemento in un determinato indice
		//lista1.remove(1);
		
		//verifica se è vuota la lista
//		boolean vuoto = lista1.isEmpty();
//		System.out.println(vuoto);
//		
//		//verifica la presenza di quell'elemento
//		boolean presente = lista1.contains("elemento 1");
//		System.out.println(presente);
//		
//		System.out.println("");
		
		//svuota la lista
		//lista1.clear();
		//System.out.println(lista1);
		
		Iterator<String> iteratore = lista1.iterator();
		while (iteratore.hasNext()) { // controlla se ci sono elementi successivi
			String elemento = iteratore.next(); //da gli elementi successivi
			//stampo gli elementi della lista in avanti
			System.out.println(elemento);
		}
		
		System.out.println("");
		
		//creazione di un ListIteretor per iterare attraverso la lista
		ListIterator<String> listaIteratori = lista1.listIterator();
		while (listaIteratori.hasNext()) {
			String elAvanti = listaIteratori.next();
			//stampa degli elementi della lista in avanti
			System.out.println(elAvanti);
		}
		
		System.out.println("");
		
		while (listaIteratori.hasPrevious()) {
			String elIndietro = listaIteratori.previous();
			//stampa degli elementi della lista all'indietro
			System.out.println(elIndietro);
		}
		
	}


}
