package ar.edu.unq.po2.tp3;

import java.util.ArrayList;

public class Counter {
  
  private ArrayList<Integer> numeros = new ArrayList<Integer>();
  
  public void addNumber(int n)
  {
    numeros.add(n);
  }
  
  public int contadorDePares()
  {
    int contador = 0;

    for (int i = 0; i < numeros.size(); i++) {
      if (numeros.get(i) % 2 == 0) {
        contador ++;
      }
    }
    return contador;
  }
  public int contadorDeImpares()
  {
    int contador = 0;

    for (int i = 0; i < numeros.size(); i++) {
      if (numeros.get(i) % 2 == 1) {
        contador ++;
      }
    }
    return contador;
  }

  public int contadorDeMultiplosDe_(int n)
  {
    int contador = 0;

    for(int i = 0; i < numeros.size(); i++) {
      if (numeros.get(i) % n == 0) {
        contador ++;
      }
    }
    
    return contador;
  }
  
  public int contadorDigitosPares(int num) {
	  int contador = 0;
	  while (num != 0) {
		  int digito = num % 10;
		  if(digito % 2 == 0) {
			  contador ++;
		  }
		  num = num / 10;
	  }
	  return contador;
  }
  
  public int mayorCantidadDigitosPares() {
	  int maxNumero = 0;
	  int maxCantPares = 0 ;
	  for (int i = 0; i < numeros.size(); i++) {
		  int cantPares = contadorDigitosPares(numeros.get(i));
		  if (cantPares > maxCantPares) {
			  maxCantPares = cantPares;
			  maxNumero = numeros.get(i);
		  }	  
	  }
	  return maxNumero;	
  }
  
  public int multEntreCeroAMilDe_Y_(int x, int y) {
	  
	  for (int i = 1000; i >= 0; i--) {
		  
          if (i % x == 0 && i % y == 0) {
              return i;
          }
      }
	  
      return -1;
      
	  }
	  
}
