package com.problemas.dia2;

import java.util.Scanner;

public class Ejercicio9_ADLM {

	public static void main(String[] args) {
		/* 9.Realiza un programa que pida el d�a de la semana (del 1 al 7) y escriba el d�a 
		 correspondiente. Si introducimos otro n�mero nos da un error. */
		Scanner entrada = new Scanner(System.in);
		System.out.println("Ingresa el n�mero de la semana");
		int semana = entrada.nextInt();
		switch(semana) {
			case 1:
				System.out.println("LUNES");
				break;
			case 2:
				System.out.println("MARTES");
				break;
			case 3:
				System.out.println("MI�RCOLES");
				break;
			case 4:
				System.out.println("JUEVES");
				break;
			case 5:
				System.out.println("VIERNES");
				break;
			case 6:
				System.out.println("S�BADO");
				break;
			case 7:
				System.out.println("DOMINGO");
				break;
			default:
				System.out.println("N�mero incorrecto");
				break;
		}
	}

}
