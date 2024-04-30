package ar.edu.unq.po2.tp5.mercado;

public class Caja {

	private double montoAPagar;
	private Mercado mercado ;

	public Caja( Mercado mercado) {
		super();
		this.montoAPagar = 0;
		this.mercado = mercado;
	}
		
	public void registrar(Producto producto){
		
		this.montoAPagar += producto.getPrice();
		this.mercado.decrementarCantidadProducto(producto);
		
	}
	
	public double getMontoAPagar() {
		return montoAPagar;
	}
		
}
