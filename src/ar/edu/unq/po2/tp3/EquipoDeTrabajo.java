package ar.edu.unq.po2.tp3;

import java.util.ArrayList;

public class EquipoDeTrabajo {
	
	private String nombre;
	private ArrayList<Persona> personas;
	
	public EquipoDeTrabajo(String nombre) {
		super();
		this.nombre = nombre;
		this.personas = new ArrayList<Persona>();
	}
	
	public void agregarIntegrante(Persona p) {
		
		personas.add(p);
	}
	
	public String getNombre() {
		return nombre;
	}

	public float promedioEdadesIntegrantes() {
		
		int acumulador = 0;
		int contador = 0;
		
		for (int i = 0; i < personas.size(); i++) {
			acumulador = acumulador + personas.get(i).edad();
			contador ++;
		    }
		
		return acumulador/contador;
	}
	
}
