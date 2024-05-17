package it.corso.java.esercizio.quadrato;

/*
 * Creare una classe MainQuadrato che contenga un metodo main() che  istanzi un oggetto di tipo Quadrato, con lato di valore 5. 
 * Quindi stampare  il perimetro e l’area dell’oggetto appena creato.
 */

public class MainQuadrato {

	public static void main(String[] args) {
		
		// APPROCCIO MEDIANTE L'USO DI UN ISTANZA DELLA CLASSE QUADRATO
		Quadrato q = new Quadrato(5);
		System.out.println("Il lato del quadrato è: " + q.getLato());
		System.out.println("Il perimetro del quadrato di lato " + q.getLato() + " è "+ q.perimetro());
        System.out.println("L'area del quadrato di lato " + q.getLato()  + " è " + q.area());


        //APPROCCIO MEDIANTE USO DEI METODI STATIC PROVENIENTI DALLA CLASSE QUADRATO
//		int lato = 5;
//		System.out.println("L'area del quadrato di lato " + Quadrato.area(lato));
//		System.out.println("Il perimetro del quadrato di lato " + Quadrato.perimetro(lato));
    }

}
