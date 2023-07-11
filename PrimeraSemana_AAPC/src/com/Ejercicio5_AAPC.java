package com;

import java.util.Scanner;

public class Ejercicio5_AAPC {

	public static void main(String[] args) {
		//  Realiza un programa que calcule la aceptaci�n de
		//una solicitud en base a los siguientes par�metros: 
		//edad, nota y sexo. * M�nimo: Nota (5), edad (18),
		//sexo M -> POSIBLE * M�nimo: Nota (5), edad (18), sexo F -> ACEPTADA * Otros casos -> NO ACEPTADA 
		
		        Scanner scanner = new Scanner(System.in);
		        

		        // Obtener los datos del usuario
		        System.out.println("Ingrese la nota: ");
		        int nota = scanner.nextInt();

		        System.out.println("Ingrese la edad: ");
		        int edad = scanner.nextInt();

		        System.out.println("Ingrese el sexo (M/F): ");
		        String sexo = scanner.next();

		        // Verificar la aceptaci�n de la solicitud
		        if (nota >= 5 && edad >= 18) {
		            if (sexo.equalsIgnoreCase("M")) {
		                System.out.println("POSIBLE");
		            } else if (sexo.equalsIgnoreCase("F")) {
		                System.out.println("ACEPTADA");
		            } else {
		                System.out.println("NO ACEPTADA");
		            }
		        } else {
		            System.out.println("NO ACEPTADA");
		        }
		    }
		

		
		
		 

		
		
		
		
	}


