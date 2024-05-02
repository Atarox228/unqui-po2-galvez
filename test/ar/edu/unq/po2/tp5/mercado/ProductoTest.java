package ar.edu.unq.po2.tp5.mercado;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ProductoTest {

	@Test
	public void testConstructor() {
		assertEquals("Arroz", arroz.getNombre());
		assertEquals(new Double(18.9), arroz.getPrecio());
		assertTrue(arroz.esPrecioCuidado());
		
		assertEquals("Vino", vino.getNombre());
		assertEquals(new Double(55), vino.getPrecio());
		assertFalse(vino.esPrecioCuidado());
	}

}
