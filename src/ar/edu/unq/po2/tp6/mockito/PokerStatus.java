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
	
	public boolean verificar(String c1, String c2, String c3, String c4, String c5)
    {
        
		String[] cartas = {c1,c2,c3,c4,c5};
		Map<String, Integer> cuentaCartas = new HashMap<>();
		
		for (String carta : cartas) {
            String valor = carta.length() == 3 ? carta.substring(0, 2) : carta.substring(0, 1);
            cuentaCartas.put(valor, cuentaCartas.getOrDefault(valor, 0) + 1);
        }
        
		for (int count : cuentaCartas.values()) {
            if (count == 4) {
                return true;
            }
        }
		
        return false;
        
    }
	
}
