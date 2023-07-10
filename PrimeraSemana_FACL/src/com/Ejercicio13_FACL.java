package com;

import java.util.Scanner;

public class Ejercicio13_FACL {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int donativo;
		double PCS,PCC,PPB;//PCS=Porcentaje para salud, PCC=Porcentaje para comedor, PPB=Porcentaje para la bolsa.
		

		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Inserte la cantidad donada");
		
		donativo = entrada.nextInt();
		
		if(donativo>=10000) {
			PCS=donativo*.3;
			PCC=donativo*.5;
			PPB=donativo*.2;
			System.out.println("Se reparte de la siguiente forma: "+"\n para el centro de salud: "+PCS+
					"\n Para el comedor de niños: "+PCC+"\n Para inversion en la bolsa: "+PPB);
		}
		else {
			PCS=donativo*.25;
			PCC=donativo*.6;
			PPB=donativo*.15;
			System.out.println("Se reparte de la siguiente forma: "+"\n para el centro de salud: "+PCS+
					"\n Para el comedor de niños: "+PCC+"\n Para inversion en la bolsa: "+PPB);
		}

	}

}
