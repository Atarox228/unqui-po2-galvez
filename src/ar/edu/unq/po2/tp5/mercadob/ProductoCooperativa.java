package ar.edu.unq.po2.tp5.mercadob;

public class ProductoCooperativa extends Producto{

	private double descuento;
	
	public ProductoCooperativa(double price, String name, int stock) {
		super(price, name, stock);
		this.descuento = 10;
		// TODO Auto-generated constructor stub
	}
	
	public ProductoCooperativa(double price, String name, int stock, double descuento) {
		super(price, name, stock);
		this.descuento = descuento;
	}
	
	public double getDescuento() {
		return (1-(descuento/100));
	}

	public double getPrice() {
		return price*this.getDescuento();
	}
	
	
	
}
