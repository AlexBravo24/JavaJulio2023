package com.problemas.dia2;

import java.util.Scanner;

public class Ejercicio3_ADLM {

	public static void main(String[] args) {
		/* 3.Crea un programa que pida al usuario dos números y muestre el resultado de su 
		 * división. Si el segundo número es 0, debe mostrar un mensaje de error*/
		Scanner entrada = new Scanner(System.in);
		System.out.println("Ingresa el primer número");
		double numero1 = entrada.nextDouble();
		System.out.println("Ingresa el segundo número");
		double numero2 = entrada.nextDouble();
		
		if(numero2 == 0) {
			System.out.println("No se pudo realizar la operación");
		}else {
			System.out.println("El resultado de la operación es: " + numero1 / numero2);
		}
	}

}
