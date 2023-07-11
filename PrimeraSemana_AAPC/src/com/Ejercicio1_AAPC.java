package com;

import java.math.BigDecimal;
import java.util.Scanner;

public class Ejercicio1_AAPC {

	public static void main(String[] args) {
		// 1.Realiza un programa que reciba dos 
		//números por teclado e indique cuál es mayor o si son iguales. 

		double x;
		Scanner entrada = new Scanner(System.in);
		System.out.println("Introduce dos números");
		x = entrada.nextDouble();
		double y;
		y = entrada.nextDouble();
		if (x>y) {
			System.out.println("Número 1 es mayor que número 2");
		}if(x<y) {
			System.out.println("Número 2 es mayor que número 1");
		}if (x==y) {
			System.out.println("Número 1 es igual al número 2");
		}
		
		
		
		
		
		
		
				
				
		
		
	}

}
