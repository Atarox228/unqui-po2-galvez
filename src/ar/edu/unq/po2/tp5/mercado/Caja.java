package ar.edu.unq.po2.tp5.mercado;

public class Caja implements Agencia{

	private double montoAPagar;
		
	public Caja() {
		super();
		this.montoAPagar = 0;
	}
	
	public double getMontoAPagar() {
		return montoAPagar;
	}
	
	
	public void registrar(Producto producto){
		
		this.montoAPagar += producto.getPrice();
		producto.reducirCantidad();
		
	}

	@Override
	public void registrarPago(Factura factura) {
		
		
	}
	
	public void registrarFactura(Factura factura) {
		
		montoAPagar += factura.getMonto();
		registrarPago(factura);
	}
}
