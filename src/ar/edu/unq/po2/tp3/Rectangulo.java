package ar.edu.unq.po2.tp3;

public class Rectangulo {
	
	private int largo;
	private int ancho;
	private Point esquinaSuperiorIzquierda;
	
	public Rectangulo(Point punto,int largo, int ancho) {
		super();
		this.esquinaSuperiorIzquierda = punto;
		this.largo = largo;
		this.ancho = ancho;
	}
	
	public int getLargo() {
		return largo;
	}

	public int getAncho() {
		return ancho;
	}

	public Point getEsquinaSuperiorIzquierda() {
		return esquinaSuperiorIzquierda;
	}

	public int obtenerArea() {
		
		return this.getAncho() * this.getLargo();
	}
	
	public int obtenerPerimetro() {
		
		return (this.getAncho()*2) + (this.getLargo()*2);
	}
	
	public String esVerticalUHorizontal() {
		
		if(this.getAncho() > this.getLargo()) {
			return "Horizontal";
		}
		else {
			return "Vertical";
		}
	}
	
	
	
}
