package com;

import java.util.Scanner;

public class Problema7_OIPH {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Indica el numero de alumnos: ");
		Integer alumnos = scan.nextInt();
		Double costo;
		if(alumnos>=100) {
			costo = 65.0*alumnos;
			System.out.println("El costo total es de: $"+costo);
		}else if(alumnos>=50 && alumnos<=99) {
			costo = 70.0*alumnos;
			System.out.println("El costo total es de: $"+costo);
		}else if(alumnos>=30 && alumnos<=49) {
			costo = 95.0*alumnos;
			System.out.println("El costo total es de: $"+costo);
		}else if(alumnos<30) {
			costo = 4000.0;
			System.out.println("El costo total es de: $"+costo);
		}
	}

}
