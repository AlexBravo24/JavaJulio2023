package com;

import java.util.Scanner;

public class Ejercicio10_AAPC {

	public static void main(String[] args) {
		// Realiza un programa que pida un número entero 
		//entre uno y doce e imprima el número de días que tiene el mes correspondiente.
		
		
		        Scanner scanner = new Scanner(System.in);

		        // Obtener el número del mes desde el teclado
		        System.out.println("Ingrese un número del 1 al 12: ");
		        int numeroMes = scanner.nextInt();

		        // Verificar el número del mes y mostrar el número de días correspondiente
		        int numeroDias;

		        switch (numeroMes) {
		            case 1:
		                numeroDias = 31;
		                break;
		            case 2:
		                numeroDias = 28; // Consideramos un año no bisiesto
		                break;
		            case 3:
		                numeroDias = 31;
		                break;
		            case 4:
		                numeroDias = 30;
		                break;
		            case 5:
		                numeroDias = 31;
		                break;
		            case 6:
		                numeroDias = 30;
		                break;
		            case 7:
		                numeroDias = 31;
		                break;
		            case 8:
		                numeroDias = 31;
		                break;
		            case 9:
		                numeroDias = 30;
		                break;
		            case 10:
		                numeroDias = 31;
		                break;
		            case 11:
		                numeroDias = 30;
		                break;
		            case 12:
		                numeroDias = 31;
		                break;
		            default:
		                numeroDias = -1; // Indicador de número inválido
		                break;
		        }

		        // Imprimir el resultado
		        if (numeroDias == -1) {
		            System.out.println("ERROR: número incorrecto");
		        } else {
		            System.out.println("Número de días del mes: " + numeroDias);
		        }
		    }
		

		

	}


