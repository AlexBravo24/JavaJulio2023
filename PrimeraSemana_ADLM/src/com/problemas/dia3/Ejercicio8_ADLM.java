package com.problemas.dia3;

import java.util.Scanner;

public class Ejercicio8_ADLM {

	public static void main(String[] args) {
		/* 8. Programa Java que lea dos n�meros y muestre los n�meros desde el menor hasta el 
		mayor */
		
		Scanner entrada = new Scanner(System.in);
		System.out.println("Ingresa el primer n�mero");
		int numero1 = entrada.nextInt();
		System.out.println("Ingresa el segundo n�mero");
		int numero2 = entrada.nextInt();
		int menor = numero1 < numero2 ? numero1 : numero2;
		int mayor = numero1 > numero2 ? numero1 : numero2;
		
		for(int i = menor; i <= mayor; i++) {
			System.out.println(i);
		}
	}

}
