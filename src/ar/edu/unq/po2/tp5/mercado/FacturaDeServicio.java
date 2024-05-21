package ar.edu.unq.po2.tp5.mercado;

public class FacturaDeServicio extends Factura {
	
	public double costoUnidad;
	public int cantUnidaddes;
	
	public FacturaDeServicio(double costoUnidad, int cantUnidades) {
		super(costoUnidad * cantUnidades);
		this.costoUnidad = costoUnidad;
		this.cantUnidaddes = cantUnidades;
		
	}

	public double getCostoUnidad() {
		return costoUnidad;
	}

	public int getCantUnidaddes() {
		return cantUnidaddes;
	}
	
	
	
}
