package com;

import java.util.Scanner;

public class Ejercicio1_FACL {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Ejercicio 1, recibir dos numeros y determinar cuál es mayor o si son iguales
		
		int a,b;
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Inserte el numero a");
		
		a = entrada.nextInt();
		
		System.out.println("Inserte el numero b");
		
		b = entrada.nextInt();
		
		if (a>b) {
			System.out.println("a es mayor que b");
		}
		else if(b>a) {
			System.out.println("b es mayor que a");
		}
		else {
			System.out.println("son iguales");
		}
		

	}

}
