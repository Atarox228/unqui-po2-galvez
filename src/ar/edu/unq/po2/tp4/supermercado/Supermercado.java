package ar.edu.unq.po2.tp4.supermercado;

import java.util.ArrayList;

public class Supermercado {

	private String nombre;
	private String direccion;
	private ArrayList<Mercancia> mercancias = new ArrayList<Mercancia>();
	
	
	public Supermercado(String nombre, String direccion) {
		super();
		this.nombre = nombre;
		this.direccion = direccion;
	}
	
	public ArrayList<Mercancia> getProductos() {
		return mercancias;
	}

	public long getCantidadDeProductos() {
		
		return this.getProductos().stream().count();
	}
	
	public void agregarProducto(Mercancia mercancia) {
		
		this.getProductos().add(mercancia);
	}
	
	public double getPrecioTotal() {
		
		return this.getProductos().stream().mapToDouble(p -> p.getPrecio()).sum();
	}
	
}

