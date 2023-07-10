package com;

import java.util.Scanner;

public class Ejercicio03 { //Aperura del Class

	public static void main(String[] args) { // Apertura del main
		
		float numero1;
		float numero2;
		float resultado;
		
		Scanner entrada1 = new Scanner(System.in);
		
			System.out.println("Introduce el primer numero:");
		
			numero1 = entrada1.nextInt();
		
		Scanner entrada2 = new Scanner(System.in);
		
			System.out.println("Introduce el segundo numero:");
		
			numero2 = entrada2.nextInt();
			
			
		 resultado = numero1 / numero2;
			
		if (numero2 == 0 ) {
			System.out.println("El valor 0 no es un numero valido");
		} else {
			System.out.printf("El resultado es: " + resultado);
		}

	} // Cierre del main

} // Cierre del Class
