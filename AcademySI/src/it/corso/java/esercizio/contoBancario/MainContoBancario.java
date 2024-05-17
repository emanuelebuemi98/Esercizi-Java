package it.corso.java.esercizio.contoBancario;

/*Scrivere un programma che costruisca un conto bancario, versi in esso
$1000, prelevi da esso $500, prelevi altri $400 e infine visualizzi il saldo
rimanente */

public class MainContoBancario {

	public static void main(String[] args) {
        ContoBancario c = new ContoBancario();
        System.out.println("Versamento di: " + c.versa(1000.0) + "$");
        System.out.println("1° prelievo di: " + c.preleva(500.0) + "$");
        System.out.println("2° prelievo di: " + c.preleva(400.0)+ "$");
        System.out.println("Saldo rimanente: " + c.getSaldoAttuale() + "$"); 

	}

}
