package com.arrays;

public class Arrays_dosdimensiones {

	public static void main(String[] args) {
		// Array bidimensional - coleccion de datos de un mismo tipo
		// En lugar de tener un solo espacio linal para almacenar los datos
		//pasamos a un concepto de tabla
		// [1][2][3] 
		// [2][] []
		// [3][] []
		
int[][]numeros= new int [3][3];

numeros [0][0]=1;
numeros [0][1]=2;
numeros [0][2]=3;

numeros [1][0]=4;
numeros [1][1]=5;
numeros [1][2]=6;

numeros [2][0]=7;
numeros [2][1]=8;
numeros [2][2]=9;


//Declarando un array de dos dimensiones con sus valores asignados
//desde un inicio


int[][]matriz= {{1,2,3},
		{4,5,6},
		{7,8,9}};
System.out.println("los valores contenidos en la matriz son : ");
for (int i = 0; i < matriz.length; i++) {
	for (int j = 0; j < 3; j++) {
		System.out.print(matriz[i][j] + " ");
		
	}
	System.out.println();

}





	}

}
