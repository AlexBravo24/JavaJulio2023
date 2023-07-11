package com.arrays;

public class Array {

	public static void main(String[] args) {
		//arrays son una estructura de datos que almacenan un tipo de ellos en comun y
		//una vez declarado su tamaño o longitud este no puede crecer o cambiar en tiempo
		//de ejecucion
		
		
		
		
		//Declarando un array con su tamaño
		
		int[]numero = new int [7]; //un array de numeros enteros con su tamaño 
		//declarado
		
		//introducir datos en nuestro array indicando la posicion que se 
		//almacenara el dato
		
		numero [0]= 101;
		numero [1]= 102;
		numero [2]= 103;
		numero [3]= 104;
		numero [4]= 105;
		numero [5]= 106;
		numero [6]= 107;
			
		System.out.println(numero[6]);
		
		//otra manera de declarar oe iniciar una array ya con sus valores
		int[] numeros = {1,2,3,4,5,6,7,8,9 };
		
//		for (int i = 0; i < numeros.length; i++) {
//			System.out.println("la posicion "+i+" tiene guardado el valor "+numeros[i]);
//			
//		}
		
		//imprimiendo todos los valores de mi arrays con un ciclo for each
		for (int i : numeros) {
			System.out.println(i);
			
			
		}
		
		
		//podemos almacenar objetos, string, char, etc
		
		
		
		
		
	}
	

}
