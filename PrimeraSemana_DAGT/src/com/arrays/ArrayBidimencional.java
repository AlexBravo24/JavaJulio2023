package com.arrays;

public class ArrayBidimencional {

	public static void main(String[] args) {

	/*Array Bidimencional -  Coleccion de datos de un mismo tipo
	 * En Lugar de tener un solo espacio "lineal" para almacenar
	 * Pasamos un concepto de tabla
	 */
			
		int [][] matriz = new int [3][3];
		matriz[0][0] = 1;
		matriz[0][1] = 2;
		matriz[0][2] = 3;
		
		matriz[1][0] = 4;
		matriz[1][1] = 5;
		matriz[1][2] = 6;
		
		matriz[2][0] = 7;
		matriz[2][1] = 8;
		matriz[2][2] = 9;
		
		//Declarando una matriz con sus valores asignados desde el eprincipio
		
		int [][] matriz2 = {{1,2,3},{4,5,6},{7,8,9},{10,11,12},{13,14,15}};
		
		System.out.println(matriz.length);
		System.out.println(matriz2.length);
		
		
		for (int i = 0; i <  matriz2.length ; i++) {
			for (int j = 0; j < 3; j++){
				System.out.print(matriz2[i][j] + " ");
			}
			System.out.println();
		}
	
	
	}

}
