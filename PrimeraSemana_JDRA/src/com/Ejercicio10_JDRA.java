package com;

import java.util.Scanner;

public class Ejercicio10_JDRA {

	public static void main(String[] args) {
		
		// 10.Realiza un programa que pida un número entero entre uno y doce e imprima el número de días que tiene el 
		//mes correspondiente.
		
int num;
		
		Scanner entrada= new Scanner(System.in);
		
		System.out.println("Introduzca un numero entero entre ( 1 - 12 ) : ");
		num = entrada.nextInt();
		
		switch (num) {
		case 1:
			System.out.println("31 Dias");
			break;
		case 2:
			System.out.println("28 Dias");
			break;
		case 3:
			System.out.println("31 Dias");
			break;
		case 4:
			System.out.println("30 Dias");
			break;
		case 5:
			System.out.println("31 Dias");
			break;
		case 6:
			System.out.println("30 Dias");
			break;
		case 7:
			System.out.println("31 Dias");
			break;
		case 8:
			System.out.println("31 Dias");
			break;
		case 9:
			System.out.println("30 Dias");
			break;
		case 10:
			System.out.println("31 Dias");
			break;
		case 11:
			System.out.println("30 Dias");
			break;
		case 12:
			System.out.println("31 Dias");
			break;
		default:
			System.out.println("Desconocido");
			break;
		}

	}

}
