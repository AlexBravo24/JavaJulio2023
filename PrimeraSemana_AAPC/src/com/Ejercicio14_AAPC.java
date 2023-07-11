package com;

import java.util.Scanner;

public class Ejercicio14_AAPC {

	public static void main(String[] args) {
		// Un obrero necesita calcular su salario semanal, el cual se obtiene de la siguiente manera: Si trabaja 40 horas o menos se le paga $16 por hora. 
		//Si trabaja más de 40 horas se le paga $16 por cada una de las primeras 40 horas y $20 por cada hora extra. 

		
		        Scanner scanner = new Scanner(System.in);

		        // Obtener el número de horas trabajadas desde el teclado
		        System.out.println("Ingrese el número de horas trabajadas: ");
		        int horasTrabajadas = scanner.nextInt();

		        // Calcular el salario semanal
		        double salario;

		        if (horasTrabajadas <= 40) {
		            salario = horasTrabajadas * 16;
		        } else {
		            int horasNormales = 40;
		            int horasExtra = horasTrabajadas - horasNormales;
		            salario = (horasNormales * 16) + (horasExtra * 20);
		        }

		        // Imprimir el salario semanal
		        System.out.println("El salario semanal es: $" + salario);
		    }
		

		
		
		
	}


