package com;

import java.util.Scanner;

public class Problema14_OIPH {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Introduce el total de horas laboradas: ");
		Double horasTotal = scan.nextDouble();
		Double pago;
		if(horasTotal <= 40) {
			pago = 16*horasTotal;
			System.out.println("El salario total es: $"+pago);
		}else {
			pago = 16*40+(horasTotal-40)*20;
			System.out.println("El salario total es: $"+pago);
		}
	}

}
