package com.ciclos;

import java.util.Scanner;

public class Ejercicio10_AAPC {

	public static void main(String[] args) {
		// Programa que lea 20 números e indique si son positivos o negativos y pares o 
        //impares y además muestre la sumatoria de los positivos y sumatoria de los impares. 

		
		        Scanner scanner = new Scanner(System.in);

		        int cantidadNumeros = 20;
		        int[] numeros = new int[cantidadNumeros];
		        int sumaPositivos = 0;
		        int sumaImpares = 0;

		        System.out.println("Ingrese " + cantidadNumeros + " números:");

		        for (int i = 0; i < cantidadNumeros; i++) {
		            System.out.print("Número " + (i + 1) + ": ");
		            numeros[i] = scanner.nextInt();

		            if (numeros[i] > 0) {
		                sumaPositivos += numeros[i];
		            }

		            if (numeros[i] % 2 != 0) {
		                sumaImpares += numeros[i];
		            }
		        }

		        System.out.println("Clasificación de los números:");

		        for (int i = 0; i < cantidadNumeros; i++) {
		            System.out.print(numeros[i] + ": ");

		            if (numeros[i] > 0) {
		                System.out.print("Positivo ");
		            } else if (numeros[i] < 0) {
		                System.out.print("Negativo ");
		            } else {
		                System.out.print("Cero ");
		            }

		            if (numeros[i] % 2 == 0) {
		                System.out.print("Par");
		            } else {
		                System.out.print("Impar");
		            }

		            System.out.println();
		        }

		        System.out.println("Sumatoria de los números positivos: " + sumaPositivos);
		        System.out.println("Sumatoria de los números impares: " + sumaImpares);
		    }
		}

		
		
		
		
	


