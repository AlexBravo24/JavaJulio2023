package com.problemas.dia2;

import java.util.Scanner;

public class Ejercicio1_ADLM {

	public static void main(String[] args) {
		/* 1.Realiza un programa que reciba dos n�meros por teclado 
			e indique cu�l es mayor o si son iguales.
		*/
		int num1, num2;
		Scanner entrada = new Scanner(System.in);
		System.out.println("Ingresa el primer n�mero");
		num1 = entrada.nextInt();
		System.out.println("Ingresa el segundo n�mero");
		num2 = entrada.nextInt();
		
		if(num1 > num2) {
			System.out.println("El primer n�mero es mayor");
		}else if (num2 > num1){
			System.out.println("El segundo n�mero es mayor");
		}else {
			System.out.println("Los n�meros son iguales");
		}
	}

}
