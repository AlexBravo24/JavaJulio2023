package com;

import java.util.Scanner;

public class Ejercicio4_BAFV {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Ingrese una cadena");
		String cadena = entrada.nextLine();
		
		if(cadena == cadena.toLowerCase()) {
			System.out.println("cadena minúscula");
		}else if(cadena == cadena.toUpperCase()) {
			System.out.println("cadena mayúscula");
		}

	}

}
