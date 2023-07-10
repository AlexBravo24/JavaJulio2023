package com;

import java.util.Scanner;

public class Ejercicio2_FACL {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Ejercicio 2 determinar si el número es par o impar
		
		Scanner entrada = new Scanner (System.in);
		
		System.out.println("Inserte un numero");
		
		int a;
		
		a=entrada.nextInt();
		
		if(a%2==0) {
			System.out.println("El numero es par");
		}
		else {
			System.out.println("el numero es impar");
		}
		

	}

}
