package it.corso.java.esercizio.libro;

public class MainLibro {

	public static void main(String[] args) {
		
        Libro l1 = new Libro("Il gatto con gli stivali", "26252222727", "Mario Rossi", 1984);
        l1.stampaInfo();
        System.out.println("\nOttieni informazioni del 1° libro:\n" + l1.ottieniInfo());
        
        System.out.println("");
        
        Libro l2 = new Libro();
        l2.setTitolo("Il bambino con il pigiama a righe");
        l2.setISBN("3746672828292");
        l2.setAutore("Fabio Verdi");
        l2.setAnno(1977);
        l2.stampaInfo();
        System.out.println("\nOttieni informazioni del 2°libro:\n" + l2.ottieniInfo());
        
        System.out.println("");
        Libro l3 = new Libro("La storia di Mussolini", "Luigi Gialli");
        l3.setISBN("6453858733");
        l3.setAnno(1980);
        l3.stampaInfo();
        System.out.println("\nOttieni informazioni del 3° libro:\n" + l3.ottieniInfo());
        

	}

}
