package com;

import java.util.Scanner;

public class Ejercicio13 { // Apertura Class

	public static void main(String[] args) { // Apertura main
		
		double cantidad;
		double niños;
		double salud;
		double bolsa;
		
		Scanner entrada1 = new Scanner(System.in);
			System.out.println("Cantidad donado por la institucion: ");
			cantidad = entrada1.nextDouble();
		
		if (cantidad >= 10000) {
			salud = cantidad * .30;
			niños = cantidad * .50;
			bolsa = cantidad * .20;
			
			System.out.println("Se destinara anualmente: " + salud + " Euros al Centro de Salud " + niños + " Euros al Comedor de Niños y " + bolsa + " Euros a "
					+ "la Bolsa de Valores");
			
		} else if (cantidad < 10000 && cantidad > 0) {
			salud = cantidad * .25;
			niños = cantidad * .60;
			bolsa = cantidad * .15;
			
			System.out.println("Se destinara anualmente: " + salud + " Euros al Centro de Salud " + niños + " Euros al Comedor de Niños y " + bolsa + " Euros a "
					+ "la Bolsa de Valores");
		} else {
			System.out.println("Favor de introducir una cantidad mayor a 0");
		}

	} // Cierre main

} // Cierre class
