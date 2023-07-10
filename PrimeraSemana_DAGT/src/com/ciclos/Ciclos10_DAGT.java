package com.ciclos;

import java.util.Scanner;

public class Ciclos10_DAGT {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

        int positivos = 0;
        int negativos = 0;
        int pares = 0;
        int impares = 0;
        int sumPositivos = 0;
        int sumUneven = 0;

        for (int i = 1; i <= 20; i++) {
            System.out.print("Ingresa el número " + i + ": ");
            int numero = scanner.nextInt();

            if (numero > 0) {
                positivos++;
                sumPositivos += numero;
            } else if (numero < 0) {
                negativos++;
            }

            if (numero % 2 == 0) {
                pares++;
            } else {
                impares++;
                sumUneven += numero;
            }
        }

        System.out.println("Cantidad de números positivos: " + positivos);
        System.out.println("Cantidad de números negativos: " + negativos);
        System.out.println("Cantidad de números pares: " + pares);
        System.out.println("Cantidad de números impares: " + impares);
        System.out.println("La sumatoria de los numeros positivos es: " + sumPositivos);
        System.out.println("la sumatoria de los numeros impares es: " + sumUneven);
	}

}
