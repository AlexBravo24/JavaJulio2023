package com.arrays;

import java.util.Scanner;

public class Array1_ADMG {

	public static void main(String[] args) {
		
		//Crea un array de 10 posiciones de números con valores pedidos por teclado.
		//Muestra por consola el índice y el valor al que corresponde
		
		
		Scanner scanner = new Scanner(System.in);

        int[] numeros = new int[10];

        for (int i = 0; i < numeros.length; i++) {
            System.out.print("Ingrese un número para la posición " + i + ": ");
            numeros[i] = scanner.nextInt();
        }

        System.out.println("Elementos del array:");

        for (int i = 0; i < numeros.length; i++) {
            System.out.println("Índice " + i + ": Valor " + numeros[i]);
        }

	}

}
