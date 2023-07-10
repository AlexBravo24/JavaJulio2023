package com.problemas.dia2;

import java.util.Scanner;

public class Ejercicio4_ADLM {
	public static void main(String[] args) {
		// 4. Realiza un programa que lea una cadena por teclado y compruebe si es una letra mayúscula.
		Scanner entrada = new Scanner(System.in);
		System.out.println("Escribe tu mensaje");
		String mensaje = entrada.nextLine();
		if(mensaje.equals(mensaje.toUpperCase())) {
			System.out.println("La cadena esta en mayuscula");
		}else {
			System.out.println("La cadena no esta en mayuscula");
		}
	}
}
