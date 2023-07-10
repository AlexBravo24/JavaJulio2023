package com.ciclos;

import java.util.Scanner;

public class Ciclos10_ADMG {

	public static void main(String[] args) {
		
		//Programa que lea 20 números e indique si son positivos o negativos y pares o 
		//impares y además muestre la sumatoria de los positivos y sumatoria de los impares.
		
		Scanner scanner = new Scanner(System.in);

        int totalNumeros = 20;
        int sumatoriaPositivos = 0;
        int sumatoriaImpares = 0;

        System.out.println("Ingrese " + totalNumeros + " números:");

        for (int i = 1; i <= totalNumeros; i++) {
            System.out.print("Número " + i + ": ");
            int numero = scanner.nextInt();

            if (numero > 0) {
                System.out.println("Positivo");
                sumatoriaPositivos += numero;
            } else if (numero < 0) {
                System.out.println("Negativo");
            } else {
                System.out.println("Cero");
            }

            if (numero % 2 == 0) {
                System.out.println("Par");
            } else {
                System.out.println("Impar");
                sumatoriaImpares += numero;
            }
        }

        System.out.println("Sumatoria de los números positivos: " + sumatoriaPositivos);
        System.out.println("Sumatoria de los números impares: " + sumatoriaImpares);

	}

}
