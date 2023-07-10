package com.ciclos;

import java.util.Scanner;

public class Ciclos1_JDRA {

	public static void main(String[] args) {
		
		// 1.- Programa un algoritmo que realice la tabla de multiplicar del 12
		
		Scanner entrada = new Scanner(System.in);
		
        int numero = 12;
        int i;
        
        System.out.println("TABLA DE MULTIPLICAR");
        
            for(i = 1; i <= 10; i++)
            {
                System.out.println(numero + " X " + i + " = " + numero*i);
            }
            
            System.out.println();

	}

}
