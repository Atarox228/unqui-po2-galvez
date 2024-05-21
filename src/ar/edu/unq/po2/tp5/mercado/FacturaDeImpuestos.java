package ar.edu.unq.po2.tp5.mercado;

public class FacturaDeImpuestos extends Factura{

	public double tasa;
	
	public FacturaDeImpuestos(double tasa) {
		super(tasa);
		this.tasa = tasa;
	}

	public double getTasa() {
		return tasa;
	}
	
	
}
