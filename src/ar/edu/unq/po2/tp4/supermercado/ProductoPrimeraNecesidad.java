package ar.edu.unq.po2.tp4.supermercado;

public class ProductoPrimeraNecesidad extends Mercancia{
	
	
	
	public ProductoPrimeraNecesidad(String nombre, double precioBase, boolean esPrecioCuidado, double descuento) {
		
		super(nombre, (precioBase * (1 - (descuento / 100))), esPrecioCuidado);
		
	}
	
	public ProductoPrimeraNecesidad(String nombre, double precioBase, double descuento) {
		super(nombre,(precioBase * (1 - (descuento / 100))));
	}
	
	
	
}