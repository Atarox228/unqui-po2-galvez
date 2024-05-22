package ar.edu.unq.po2.tp6.mockito;

public class Trio extends Jugada {

	public Trio(Carta...cartas) {
		super(cartas);
	}

	@Override
	public int getValorJugada() {
		return 1;
	}

	@Override
	public int getValorDesempate() {
		
		for (Carta carta : cartas) {
            int count = 0;
            for (Carta c : cartas) {
                if (c.getValor().equals(carta.getValor())) {
                    count++;
                }
            }
            if (count == 3) {
                return carta.getValorInt();
            }
        }
		return 0;
	}

}
