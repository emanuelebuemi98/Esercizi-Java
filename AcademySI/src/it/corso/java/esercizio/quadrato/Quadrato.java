package it.corso.java.esercizio.quadrato;

/*
 * Creare una classe Quadrato, che dichiari una variabile d’istanza intera  lato. Quindi creare un metodo pubblico che si chiami perimetro() 
 * e che  ritorni il perimetro del quadrato, e un metodo pubblico area() che ritorni  l’area del quadrato.
*/

public class Quadrato {
	
	private int lato;

	public Quadrato(int l) {
		this.lato = l;
	}

	public int getLato() {
		return lato;
	}

	public int perimetro() {
		return lato * 4;
	}

	public int area() {
		return lato * lato;
	}

     // VARIANTE MEDIANTE USO DEI METODI STATIC 
//	 public static int perimetro(int lato) { 
//		 return lato * 4; 
//	 }
//	  
//	 public static int area(int lato) { 
//		 return lato * lato; 
//	 }


}
