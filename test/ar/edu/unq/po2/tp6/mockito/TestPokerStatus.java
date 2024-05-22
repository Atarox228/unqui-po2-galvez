package ar.edu.unq.po2.tp6.mockito;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class TestPokerStatus {
	private PokerStatus poker ;
	private Carta carta1;
	private Carta carta2;
	private Carta carta3;
	private Carta carta4;
	
	@BeforeEach
	public void setUp() throws Exception {
		//Setup
		poker = new PokerStatus();
		carta1 = new Carta("K",Palos.Diamantes);
		carta2 = new Carta("4",Palos.Diamantes);
		carta3 = new Carta("4",Palos.Treboles);
		carta4 = new Carta("4",Palos.Corazones);
	}
	
	@Test
	void pokerDeLetras() {
		//Setup
		Carta c1 = new Carta("Q",Palos.Corazones);
		Carta c2 = new Carta("Q",Palos.Diamantes);
		Carta c3 = new Carta("Q",Palos.Picas);
		Carta c4 = new Carta("Q",Palos.Treboles);
		
		//exercise
		String resultado = poker.verificar(c1, c2, c3, c4, carta1);
		//verify
		assertEquals(resultado, "Poquer");
		
	}
	
	@Test
	void pierna() {
		
		//Setup
		Carta c1 = new Carta("8",Palos.Picas);
		Carta c2 = new Carta("8",Palos.Treboles);
		
		//exercise		
		String resultado = poker.verificar(carta2, c1, carta3, c2, carta4);
		
		//verify
		assertEquals(resultado, "Trio");
		
	}
	
	@Test
	void doblePar() {
		
		//SetUp
		Carta c1 = new Carta("8",Palos.Picas);
		Carta c2 = new Carta("8",Palos.Treboles);
		
		//exercise	
		String resultado = poker.verificar(carta2, carta3, carta1, c1, c2);
		
		//verify
		assertEquals(resultado, "Nada");
		
	}
	
	@Test
	void pokerDeNumeros() {
		
		//SetUp
		Carta c1 = new Carta("4",Palos.Corazones);
		
		//exercise
		String resultado = poker.verificar(carta2, carta1, carta3, carta4, c1);
		
		//verify
		assertEquals(resultado, "Poquer");
		
	}
	
	@Test
	void color() {
		
		//SetUp
		Carta c1 = new Carta("6",Palos.Diamantes);
		Carta c2 = new Carta("8",Palos.Diamantes);
		Carta c3 = new Carta("10",Palos.Diamantes);
		
		//exercise
		String resultado = poker.verificar(carta1, carta2, c1, c2, c3);
		
		//verify
		assertEquals(resultado, "Color");
		
	}
}
