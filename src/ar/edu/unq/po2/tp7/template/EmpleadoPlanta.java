package ar.edu.unq.po2.tp7.template;

public class EmpleadoPlanta extends Empleado {

	public EmpleadoPlanta(int horasTrabajadas, boolean estaCasado, int cantHijos) {
		super(horasTrabajadas, estaCasado, cantHijos);
		// TODO Auto-generated constructor stub
	}

	@Override
	public double sueldoBruto() {
		
		double basico = 3000;
		double extraPorHijo = 150 * this.getCantHijos();
		
		return basico + extraPorHijo;
	}

}
