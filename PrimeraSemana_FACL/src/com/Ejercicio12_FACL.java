package com;

import java.util.Scanner;

public class Ejercicio12_FACL {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double peso, altura, IMC;
		

		
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Inserte su peso en Kg");
		
		peso = entrada.nextDouble();
		
		System.out.println("Inserte su altura en metros");
		
		altura = entrada.nextDouble();
		
		IMC=peso/(altura*altura);
		
		if(IMC<16) {
			System.out.println("Usted debe ir al hospital por su bajo peso");
		}
		else if(IMC<17 && IMC>16) {
			System.out.println("Usted tiene Infrapeso");
		}
		else if(IMC<18 && IMC>17) {
			System.out.println("Usted tiene bajo peso");
		}
		else if(IMC<25 && IMC>18) {
			System.out.println("Usted está saludable");
		}
		else if(IMC<30 && IMC>25) {
			System.out.println("Usted tiene sobre peso, obesidad grado 1");
		}
		else if(IMC<35 && IMC>30) {
			System.out.println("Usted tiene obesidad grado 2");
		}
		else if (IMC<40 && IMC>35) {
			System.out.println("Usted tiene obesidad grado 3");
		}
		else {
			System.out.println("Usted tiene obesidad grado 4");
		}

	}

}
