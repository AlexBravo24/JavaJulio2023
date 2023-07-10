package com.ciclos;

import java.util.Scanner;

public class Ciclos2_JDRA {

	public static void main(String[] args) {
		
		/* 2.- Programa un algoritmo que realice la tabla de multiplicar de un numero introducido 
		desde teclado, hasta la iteración deseada por el usuario. Ejemplo, tabla de 23 hasta el 95. 
		23 x 95 = ???
		*/
		
        Scanner entrada = new Scanner(System.in);
        int n,p;
        
        System.out.print("Introduce el numero de tabla de multiplicar que desee: ");                                                         
        n = entrada.nextInt();
        
        System.out.print("Introduce el numero de iteracion a parar: ");                                                         
        p = entrada.nextInt();
        
        
        
        System.out.println("Tabla del " + n + " Hasta iteracion: "+p );
        
        for(int i = 1; i<=p; i++){
             System.out.println(n + " * " + i + " = " + n*i);                                                     
        }
	
	}

}
