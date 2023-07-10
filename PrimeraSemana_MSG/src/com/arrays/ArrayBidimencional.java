package com.arrays;

public class ArrayBidimencional {

	public static void main(String[] args) {

		/*
		 * Array Bidimencional - Coleccion de datos de un mismo tipo. en lugar de tener un espacio "Lineal" para almacenar datos
		 * pasamos a un concepto de tabla
 		 */
		
		//[1][2][3]
		//[2][0][0]
		//[3][0][0]
		
		int [] [] numeros = new int [3][3];
		
		//[0,0][0,1][0,2]
		//[1,0][1,1][1,2]
		//[2,0][2,1][2,2]
		
		numeros [0][0]=1;
		numeros [0][1]=2;
		numeros [0][2]=3;
		
		numeros [1][0]=4;
		numeros [1][1]=5;
		numeros [1][2]=6;
		
		numeros [2][0]=7;
		numeros [2][1]=8;
		numeros [2][2]=9;
		
		// Declarando un array de 2 dimensiones con sus valores asignados desde un inicio.
		
		int [][] matriz = {{1,2,3},{4,5,6},{7,8,9}};
		
		System.out.println("Los valores contenidos en la matriz son: ");
		
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				System.out.println(matriz[i][j] + " ");
			}
		System.out.println();
		}
		

	} // Cierre main

}	// Cierre Class
