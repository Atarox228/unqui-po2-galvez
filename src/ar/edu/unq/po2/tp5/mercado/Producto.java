package ar.edu.unq.po2.tp5.mercado;

public abstract class Producto {

	protected double price;
	protected String name;
	
	public Producto(double price, String name, int stock) {
		super();
		this.price = price;
		this.name = name;
	}

	public double getPrice() {
		
		return price;
	}


	
	
	
}
