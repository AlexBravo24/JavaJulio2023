package com.problemas.dia2;

import java.util.Scanner;

public class Ejercicio3_ADLM {

	public static void main(String[] args) {
		/* 3.Crea un programa que pida al usuario dos n�meros y muestre el resultado de su 
		 * divisi�n. Si el segundo n�mero es 0, debe mostrar un mensaje de error*/
		Scanner entrada = new Scanner(System.in);
		System.out.println("Ingresa el primer n�mero");
		double numero1 = entrada.nextDouble();
		System.out.println("Ingresa el segundo n�mero");
		double numero2 = entrada.nextDouble();
		
		if(numero2 == 0) {
			System.out.println("No se pudo realizar la operaci�n");
		}else {
			System.out.println("El resultado de la operaci�n es: " + numero1 / numero2);
		}
	}

}
