package com;

import java.util.Scanner;

public class Ejercicio3_AAPC {

	public static void main(String[] args) {
		// 3.Crea un programa que pida al usuario dos n�meros
		//y muestre el resultado de su divisi�n. Si el segundo n�mero es 0,
		//debe mostrar un mensaje de error

		double x;
		Scanner numero = new Scanner(System.in);
		System.out.println("Vamos a hacer una divisi�n");
		System.out.println("Introduce el dividendo");
		x = numero.nextDouble();
		System.out.println("Introduce el divisor");
		double y;
		y = numero.nextDouble();
				System.out.println(Math.abs(x/y));
				if(y == 0) {
					System.out.println("Erroor, no se puede colocar 0 en el divisor ");
		}
				
	}

}
