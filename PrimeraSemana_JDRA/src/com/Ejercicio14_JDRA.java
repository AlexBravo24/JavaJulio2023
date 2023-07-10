package com;

import java.util.Scanner;

public class Ejercicio14_JDRA {

	public static void main(String[] args) {
		
		/* 14. Un obrero necesita calcular su salario semanal, el cual se obtiene de la siguiente manera: 
		 * Si trabaja 40 horas o menos se le paga $16 por hora. Si trabaja más de 40 horas se le paga $16 
		 *por cada una de las primeras 40 horas y $20 por cada hora extra.	
		*/
		
		double horasT;
		int pagaHora = 16;
		int pagaHoraE = 20;
		
		Scanner entrada= new Scanner(System.in);
		
		System.out.println("Introduzca el numero de horas trabajadas: ");
		horasT = entrada.nextDouble();
		
		
		if (horasT <= 40 ) {
			double sueldo = horasT * pagaHora;
			
			System.out.println("Su salario semanal es de $ " + sueldo + " pesos");
			
		} else if (horasT > 40 ) {
			Double horasEx = horasT - 40;
			
			double sueldo = (40 * pagaHora) + (horasEx * pagaHoraE);
			
			System.out.println("Su salario semanal es de $ " + sueldo + " pesos" + 
			" Con: " + horasEx + " Extras");
			
		}
		

	}

}
