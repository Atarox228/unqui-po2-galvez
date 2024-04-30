package ar.edu.unq.po2.tp4.trabajador;

import java.util.Date;

public abstract class Ingresos {

	protected Date mesPercepcion;
	protected String concepto;
	protected double montoPercibido;
	
	public Ingresos(Date mesPercepcion, String concepto, float montoPercibido) {
		this.mesPercepcion = mesPercepcion;
		this.concepto = concepto;
		this.montoPercibido = montoPercibido;
	}
	
	public double getTotalPercibido() {
		
		return this.montoPercibido;
	}
	
	public double getMontoImponible() {
		
		return this.getTotalPercibido();
	}
	
	public double getImpuestoAPagar() {
		
		return this.getMontoImponible() * 0.02;
	}
}
