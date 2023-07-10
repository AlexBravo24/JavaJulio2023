package com.arrays;

import java.util.Scanner;

public class Array1_JDRA {

	public static void main(String[] args) {
		
		// 1. Crea un array de 10 posiciones de números con valores pedidos por teclado.
		// Muestra por consola el índice y el valor al que corresponde.
		
		Scanner entrada = new Scanner (System.in);
		
		int [] valores = new int [10];
		int pos=0;
		
		System.out.println("Ingrese el valor : ");
		for(int i=0; i<valores.length;i++) {
			
			System.out.println("numeros[" + i + "]=");
			valores[i] = entrada.nextInt();
		}
		
		for(int i=0; i<valores.length;i++) {
			
			System.out.println("La posicion: "+ i +" tiene guardado el valor: "+valores[i]);	
		}
			
	}
}
