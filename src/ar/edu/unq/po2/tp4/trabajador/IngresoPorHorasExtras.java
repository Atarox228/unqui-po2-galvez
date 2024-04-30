package ar.edu.unq.po2.tp4.trabajador;

import java.util.Date;

public class IngresoPorHorasExtras extends Ingresos{
	
	private int cantHorasExtras;
	
	
	public IngresoPorHorasExtras(Date mesPercepcion, String concepto, float montoPercibido, int cantHorasExtras) {
		super(mesPercepcion, concepto, montoPercibido);
		this.cantHorasExtras = cantHorasExtras;
	}
	
	public double getMontoImponible() {
		
		return 0;
	}
	
	
}
