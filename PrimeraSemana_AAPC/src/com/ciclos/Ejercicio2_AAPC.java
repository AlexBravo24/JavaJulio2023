package com.ciclos;

import java.util.Scanner;

public class Ejercicio2_AAPC {

	public static void main(String[] args) {
		// Programa un algoritmo que realice la tabla de multiplicar de un 
		//numero introducido desde teclado, hasta la iteración deseada por el usuario.
		//Ejemplo, tabla de 23 hasta el 95. 23 x 95 = ??? 
		 
		Scanner num=new Scanner(System.in);
		
		
		
		System.out.println("Tabla de multiplicar");
		System.out.println("Ingresa numero a multiplicar");
		int numero=num.nextInt();
		
		System.out.println("Ingresa hasta que numero deseas multiplicar");
		int numero2=num.nextInt();
		
		System.out.println("Tabla de multiplicar de "+ numero +"x"+ numero2+ " :");
		
		for (int i = 1; i < numero2; i++) {
			int resultado = numero * i;
			System.out.println(numero+"x"+i+"="+ resultado);
			
			
		}
		
	}

}
