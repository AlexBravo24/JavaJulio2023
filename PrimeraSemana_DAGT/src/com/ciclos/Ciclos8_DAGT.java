package com.ciclos;

import java.util.Scanner;

public class Ciclos8_DAGT {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

        System.out.print("Ingresa el primer n�mero: ");
        int numero1 = scanner.nextInt();

        System.out.print("Ingresa el segundo n�mero: ");
        int numero2 = scanner.nextInt();

        int menor = Math.min(numero1, numero2);
        int mayor = Math.max(numero1, numero2);

        System.out.println("Los n�meros desde el menor hasta el mayor son:");
        for (int i = menor; i <= mayor; i++) {
            System.out.println(i);
        }
		
	}

}
