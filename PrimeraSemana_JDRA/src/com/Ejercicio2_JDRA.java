package com;

import java.util.Scanner;

public class Ejercicio2_JDRA {

	public static void main(String[] args) {
		
		// 2.Realiza un programa que pida un número por teclado y nos indique si es par o impar.
		
		int num;
		
		Scanner entrada= new Scanner(System.in);
		
		System.out.println("Introduzca un numero : ");
		num = entrada.nextInt();
		
		 if (num % 2 == 0) {
			System.out.println("Es par");
			
		    } else {
		    System.out.println("Es impar");
		    }
		
	}

}
