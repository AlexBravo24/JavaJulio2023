package com;

import java.util.Scanner;

public class Ejercicio09_DVC {

	public static void main(String[] args) {
		// ejercicio 9
		
		int numero;
		String dia = null;
		
		Scanner entrada = new Scanner (System.in);
		System.out.println("Introduce el un numero dia de la semana (1 - 7)");
		numero = entrada.nextInt();
		
		switch (numero) {
		case 1:
			dia = "Lunes";
			break;
		case 2:
			dia = "Martes";
			break;
		case 3:
			dia = "Miercoles";
			break;
		case 4:
			dia = "Jueves";
			break;
		case 5:
			dia = "Viernes";
			break;
		case 6:
			dia = "Sabado";
			break;
		case 7:
			dia = "Domingo";
			break;
		default:
			dia = "NÜMERO INCORRECTO";
			break;
		}
		System.out.println("El día de la semana correspondiente es  " + dia);

	}

}
