package com.problemas.dia3;

public class Ejercicio6_ADLM {

	public static void main(String[] args) {
		/* 6.- Una persona desea invertir $1000.00 en un banco, el cual le otorga un 2% de inter�s 
		mensual. �Cu�l ser� la cantidad de dinero que esta persona tendr� al cabo de un a�o si 
		todo el dinero lo reinvierte? */
		
		double total = 1000.00;
		for(int i = 0; i<= 12; i++) {
			System.out.println(total);
			total *= 1.02;
		}
		System.out.println("El total de la inversi�n es: " + total);
	}

}
