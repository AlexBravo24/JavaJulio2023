package com.ciclos;

import java.util.Scanner;

public class Ciclos12_DAGT {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

        int sumaEdades = 0;
        int cantidadEdades = 0;

        while (true) {
            System.out.print("Ingresa una edad: ");
            int edad = scanner.nextInt();

            sumaEdades += edad;
            cantidadEdades++;

            double promedio =  sumaEdades / cantidadEdades;

            if (promedio > 25) {
                break;
            }
        }

        System.out.println("El programa ha finalizado.");
        System.out.println("Promedio de las edades: " + (double) sumaEdades / cantidadEdades);
		
	}

}
