package ar.edu.unq.po2.tp3;

import java.util.ArrayList;

public class Multioperador {
	
	private ArrayList<Integer> numeros;
	
	public void nuevaM() {
		numeros = new ArrayList<Integer>();
	}
	
	public void addNumber(int n)
	  {
	    numeros.add(n);
	  }
	
	public int sumarTodos() {
		int acumulador = 0;
		
		for(int i = 0; i < numeros.size(); i++) {
			acumulador = numeros.get(i) + acumulador;
		}
		return acumulador;
	}
	
	public int restarTodos() {
		int acumulador = 0;
		
		for(int i = 0; i < numeros.size(); i++) {
			acumulador = numeros.get(i) - acumulador;
		}
		return acumulador;
	}
	
	public int multiplicarTodos() {
		int acumulador = 1;
		
		for(int i = 0; i < numeros.size(); i++) {
			acumulador = numeros.get(i) * acumulador;
		}
		return acumulador;
	}
	
}
