package it.corso.java.blocco2;
/*
 * Scrivere un programma Java che trovi il valore massimo presente in un
 * array di interi. Si assuma inizialmente che il primo elemento dell’array sia il massimo iniziale
 */

public class Esercizio4 {

	public static void main(String[] args) {
		int[] num = { 21, 2, 13, 41, 5, 100, 7, 18, 94 };
		System.out.println(ricercaMax(num));
	}

	public static int ricercaMax(int[] arr) {
		int max = arr[0];
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > max) {
				max = arr[i];
			}
		}
		return max;
	}

}