package com.ciclos;

import java.util.Scanner;

public class Problema12_OIPH {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Integer edad;
		Integer count = 1;
		Integer sumaEdad = 0;
		Double promedio = 0.0;
		while(promedio <= 25.0) {
			System.out.println("Ingresa una edad: ");
			edad = scan.nextInt();
			sumaEdad = sumaEdad + edad;
			promedio = (double)(sumaEdad/count);
			count = count + 1;
		}
		System.out.println("El promedio de edades es: "+promedio);
	}
}
