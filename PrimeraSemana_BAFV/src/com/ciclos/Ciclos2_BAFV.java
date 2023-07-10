package com.ciclos;

import java.util.Scanner;

public class Ciclos2_BAFV {
    public static void main(String[] args) {
    	
    	/*
    	 
    	 2.- Programa un algoritmo que realice la tabla de multiplicar de un numero introducido 
		desde teclado, hasta la iteración deseada por el usuario. Ejemplo, tabla de 23 hasta el 95. 
			23 x 95 = ??
    	  */
        Scanner entrada = new Scanner(System.in);

        System.out.print("Ingrese un número: ");
        int numero = entrada.nextInt();

        System.out.print("Ingrese el límite de la tabla: ");
        int limite = entrada.nextInt();
        
        
        System.out.println("Tabla de multiplicar del " + numero + " hasta " + limite + ":");

        for (int i = 1; i <= limite; i++) {
            int resultado = numero * i;
            System.out.println(numero + " x " + i + " = " + resultado);
        }
    }
}
