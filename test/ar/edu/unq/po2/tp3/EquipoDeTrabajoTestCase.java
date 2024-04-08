package ar.edu.unq.po2.tp3;

import static org.junit.jupiter.api.Assertions.*;

import java.time.LocalDate;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class EquipoDeTrabajoTestCase {
	private EquipoDeTrabajo equipo;

	@Test
	void test() {
		fail("Not yet implemented");
	}
	
	@BeforeEach
	public void setUp() throws Exception {
		
		Persona jorge = new Persona("Jorge","Gonzales",LocalDate.of(2000,11,4));
		Persona pedro = new Persona("Pedro","Rodriguez",LocalDate.of(1998,7,1));
		Persona camila = new Persona("Camila","Garcia",LocalDate.of(1990,5,5));
		Persona raul = new Persona("Raul","Paredes",LocalDate.of(1992,2,10));
		Persona sasha = new Persona("Sasha","Diaz",LocalDate.of(1995,1,5));
		
		equipo = new EquipoDeTrabajo("Equipo1");
		
		equipo.agregarIntegrante(jorge);
		equipo.agregarIntegrante(pedro);
		equipo.agregarIntegrante(camila);
		equipo.agregarIntegrante(raul);
		equipo.agregarIntegrante(sasha);
		
	}
	
	@Test
	public void testPromedioEdades() {
		
			float amount = equipo.promedioEdadesIntegrantes();
		
			assertEquals(amount, 28);
	}
}
