package ar.edu.unq.po2.tp6.mockito;

public class Carta {
	
	private String valor;
	private Palos palo;
	
	public Carta(String i, Palos p) {
		this.valor = i;
		this.palo = p;
	}

	public String getValor() {
		return valor;
	}

	public Palos getPalo() {
		return palo;
	}

	public boolean esMayorQue(Carta carta) {
		
		return this.getValorInt() > carta.getValorInt();
	}

	public boolean esMismoPaloQue(Carta carta) {
		
		return this.getPalo()==carta.getPalo();
	}
	
	public int getValorInt() {
		
		switch (valor) {
		
		case "K" :
			return 13;
			
		case "Q":
			return 12;
			
		case "J":
			return 11;
			
		case "A":
			return 1;
			
		default:
			return Integer.parseInt(valor);
		}
		
	}
	
}
