package com.ciclos;

import java.util.Scanner;

public class Ciclos10_JDRA {

	public static void main(String[] args) {
		
		// 10. Programa que lea 20 números e indique si son positivos o negativos y pares o 
		// impares y además muestre la sumatoria de los positivos y sumatoria de los impares.
		
        Scanner entrada = new Scanner(System.in);
        int numero;
        int pos = 0,impar = 0;

        
        for(int i=0; i<20; i++) {
        	
        	System.out.print("\nIntroduce un número: ");                                  
            numero = entrada.nextInt();


            if (numero > 0) {
                System.out.print("Positivo");
                pos=pos+numero;
                   
            } else {
                System.out.print("Negativo");
            }
            
            
            if(numero % 2 == 0){
                System.out.println(" Par");
                
            }else{
                System.out.println(" Impar");
                impar=impar+numero;
            }
            
        }
        
        System.out.println("\nLa suma de los positivos es: "+ pos);
        System.out.println("\nLa suma de los impares es: "+ impar);
        
        }
	}