package com.arrays;

import java.util.Scanner;

public class Array1_ADMG {

	public static void main(String[] args) {
		
		//Crea un array de 10 posiciones de n�meros con valores pedidos por teclado.
		//Muestra por consola el �ndice y el valor al que corresponde
		
		
		Scanner scanner = new Scanner(System.in);

        int[] numeros = new int[10];

        for (int i = 0; i < numeros.length; i++) {
            System.out.print("Ingrese un n�mero para la posici�n " + i + ": ");
            numeros[i] = scanner.nextInt();
        }

        System.out.println("Elementos del array:");

        for (int i = 0; i < numeros.length; i++) {
            System.out.println("�ndice " + i + ": Valor " + numeros[i]);
        }

	}

}
