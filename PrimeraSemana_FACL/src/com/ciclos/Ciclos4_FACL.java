package com.ciclos;

import java.util.Scanner;

public class Ciclos4_FACL {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String frase,letra;//
		int j=0;

		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Inserte la frase");
		
		frase = entrada.nextLine();
		System.out.println("Inserte la letra");
		
		letra = entrada.nextLine();
		
		for(int i=0;i<frase.length();i++) {
			if(letra.charAt(0)==frase.charAt(i)) {
				j++;
			}

		}
		if(j>0) {
			System.out.println("Se encuentra "+j+" veces");
		}
		else {
			System.out.println("No se encuentra esa letra en la frase");
		}

	}

}
