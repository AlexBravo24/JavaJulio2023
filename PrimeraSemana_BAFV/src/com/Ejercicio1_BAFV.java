package com;

import java.util.Scanner;

public class Ejercicio1_BAFV {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// 1.Realiza un programa que reciba dos n�meros por teclado e indique cu�l es mayor
		//o si son iguales.
		
		Scanner entrada  = new Scanner(System.in);
		
		System.out.print("Ingrese el primer n�mero: ");
        int numero1 = entrada.nextInt();

        System.out.print("Ingrese el segundo n�mero: ");
        int numero2 = entrada.nextInt();

        if (numero1 > numero2) {
            System.out.println(numero1 + " es mayor que " + numero2);
        } else if (numero2 > numero1) {
            System.out.println(numero2 + " es mayor que " + numero1);
        } else {
            System.out.println("los n�meros son iguales.");
        }
		
		
	}

}
