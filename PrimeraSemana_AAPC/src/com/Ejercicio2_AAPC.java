package com;

import java.util.Scanner;

public class Ejercicio2_AAPC {

	public static void main(String[] args) {
		// 2.Realiza un programa que pida un número por teclado y nos indique si es par o impar
		
		int x;
		Scanner entrada = new Scanner(System.in);
		System.out.println("Introduce un número");
		x = entrada.nextInt();
		if (x%2==0) {
			System.out.println("El número es par");
		}else {
			System.out.println("El número es impar");
		}
		
			
		
		

	}

}
