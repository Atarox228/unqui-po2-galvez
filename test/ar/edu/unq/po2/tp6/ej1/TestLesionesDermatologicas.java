package ar.edu.unq.po2.tp6.ej1;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TestLesionesDermatologicas {

	@Test
	void test() {
		fail("Not yet implemented");
	}
	
	public static void main(String[] args) {
        for (LesionesDermatologicas color : LesionesDermatologicas.values()) {
            System.out.println("Color: " + color.getColor());
            System.out.println("Descripción: " + color.getDescripcion());
            System.out.println("Nivel de Riesgo: " + color.getGravedad());
            System.out.println("Siguiente Color: " + color.getSiguienteColor().getColor());
            System.out.println();
        }
    }
	
}
