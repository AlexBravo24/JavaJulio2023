package com.arrays;

import java.util.Scanner;

public class Array3_BAFV {
	
	/*
	 Pide al usuario por teclado una frase y pasa sus caracteres a un array de 
	caracteres.
	 */
	
	public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Ingrese una frase: ");
        String frase =entrada.nextLine();

        // se convierte a un array contenido por caracteres
        char[] caracteres = frase.toCharArray();

        // Imprimir el array de caracteres
        System.out.println("Se muestra los caracteres de la frase:");

        for (char i : caracteres) {
            System.out.println(i);
        }
    }

}
