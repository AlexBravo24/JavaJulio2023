package com.problemas.dia4;

public class Ejercicio2_ADLM {

	public static void main(String[] args) {
		/* 2. Crea un array de n�meros de 100 posiciones, que contendr� los n�meros del 
		1 al 100. Obt�n la suma de todos ellos y la media. */
		
		int[] array = new int[100];
		int suma = 0;
		
		for(int i = 0; i <= array.length - 1; i++) {
			array[i] = i + 1;
			suma+=array[i];
		}
		
		double media = (double)suma / array.length;
		
		System.out.println("La suma de los n�meros es: " + suma);
		System.out.println("La media es: " + media);
	}

}
