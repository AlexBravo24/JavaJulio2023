package com;

import java.util.Scanner;

public class Ejercicio5_FACL {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int edad,nota;
		char sexo;
		
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Inserte el sexo");
		
		sexo = entrada.next().charAt(0);
		
		System.out.println("Inserte la edad");
		
		edad = entrada.nextInt();
		
		System.out.println("Inserte la nota");
		
		nota = entrada.nextInt();
		
		if(nota>=5 && edad >=18 && sexo=='m') {
			System.out.println("Posible");
		}
		else if(nota>=5 && edad >=18 && sexo=='f') {
			System.out.println("Aceptada");
		}
		else {
			System.out.println("No aceptada");
		}
			

	}

}
