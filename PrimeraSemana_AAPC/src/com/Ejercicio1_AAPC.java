package com;

import java.math.BigDecimal;
import java.util.Scanner;

public class Ejercicio1_AAPC {

	public static void main(String[] args) {
		// 1.Realiza un programa que reciba dos 
		//n�meros por teclado e indique cu�l es mayor o si son iguales. 

		double x;
		Scanner entrada = new Scanner(System.in);
		System.out.println("Introduce dos n�meros");
		x = entrada.nextDouble();
		double y;
		y = entrada.nextDouble();
		if (x>y) {
			System.out.println("N�mero 1 es mayor que n�mero 2");
		}if(x<y) {
			System.out.println("N�mero 2 es mayor que n�mero 1");
		}if (x==y) {
			System.out.println("N�mero 1 es igual al n�mero 2");
		}
		
		
		
		
		
		
		
				
				
		
		
	}

}
