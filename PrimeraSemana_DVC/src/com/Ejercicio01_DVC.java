package com;

import java.util.Scanner;

public class Ejercicio01_DVC {

	public static void main(String[] args) {
		
		//1.Realiza un programa que reciba dos n�meros por teclado e indique cu�l es mayor o si son iguales.
		
		int num1, num2;
		
		System.out.println("Introduce dos n�meros para comparar cual es mayor y cual es el menor o si son iguales10");
		Scanner entrada = new Scanner (System.in);
		System.out.println("Introduce el primer n�mero");
		num1 = entrada.nextInt();
		System.out.println("Introduce el segundo numero");
		num2 = entrada.nextInt();
		
		if (num1 > num2) {
			System.out.println(num1 + " Es mayor que " + num2);
		} else if (num1 < num2) {
			System.out.println(num1 + " Es menor que " + num2);
		}else {
			System.out.println("Son iguales");
		}

	}

}