package com.arrays;

import java.util.Scanner;

public class Ejercicio1_AAPC {

	public static void main(String[] args) {
		// Crea un array de 10 posiciones de números con valores pedidos por teclado.
		//Muestra por consola el índice y el valor al que corresponde.

Scanner entrada = new Scanner (System.in);
int[]numero= new int[10];
for (int i = 0; i < numero.length; i++) {
	System.out.println(" INGRESA UN NUMERO PARA LA POSICION "+ i + " : " );
	numero [i]=entrada.nextInt()	;
}
	System.out.println("Elementos del array:");
    for (int i = 0; i < numero.length; i++) {
        System.out.println("Índice " + i + ": " + numero[i]);
        
        
		}
    System.out.println("El programa ha terminado");
	}
}


