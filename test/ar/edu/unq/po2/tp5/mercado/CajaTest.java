package ar.edu.unq.po2.tp5.mercado;

import static org.junit.jupiter.api.Assertions.*;

import ar.edu.unq.po2.tp5.mercado.Caja;
import ar.edu.unq.po2.tp5.mercado.Producto;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


class CajaTest {
	private Caja caja;
	private Producto arroz;
	private Producto detergente;
	
	
	@BeforeEach
	public void setUp() throws Exception {

		caja = new Caja();
		arroz = new ProductoCooperativa("Arroz", 18.9d , 10 );
		detergente = new ProductoEmpresaTradicional("Detergente", 50d, 1);
		
	}

	@Test
	public void testNumsImpars() {
		caja.registrar(arroz);
		caja.registrar(arroz);
		caja.registrar(detergente);
		double monto = caja.getMontoAPagar();
		assertEquals(monto, 84.02d ,0.001);
	}
}
