package ar.edu.unq.po2.tp6.mockito;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class TestJugada {
	private Jugada poker;
	private Jugada color;
	private Jugada trio;
	
	@BeforeEach
	public void setUp() throws Exception {
		//Setup
		Carta c1 = mock(Carta.class);
		Carta c2 = mock(Carta.class);
		Carta c3 = mock(Carta.class);		
		Carta c4 = mock(Carta.class);
		Carta c5 = mock(Carta.class);
		
		when(c1.getValor()).thenReturn("K");
		when(c2.getValor()).thenReturn("Q");
		when(c3.getValor()).thenReturn("Q");
		when(c4.getValor()).thenReturn("Q");
		when(c5.getValor()).thenReturn("Q");
		
		poker =  new Poquer(c1,c2,c3,c4,c5);
		
		Carta c6 = mock(Carta.class);
		Carta c7 = mock(Carta.class);
		Carta c8 = mock(Carta.class);		
		Carta c9 = mock(Carta.class);
		Carta c10 = mock(Carta.class);
		
		when(c6.getPalo()).thenReturn(Palos.Diamantes);
		when(c7.getPalo()).thenReturn(Palos.Diamantes);
		when(c8.getPalo()).thenReturn(Palos.Diamantes);
		when(c9.getPalo()).thenReturn(Palos.Diamantes);
		when(c10.getPalo()).thenReturn(Palos.Diamantes);
		
		color =  new Color(c6,c7,c8,c9,c10);
		
		Carta c11 = mock(Carta.class);
		Carta c12 = mock(Carta.class);
		Carta c13 = mock(Carta.class);		
		Carta c14 = mock(Carta.class);
		Carta c15 = mock(Carta.class);
		
		when(c11.getValor()).thenReturn("K");
		when(c12.getValor()).thenReturn("Q");
		when(c13.getValor()).thenReturn("Q");
		when(c14.getValor()).thenReturn("Q");
		when(c15.getValor()).thenReturn("J");
		
		trio = new Trio(c11,c12,c13,c14,c15);
	}
	
	@Test
	void pokerContraColor() {
		
		//exercise
		int resultado = poker.compararCon(color);
		
		//verify
		assertTrue(resultado>0);
		
	}
	
	@Test
	void colorContraTrio() {
		
		//exercise
		int resultado = color.compararCon(trio);
		
		//verify
		assertTrue(resultado>0);
		
	}
	
	@Test
	void trioContraPoker() {
		
		//exercise
		int resultado = trio.compararCon(poker);
		
		//verify
		assertFalse(resultado>0);
		
	}
	
	@Test
	void desempate() {
		
		//SetUp
		Carta c1 = new Carta("K",Palos.Corazones);
		Carta c2 = new Carta("Q",Palos.Corazones);
		Carta c3 = new Carta("Q",Palos.Diamantes);
		Carta c4 = new Carta("Q",Palos.Treboles);
		Carta c5 = new Carta("Q",Palos.Picas);
		Carta c11 = new Carta("K",Palos.Diamantes);
		Carta c12 = new Carta("J",Palos.Corazones);
		Carta c13 = new Carta("J",Palos.Treboles);
		Carta c14 = new Carta("J",Palos.Picas);
		Carta c15 = new Carta("J",Palos.Diamantes);

		Jugada poker1 = new Poquer(c1,c2,c3,c4,c5);
		Jugada poker2 = new Poquer(c11,c12,c13,c14,c15);
		
		//exercise
		int resultado = poker1.compararCon(poker2);
		
		//verify
		assertTrue(resultado>0);
		
	}
	
	@Test
	void empateJugadasIguales() {
		
		//SetUp
		Carta c11 = mock(Carta.class);
		Carta c12 = mock(Carta.class);
		Carta c13 = mock(Carta.class);		
		Carta c14 = mock(Carta.class);
		Carta c15 = mock(Carta.class);
		when(c11.getValor()).thenReturn("K");
		when(c12.getValor()).thenReturn("Q");
		when(c13.getValor()).thenReturn("Q");
		when(c14.getValor()).thenReturn("Q");
		when(c15.getValor()).thenReturn("Q");
		
		Jugada poker2 = new Poquer(c11,c12,c13,c14,c15);
		
		//exercise
		int resultado = poker.compararCon(poker2);
		
		//verify
		assertEquals(0,resultado);
		
		
	}

}
