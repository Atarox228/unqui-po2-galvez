package ar.edu.unq.po2.tp3;

public class Point {
	
	private int x;
	private int y;
	
	public Point() {
		this(0,0);
	}
	
	public Point(int x, int y) {
		super();
		this.x = x;
		this.y = y;
	}
	
	public int getX() {
		return x;
	}

	public int getY() {
		return y;
	}

	public void moverPuntoA_(int a, int b) {
		this.x = a;
		this.y = b;
	}
	
	public void sumarPuntos(Point b) {
		
		this.x = x + b.getX();
		this.y = y + b.getY();
		
	}
	
	public String mostraPunto() {
		return "(" + x + ", " + y + ")";
	}
	
}
