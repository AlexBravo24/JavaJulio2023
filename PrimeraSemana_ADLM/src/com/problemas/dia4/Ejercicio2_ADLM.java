package com.problemas.dia4;

public class Ejercicio2_ADLM {

	public static void main(String[] args) {
		/* 2. Crea un array de números de 100 posiciones, que contendrá los números del 
		1 al 100. Obtén la suma de todos ellos y la media. */
		
		int[] array = new int[100];
		int suma = 0;
		
		for(int i = 0; i <= array.length - 1; i++) {
			array[i] = i + 1;
			suma+=array[i];
		}
		
		double media = (double)suma / array.length;
		
		System.out.println("La suma de los números es: " + suma);
		System.out.println("La media es: " + media);
	}

}
