package com.arrays;

public class Array {

	public static void main(String[] args) {
		/*
		 * Los arrays son una estructura de datos que almacenan
		 * un tipo de ellos en comun y una vez declarado su tama�o
		 * u longitud este no puede crecer o cambiar en tiempo 
		 * de ejecuci�n 
		 */
		
		
		//Declarando un array con su tama�o 
		int [] numero = new int [7];  // Un array de n�meros enteros
		//con su tama�o declarado 
		
		//Introducir daoe en nuestro array indicando la posici�n
		//en la que se almacenar� dicho dato
		
		numero [0] = 101;
		numero [1] = 102;
		numero [2] = 103;
		numero [3] = 104;
		numero [4] = 105;
		numero [5] = 106;
		
		// Si quiero mostrar un determinado valor de una posici�n se debe indicar
		// la posici�n
//		System.out.println(numero[5]);
		
		//otra manera de celarar e inicar un array ya con sus valores
		int [] numeros = { 1,2,3,4,5,6,7,8,9} ;
		
		//Imprimir en consola todos los valores del array
//		for (int i = 0; i < 9; i++) {
//			System.out.println("la posic�n " + i+ " tiene guardado el valor " + numeros [i]);
//		}
		
		//Otra manera de imprimir todos los valores de mi array con un cliclo
		//for each
		
		for (int i:numeros){
			System.out.println(i);
		}
		
		//Podemos almacenar objetos, Strings, char, etc
	
		

	}

}
