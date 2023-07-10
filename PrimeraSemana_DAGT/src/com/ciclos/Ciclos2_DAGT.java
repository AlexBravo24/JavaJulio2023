package com.ciclos;

import java.util.Scanner;

public class Ciclos2_DAGT {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

        System.out.print("Ingresa un n�mero: ");
        int numero = scanner.nextInt();

        System.out.print("Ingresa el n�mero m�ximo de iteraciones: ");
        int iteraciones = scanner.nextInt();

        for (int i = 1; i <= iteraciones; i++) {
            int resultado = numero * i;
            System.out.println(numero + " x " + i + " = " + resultado);
        }
	}

}
