package com;

import java.util.Scanner;

public class Ejercicio13_DVC {

	public static void main(String[] args) {
		// Ejercicio 13
		
		double dona,salu = 0,come = 0,bolsa = 0, suma;
		
		Scanner entrada = new Scanner(System.in);
		System.out.println("Monto de la donación anual");
		dona = entrada.nextDouble();
		
		if (dona >= 10000) {
			
			salu = dona * .3;
			come = dona * .5;
			suma = salu + come;
			bolsa = dona - suma;
			
		}else if (dona < 10000) {
			salu = dona * .25;
			come = dona * .60;
			suma = salu + come;
			bolsa = dona - suma;
			
		}
	
		
		System.out.println("Dinero destinado a Centro de Salud = " + salu);
		System.out.println("Dinero destinado al Comedor de niños = " + come);
		System.out.println("Dinero destinado a Inversion en la Bolsa = " + bolsa);
		

	}

}
