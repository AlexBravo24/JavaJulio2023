package com;

import java.util.Scanner;

public class Ejercicio1_ADMG {

	public static void main(String[] args) {
		
		//Realiza un programa que reciba dos n�meros por teclado
		// e indique cu�l es mayor o si son iguales.

		Scanner scanner = new Scanner(System.in);

        System.out.print("Ingresa el primer n�mero: ");
        int numero1 = scanner.nextInt();

        System.out.print("Ingresa el segundo n�mero: ");
        int numero2 = scanner.nextInt();

        if (numero1 > numero2) {
            System.out.println(numero1 + " es mayor que " + numero2);
        } else if (numero1 < numero2) {
            System.out.println(numero2 + " es mayor que " + numero1);
        } else {
            System.out.println("Los n�meros ingresados son iguales.");
        }
		
		
	}

}
