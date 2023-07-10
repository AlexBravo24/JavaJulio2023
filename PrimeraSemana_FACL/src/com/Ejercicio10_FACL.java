package com;

import java.util.Scanner;

public class Ejercicio10_FACL {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int M;
		String Dias;
		
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Inserte el numero del mes");
		
		M = entrada.nextInt();
		
		switch (M) {
		case 1:
			Dias="Es enero y tiene 31 dias";
			System.out.println(Dias);
			break;
		case 2:
			Dias="Es febrero y tiene 28 dias";
			System.out.println(Dias);
			break;	
		case 3:
			Dias="Es marzo y tiene 31 dias";
			System.out.println(Dias);
			break;
		case 4:
			Dias="Es abril y tiene 30 dias";
			System.out.println(Dias);
			break;	
		case 5:
			Dias="Es mayo y tiene 31 dias";
			System.out.println(Dias);
			break;
		case 6:
			Dias="Es junio y tiene 30 dias";
			System.out.println(Dias);
			break;	
		case 7:
			Dias="Es julio y tiene 31 dias";
			System.out.println(Dias);
			break;
		case 8:
			Dias="Es agosto y tiene 30 dias";
			System.out.println(Dias);
			break;
		case 9:
			Dias="Es septiembre y tiene 30 dias";
			System.out.println(Dias);
			break;
		case 10:
			Dias="Es octubre y tiene 31 dias";
			System.out.println(Dias);
			break;	
		case 11:
			Dias="Es noviembre y tiene 30 dias";
			System.out.println(Dias);
			break;
		case 12:
			Dias="Es diciembre y tiene 31 dias";
			System.out.println(Dias);
			break;
		
		}
	}

}
