package it.corso.java.blocco1;

public class Esercizio {

	public static void main(String[] args) {
		//Esercizio 1
		System.out.println("ESERCIZIO 1");

		int a = 5;
		int b = 3;
		double r1 = (double) a/b;
		System.out.println("Risultato divisione: " + r1);
	    
		System.out.println("");
		
		char c = 'a';
		short s = 5000;
        int castVal = c;
        System.out.println("Valore Unicode del carattere: " + castVal);
        int r2 = castVal * s;
        System.out.println("Risultato moltiplicazione: " + r2);
       
        System.out.println("");
        
        int i = 6;
        float f = 3.14F;
        float r3 = i + f;
        System.out.println("Risultato somma: " + r3);
        
        System.out.println("");
		
        double r4 = r1 - r2 - r3;
        System.out.println("Risultato sottrazione: " + r4);
		
        System.out.println("");
        System.out.println("------------------");
        System.out.println("");
        
        //Esercizio 2
        System.out.println("ESERCIZIO 2");
        byte numeroByte = 66;
        short numeroShort = 19740;
        int numeroInt = 3659383;
        long numeroLong = 50000L + ((numeroByte + numeroShort + numeroInt) * 10);
        System.out.println("Risultato:" + numeroLong);
        
        System.out.println("");
        System.out.println("------------------");
        System.out.println("");
        
        //Esercizio 3
        System.out.println("ESERCIZIO 3");
        final double LIBBRE = 180.50;
        final double LIBBRA_IN_KG = 0.45359237;
        System.out.println(LIBBRE + " libbre sono equivalenti a " + LIBBRA_IN_KG + " chilogrammi.");
	}

}
