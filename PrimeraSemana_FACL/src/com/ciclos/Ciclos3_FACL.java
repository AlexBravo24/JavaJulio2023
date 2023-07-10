package com.ciclos;

import java.util.Scanner;

public class Ciclos3_FACL {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String palabra,p;//p= palabra sin espacios
		boolean palindromo=true;

		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Inserte la palabra");
		
		palabra = entrada.nextLine();
		p=palabra.replace(" ", "");
		int j=0;
		for(int i=(p.length()-1);i>=0;i--) {
			

			if(p.charAt(i)== p.charAt(j)) {
				palindromo=true;

			}
			else {
				palindromo=false;
				break;
			}
			j++;
			
			
		}
		if (palindromo==true) {
			System.out.println("Es palindromo");
		}
		else {
			System.out.println("No es palindromo");
		}


	}

}
