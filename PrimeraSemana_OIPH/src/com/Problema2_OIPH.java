package com;

import java.util.Scanner;

public class Problema2_OIPH {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 Realiza un programa que pida un número por 
		 teclado y nos indique si es par o impar.
		 */
		Scanner scan = new Scanner(System.in);
		Integer number;
		System.out.println("Introduce un numero: ");
		number = scan.nextInt();
		if(number%2==0) {
			System.out.println("El numero "+number+" es par");
		}else {
			System.out.println("El numero "+ number +" es impar");
		}
	}

}
