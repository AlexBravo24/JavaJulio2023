package com.ciclos;

import java.util.Scanner;

public class Ciclos2_ADMG {

	public static void main(String[] args) {
		
		//Programa un algoritmo que realice la tabla de multiplicar de un numero introducido 
		//desde teclado, hasta la iteración deseada por el usuario. Ejemplo, tabla de 23 hasta el 95. 
		//23 x 95 = ???
		
		Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el número para generar la tabla de multiplicar: ");
        int numero = scanner.nextInt();

        System.out.print("Ingrese el número de iteraciones deseadas: ");
        int iteraciones = scanner.nextInt();

        System.out.println("Tabla de multiplicar del " + numero + ":");

        for (int i = 1; i <= iteraciones; i++) {
            int resultado = numero * i;
            System.out.println(numero + " x " + i + " = " + resultado);

	}

}
}
