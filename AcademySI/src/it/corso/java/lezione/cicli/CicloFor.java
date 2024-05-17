package it.corso.java.lezione.cicli;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CicloFor {
	
	public static void main(String[] args) {
		int numeri[] = {1,2,3,4,5};
		
		for(int i=0; i<numeri.length; i++) {
			System.out.println(numeri[i]);
		}
		
		String[] nomi = {"Marco", "Luca", "Pippo"};
		for (String nome : nomi) {
			System.out.println(nome);
		}
		
		List<String> colori = new ArrayList<>();
		colori.add("rosso");
		colori.add("nero");
		colori.add("giallo");
		
		//al posto della lista utilzzo per la collection il metodo foreach
		//all'interno del metodo forEach() chiamato sull'oggetto colori di tipo List 
		//passo una lambda expression che può essere vista come una funzione anonima.
		//la sintatti della lambda expression è  (parametri) -> (corpo)
		colori.forEach(colore -> System.out.println(colore.toUpperCase()));
		
		Map<String, Integer> mappa = new HashMap<>();
		mappa.put("chiave1", 1);
		mappa.put("chiave2", 2);
		mappa.put("chiave3", 3);
		
		mappa.forEach((chiave, valore) -> {
			System.out.println(valore);
		});
		
	}

}
