package com.ciclos;

import java.util.Scanner;

public class Ciclos2_FACL {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a,b,mult,i=1;

		
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Inserte el numero que desea multiplicar");
		
		a = entrada.nextInt();
		
		System.out.print("\n Inserte las veces que desea multiplicarlo");
		
		b = entrada.nextInt();
		
		while(i<=b) {
			mult=i*a;
			
			System.out.println("El resultado de la multiplicacion en el lugar "+i+" es: "+mult);
			i++;
			
		}

	}

}
