package com;

import java.util.Scanner;

public class Ejercicio14_ADMG {

	public static void main(String[] args) {
		
//		Un obrero necesita calcular su salario semanal, 
//		el cual se obtiene de la siguiente manera: Si trabaja 40 
//		horas o menos se le paga $16 por hora. 
//		Si trabaja más de 40 horas se le paga $16 por cada una de las 
//		primeras 40 horas y $20 por cada hora extra

		Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el número de horas trabajadas en la semana: ");
        int horastrabajadas = scanner.nextInt();

        double salario;

        if (horastrabajadas <= 40) {
            salario = horastrabajadas * 16;
        } else {
            int horasextras = horastrabajadas - 40;
            salario = (40 * 16) + (horasextras * 20);
        }

        System.out.println("El salario semanal es: $" + salario);
		
		
		
		
		
		
	}

}
