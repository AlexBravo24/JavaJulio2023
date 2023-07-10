
package com;

import java.util.Scanner;

public class Ejercicio10_DVC {

	public static void main(String[] args) {
		// ejercicio 10
		
		int numero, dia;
		String mes = null;
		
		Scanner entrada = new Scanner (System.in);
		System.out.println("Introduce el un numero entre  (1 - 12)");
		numero = entrada.nextInt();
		
		switch (numero) {
		case 1:
			mes = "Enero";
			dia = 31;
			break;
		case 2:
			mes = "Febrero";
			dia = 28;
			break;
		case 3:
			mes = "Marzo";
			dia = 31;
			break;
		case 4:
			mes = "Abril";
			dia = 30;
			break;
		case 5:
			mes = "Mayo";
			dia = 31;
			break;
		case 6:
			mes = "Junio";
			dia = 30;
			break;
		case 7:
			mes = "Julio";
			dia = 31;
			break;
		case 8:
			mes = "Agosto";
			dia = 31;
			break;
		case 9:
			mes = "Septiembre";
			dia = 30;
			break;
		case 10:
			mes = "Ocubre";
			dia = 31;
			break;
		case 11:
			mes = "Noviembre";
			dia = 30;
			break;
		case 12:
			mes = "Diciembre";
			dia = 31;
			break;
		default:
			mes = "NÜMERO INCORRECTO";
			dia = 0;
			break;
		}
		System.out.println("El mes de  " + mes + " tiene " + dia + " días");

	}

}
