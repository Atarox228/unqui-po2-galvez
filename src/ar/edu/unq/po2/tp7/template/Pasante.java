package ar.edu.unq.po2.tp7.template;

public class Pasante extends Empleado{

	public Pasante(int horasTrabajadas, boolean estaCasado, int cantHijos) {
		super(horasTrabajadas, estaCasado, cantHijos);
		// TODO Auto-generated constructor stub
	}

	@Override
	public double sueldoBruto() {

		return (40*this.getHorasTrabajadas());
	}
	
	

}
