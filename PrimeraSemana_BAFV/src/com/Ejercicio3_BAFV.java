package com;

import java.util.Scanner;

public class Ejercicio3_BAFV {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*3.- .Crea un programa que pida al usuario dos números y muestre el resultado de su división. Si el 
		segundo número es 0, debe mostrar un mensaje de error.
		 	*/
		
		Scanner entrada = new Scanner(System.in);
		
		double numero1, numero2, resultado;
		
		System.out.println("Ingrese número 1: ");
		numero1 = entrada.nextDouble();
		System.out.println("Ingrese número 2: ");
		numero2 = entrada.nextDouble();
		
		if(numero2 == 0) {
			System.out.println("error");
		}else {
			resultado = numero1 / numero2;
			
			System.out.println("resultado: "+resultado);
		}
		

	}

}
