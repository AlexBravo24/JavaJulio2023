package com;

import java.util.Scanner;

public class Ejercicio3_FACL {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a,b,c;
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Inserte el numero a");
		
		a = entrada.nextInt();
		
		System.out.println("Inserte el numero b");
		
		b = entrada.nextInt();
		
		if (b!=0) {
			c=a/b;
			System.out.println("El resultado de la division es: "+c);
		}
		else {
			System.out.println("b debe ser diferente de 0");
		}

	}

}
