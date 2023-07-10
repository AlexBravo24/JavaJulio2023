package com;

import java.util.Scanner;

public class Ejercicio03_DVC {

	public static void main(String[] args) {
		// 3.Crea un programa que pida al usuario dos números y muestre el resultado de su división.
		//Si el segundo número es 0, debe mostrar un mensaje de error.

		
		int num1, num2;
		double res;
		System.out.println("Divide dos números");
		Scanner entrada = new Scanner (System.in);
		System.out.println("Introduce el primer número");
		num1 = entrada.nextInt();
		System.out.println("Introduce el segundo número");
		num2 = entrada.nextInt();
		
		if (num2 == 0) {
			System.out.println("Error no se puede dividir entre 0");
		}else {
		res = num1 /num2;
		System.out.println("El resultado es " + res );
		
		}
	}
}