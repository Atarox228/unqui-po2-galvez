package ar.edu.unq.po2.tp4.supermercado;

public abstract class Mercancia {
	
	private String nombre;
	private double precioBase;
	private boolean precioCuidado;
	
	public Mercancia(String nombre, double precioBase, boolean esPrecioCuidado) {
		super();
		this.nombre = nombre;
		this.precioBase = precioBase;
		this.precioCuidado = esPrecioCuidado;
	}

	public Mercancia(String nombre, double precioBase) {
		super();
		this.nombre = nombre;
		this.precioBase = precioBase;
		this.precioCuidado = false;
	}

	public String getNombre() {
		return nombre;
	}

	public double getPrecio() {
		return precioBase;
	}

	private void setPrecioBase(double precioBase) {
		this.precioBase = precioBase;
	}

	public boolean esPrecioCuidado() {
		return precioCuidado;
	}
	
	public void aumentarPrecio(double precio) {
		
		this.setPrecioBase(this.precioBase + precio);
		
	}
}
