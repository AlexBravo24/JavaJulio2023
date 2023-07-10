package com;

import java.util.Scanner;

public class Problema5_OIPH {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Integer edad;
		Double nota;
		char sexo;
		System.out.println("Ingresa tu nota: ");
		nota = scan.nextDouble();
		System.out.println("ingresa tu edad: ");
		edad = scan.nextInt();
		System.out.println("Ingresa tu sexo: ");
		sexo = scan.next().charAt(0);
		if(nota==5.0 && edad==18 && sexo=='M') {
			System.out.println("POSIBLE");
		}else if(nota==5.0 && edad==18 && sexo=='F') {
			System.out.println("ACEPTADA");
		}else {
			System.out.println("NO ACEPTADA");
		}
	}
}
