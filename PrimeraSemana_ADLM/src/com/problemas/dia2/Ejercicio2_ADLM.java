package com.problemas.dia2;

import java.util.Scanner;

public class Ejercicio2_ADLM {

	public static void main(String[] args) {
		/* 2.Realiza un programa que pida 
		 * un n�mero por teclado y nos indique si es par o impar*/
		
		int numero1;
		Scanner entrada = new Scanner(System.in);
		System.out.println("Ingresa un n�mero");
		numero1 = entrada.nextInt();
		if(numero1 % 2 != 0) {
			System.out.println("El n�mero es impar");
		}else {
			System.out.println("El n�mero es par");
		}
	}

}
