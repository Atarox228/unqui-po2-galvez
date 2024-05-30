package ar.edu.unq.po2.tp7.template;

public abstract class Empleado {
	
	private int horasTrabajadas;
	private boolean estaCasado;
	private int cantHijos;
	
	public Empleado(int horasTrabajadas, boolean estaCasado, int cantHijos) {
		super();
		this.horasTrabajadas = horasTrabajadas;
		this.estaCasado = estaCasado;
		this.cantHijos = cantHijos;
	}

	public int getHorasTrabajadas() {
		return horasTrabajadas;
	}

	public boolean isEstaCasado() {
		return estaCasado;
	}

	public int getCantHijos() {
		return cantHijos;
	}

	public abstract double sueldoBruto();
	
	public double sueldo() {
		
		double sueldo = this.sueldoBruto();
		double descuento = sueldo * 0.13;
		return sueldo - descuento;
	}
	
	
}
