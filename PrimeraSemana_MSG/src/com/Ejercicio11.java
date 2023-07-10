package com;

import java.util.Scanner;

public class Ejercicio11 { // Apertura Class

	public static void main(String[] args) { // Apertura Main
		
		
		float peso;
		float total;
		int zona;
		
		Scanner entrada1 = new Scanner(System.in);
			System.out.println("Elige la opcion correspondiente a la zona: 1.America del norte  2.America central  3.America del Sur"
					+ "  4.Europa  5.Asia");
			zona = entrada1.nextInt();
			
		Scanner entrada2 = new Scanner(System.in);
			System.out.println("Peso del paquete:");
			peso = entrada2.nextFloat();
		
			if (zona == 1 && peso <= 5) {
				total = peso * 24000;
				System.out.println("El costo de su viaje sera de: " + total);
			} else if (zona == 2 && peso <= 5) {
				total = peso * 20000;
				System.out.println("El costo de su viaje sera de: " + total);
			} else if (zona == 3 && peso <= 5) {
				total = peso * 21000;
				System.out.println("El costo de su viaje sera de: " + total);
			} else if (zona == 4 && peso <= 5) {
				total = peso * 10000;
				System.out.println("El costo de su viaje sera de: " + total);
			} else if (zona == 5 && peso <= 5) {
				total = peso * 18000;
				System.out.println("El costo de su viaje sera de: " + total);
			} else {
				System.out.println("Lo sentimos, su viaje no pudo ser confirmado");
			}
		

	} // Cierre main

} // Cierre Class
