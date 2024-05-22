package ar.edu.unq.po2.tp6.mockito;

public class Color extends Jugada {

	public Color(Carta...cartas ) {
		super(cartas);
	}

	@Override
	public int getValorJugada() {
		// TODO Auto-generated method stub
		return 2;
	}

	@Override
	public int getValorDesempate() {
		int maxValor = 0;
		for (Carta carta : cartas) {
            int valor = carta.getValorInt();
            if (valor > maxValor) {
            	maxValor = valor;
            }
        }
		return maxValor;
	}

}
