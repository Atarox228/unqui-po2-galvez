package ar.edu.unq.po2.tp5.mercado;

import static org.junit.jupiter.api.Assertions.*;

import ar.edu.unq.po2.tp5.mercado.Producto;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class ProductoTest {

  private Producto arroz;
  private Producto detergente;

  @BeforeEach
  public void setUp() throws Exception {

    arroz = new ProductoCooperativa("Arroz", 18.9d , 10 );
    leche = new ProductoCooperativa("Leche", 22.5d , 5 , 30d);
    detergente = new ProductoEmpresaTradicional("Detergente", 50d, 1);

  }
  
  @Test
  public void testConstructor() {
    assertEquals("Arroz", arroz.getName());
    assertEquals(18.0d, arroz.getPrice(),0.001);
    assertEquals(10, arroz.getStock());

    assertEquals("Leche", leche.getName());
    assertEquals(15.75d, leche.getPrice(),0.001);
    assertEquals(5, leche.getStock());

    assertEquals("Detergente", detergente.getName());
    assertEquals(50d, detergente.getPrice());
    assertEquals(1, detergente.getStock());
  }


  @Test 
  public void testReducirStack(){
    arroz.reducirStock();
    assertEquals(9, arroz.getStock());
    
    detergente.aumentarStock();
    assertEquals(2, detergente.getStock());
  }


  
}
