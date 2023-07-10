package com.arrays;

import java.util.Scanner;

public class Array3_MSG {

	public static void main(String[] args) {
		
		
		/*
		 *  Pide al usuario por teclado una frase y pasa sus caracteres a un array de caracteres.
		 */
		
		
		
		Scanner entrada = new Scanner(System.in);
			System.out.println("Ingresa la frase");
			String cadena = entrada.next();
		
		
		
        char [] caracteres = cadena.toCharArray();
        
        for (int i = 0; i < caracteres.length; i++) {
            System.out.println( "Posición[" + i + "] "  + caracteres [i]);
        }
		
		
		
	}

}


