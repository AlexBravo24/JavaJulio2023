package com;

import java.util.Scanner;

public class Ejercicio13 { // Apertura Class

	public static void main(String[] args) { // Apertura main
		
		double cantidad;
		double ni�os;
		double salud;
		double bolsa;
		
		Scanner entrada1 = new Scanner(System.in);
			System.out.println("Cantidad donado por la institucion: ");
			cantidad = entrada1.nextDouble();
		
		if (cantidad >= 10000) {
			salud = cantidad * .30;
			ni�os = cantidad * .50;
			bolsa = cantidad * .20;
			
			System.out.println("Se destinara anualmente: " + salud + " Euros al Centro de Salud " + ni�os + " Euros al Comedor de Ni�os y " + bolsa + " Euros a "
					+ "la Bolsa de Valores");
			
		} else if (cantidad < 10000 && cantidad > 0) {
			salud = cantidad * .25;
			ni�os = cantidad * .60;
			bolsa = cantidad * .15;
			
			System.out.println("Se destinara anualmente: " + salud + " Euros al Centro de Salud " + ni�os + " Euros al Comedor de Ni�os y " + bolsa + " Euros a "
					+ "la Bolsa de Valores");
		} else {
			System.out.println("Favor de introducir una cantidad mayor a 0");
		}

	} // Cierre main

} // Cierre class
