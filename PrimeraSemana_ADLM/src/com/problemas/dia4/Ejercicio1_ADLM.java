package com.problemas.dia4;

import java.util.Scanner;

public class Ejercicio1_ADLM {

	public static void main(String[] args) {
		/* 1. Crea un array de 10 posiciones de n�meros con valores pedidos por teclado.
		Muestra por consola el �ndice y el valor al que corresponde. */
		
		Scanner entrada = new Scanner(System.in);
		int[] array = new int[10];
		int i = 0;
		
		while(i <= array.length - 1 ) {
			System.out.println("Inserta un n�mero");
			int num = entrada.nextInt();
			array[i] = num;
			i++;
		}
		
		for(int j = 0; j<= array.length - 1 ; j++) {
			System.out.println("�ndice " + j + " n�mero: " + array[j]);
		}
	}

}
