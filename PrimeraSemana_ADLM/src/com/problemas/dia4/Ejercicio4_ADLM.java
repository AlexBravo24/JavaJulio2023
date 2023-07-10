package com.problemas.dia4;

public class Ejercicio4_ADLM {

	public static void main(String[] args) {
		/* 4. Dado un array de números de 5 posiciones con los siguientes valores:
		{1,2,3,4,5}. Guardar los valores de este array en otro array distinto pero con 
		los valores invertidos, es decir, que el segundo array deberá tener los valores 
		{5,4,3,2,1}.*/ 
		int[] array1 = {1, 2, 3, 4, 5};
		int[] array2 = new int[array1.length];
		int j = 0;
		for(int i = array1.length - 1 ; i >= 0; i--) {
			array2[j] = array1[i];
			j++;
		}
		for(int i: array1) {
			System.out.print(i);
		}
		System.out.println();
		for(int i: array2) {
			System.out.print(i);
		}
	}

}
