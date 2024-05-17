package it.corso;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertFalse;

public class MainTest {

	@Test
	public void Maintest() {
		
		// Test per entrambi i numeri pari
		assertTrue(Main.controllaNumeri(2, 4));
		
		// Test per entrambi i numeri dispari
		assertFalse(Main.controllaNumeri(3, 5));
		
		// Test per un numero pari e uno dispari, primo maggiore del secondo
		assertTrue(Main.controllaNumeri(4, 3));
		
		// Test per un numero pari e uno dispari, secondo maggiore del primo
		assertFalse(Main.controllaNumeri(2, 7));

    }
	
}
