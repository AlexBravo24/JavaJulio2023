package com.ciclos;

import java.util.Scanner;

public class Ejercicio4_AAPC {

	public static void main(String[] args) {
		// Programa que reciba una frase y una letra por teclado. Deberá retornar como resultado cuántas 
		//veces existe esa letra dentro de la frase. Si no existe, imprimir un mensaje “Carácter no encontrado”.
		
		
		
		        Scanner scanner = new Scanner(System.in);

		        System.out.print("Ingresa una frase: ");
		        String frase = scanner.nextLine();

		        System.out.print("Ingresa una letra: ");
		        char letra = scanner.nextLine().charAt(0);

		        int contador = contarCaracter(frase, letra);

		        if (contador > 0) {
		            System.out.println("La letra '" + letra + "' aparece " + contador + " veces en la frase.");
		        } else {
		            System.out.println("Carácter no encontrado.");
		        }
		    }

		    public static int contarCaracter(String frase, char letra) {
		        int contador = 0;
		        for (int i = 0; i < frase.length(); i++) {
		            if (frase.charAt(i) == letra) {
		                contador++;
		            }
		        }
		        return contador;
		    }
		
	
		
		
		
	}


