package com.ciclos;

import java.util.Scanner;

public class Ciclos3 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

        System.out.print("Ingresa una palabra: ");
        String palabra = scanner.nextLine();

        palabra = palabra.replaceAll(" ", "").toLowerCase(); // Elimina espacios y convierte a minúsculas

        int longitud = palabra.length();
        boolean esPalindromo = true;

        for (int i = 0; i < longitud / 2; i++) {
            if (palabra.charAt(i) != palabra.charAt(longitud - 1 - i)) {
                esPalindromo = false;
                break;
            }
        }

        if (esPalindromo) {
            System.out.println("La palabra ingresada es un palíndromo.");
        } else {
            System.out.println("La palabra ingresada no es un palíndromo.");
        }
	}

}
