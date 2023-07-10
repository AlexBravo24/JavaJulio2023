package com.problemas.dia2;

import java.util.Scanner;

public class Ejercicio9_ADLM {

	public static void main(String[] args) {
		/* 9.Realiza un programa que pida el día de la semana (del 1 al 7) y escriba el día 
		 correspondiente. Si introducimos otro número nos da un error. */
		Scanner entrada = new Scanner(System.in);
		System.out.println("Ingresa el número de la semana");
		int semana = entrada.nextInt();
		switch(semana) {
			case 1:
				System.out.println("LUNES");
				break;
			case 2:
				System.out.println("MARTES");
				break;
			case 3:
				System.out.println("MIÉRCOLES");
				break;
			case 4:
				System.out.println("JUEVES");
				break;
			case 5:
				System.out.println("VIERNES");
				break;
			case 6:
				System.out.println("SÁBADO");
				break;
			case 7:
				System.out.println("DOMINGO");
				break;
			default:
				System.out.println("Número incorrecto");
				break;
		}
	}

}
