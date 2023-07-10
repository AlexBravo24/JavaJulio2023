package com.problemas.dia2;

import java.util.Scanner;

public class Ejercicio10_ADLM {

	public static void main(String[] args) {
		/* 10.Realiza un programa que pida un número entero entre uno y doce e imprima el número de días 
		 	que tiene el mes correspondiente. */
		Scanner entrada = new Scanner(System.in);
		System.out.println("Ingresa el número del mes");
		int mes = entrada.nextInt();
		switch(mes) {
			case 1: case 3: case 5: case 7: case 8: case 10: case 12:
				System.out.println("31 días");
				break;
			case 2:
				System.out.println("28 días");
				break;
			case 4: case 6: case 9: case 11:
				System.out.println("30 días");
				break;
			
			default:
				System.out.println("Número incorrecto");
				break;
		}
	}

}
