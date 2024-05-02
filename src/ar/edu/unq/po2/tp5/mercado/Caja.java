package ar.edu.unq.po2.tp5.mercado;

import ar.edu.unq.po2.tp5.mercado.Producto;

public class Caja {

	private double montoAPagar;
		
	public Caja() {
		super();
		this.montoAPagar = 0;
	}
		
	public void registrar(Producto producto){
		
		this.montoAPagar += producto.getPrice();
		producto.reducirCantidad();
		
	}
	
	public double getMontoAPagar() {
		return montoAPagar;
	}
		
}
