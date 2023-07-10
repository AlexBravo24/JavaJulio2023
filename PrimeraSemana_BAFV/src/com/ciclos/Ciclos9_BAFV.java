package com.ciclos;

import java.util.Scanner;

public class Ciclos9_BAFV{
    public static void main(String[] args) {
    	/*
    	 9. Programa Java que lea dos números y muestre los números pares entre ellos  
    	  
    	  
    	 */
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese numero 1: ");
        int numero1 = scanner.nextInt();

        System.out.print("Ingrese numero 2: ");
        int numero2 = scanner.nextInt();

        System.out.println("Los números pares entre " + numero1 + " y " + numero2 + " son:");
        for (int i = numero1; i <= numero2; i++) {
            if (i % 2 == 0) { // modulo
                System.out.println(i);
            }
        }
    }
}
