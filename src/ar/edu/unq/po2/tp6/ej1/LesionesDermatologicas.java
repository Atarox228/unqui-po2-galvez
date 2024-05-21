package ar.edu.unq.po2.tp6.ej1;

public enum LesionesDermatologicas {
	ROJO("Rojo","Alta", "descripcion1"), 
	GRIS("Gris","Media", "descripcion2"), 
	AMARILLO("Amarillo","Baja", "descripcion3"), 
	MIEL("Miel","Baja", "descripcion4");	
	
	String color;
	String gravedad;
	String descripcion;
	
	private LesionesDermatologicas(String color, String gravedad, String descripcion) {
		this.color = color;
		this.gravedad = gravedad;
		this.descripcion = descripcion;
	}
	
	public String getColor() {
		return color;
	}

	public String getGravedad() {
		return gravedad;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public LesionesDermatologicas getSiguienteColor() {
        return values()[(this.ordinal() + 1) % values().length];
    }
}
