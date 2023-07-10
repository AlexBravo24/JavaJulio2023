package com;

import java.util.Scanner;

public class Ejercicio14_FACL {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int HT,HE,ST,SCTE;//HT=Horas trabajadas,Horas extra,ST=sueldo total,SSTE=Sueldo C tiempo extra
		

		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Inserte las horas trabajadas");
		
		HT = entrada.nextInt();
		
		if(HT<=40) {
			ST=16*HT;
			System.out.println("Su sueldo final es de: "+ST);
		}
		else {
			HE=HT-40;
			SCTE=HE*20;
			ST=(40*16)+SCTE;
			System.out.println("Su sueldo final es de: "+ST);
			
		}

	}

}
