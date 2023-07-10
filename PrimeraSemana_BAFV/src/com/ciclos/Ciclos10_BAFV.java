package com.ciclos;

import java.util.Scanner;

public class Ciclos10_BAFV {
    public static void main(String[] args) {
    	/*
    	 10. Programa que lea 20 números e indique si son positivos o negativos y pares o 
			impares y además muestre la sumatoria de los positivos y sumatoria de los impares. 
    	 
    	 * */
        Scanner scanner = new Scanner(System.in);

        int positivos = 0;
        int negativos = 0;
        int pares = 0;
        int impares = 0;

        for (int i = 1; i <= 20; i++) { // bucle de 20 repeticiones 
            System.out.print("Ingrese el número " + i + ": ");
            int numero = scanner.nextInt();

            if (numero > 0) {
                positivos += numero;
                System.out.println(numero + " es positivo.");
            } else if (numero < 0) {
                negativos += numero;
                System.out.println(numero + " es negativo.");
            } else {
                System.out.println(numero + " es cero.");
            }

            if (numero % 2 == 0) {
                pares += numero;
                System.out.println(numero + " es par.");
            } else {
                impares += numero;
                System.out.println(numero + " es impar.");
            }
        }

        System.out.println("suma de positivos: " + positivos);
        System.out.println("suma de impares : " + impares);
    }
}
