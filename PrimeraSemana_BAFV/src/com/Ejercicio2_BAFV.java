package com;

import java.util.Scanner;

public class Ejercicio2_BAFV {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*2.Realiza un programa que pida un número por teclado y nos indique si es par o impar.*/
		
		Scanner entrada = new Scanner(System.in);
		
		int numero;
		System.out.println("Ingrese un número: 	");
		numero = entrada.nextInt();
		
		if(numero%2==0) { // obtenemos el modulo de 2
			System.out.println("par");
		}else {
			System.out.println("impar");
		}
	}

}
