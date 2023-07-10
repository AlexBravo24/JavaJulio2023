package com.problemas.dia2;

import java.util.Scanner;

public class Ejercicio1_ADLM {

	public static void main(String[] args) {
		/* 1.Realiza un programa que reciba dos números por teclado 
			e indique cuál es mayor o si son iguales.
		*/
		int num1, num2;
		Scanner entrada = new Scanner(System.in);
		System.out.println("Ingresa el primer número");
		num1 = entrada.nextInt();
		System.out.println("Ingresa el segundo número");
		num2 = entrada.nextInt();
		
		if(num1 > num2) {
			System.out.println("El primer número es mayor");
		}else if (num2 > num1){
			System.out.println("El segundo número es mayor");
		}else {
			System.out.println("Los números son iguales");
		}
	}

}
