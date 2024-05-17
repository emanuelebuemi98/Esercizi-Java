package it.corso.java.blocco2;

import java.util.Random;

/*
 * Scrivere un programma Java che generi una password casuale di lunghezza 20 caratteri creando il metodo generaPasswordCasuale(). 
 * Si consiglia l’utilizzo di Math.Random*/

public class Esercizio3 {
	
	public static void main(String[] args) {
		final String CARATTERI = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!@#$%^&*()_+-=[]{}|;:,.<>?";
        System.out.println("La password generata è: " + generaPasswordCasuale(CARATTERI));
	}
	
    public static String generaPasswordCasuale(String caratteriPossibili) {   	
    	
    	StringBuilder pwCasuale = new StringBuilder();
    	for (int i = 0; i < 20; i++) {
    		Random r = new Random();
    		int indiceRandom = r.nextInt(caratteriPossibili.length()-1);
    		pwCasuale.append(caratteriPossibili.charAt(indiceRandom));
    	}
    	return pwCasuale.toString();
    }

}