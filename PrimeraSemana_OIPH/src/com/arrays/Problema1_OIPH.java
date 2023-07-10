package com.arrays;

import java.util.Scanner;

public class Problema1_OIPH {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/* 
		 Crea un array de 10 posiciones de números con valores 
		 pedidos por teclado. Muestra por consola el índice y 
		 el valor al que corresponde.
		 */
		Scanner scan = new Scanner(System.in);
		int[] array = new int[10];
		for(int i=0; i<10; i++) {
			System.out.println("Introduce los valores:");
			array[i] = scan.nextInt();
		}
		System.out.println("Los valores son:");
		for(int i=0; i<10; i++) {
			System.out.println(i+" .- "+ array[i]);
		}
	}

}
