package com;

import java.util.Scanner;

public class Ejercicio14_DVC {

	public static void main(String[] args) {
		// ejercicio 14
		
		double hora, paga, total = 0, extra;
		paga = 16;
		Scanner entrada = new Scanner(System.in);
		System.out.println("Horas trabajadas en la semana");
		hora = entrada.nextDouble();
		
		if (hora <= 40) {
			total = paga * hora;
		}else if (hora > 40) {
			double hrnor = 40;
			extra = hora - hrnor;
			total = (hrnor * 16) + (extra * 20);
		}
		System.out.println("Salario semanal es de = "+ total );

	}

}
