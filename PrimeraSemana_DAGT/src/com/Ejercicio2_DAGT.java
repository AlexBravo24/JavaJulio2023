package com;

import java.util.Scanner;

public class Ejercicio2_DAGT {

	public static void main(String[] args) {
		
		int num;
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Teclea un numero: ");
		num = scanner.nextInt();
		
		if ((num % 2) == 0) {
			System.out.println("El numero es par");			
		}else {
			System.out.println("El numero es impar");
		}
	}

}
