package com.arrays;

import java.util.Scanner;

public class Arrays1_DAGT {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int [] array = new int [10];
		
		for (int i = 0; i < array.length; i++) {
			System.out.println("Introduce un valor para el array: ");
			array[i] = scanner.nextInt();

		}

		for (int i = 0;i < array.length;i++) {
			System.out.println("El valor en el indice " + i + " es " + array[i]);
		}
		
	}

}
