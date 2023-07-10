package com.ciclos;

import java.util.Scanner;

public class Ciclos9_FACL {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a, b;

		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Inserte el numero a");
		
		a = entrada.nextInt();
		System.out.println("Inserte el numero b");
		
		b = entrada.nextInt();
		
		if(a>b) {
			System.out.println("iremos del numero b al numero a");
			for(int i=b;i<=a;i++) {
				if(i%2==0) {
					System.out.println(i);
				}
			}
		}
		else {
			System.out.println("Iremos del numero a al numero b");
			
			for(int i=a;i<=b;i++) {
				if(i%2==0) {
				System.out.println(i);
				}
			}
		}

	}

}
