package com.ciclos;



import java.util.Scanner;

public class Ciclo8_BAFV {
    public static void main(String[] args) {
    	
    	/*
    	8. Programa Java que lea dos números y muestre los números desde el menor hasta el 
			mayor
    	 * */
        Scanner entrada = new Scanner(System.in);

        System.out.print("Ingrese numero 1: ");
        int numero1 = entrada.nextInt();

        System.out.print("Ingrese numero 2 : ");
        int numero2 = entrada.nextInt();

        /*
         Luego, utilizamos los métodos Math.min() y Math.max() 
         para determinar cuál de los dos números es el menor y cuál es el mayor.
          */
        int menor = Math.min(numero1, numero2);
        int mayor = Math.max(numero1, numero2);
        
        System.out.println("Los números desde el menor hasta el mayor son:");
        for (int i = menor; i <= mayor; i++) {
            System.out.println(i);
        }
    }
}

