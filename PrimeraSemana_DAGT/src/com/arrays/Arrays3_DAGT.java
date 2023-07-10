package com.arrays;

import java.util.Scanner;

public class Arrays3_DAGT {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.print("Escribe una frase: ");
		String frase = scanner.nextLine();
		char [] array = new char [frase.length()];
		
		for (int i = 0; i < array.length; i++) {
			array[i]=frase.charAt(i);
		}
	}

}
