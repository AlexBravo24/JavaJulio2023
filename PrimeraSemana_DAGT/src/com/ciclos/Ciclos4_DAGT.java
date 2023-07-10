package com.ciclos;

import java.util.Scanner;

public class Ciclos4_DAGT {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

        System.out.print("Ingresa una frase: ");
        String frase = scanner.nextLine();

        System.out.print("Ingresa una letra: ");
        char letra = scanner.nextLine().charAt(0);

        int contador = 0;

        for (int i = 0; i < frase.length(); i++) {
            if (frase.charAt(i) == letra) {
                contador++;
            }
        }

        if (contador > 0) {
            System.out.println("La letra '" + letra + "' aparece " + contador + " veces en la frase.");
        } else {
            System.out.println("Carácter no encontrado.");
        }
	}

}
