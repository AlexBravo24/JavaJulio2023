package com.arrays;

import java.util.Scanner;

public class Ejercicio3_AAPC {

	public static void main(String[] args) {
		// Pide al usuario por teclado una frase 
		//y pasa sus caracteres a un array de caracteres. 
		 
		
		        Scanner scanner = new Scanner(System.in);

		        System.out.print("Ingrese una frase: ");
		        String frase = scanner.nextLine();

		        char[] caracteres = frase.toCharArray();

		        System.out.println("Los caracteres de la frase en un array son:");

		        for (char c : caracteres) {
		            System.out.println(c);
		        }
		    }
		

	

}
