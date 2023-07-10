package com;

import java.util.Scanner;

public class Ejercicio1_DAGT {

	public static void main(String[] args) {

		/*Programa que pide 2 numeros al usuario
		 * e indica cual de los dos es mayor
		 */
		
		int num1;
		int num2;
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Teclea el primer numero: ");
		num1 = scanner.nextInt();
		System.out.println("Teclea el segundo numero: ");
		num2 = scanner.nextInt();
		
		if (num1 == num2) {
			System.out.println("Ambos numeros son iguales");
		}else if (num1 > num2) {
			System.out.println("El numero mayor es: " + num1);
		}else{
			System.out.println("El numero mayor es: " + num2);
		}
		
		
		
	}

}
