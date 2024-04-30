package ar.edu.unq.po2.tp5.mercado;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Mercado {
	
	private Map<Producto,Integer> productos;
	private String nombre;
	
	public Mercado(String nombre) {
		super();
		this.productos = new HashMap<>();
		this.nombre = nombre;
	}
	
	public Map<Producto, Integer> getProductos() {
		return productos;
	}

	public void agregarProducto(Producto producto, int cantidad) {
		this.getProductos().put(producto,cantidad);
	}
	
	public void decrementarCantidadProducto(Producto producto) {
		int cantidad = this.productos.get(producto) - 1;
		this.productos.put(producto, cantidad);
	}
	
}
