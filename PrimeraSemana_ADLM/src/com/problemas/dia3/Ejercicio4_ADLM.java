package com.problemas.dia3;

import java.util.Scanner;

public class Ejercicio4_ADLM {

	public static void main(String[] args) {
		/* 4.Programa que reciba una frase y una letra por teclado. Deber� retornar como resultado 
			cu�ntas veces existe esa letra dentro de la frase. Si no existe, imprimir un mensaje 
			�Car�cter no encontrado�. */
		
		Scanner entrada = new Scanner(System.in);
		System.out.println("Ingresa una frase");
		String frase = entrada.next();
		System.out.println("Ingresa el car�cter a buscar");
		String letra = entrada.next();
		int contadorletras = 0;
		
		for(int i = 0; i <= frase.length() - 1 ; i++) {
			if(letra.charAt(0) == frase.charAt(i)) {
				contadorletras++;
			}
		}
		
		if(contadorletras > 0) {
			System.out.println("El car�cter se encontro un tatal de: " + contadorletras);
		}else {
			System.out.println("Car�cter no encontrado");
		}
	}

}
