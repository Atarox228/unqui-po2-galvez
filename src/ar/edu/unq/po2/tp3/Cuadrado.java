package ar.edu.unq.po2.tp3;

public class Cuadrado {
	
	private Point esquinaSuperiorIzquierda;
	private int lado;
	
	public Cuadrado(Point esquinaSuperiorIzquierda, int lados) {
		super();
		this.esquinaSuperiorIzquierda = esquinaSuperiorIzquierda;
		this.lado = lados;
	}
	
	public Point getEsquinaSuperiorIzquierda() {
		return esquinaSuperiorIzquierda;
	}
	
	public int getLado() {
		return lado;
	}
	
	public int obtenerArea() {
		
		return this.getLado() * 2 ;
	}
	
	public int obtenerPerimetro() {
		
		return this.getLado()*4;
	}
	
}
