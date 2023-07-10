package com;

import java.util.Scanner;

public class Ejercicio05_DVC {

	public static void main(String[] args) {
		// Realiza un programa que calcule la aceptación de una solicitud en 
//		base a los siguientes parámetros: edad, nota y sexo.
//		* Mínimo: Nota (5), edad (18), sexo M -> POSIBLE 
//		* Mínimo: Nota (5), edad (18), sexo F -> ACEPTADA 
//		* Otros casos -> NO ACEPTADA

		int nota, edad;
		char sexo;
		
		System.out.println("Introduce tus datos para ver si eres aceptado");
		Scanner entrada = new Scanner (System.in);
		System.out.println("Introduce tu nota");
		nota = entrada.nextInt();
		System.out.println("Introduce tu edad");
		edad = entrada.nextInt();
		System.out.println("Introduce tu genero con M o F");
		sexo = entrada.next().charAt(0);
		
		if (nota >= 5 && edad >= 18 && sexo == 'F') {
			System.out.println("ACEPTADO");		
		} else if (nota >= 5 && edad >= 18 && sexo == 'M') {
			System.out.println("POSIBLEMENTE ACEPTADO");
		}else {
			System.out.println("NO ACEPTADO");
		}
	}

}