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
	
	public String verificar(String c1, String c2, String c3, String c4, String c5)
    {
        
		String[] cartas = {c1,c2,c3,c4,c5};
		Map<String, Integer> cuentaValores = new HashMap<>();
		Map<Character, Integer> cuentaPalos= new HashMap<>();
		
		for (String carta : cartas) {
            String valor = carta.length() == 3 ? carta.substring(0, 2) : carta.substring(0, 1);
            char palo = carta.charAt(carta.length() - 1);
            
            cuentaValores.put(valor, cuentaValores.getOrDefault(valor, 0) + 1);
            cuentaPalos.put(palo, cuentaPalos.getOrDefault(palo, 0) + 1);
            
        }
        
		for (int count : cuentaValores.values()) {
            
			if (count == 4) {
                return "Poquer";
            }
            else if (count == 3) {
                return "Trio";
            }
        }
		
		for (int count : cuentaPalos.values() ) {
			
			if(count == 5) {
				return "Color";
			}
		}
		
        return "Nada";
        
    }
	
}
