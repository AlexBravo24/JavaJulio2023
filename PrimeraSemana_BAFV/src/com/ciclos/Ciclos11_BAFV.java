package com.ciclos;

import java.util.Scanner;

public class Ciclos11_BAFV {
	
    public static void main(String[] args) {
    	
    	/*
    	 11.Dibuja un cuadrado, como en la imagen que acompaña, introducir desde teclado el 
			ancho y el alto. Ejemplo: 8 x 8
    	 * */
        Scanner entrada = new Scanner(System.in);

        System.out.print("Ingrese el ancho del cuadrado: ");
        int ancho = entrada.nextInt();

        System.out.print("Ingrese el alto del cuadrado: ");
        int alto = entrada.nextInt();

        for (int i = 0; i < alto; i++) {
            for (int j = 0; j < ancho; j++) {
                System.out.print("* ");
            }
            System.out.println(); // salto de linea
        }
    }
}
