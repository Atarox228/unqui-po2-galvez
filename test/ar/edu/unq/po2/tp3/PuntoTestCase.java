package ar.edu.unq.po2.tp3;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class PuntoTestCase {
	
	private Punto punto;
	/*
	* Crea un escenario de test básico, que consiste en un contador
	* con 10 enteros
	*
	* @throws Exception
	*/
	@BeforeEach
	public void setUp() throws Exception {
		//Se crea el contador
		punto = new Punto();
		//Se agregan los numeros. Un solo par y nueve impares
		punto.setT("A");
	}
	
	@Test
	public void testCant() {
		int amount = punto.getT().length();
		assertEquals(amount, 1);
	}
	
	@Test
	public void testSum() {
		String amount = punto.getA() + 1;
		assertEquals(amount, "abc1");
	}
	
	@Test
	public void testUpper() {
		String amount = punto.getA().toUpperCase();
		assertEquals(amount, "ABC");
	}
	
	@Test
	public void testIndex() {
		punto.setT("Libertad");
		int amount = punto.getT().indexOf("r");
		assertEquals(amount, 4);
	}
	
	@Test
	public void testLastIndex() {
		punto.setT("Universidad");
		int amount = punto.getT().lastIndexOf("i");
		assertEquals(amount, 7);
	}
	
	@Test
	public void testSub() {
		punto.setT("Quilmes");
		String amount = punto.getT().substring(2,4);
		assertEquals(amount, "il");
	}
	
	@Test
	public void testStart() {
		String x = punto.getA();
		boolean amount = (x.length() + x).startsWith("a");
		assertEquals(amount, false);
	}
	
	@Test
	public void testBool() {
		String x = punto.getA();
		String y = punto.getS();
		
		boolean amount = x==y;
		assertEquals(amount, true);
	}
	
	@Test
	public void testSub2() {
		String x = punto.getA();
		boolean amount = x.substring(1, 3).equals("bc");
		assertEquals(amount, false);
	}
}
