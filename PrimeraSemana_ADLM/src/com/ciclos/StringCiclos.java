package com.ciclos;

import java.util.Scanner;

public class StringCiclos {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		Double cadena1 = 10.0;
		System.out.println("Inserta la cadena");
		Double cadena2 = entrada.nextDouble();
		if(cadena1 == cadena2) {
			System.out.println("Las cadenas son iguales operador lógico");
		}
		
		if(cadena1.equals(cadena2)) {
			System.out.println("Las cadenas son iguales método equals");
		}
	}

}
