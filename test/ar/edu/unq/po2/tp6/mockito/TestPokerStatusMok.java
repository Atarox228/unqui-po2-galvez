package ar.edu.unq.po2.tp6.mockito;
import static org.mockito.Mockito.*;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class TestPokerStatusMok {
	private PokerStatus poker ;
	private Carta carta1;
	private Carta carta2;
	private Carta carta3;
	private Carta carta4;
	private Carta carta5;
	
	@BeforeEach
	public void setUp() throws Exception {
		//Setup
		poker = new PokerStatus();
		carta1 = mock(Carta.class);
		carta2 = mock(Carta.class);
		carta3 = mock(Carta.class);		
		carta4 = mock(Carta.class);
		carta5 = mock(Carta.class);
		
	}
	
	@Test
	void pokerDeLetras() {
		//Setup
		when(carta1.getValor()).thenReturn("K");
		when(carta2.getValor()).thenReturn("Q");
		when(carta3.getValor()).thenReturn("Q");
		when(carta4.getValor()).thenReturn("Q");
		when(carta5.getValor()).thenReturn("Q");
		
		//exercise
		Jugada resultado = poker.verificar(carta1, carta2, carta3, carta4, carta5);
		
		//verify
		assertTrue(resultado instanceof Poquer);
		
	}
	
	@Test
	void pierna() {
		
		//Setup
		when(carta1.getValor()).thenReturn("4");
		when(carta2.getValor()).thenReturn("2");
		when(carta3.getValor()).thenReturn("4");
		when(carta4.getValor()).thenReturn("3");
		when(carta5.getValor()).thenReturn("4");
		
		//exercise		
		Jugada resultado = poker.verificar(carta1, carta2, carta3, carta4, carta5);
		
		//verify
		assertTrue(resultado instanceof Trio);
		
	}
	
	@Test
	void nada() {
		
		//SetUp
		when(carta1.getValor()).thenReturn("1");
		when(carta1.getPalo()).thenReturn(Palos.Corazones);
		when(carta2.getValor()).thenReturn("2");
		when(carta2.getPalo()).thenReturn(Palos.Diamantes);
		when(carta3.getValor()).thenReturn("3");
		when(carta4.getValor()).thenReturn("4");
		when(carta5.getValor()).thenReturn("5");
		
		//exercise	
		Jugada resultado = poker.verificar(carta1, carta2, carta3, carta4, carta5);
		
		//verify
		assertNull(resultado);
		
	}
	
	@Test
	void pokerDeNumeros() {
		
		//SetUp
		when(carta1.getValor()).thenReturn("4");
		when(carta2.getValor()).thenReturn("2");
		when(carta3.getValor()).thenReturn("4");
		when(carta4.getValor()).thenReturn("4");
		when(carta5.getValor()).thenReturn("4");
		
		//exercise
		Jugada resultado = poker.verificar(carta1, carta2, carta3, carta4, carta5);
		
		//verify
		assertTrue(resultado instanceof Poquer);
		
	}
	
	@Test
	void color() {
		
		//SetUp
		when(carta1.getPalo()).thenReturn(Palos.Corazones);
		when(carta2.getPalo()).thenReturn(Palos.Corazones);
		when(carta3.getPalo()).thenReturn(Palos.Corazones);
		when(carta4.getPalo()).thenReturn(Palos.Corazones);
		when(carta5.getPalo()).thenReturn(Palos.Corazones);
		
		//exercise
		Jugada resultado = poker.verificar(carta1, carta2, carta3, carta4, carta5);
		
		//verify
		assertTrue(resultado instanceof Color);
		
	}
	
}
