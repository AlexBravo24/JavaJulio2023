package com.problemas.dia3;

import java.util.Scanner;

public class Ejercicio2_ADLM {

	public static void main(String[] args) {
		/* 2.- Programa un algoritmo que realice la tabla de multiplicar de un numero introducido 
		desde teclado, hasta la iteración deseada por el usuario. Ejemplo, tabla de 23 hasta el 95. 
		23 x 95 = ??? */
		
		Scanner entrada = new Scanner(System.in);
		System.out.println("Introduce de que número quieres la tabla de multiplicar");
		int numero = entrada.nextInt();
		System.out.println("Limite a multiplicar");
		int limite = entrada.nextInt();
		
		for(int i = 1; i<= limite; i++) {
			System.out.println(i + " X " + numero + " = " + numero * i );
		}
	}

}
