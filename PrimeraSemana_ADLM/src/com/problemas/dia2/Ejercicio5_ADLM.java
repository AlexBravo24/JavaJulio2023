package com.problemas.dia2;

import java.util.Scanner;

public class Ejercicio5_ADLM {

	public static void main(String[] args) {
		/* 5. Realiza un programa que calcule la aceptación de una solicitud en base a los siguientes 
				parámetros: edad, nota y sexo.
		 	* Mínimo: Nota (5), edad (18), sexo M -> POSIBLE
		    * Mínimo: Nota (5), edad (18), sexo F -> ACEPTADA
		    * Otros casos -> NO ACEPTADA */
		Scanner entrada = new Scanner(System.in);
		System.out.println("Ingresa tu edad");
		int edad = entrada.nextInt();
		System.out.println("Ingresa tu nota");
		int nota = entrada.nextInt();
		System.out.println("Ingresa el sexo M/F");
		String sexo = entrada.next();
		if(nota >= 5 && edad >= 18 && sexo.equals("M")) {
			System.out.println("Solicitud posible");
		}else if(nota >= 5 && edad >= 18 && sexo.equals("F")) {
			System.out.println("Solicitud aceptada");
		}else {
			System.out.println("Solicitud no aceptada");
		}
	}

}
