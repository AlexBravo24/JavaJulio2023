package com.arrays;

import java.util.Scanner;

public class ArrayBidireccional1_ADMG {

	public static void main(String[] args) {
		
//		Crea un programa que pida por pantalla cuatro pa�ses y a continuaci�n tres 
//		ciudades de cada uno de estos pa�ses. Los nombres de ciudades deben 
//		almacenarse en un array multidimensional cuyo primer �ndice sea el 
//		n�mero asignado a cada pa�s y el segundo �ndice el n�mero asignado a 
//		cada ciudad.
//		Ejemplo de resultados que debe mostrar el programa:
//		Pa�s: Argentina Ciudades: Buenos Aires C�rdoba La Plata
//		Pa�s: Espa�a Ciudades: Madrid Lugo Sevilla
//		Pa�s: Francia Ciudades: Paris Niza Lyon
//		Pa�s: Italia Ciudades: Roma N�poles Sicilia

		
		
		Scanner scanner = new Scanner(System.in);

        String[] paises = new String[4]; // Array para almacenar los nombres de los pa�ses
        String[][] ciudades = new String[4][3]; // Array multidimensional para almacenar las ciudades

        // Capturar los nombres de los pa�ses
        for (int i = 0; i < 4; i++) {
            System.out.print("Ingrese el nombre del pa�s " + (i + 1) + ": ");
            paises[i] = scanner.nextLine();
        }
        
        // Capturar las ciudades para cada pa�s
        for (int i = 0; i < 4; i++) {
            System.out.println("Ingrese las ciudades para " + paises[i] + ":");
            for (int j = 0; j < 3; j++) {
                System.out.print("Ciudad " + (j + 1) + ": ");
                ciudades[i][j] = scanner.nextLine();
            }
        }

        // Imprimir los pa�ses con sus ciudades correspondientes
        for (int i = 0; i < 4; i++) {
            System.out.print("Pa�s: " + paises[i] + " Ciudades: ");
            for (int j = 0; j < 3; j++) {
                System.out.print(ciudades[i][j] + " ");
            }
            System.out.println();
        }

        scanner.close();

	}

}
