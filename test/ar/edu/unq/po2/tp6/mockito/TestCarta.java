package ar.edu.unq.po2.tp6.mockito;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class TestCarta {
	
	private Carta carta1;
	private Carta carta2;
	private Carta carta3;
	
	@BeforeEach
	public void setUp() throws Exception {
		//Setup
		carta1 = new Carta("4", Palos.Picas);
		carta2 = new Carta("5",Palos.Picas);
		carta3 = new Carta("6",Palos.Corazones);
	}
	
	@Test
	void  valorCorrecto(){
		
		int valor = carta1.getValorInt();
		
		assertEquals(4,valor);
	}
	
	@Test
	void paloCorrecto() {
		
		Palos palo = carta2.getPalo();
		
		assertEquals(Palos.Picas, palo);
	}
	
	@Test
	void cartaMayorQueOtra() {
		
		boolean respuesta = carta3.esMayorQue(carta1);
		
		assertTrue(respuesta);
		
	}
	
	@Test
	void noEsMayorQue() {
		
		boolean respuesta = carta1.esMayorQue(carta3);
		
		assertFalse(respuesta);
	}
	
	@Test
	void sonMismoPalo() {
		
		boolean respuesta = carta1.esMismoPaloQue(carta2);
		
		assertTrue(respuesta);
	}
	
	@Test
	void noSonMismoPalo() {
		
		boolean respuesta = carta1.esMismoPaloQue(carta3);
		
		assertFalse(respuesta);
	}
}
