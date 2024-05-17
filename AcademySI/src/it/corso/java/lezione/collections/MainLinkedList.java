package it.corso.java.lezione.collections;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class MainLinkedList {

	public static void main(String[] args) {
		
		LinkedList<String> linkedList = new LinkedList<>();
		linkedList.add("elemento 1");
		linkedList.add("elemento 2");
		linkedList.add("elemento 3");
		
		//aggiunta eleemento iniziale e finale
		linkedList.addFirst("elemento iniziale");
		linkedList.addLast("elemento finale");
		
		System.out.println(linkedList);
		
		linkedList.removeLast();
		
		//rimuove e restituisce il primo elemento della lista.
		// restituisce null se la list è vuota
		String elementoPrimo = linkedList.poll();
		System.out.println(elementoPrimo);
		
		//restituisce senza rimuovere il primo elemento della lista
		String elementoPrimoEstratto = linkedList.peek();
		System.out.println(elementoPrimoEstratto);
		
		boolean verificaInserimento = linkedList.offer("elemento aggiunto con offer");
		if (verificaInserimento) {
			System.out.println(elementoPrimoEstratto);			
		} else {
			
		}
		
		Iterator<String> iteratore = linkedList.iterator();
		while (iteratore.hasNext()) { // controlla se ci sono elementi successivi
			String elemento = iteratore.next(); //da gli elementi successivi
			//stampo gli elementi della lista in avanti
			System.out.println(elemento);
		}
		
		ListIterator<String> listaIteratori = linkedList.listIterator();
		while (listaIteratori.hasPrevious()) {
			String elIndietro = listaIteratori.previous();
			//stampa degli elementi della lista in avanti
			System.out.println(elIndietro);
		}
	}

}
