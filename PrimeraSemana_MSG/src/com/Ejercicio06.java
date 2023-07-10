package com;

import java.util.Scanner;

public class Ejercicio06 { // Apertura Class

	public static void main(String[] args) { // Apertura Main
		
		int precio;
		int cantidad;
		String tipo;
		int tamaño;
		double total;
		
		Scanner entrada1 = new Scanner(System.in);
			System.out.println("Introduce el precio:");
			precio = entrada1.nextInt();
			
		Scanner entrada2 = new Scanner(System.in);
			System.out.println("Cuantos Kilos?");
			cantidad = entrada2.nextInt();
		
		Scanner entrada3 = new Scanner(System.in);
			System.out.println("Tipo de Uva:");
			tipo = entrada3.next();
		
		Scanner entrada4 = new Scanner(System.in);
			System.out.println("Tamaño de Uva:");
			tamaño = entrada4.nextInt();
		
			
			if (tamaño == 1 && tipo.equals ("a")) {
				total = (precio * cantidad) + (cantidad * .20);
				System.out.println("Su total es: " + total);
			} else if (tamaño == 2 && tipo.equals ("a")) {
				total = (precio * cantidad) + (cantidad * .30);
				System.out.println("Su total es: " + total); 
			} else if (tamaño == 1 && tipo.equals ("b")) {
				total = (precio * cantidad) - (cantidad * .30);
				System.out.println("Su total es: " + total);
			} else if (tamaño == 2 && tipo.equals ("b")) {
				total = (precio * cantidad) - (cantidad * .50);
				System.out.println("Su total es: " + total);
			
			}else {
				System.out.println("Datos erroneos");
			}
			
			
			
			
			
//			System.out.println("Si Solicita uva del Tipo A1 le costara " + (precio + .20) + " el Kilo");
//
//			System.out.println("Si Solicita uva del Tipo A2 le costara " + (precio + .30) + " el Kilo");
//
//			System.out.println("Si Solicita uva del Tipo B1 le costara " + (precio - .30) + " el Kilo");
//
//			System.out.println("Si Solicita uva del Tipo A2 le costara " + (precio - .50) + " el Kilo");
			

		


	} // Cierre Main

} // Cierre Clas
