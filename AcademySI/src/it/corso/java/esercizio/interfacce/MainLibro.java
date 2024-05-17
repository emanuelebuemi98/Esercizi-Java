package it.corso.java.esercizio.interfacce;

public class MainLibro {

	public static void main(String[] args) {
        LibroCartaceo l1 = new LibroCartaceo("La vita è bella", "Roberto Benigni", 133);
        System.out.println("INFO LIBRO CARTACEO");
        l1.informazioni();
        System.out.println();

        Ebook l2 = new Ebook("La storia", "Mario Rossi", 118);
        System.out.println("INFO LIBRO DIGITALE");
        l2.informazioni();
        l2.visualizza();

	}

}