package ar.edu.unq.po2.tp7.template;

public class EmpleadoTemporario extends Empleado {
	
	public EmpleadoTemporario(int horasTrabajadas, boolean estaCasado, int cantHijos) {
		super(horasTrabajadas, estaCasado, cantHijos);
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public double sueldoBruto() {
		
		int basico = 1000;
		int pagoPorHoras = this.getHorasTrabajadas()*5;
		int extra = (isEstaCasado() || getCantHijos() > 0) ? 100 : 0;
		
		return basico + pagoPorHoras + extra;
	}
	
}
