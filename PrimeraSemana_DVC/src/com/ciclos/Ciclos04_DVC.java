package com.ciclos;

import java.util.Scanner;

public class Ciclos04_DVC {

	public static void main(String[] args) {
		
		 Scanner entrada = new Scanner(System.in);

	        System.out.print("Ingresa una frase: ");
	        String frase = entrada.nextLine();

	        System.out.print("Ingresa una letra: ");
	        char letra = entrada.next().charAt(0);

	        // Convertir la letra a minúscula 
	        letra = Character.toLowerCase(letra);

	        // Contar la cantidad de veces que aparece la letra en la frase
	        int contador = 0;

	        for (int i = 0; i < frase.length(); i++) {
	            char caracter = Character.toLowerCase(frase.charAt(i));

	            if (caracter == letra) {
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
