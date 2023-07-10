package com.ciclos;

import java.util.Scanner;

public class Ciclos9_ADMG {

	public static void main(String[] args) {
		
		//Programa Java que lea dos n�meros y muestre los n�meros pares entre ellos
		
		Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el primer n�mero: ");
        int numero1 = scanner.nextInt();

        System.out.print("Ingrese el segundo n�mero: ");
        int numero2 = scanner.nextInt();

        int menor = Math.min(numero1, numero2);
        int mayor = Math.max(numero1, numero2);

        System.out.println("N�meros pares entre " + menor + " y " + mayor + ":");

        for (int i = menor; i <= mayor; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }

	}

}
