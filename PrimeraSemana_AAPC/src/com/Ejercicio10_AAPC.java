package com;

import java.util.Scanner;

public class Ejercicio10_AAPC {

	public static void main(String[] args) {
		// Realiza un programa que pida un n�mero entero 
		//entre uno y doce e imprima el n�mero de d�as que tiene el mes correspondiente.
		
		
		        Scanner scanner = new Scanner(System.in);

		        // Obtener el n�mero del mes desde el teclado
		        System.out.println("Ingrese un n�mero del 1 al 12: ");
		        int numeroMes = scanner.nextInt();

		        // Verificar el n�mero del mes y mostrar el n�mero de d�as correspondiente
		        int numeroDias;

		        switch (numeroMes) {
		            case 1:
		                numeroDias = 31;
		                break;
		            case 2:
		                numeroDias = 28; // Consideramos un a�o no bisiesto
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
		                numeroDias = -1; // Indicador de n�mero inv�lido
		                break;
		        }

		        // Imprimir el resultado
		        if (numeroDias == -1) {
		            System.out.println("ERROR: n�mero incorrecto");
		        } else {
		            System.out.println("N�mero de d�as del mes: " + numeroDias);
		        }
		    }
		

		

	}


