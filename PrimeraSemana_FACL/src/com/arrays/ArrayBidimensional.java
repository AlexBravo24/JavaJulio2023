package com.arrays;

public class ArrayBidimensional {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Array Bidimensional- Colección de datos de un mismo tipo
		//Pero en 2 espaciones lineanes para almacenar datos (tabla)
		
		int [] [] numeros = new int [3] [3];
		
		 numeros[0][0]=1;
		 numeros[0][1]=2;
		 numeros[0][2]=3;
		 
		 numeros[1][0]=4;
		 numeros[1][1]=5;
		 numeros[1][2]=6;
		 
		 numeros[2][0]=7;
		 numeros[2][1]=8;
		 numeros[2][2]=9;
		 
		 //Declarando un arreglo de dos dimensiones con sus valores asignados
		 //Desde el principio
		 
		 int [][] matriz = {{1,2,3},
				 			{4,5,6},
				 			{7,8,9}};
		 
		 //Se se paran por columnas
		 
		 System.out.println("Los valores contenidos en la matriz son: ");
		 
		 for(int i=0;i<3;i++) {
			 for (int j=0;j<3;j++) {
				 System.out.print(matriz[i][j]+" ");
			 }
			 System.out.println();//salto de línea para mostrar las columnas
		 }
		 
		 
		 
	}

}
