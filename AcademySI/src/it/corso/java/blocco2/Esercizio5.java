package it.corso.java.blocco2;


/*
 *  Scrivere un programma Java che calcoli la somma di tutti gli elementi presenti in un array di interi.
 */

public class Esercizio5 {

	public static void main(String[] args) {
		int[] num = {21, 2, 13, 41, 5, 100, 7, 18, 94};
		System.out.println(somma(num));
	}
	
	public static int somma(int[] arr){
        int sum = 0;
        for (int i = 0; i < arr.length; i++){
            sum+=arr[i];
        }
        return sum;
    } 

}
