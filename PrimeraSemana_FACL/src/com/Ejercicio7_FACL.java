package com;

import java.util.Scanner;

public class Ejercicio7_FACL {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int NA,CPA,CA;//NA=numero de alumnos, CPA=COsto Por Alumno, CA=Costo de Autobus
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Inserte el numero a");
		
		NA = entrada.nextInt();
		
			if(NA>=100) {
				CPA=65;
				CA=CPA*NA;
				System.out.println("El costo por el autobus será de: "+CA);
			}
			else if(NA>=50 && NA<100) {
				CPA=70;
				CA=CPA*NA;
				System.out.println("El costo por el autobus será de: "+CA);
			}
			else if(NA>=30 && NA<50) {
				CPA=95;
				CA=CPA*NA;
				System.out.println("El costo por el autobus será de: "+CA);
			}
			else {
				
					CPA=70;
					CA=CPA*NA;
					System.out.println("El costo por el autobus será de: "+CA);
				
			}
		
		

	}

}
