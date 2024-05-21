package ar.edu.unq.po2.tp6.ej2;

public enum Deportes {
	RUNNING(1),FUTBOL(2),BASKET(2),TENNIS(3),JABALINA(4);
	
	private int complejidad;

	private Deportes(int complejidad) {
		this.complejidad = complejidad;
	}

	public int getComplejidad() {
		return complejidad;
	}
	
	
	
}

