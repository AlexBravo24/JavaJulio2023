package com.problemas.dia3;

import java.util.Scanner;

public class Ejercicio12_ADLM {

	public static void main(String[] args) {
		/* 12.Se ingresan un conjunto de n edades de personas por teclado. El programa finalizara 
		cuando el promedio de las edades sea superior a 25 */
		Scanner entrada = new Scanner(System.in);
		double promedio = 0;
		int edades = 0, sumaedades = 0;

		while(promedio < 25) {
			System.out.println("Ingresa la edad");
			int edad = entrada.nextInt();
			if(edad < 0) {
				continue;
			}
			sumaedades += edad;
			edades++;
			promedio = sumaedades / edades;
			System.out.println("El promedio es: " + promedio);
		}
		System.out.println("El promedio se a obtenido");

	}
}
