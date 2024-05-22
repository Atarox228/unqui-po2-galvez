package ar.edu.unq.po2.tp6.mockito;

abstract class Jugada {

	Carta[] cartas;
	
	public Jugada(Carta... cartas) {
        this.cartas = cartas;
    }
	
	public abstract int getValorJugada();
	public abstract int getValorDesempate();
	
	public int compararCon(Jugada otra) {
		
		if(this.getValorJugada() != otra.getValorJugada()) {
			return this.getValorJugada() - otra.getValorJugada();
		}
		
		return this.getValorDesempate() - otra.getValorDesempate();
	}
}
