package com.arrays;

public class Ejercicio4_AAPC {

	public static void main(String[] args) {
		//Dado un array de números de 5 posiciones con los siguientes valores: {1,2,3,4,5}. Guardar los valores de este array en otro array distinto pero con los valores invertidos, es decir
		//, que el segundo array deberá tener los valores {5,4,3,2,1}. 
		
		        int[] arrayOriginal = {1, 2, 3, 4, 5};
		        int[] arrayInvertido = new int[arrayOriginal.length];

		        for (int i = 0; i < arrayOriginal.length; i++) {
		            arrayInvertido[i] = arrayOriginal[arrayOriginal.length - 1 - i];
		        }

		        System.out.println("Array original: ");
		        mostrarArray(arrayOriginal);

		        System.out.println("\nArray invertido: ");
		        mostrarArray(arrayInvertido);
		    }

		    public static void mostrarArray(int[] array) {
		        for (int elemento : array) {
		            System.out.print(elemento + " ");
		        }
		        System.out.println();
		    }
		


	

}
