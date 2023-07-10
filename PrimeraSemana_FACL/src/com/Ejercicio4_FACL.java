package com;

import java.util.Scanner;

public class Ejercicio4_FACL {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char a;
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Inserte el caracter");
		
		a = entrada.next().charAt(0);
		
		
		if(Character.isUpperCase(a)) {
			System.out.println("Es mayuscula");
		}
		else {
			System.out.println("Es minuscula");
		}
		
	}

}
