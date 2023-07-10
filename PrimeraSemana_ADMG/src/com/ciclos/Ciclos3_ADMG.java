package com.ciclos;

import java.util.Scanner;

public class Ciclos3_ADMG {

	public static void main(String[] args) {
		
		//Realiza un programa para determinar si un String es palíndromo
		
		Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese una palabra o frase: ");
        String texto = scanner.nextLine();

        // Eliminar espacios en blanco y convertir a minúsculas
        String textoSinEspacios = texto.replaceAll("\\s", "").toLowerCase();

        boolean esPalindromo = true;
        int longitud = textoSinEspacios.length();

        for (int i = 0; i < longitud / 2; i++) {
            if (textoSinEspacios.charAt(i) != textoSinEspacios.charAt(longitud - 1 - i)) {
                esPalindromo = false;
                break;
            }
        }

        if (esPalindromo) {
            System.out.println("El texto es un palíndromo.");
        } else {
            System.out.println("El texto no es un palíndromo.");

	}

}
}
