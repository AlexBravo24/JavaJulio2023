package com.ciclos;

import java.util.Scanner;

public class Ciclos10_DVC {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		int sp =0, si = 0, x, num;
		
		for (x = 1; x <= 20; x++) {
			System.out.println(" Ingresa el n�mero " + x + ":");
			num = entrada.nextInt();
			if (num > 0) {
				System.out.println("El n�mero " + num + " es positivo");
				sp += num;	
			}else if  (num < 0) {
				System.out.println("El n�mero " + num + " es negativo");
			}else {
				System.out.println("El n�mero " + num + " es cero");
			}
			
			if (num % 2  == 0) {
				System.out.println("El n�mero " + num + " es par");
			}else {
				System.out.println("El n�mero " + num + " es impar");
				si += num;
			}
			
				
		}
		
		System.out.println("La sumatoria de n�meros positivos es " + sp);
		System.out.println("La sumatoria de n�meros impares es " + si);
		
		
		
		
		

	}

}
