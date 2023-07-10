package com;

import java.util.Scanner;

public class Ejercicio14 {

	public static void main(String[] args) {

		double hora;
		double extra;
		double total;
		double total2;
		
		Scanner entrada1 = new Scanner(System.in);
			System.out.println("Horas trabajadas: ");
			hora = entrada1.nextDouble();
		
//		Scanner entrada2 = new Scanner(System.in);
//			System.out.println("Horas Extras Trabajadas: ");
//			extra = entrada2.nextDouble();
			
		if (hora <= 40 && hora > 0) {
			total = hora * 16;
			
			System.out.println("Su salario es de: " + total);
			
		} else if ( hora > 40) {
			total2 = (hora - 40);
			
			total = (40 * 16) + (total2 * 20);
			
			System.out.println("Su salario es de: " + total);
			
		} else {
			System.out.println("Favor de introducir un valor mayor a 0");
		}

	}

}
