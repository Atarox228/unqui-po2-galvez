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
		boolean resultado = poker.verificar("QD", "QP", "QC", "QT", "KD");
		//verify
		assertTrue(resultado);
		
	}
	
	@Test
	void pierna() {
		//exercise		
		boolean resultado = poker.verificar("9D", "8P", "9C", "7T", "9T");
		//verify
		assertFalse(resultado);
		
	}
	
	@Test
	void doblePar() {
		//exercise	
		boolean resultado = poker.verificar("2D", "2P", "1C", "3T", "3C");
		//verify
		assertFalse(resultado);
		
	}
	
	@Test
	void pokerDeNumeros() {
		//exercise
		boolean resultado = poker.verificar("4D", "5P", "4C", "4T", "4P");
		//verify
		assertTrue(resultado);
		
	}
	
	
}
