package com.arrays;

import java.util.Scanner;

public class Array1_BAFV {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        /*
        1.- Crea un array de 10 posiciones de números con valores pedidos por teclado.
		Muestra por consola el índice y el valor al que corresponde
         * */

        int[] numeros = new int[10]; // Array de 10 numeros

        System.out.println("Ingrese 10 números:");

        for (int i = 0; i < numeros.length; i++) {
            System.out.print("ingrese número" + i+1 + ": ");
            numeros[i] = entrada.nextInt();
        }

        System.out.println("Mostrando elementos del array:");

        for (int i = 0; i < numeros.length; i++) {
            System.out.println("Índice " + i + ": " + numeros[i]);
        }
    }
}
