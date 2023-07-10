package com;

import java.util.Scanner;

public class Ejercicio4_ADMG {

	public static void main(String[] args) {
		
		//Realiza un programa que lea una cadena por teclado 
		// y compruebe si es una letra mayúscula.
		
		 Scanner scanner = new Scanner(System.in);

	        System.out.print("Ingrese una cadena: ");
	        String cadena = scanner.nextLine();

	        if (esLetraMayuscula(cadena)) {
	            System.out.println("La cadena es una letra mayúscula.");
	        } else {
	            System.out.println("La cadena no es una letra mayúscula.");
	        }

	        scanner.close();
	    }

	    public static boolean esLetraMayuscula(String cadena) {
	        if (cadena.length() != 1) {
	            return false; // 
	        }

	        char caracter = cadena.charAt(0);
	        return Character.isUpperCase(caracter);
	}

}
