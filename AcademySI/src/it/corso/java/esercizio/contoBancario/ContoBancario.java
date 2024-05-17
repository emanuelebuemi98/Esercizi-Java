package it.corso.java.esercizio.contoBancario;

public class ContoBancario {
	
    private double saldoAttuale;
    
    public ContoBancario() {
        this.saldoAttuale = 0.0;
    }
    
    public double versa(double importo) {
        saldoAttuale += importo;
        return importo;
    }   
    public double preleva(double importo) {
        if (saldoAttuale >= importo) {
            saldoAttuale -= importo;
        } else {
            System.out.println("Fondi insufficienti per il prelievo!!!");
        }
        return importo;
    }
    public double getSaldoAttuale() {
    	return saldoAttuale;
    }
}