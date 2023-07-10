package com;

import java.util.Scanner;

public class Ejercicio1_JDRA {

	public static void main(String[] args) {
		
		// 1.Realiza un programa que reciba dos números por teclado e indique cuál es mayor o si son iguales
		
		int num1, num2;
		
		Scanner entrada= new Scanner(System.in);
		
		System.out.println("Introduzca el numero 1: ");
		num1 = entrada.nextInt();
		
		System.out.println("Introduzca el numero 2: ");
		num2 = entrada.nextInt();
		
		
		
		if ( num1 > num2 ) {
            System.out.println("El numero mayor es " + num1);
            
        } else if ( num1 < num2 ) {
            System.out.println("El numero mayor es " + num2);
            
        } else if ( num1 == num2 ) {
			System.out.println("Los numeros son iguales");
			
		} 
		
		
	}
}
