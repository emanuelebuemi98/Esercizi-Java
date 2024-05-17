package it.corso.java.lezione.collections;

import java.util.*;

public class MainHashMap {
	
	public static void main(String[] args) {
		
		Map <Integer, String> map = new HashMap<>();
	
		
		map.put(1, "ema");
		map.put(2,"fil");
		map.put(3,"ale");
		// il valore della chiave 3 viene sovrascritto
		map.put(3,"carlo");
		
		System.out.println(map);
		
		System.out.println("-------");
		//acedere al valore della chiave 1
		String valore = map.get(1);
		System.out.println(valore);
		System.out.println("-------");
		//verifica se c'è un valore associato alla chiave o viceversa
		boolean esisteKey = map.containsKey(2);
		System.out.println(esisteKey);
		boolean esisteValue = map.containsValue("fil");
		System.out.println(esisteValue);
		
		System.out.println("-------");
		Set<Integer> keys = map.keySet();
		System.out.println(keys);
		System.out.println("-------");
		
		//Iterazione mappa
		System.out.println("Modi per iterare sulla mappa");
		/*per ogni elemento di tipo interer-sting si crea un perno che andrà a scandagliare
		 * tutto l'entrySet ovvero l'insieme dei valore key-value della mappa. Ogni elemento dell'insieme 
		 * restituito è un'istanza di Map.entry
		 * */
		// map.entrySet prende tutte le coppie chiave valore della mappa
		//Otteniamo un oggetto entry che è un istanza della Map.entry
		for(Map.Entry<Integer, String> entry : map.entrySet()) {
			Integer key = entry.getKey();
			System.out.println(key);
			String value = entry.getValue();
			System.out.println(value);
		}
		
		System.out.println("-------");
		
		map.forEach((key,value) -> {
			System.out.println("Chiave - valore: " + key + " " + value);
		});
		
		
	}


}
