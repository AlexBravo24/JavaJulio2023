package com.ciclos;

import java.util.Scanner;

public class Ciclos9_JDRA {

	public static void main(String[] args) {
		
		// 9. Programa Java que lea dos números y muestre los números pares entre ellos 
		
		Scanner entrada = new Scanner(System.in);

		int num1 , num2 ;
		
		System.out.println("ingresa el primer numero: ");
		num1 = entrada.nextInt();

		System.out.println("Ingresa el segundo numero: ");
		num2 = entrada.nextInt();

		if ( num1 > num2 ){
			
		do{
			
		if( num2 %2 == 0){
		System.out.print(num2+" - ");
		}
		
		num2 += 1;
		
		}while(num2 <= num1);
		
		}
		else if(num2 > num1){
			
			System.out.print("NUMEROS PAR: ");
			
		for( ; num1 <= num2 ; num1 += 1){
			
		if(num1 %2 == 0){
		System.out.print(num1+" - ");
		}
		}
		}
		else{
		System.out.println("Los numeros son iguales");
		}
		
	}

}
