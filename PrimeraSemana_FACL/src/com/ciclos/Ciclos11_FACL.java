package com.ciclos;

import java.util.Scanner;

public class Ciclos11_FACL {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int h,a;

		
		Scanner entrada = new Scanner(System.in);
		

		
		System.out.println("Inserte el ancho");
		a = entrada.nextInt();
		System.out.println("Inserte la altura");
		h = entrada.nextInt();
		
		for (int i=1;i<=h;i++) {
			
			for(int j=1;j<a;j++) {
				System.out.print("*");
			}
			System.out.println("*");
		}
		
		

	}

}
