package com.problemas.dia2;

import java.util.Scanner;

public class Ejercicio8_ADLM {

	public static void main(String[] args) {
		/* 8. Realiza un programa que pida por teclado el resultado (dato entero) obtenido al lanzar 
		  un dado de seis caras y muestre por pantalla el número en letras (dato cadena) de la cara 
		  opuesta al resultado obtenido.
		  Nota 1: En las caras opuestas de un dado de seis caras están los números: 1-6, 2-5 y 3-4.
		  Nota 2: Si el número del dado introducido es menor que 1 o mayor que 6, se mostrará el mensaje: 
		  “ERROR: número incorrecto”.*/
		Scanner entrada = new Scanner(System.in);
		System.out.println("Ingresa el número del dado");
		int dado = entrada.nextInt();
		switch(dado) {
			case 1:
				System.out.println("SEIS");
				break;
			case 2:
				System.out.println("CINCO");
				break;
			case 3:
				System.out.println("CUATRO");
				break;
			case 4:
				System.out.println("TRES");
				break;
			case 5:
				System.out.println("DOS");
				break;
			case 6:
				System.out.println("UNO");
				break;
			default:
				System.out.println("Número incorrecto");
				break;
		}
	}

}
