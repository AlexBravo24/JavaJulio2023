package com.arrays;

public class Array {

	public static void main(String[] args) {

		/*
		 * Los arrays son un a estructura de clases que almacenan un tipo de dato de ellos en comun y una vez declarado
		 * su tamaño o longitud este no puede crecer o cambiar en tiempo de ejecuccion
		 */
		
		// declarando un array con su tamaño
		
		int [] numero = new int [5]; // Es un array de numeros enteros declarado con su tamaño
		
		// Podemos introducir datos en nustro array indicando la posicion en  la que se almacena dicho dato
		
		numero[0] = 101;
		numero[1] = 102;
		numero[2] = 103;
		numero[3] = 104;
		numero[4] = 105;
		
		// Si quiero mostrar un determinado valor de una posicion 
		
		System.out.println(numero[2]);
		
		// Otra manera de declarar un array ya con sus valores
		
		int [] numeros = {1,2,3,4,5,6,7,8,9};
		
		// para imprimir todos los valores del array
		
//		for ( int i = 0; i < numeros.length; i++) {
//			System.out.println(numeros[i]);
//		}
		
		// Imprmiendo todos los valores de array con un clico for each
		
		for (int i:numero) {
			System.out.println(i);
		}
		
		
		
		

	} // cierre main

} // cierre class
