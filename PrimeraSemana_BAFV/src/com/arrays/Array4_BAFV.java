package com.arrays;

public class Array4_BAFV {
	/*
	4.- Dado un array de números de 5 posiciones con los siguientes valores:
	{1,2,3,4,5}. Guardar los valores de este array en otro array distinto pero con 
	los valores invertidos, es decir, que el segundo array deberá tener los valores 
	{5,4,3,2,1}. 
	*/
	
	public static void main(String[] args) {
        int[] numeros = {1, 2, 3, 4, 5};
        int[] alreves = new int[5];

        // Invertir los valores del primer array y guardarlos en el segundo array
        for (int i = 0; i < 5; i++) {
            alreves[i] = numeros[5 - 1 - i];
        }

        System.out.println("numeros invertidos:");

        for (int i : alreves) {
            System.out.println(i);
        }
    }

}
