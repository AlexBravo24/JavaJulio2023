package com.problemas.dia2;

import java.util.Scanner;

public class Ejercicio14_ADLM {

	public static void main(String[] args) {
		/* 14. Un obrero necesita calcular su salario semanal, el cual se obtiene de la siguiente 
		 manera: Si trabaja 40 horas o menos se le paga $16 por hora. Si trabaja más de 40 horas se le 
		 paga $16 por cada una de las primeras 40 horas y $20 por cada hora extra*/
		Scanner entrada = new Scanner(System.in);
		System.out.println("Ingresa las horas trabajadas");
		int horas = entrada.nextInt();
		if(horas > 40) {
			int horasExtras = horas - 40, horasnormal = horas - horasExtras;
			double total = (horasnormal * 16) + (horasExtras * 20);
			System.out.println("Tu pago total con horas extras es: " + total);
		}else {
			System.out.println("Tu pago total es: " + horas * 16);
		}
	}

}
