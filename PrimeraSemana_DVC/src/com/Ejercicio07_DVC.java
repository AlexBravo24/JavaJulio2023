package com;

import java.util.Scanner;

public class Ejercicio07_DVC {

	public static void main(String[] args) {
		// ejercicio 7

		int testu, precio;
		double ca;
		Scanner entrada = new Scanner (System.in);
		System.out.println("Introduce el número de alumnos");
		testu = entrada.nextInt();
		
		if (testu >= 100) {
			precio = testu *65;
		}else if (testu >= 50) {
			precio = testu * 70;
		}else if (testu >= 30) {
			precio = testu * 95;
		}else {
			precio = 4000;
		}
		
		ca = precio / testu;
		
		System.out.println("El monto a pagar a la compañia es "+ precio);
		System.out.println("El precio por alumno es de "+ ca);
	}

}
