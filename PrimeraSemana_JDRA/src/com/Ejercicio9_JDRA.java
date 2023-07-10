package com;

import java.util.Scanner;

public class Ejercicio9_JDRA {

	public static void main(String[] args) {
		
		// 9.Realiza un programa que pida el día de la semana (del 1 al 7) y escriba el día correspondiente. Si 
		//introducimos otro número nos da un error.
		
		int num;
		
		Scanner entrada= new Scanner(System.in);
		
		System.out.println("Introduzca el dia de la semana ( 1-7 ) : ");
		num = entrada.nextInt();
		
		switch (num) {
		case 1:
			System.out.println("Lunes");
			break;
		case 2:
			System.out.println("Martes");
			break;
		case 3:
			System.out.println("Miercoles");
			break;
		case 4:
			System.out.println("Jueves");
			break;
		case 5:
			System.out.println("Viernes");
			break;
		case 6:
			System.out.println("Sabado");
			break;
		case 7:
			System.out.println("Domingo");
			break;
		default:
			System.out.println("Desconocido");
			break;
		}

	}

}
