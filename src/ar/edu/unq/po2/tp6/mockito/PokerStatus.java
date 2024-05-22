package ar.edu.unq.po2.tp6.mockito;

import java.util.HashMap;
import java.util.Map;

public class PokerStatus {

	/*
	 * La carta esta armada mediante las siguientes partes:
	 * 1.Numeracion (del 1 al 10, J, Q, K) 
	 * 2.Palo (P = picas, C = corazones, D = diamantes, T = tréboles).
	 */
	
	public String numeros(String c) {
		
		return c.substring(0, c.length()-1);
	}
	
	public Jugada verificar(Carta c1, Carta c2, Carta c3, Carta c4, Carta c5)
    {
        
		Carta[] cartas = {c1,c2,c3,c4,c5};
		Map<String, Integer> cuentaValores = new HashMap<>();
		Map<Palos, Integer> cuentaPalos= new HashMap<>();
		
		for (Carta carta : cartas) {
			String valor = carta.getValor();
			Palos palo = carta.getPalo();
            
            cuentaValores.put(valor, cuentaValores.getOrDefault(valor, 0) + 1);
            cuentaPalos.put(palo, cuentaPalos.getOrDefault(palo, 0) + 1);
            
        }
        
		for (int count : cuentaValores.values()) {
            
			if (count == 4) {
                return new Poquer(cartas);
            }
            else if (count == 3) {
                return new Trio(cartas);
            }
        }
		
		for (int count : cuentaPalos.values() ) {
			
			if(count == 5) {
				return new Color(cartas);
			}
		}
		
        return null;
        
    }
	
}
