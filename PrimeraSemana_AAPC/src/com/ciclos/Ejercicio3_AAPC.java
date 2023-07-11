package com.ciclos;

import java.util.Scanner;

public class Ejercicio3_AAPC {

	public static void main(String[] args) {
		//  Realiza un programa para determinar si un String es palíndromo. 
		
		
		Scanner pali = new Scanner (System.in);
		System.out.println("Ingresa una palabra o frase para determinar si es un palíndromo");
		String palin = pali.nextLine();
		if(Palindromo(palin)){
			System.out.println("La palabra o frase es palindromo");
		}else {
			System.out.println("La palabra o frase no es palindromo");
		}
			
			}

	private static boolean Palindromo(String palin) {
		// TODO Auto-generated method stub
		palin=palin.replaceAll("\\s+","").toLowerCase();
		int longitud= palin.length();
		for (int i = 0; i < longitud/2; i++) {
			if (palin.charAt(i) != palin.charAt(longitud - 1 - i)) {
			
		
		
		return false;
		}
	}
	return true;
}

}

	


