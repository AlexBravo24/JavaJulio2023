package com.problemas.dia3;

import java.util.Scanner;

public class Ejercicio11_ADLM {

	public static void main(String[] args) {
		/* 11.Dibuja un cuadrado, como en la imagen que acompaña, introducir desde teclado el 
		ancho y el alto. Ejemplo: 8 x 8 */
		Scanner entrada = new Scanner(System.in);
		System.out.println("Ingresa el ancho");
		int ancho = entrada.nextInt();
		System.out.println("Ingresa el alto");
		int alto = entrada.nextInt();
		
		for(int i = 1; i <= alto; i++) {
			for(int j = 1; j <= ancho; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}

}
