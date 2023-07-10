package com;

import java.util.Scanner;

public class Ejercicio5_JDRA {

	public static void main(String[] args) {
		
		/* 5. Realiza un programa que calcule la aceptación de una solicitud en base a los siguientes 
		parámetros: edad, nota y sexo.
		* Mínimo: Nota (5), edad (18), sexo M -> POSIBLE
		* Mínimo: Nota (5), edad (18), sexo F -> ACEPTADA
		* Otros casos -> NO ACEPTADA
		* */
		
		int edad, nota, sexo;
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Ingrese su Edad : ");
		edad = entrada.nextInt();
		
		System.out.println("Ingrese su Nota : ");
		nota = entrada.nextInt();
		
		System.out.println("Ingrese su Sexo (1-M / 2-F) : ");
		sexo = entrada.nextInt();
		

		if ( edad >= 18 && nota >=5 && sexo ==1 ) {
            System.out.println("POSIBLE");
            
        } else if ( edad >= 18 && nota >=5 && sexo ==2 ) {
        	System.out.println("ACEPTADA");
            
        } else {
        	System.out.println("NO ACEPTADA");
        	
        }
		

	}

}
