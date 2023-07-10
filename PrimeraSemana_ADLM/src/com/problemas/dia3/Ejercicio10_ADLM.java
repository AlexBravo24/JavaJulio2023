package com.problemas.dia3;

import java.util.Scanner;

public class Ejercicio10_ADLM {

	public static void main(String[] args) {
		/* 10. Programa que lea 20 números e indique si son positivos o negativos y pares o 
		impares y además muestre la sumatoria de los positivos y sumatoria de los impares. */
		
		Scanner entrada = new Scanner(System.in);
		int contador = 1;
		double sumaPares = 0, sumaImpares = 0, sumaNegativos = 0, sumaPositivos = 0;
		while(contador <=20) {
			System.out.println("Ingresa el número");
			int numero = entrada.nextInt();
			if(numero%2 == 0) {
				sumaPares+=numero;
				System.out.println("Par");
			}else {
				sumaImpares+=numero;
				System.out.println("Impar");
			}
			if(numero>0) {
				sumaPositivos+=numero;
				System.out.println("Positivo");
			}else {
				sumaNegativos+=numero;
				System.out.println("Negativo");
			}
			contador++;
		}
		System.out.println("Suma positivos: " + sumaPositivos);
		System.out.println("Suma impares: " + sumaImpares);
	}

}
