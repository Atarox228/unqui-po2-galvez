package ar.edu.unq.po2.tp3;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;

public class CounterTestCase {
	private Counter counter;
	/*
	* Crea un escenario de test básico, que consiste en un contador
	* con 10 enteros
	*
	* @throws Exception
	*/
	@BeforeEach
	public void setUp() throws Exception {
		//Se crea el contador
		counter = new Counter();
		//Se agregan los numeros. Un solo par y nueve impares
		counter.addNumber(11);
		counter.addNumber(3);
		counter.addNumber(51);
		counter.addNumber(777);
		counter.addNumber(963);
		counter.addNumber(1);
		counter.addNumber(195);
		counter.addNumber(1);
		counter.addNumber(10);
		counter.addNumber(420);
	}
	/*
	* Verifica la cantidad de pares
	*/
	@Test
	public void testEvenNumbers() {
		// Getting the even occurrences
			int amount = counter.contadorDePares();
		// I check the amount is the expected one
			assertEquals(amount, 2);
	}
	
	@Test
	public void testNumsImpars() {
		int amount = counter.contadorDeImpares();
		assertEquals(amount, 8);
	}
	
	@Test
	public void testNumsMult() {
		int amount = counter.contadorDeMultiplosDe_(2);
		assertEquals(amount, 2);
	}
	
	@Test
	public void testDesarmador() {
		int amount = counter.mayorCantidadDigitosPares();
		assertEquals(amount, 420);
	}
	
	@Test
	public void testMultiplos() {
		int amount = counter.multEntreCeroAMilDe_Y_(36,21);
		assertEquals(amount, 756);
	}
}
