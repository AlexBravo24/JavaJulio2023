package com;

import java.util.Scanner;

public class Ejercicio05 { // Apertura Class

	public static void main(String[] args) { // Apertura Main
		
		int edad;
		int nota;
		String sexo;
		
//		sexo = "m";
//		sexo = "f";
		
		Scanner entrada1 = new Scanner(System.in);
			System.out.println("Introduce la nota obtenida:");
			nota = entrada1.nextInt();
		
		Scanner entrada2 = new Scanner(System.in);
			System.out.println("Introduce la edad:");
			edad = entrada2.nextInt();
			
		Scanner entrada3 = new Scanner(System.in);
			System.out.println("Introduce el sexo, M para Masculino y F para Femenino:");
			sexo = entrada3.next();
			
			
			
		
		if (nota >= 5 && edad >= 18 && sexo.equals ("m")) {
			System.out.println("POSIBLE");
		} else if (nota >= 5 && edad >= 18 && sexo.equals ("f")) {
			System.out.println("ACEPTADA");
		} else {
			System.out.println("NO ACEPTADA");
		}
		
		
		
			

	} // Cierre Main

} // Cierre Class
