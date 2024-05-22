package ar.edu.unq.po2.tp6.mockito;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class TestPokerStatus {
	private PokerStatus poker ;
	
	@BeforeEach
	public void setUp() throws Exception {
		//Setup
		poker = new PokerStatus();
	}
	
	@Test
	void pokerDeLetras() {
		//exercise
		String resultado = poker.verificar("QD", "QP", "QC", "QT", "KD");
		//verify
		assertEquals(resultado, "Poquer");
		
	}
	
	@Test
	void pierna() {
		//exercise		
		String resultado = poker.verificar("9D", "8P", "9C", "7T", "9T");
		//verify
		assertEquals(resultado, "Trio");
		
	}
	
	@Test
	void doblePar() {
		//exercise	
		String resultado = poker.verificar("2D", "2P", "1C", "3T", "3C");
		//verify
		assertEquals(resultado, "Nada");
		
	}
	
	@Test
	void pokerDeNumeros() {
		//exercise
		String resultado = poker.verificar("4D", "5P", "4C", "4T", "4P");
		//verify
		assertEquals(resultado, "Poquer");
		
	}
	
	@Test
	void color() {
		//exercise
		String resultado = poker.verificar("4P", "5P", "6P", "7P", "9P");
		//verify
		assertEquals(resultado, "Color");
		
	}
}
