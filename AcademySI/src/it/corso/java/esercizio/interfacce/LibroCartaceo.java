package it.corso.java.esercizio.interfacce;

public class LibroCartaceo extends Libro{
	
    public LibroCartaceo(String titolo, String autore, int numeroPagine) {
        super(titolo, autore, numeroPagine);
    }
    
	public void informazioni() {
		System.out.println("Titolo del libro IN FORMATO CARTACEO: " + super.getTitolo() + "\nAutore del libro: " + super.getAutore() + 
				"\nNumero di pagine: " + super.getNumeroPagine());
	}
}