package com.problemas.dia3;

import java.util.Scanner;

public class Ejercicio3_ADLM {

	public static void main(String[] args) {
		/* 3. Realiza un programa para determinar si un String es palíndromo. */
		
		Scanner entrada = new Scanner(System.in);
		System.out.println("Ingresa una palabra");
		String palabra = entrada.nextLine().replace(" ", "");
		String palabra2 = "";
		
		for(int i = palabra.length() - 1 ; i >= 0 ; i--) {
			palabra2 += palabra.charAt(i);
		}
		
		if(palabra.equals(palabra2)) {
			System.out.println("Es un palindromo");
		}else {
			System.out.println("No es un palindromo");
		}
		
	}

}
