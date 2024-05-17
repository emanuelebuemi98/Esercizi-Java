package it.corso.java.esercizio.interfacce;

class Ebook extends Libro implements FormatoDigitale {
	
    public Ebook(String titolo, String autore, int numeroPagine) {
        super(titolo, autore, numeroPagine);
    }

    @Override
    public void visualizza() {
        System.out.println("Il libro con titolo: " + super.getTitolo() + " è disponibile in formato digitale.");
    }
    
	public void informazioni() {
		System.out.println("Titolo del libro IN FORMATO DIGITALE: " + super.getTitolo() + "\nAutore del libro: " + super.getAutore() + 
				"\nNumero di pagine: " + super.getNumeroPagine());
	}
    
}