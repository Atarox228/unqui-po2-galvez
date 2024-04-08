package ar.edu.unq.po2.tp3;

import java.time.LocalDate;
import java.time.Period;

public class Persona {
	
	private String nombre;
	private String apellido;
	private LocalDate fechaNacimiento;
	
	public Persona(String nombre, String apellido, LocalDate fechaNacimiento) {
		super();
		this.nombre = nombre;
		this.apellido = apellido;
		this.fechaNacimiento = fechaNacimiento;
	}

	public String getNombre() {
		return nombre;
	}
	
	public String getApellido() {
		return apellido;
	}

	public LocalDate getFechaNacimiento() {
		return fechaNacimiento;
	}

	public int edad() {
		
		LocalDate fechaActual = LocalDate.now();
		Period periodo = Period.between(this.getFechaNacimiento(), fechaActual);
		return periodo.getYears();
	}
	
	public boolean menorQue(Persona persona) {
		
		return this.edad() < persona.edad();
	}
	
	/*
	 * public int edad() {
		
		LocalDate fechaActual = LocalDate.now();
		Period periodo = Period.between(this.getFechaNacimiento(), fechaActual);
		return periodo.getYears();
	}
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * */
	
}
