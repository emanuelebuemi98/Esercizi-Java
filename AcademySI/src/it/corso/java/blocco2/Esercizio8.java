package it.corso.java.blocco2;

import java.util.Scanner;

/*
 * Scrivi un programma Java per risolvere equazioni quadratiche (utilizza if, else if e else).
 * NOTA! Equazione algebriche quadratica del tipo ax^2 + bx + c = 0
 * 
 * */

public class Esercizio8 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		try {
			System.out.println("Inserisci i coefficienti a, b e c");
			
			System.out.print("Coefficiente a: ");
			int a = scanner.nextInt();
			
			System.out.print("Coefficiente b: ");
			int b = scanner.nextInt();
			
			System.out.print("Coefficiente c: ");
			int c = scanner.nextInt();
			
			eqQuadratiche(a, b, c);
			
		} catch (Exception e) {
			System.out.println("I coefficienti di a, b e c deveono essere dei numeri");
		} finally {
			scanner.close();			
		}
	}
	
	public static void eqQuadratiche(int a, int b, int c) {
		double delta = (b * b) - (4 * a * c);
		if (delta > 0) {
			double x1 = (-b + Math.sqrt(delta)) / (2 * a);
			double x2 = (-b - Math.sqrt(delta)) / (2 * a);
			System.out.println("Abbaimo due soluzioni reali e distinte: x1 = " + x1 + " - x2 = " + x2);
		} else if (delta == 0) {
			double x = -b / (2 * a);
			System.out.println("Abbiamo una soluzione reale x = " + x);
		} else {
			System.out.println("Equazione impossibile");
		}		
	}

}
