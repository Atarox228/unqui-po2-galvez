package ar.edu.unq.po2.tp5.mercado;

public abstract class Factura {

	private double monto;

	public Factura(double monto) {
		this.monto = monto;
	}

	public double getMonto() {
		return monto;
	}
	
	
}
