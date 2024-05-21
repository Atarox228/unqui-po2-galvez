package ar.edu.unq.po2.tp4.supermercado;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ProductoPrimeraNecesidadTest {

	private ProductoPrimeraNecesidad leche;
	private ProductoPrimeraNecesidad arroz;
	private ProductoPrimeraNecesidad vino;
	
	@BeforeEach
	public void setUp() {
		leche = new ProductoPrimeraNecesidad("Leche", 8d, false, 10);
		arroz = new ProductoPrimeraNecesidad("Arroz", 18.9d, true, 20);
		vino = new ProductoPrimeraNecesidad("Vino", 55d, 5);
	}
	
	@Test
	public void testCalcularPrecio() {
		assertEquals(7.2d, leche.getPrecio());
		assertEquals(15.12d, arroz.getPrecio());
		assertEquals(52.25d, vino.getPrecio());
	}
}
