package com.problemas.dia2;

import java.util.Scanner;

public class Ejercicio2_ADLM {

	public static void main(String[] args) {
		/* 2.Realiza un programa que pida 
		 * un número por teclado y nos indique si es par o impar*/
		
		int numero1;
		Scanner entrada = new Scanner(System.in);
		System.out.println("Ingresa un número");
		numero1 = entrada.nextInt();
		if(numero1 % 2 != 0) {
			System.out.println("El número es impar");
		}else {
			System.out.println("El número es par");
		}
	}

}
