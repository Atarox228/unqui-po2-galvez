package ar.edu.unq.po2.tp5.mercado;

public abstract class Producto {

	protected String name;
	protected double price;
	protected int stock;
	
	public Producto(String name, double price, int stock) {
		super();
		this.name = name;
		this.price = price;
		this.stock = stock;
	}
	
	public int getStock() {
		return stock;
	}

	public double getPrice() {
		
		return price;
	}
	
	public void reducirCantidad() {
		stock--;
	}
}
