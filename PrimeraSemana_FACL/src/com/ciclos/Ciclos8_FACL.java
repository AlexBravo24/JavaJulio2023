package com.ciclos;

import java.util.Scanner;

public class Ciclos8_FACL {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a, b;

		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Inserte el numero a");
		
		a = entrada.nextInt();
		System.out.println("Inserte el numero b");
		
		b = entrada.nextInt();
		
		if (a>b) {
			System.out.println("el amyor es: "+a+" el menor es: "+b);
		}
		else {
			System.out.println("el amyor es: "+b+" el menor es: "+a);
		}

	}

}
