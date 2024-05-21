package ar.edu.unq.po2.tp5.mercado;

public class ProductoCooperativa extends Producto{

	private double descuento;
	
	public ProductoCooperativa(String name, double price,  int stock) {
		super(name, price, stock);
		this.descuento = 10;
		// TODO Auto-generated constructor stub
	}
	
	public ProductoCooperativa(String name, double price, int stock, double descuento) {
		super(name, price, stock);
		this.descuento = descuento;
	}
	
	public double getDescuento() {
		return (1-(descuento/100));
	}

	public double getPrice() {
		return price*this.getDescuento();
	}
	
	
	
}
