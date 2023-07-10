package com.arrays;

import java.util.Scanner;

public class ArrayBidireccional1_ADMG {

	public static void main(String[] args) {
		
//		Crea un programa que pida por pantalla cuatro países y a continuación tres 
//		ciudades de cada uno de estos países. Los nombres de ciudades deben 
//		almacenarse en un array multidimensional cuyo primer índice sea el 
//		número asignado a cada país y el segundo índice el número asignado a 
//		cada ciudad.
//		Ejemplo de resultados que debe mostrar el programa:
//		País: Argentina Ciudades: Buenos Aires Córdoba La Plata
//		País: España Ciudades: Madrid Lugo Sevilla
//		País: Francia Ciudades: Paris Niza Lyon
//		País: Italia Ciudades: Roma Nápoles Sicilia

		
		
		Scanner scanner = new Scanner(System.in);

        String[] paises = new String[4]; // Array para almacenar los nombres de los países
        String[][] ciudades = new String[4][3]; // Array multidimensional para almacenar las ciudades

        // Capturar los nombres de los países
        for (int i = 0; i < 4; i++) {
            System.out.print("Ingrese el nombre del país " + (i + 1) + ": ");
            paises[i] = scanner.nextLine();
        }
        
        // Capturar las ciudades para cada país
        for (int i = 0; i < 4; i++) {
            System.out.println("Ingrese las ciudades para " + paises[i] + ":");
            for (int j = 0; j < 3; j++) {
                System.out.print("Ciudad " + (j + 1) + ": ");
                ciudades[i][j] = scanner.nextLine();
            }
        }

        // Imprimir los países con sus ciudades correspondientes
        for (int i = 0; i < 4; i++) {
            System.out.print("País: " + paises[i] + " Ciudades: ");
            for (int j = 0; j < 3; j++) {
                System.out.print(ciudades[i][j] + " ");
            }
            System.out.println();
        }

        scanner.close();

	}

}
