package com.ciclos;

import java.util.Scanner;

public class Ciclos09_DVC {

	public static void main(String[] args) {
		
		int n1, n2, x, s = 1, r;
		 Scanner entrada = new Scanner(System.in);
		 System.out.println("Introduce un n�mero");
		 n1 = entrada.nextInt();
		 System.out.println("Introduce un segundo n�mero");
		 n2 = entrada.nextInt();
		
		 
		 if (n1 > n2) {
			 x = n1 - n2;
			 while (s < x) {
				 r = n2 + s;
				 if (r % 2 == 0) {
					 System.out.println("los pares son = " + r );
				 }
				 s++;
			 }
			 
		 }else if (n1 < n2) {
			 x = n2 - n1;
			 while (s < x) {
				 r = n1 + s;
				 if (r % 2 == 0) {
					 System.out.println("los pares son = " + r );
				 }
				 s++;
			 }
		 }
		
		
		

	}

}
