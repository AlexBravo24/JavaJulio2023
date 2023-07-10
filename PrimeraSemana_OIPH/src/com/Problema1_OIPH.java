package com;

import java.util.Scanner;

public class Problema1_OIPH {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/* Realiza un programa que reciba dos números 
		  por teclado e indique cuál es mayor o si son iguales.*/
		Scanner scan = new Scanner(System.in);
		Integer number2;
		Integer number1;
		System.out.println("Introduce un numero: ");
		number1 = scan.nextInt();
		System.out.println("Introduce otro numero: ");
		number2 = scan.nextInt();
		if(number1>number2) {
			System.out.println("El numero "+number1+" es mayor que el numero "+number2);
		}else if(number1<number2) {
			System.out.println("El numero "+number2+" es mayor que el numero "+number1);
		}else if(number1==number2) {
			System.out.println("El numero "+number1+" es igual al numero "+number1);

		}
		
		
		
	}

}
