package com;

import java.util.Scanner;

public class Ejercicio04 {

	public static void main(String[] args) {
		
		char letra;
		
		Scanner entrada1 = new Scanner(System.in);
			System.out.println("Ingrese un caracter: ");
			letra = entrada1.nextLine().charAt(0);
		
			if(Character.isUpperCase(letra)){         
		          System.out.println("Mayuscula");             
		}else{                  
		          System.out.println("Minuscula");   
		}
	}

}
