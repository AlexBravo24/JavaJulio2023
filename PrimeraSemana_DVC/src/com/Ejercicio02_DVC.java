package com;

import java.util.Scanner;

public class Ejercicio02_DVC {

	public static void main(String[] args) {
		
		//2.Realiza un programa que pida un n�mero por teclado y nos indique si es par o impar.

		int num;
		System.out.println("Comparador de si un n�meor es par o impar");
		Scanner entrada = new Scanner (System.in);
		System.out.println("Introduce un n�mero");
		num = entrada.nextInt();
		
		if (num % 2 == 0) {
            System.out.println(num + " es un n�mero par.");
        } else {
            System.out.println(num + " es un n�mero impar.");
        }
		
	}

}
