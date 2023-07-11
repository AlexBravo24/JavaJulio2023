package com;

import java.util.Scanner;

public class Ejercicio4_AAPC {

	public static void main(String[] args) {
		// 4. Realiza un programa que lea una cadena por teclado 
		//y compruebe si es una letra mayúscula.
		Scanner scanner = new Scanner(System.in);
		System.out.println("Ingresa una cadena de texto : ");
		String cadena = scanner.nextLine();
		if(Mayuscula(cadena)) {
			System.out.println("Cadena de texto ingresado es mayuscula");
		}else {
			System.out.println("Cadena de texto ingresado es minuscula");
		}
			}

	private static boolean Mayuscula(String cadena) {
		// TODO Auto-generated method stub
		if(cadena.length()!=1) {
		return false;
	}
		char primerCaracter = cadena.charAt(0);
		if(Character.isUpperCase(primerCaracter)) {
			return true;
		}else {
			return false;
		}
	}
		
		
}	
	
