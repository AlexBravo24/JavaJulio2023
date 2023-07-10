package com.ciclos;

import java.util.Scanner;

public class Ciclos08_DVC {

	public static void main(String[] args) {
		
		int n1, n2,x, s = 1, r;
		 Scanner entrada = new Scanner(System.in);
		 System.out.println("Introduce un número");
		 n1 = entrada.nextInt();
		 System.out.println("Introduce un segundo número");
		 n2 = entrada.nextInt();
		 
		 if (n1 > n2 ) {
			 x = n1 - n2;
			 while (s < x) {
				 r = n2 + s;
				 System.out.println(r);
				 s++;
				 
			 }
		 }else if (n1 <  n2) {
			 x = n2 - n1;
			 while (s < x) {
				 r = n1 +s;
				 System.out.println(r);
				 s++;
			 }
		 }
		 
		 

	}

}
