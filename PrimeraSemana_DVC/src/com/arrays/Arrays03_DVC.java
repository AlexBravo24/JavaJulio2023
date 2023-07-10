package com.arrays;

import java.util.Scanner;

public class Arrays03_DVC {

	public static void main(String[] args) {
		String cadena;
		Scanner entrada = new Scanner(System.in);
		System.out.println("Introduce una frase ");
		cadena = entrada.nextLine();
		char [] cadena1 = cadena.toCharArray();
		System.out.println("Lo caracteres son: ");
		
		for (char i:cadena1){
			System.out.println(i + " ");
		}
		
		
		
		
		
		

	}

}
