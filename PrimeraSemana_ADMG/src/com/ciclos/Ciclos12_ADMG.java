package com.ciclos;

import java.util.Scanner;

public class Ciclos12_ADMG {

	public static void main(String[] args) {
		
		//Se ingresan un conjunto de n edades de personas por teclado. El programa finalizara 
		//cuando el promedio de las edades sea superior a 25

		Scanner scanner = new Scanner(System.in);

        int totalEdades = 0;
        int sumaEdades = 0;
        double promedio = 0;

        for (int i = 1; promedio <= 25; i++) {
            System.out.print("Ingrese una edad : ");
            int edad = scanner.nextInt();

            if (edad < 0) {
                break;
            }

            sumaEdades += edad;
            totalEdades++;

            promedio = (double) sumaEdades / totalEdades;
        }

        if (totalEdades > 0) {
            System.out.println("Promedio de edades superior a 25 alcanzado.");
        } else {
            System.out.println("El dato ingresado no es edad.");
        }
		
		
	}

}
