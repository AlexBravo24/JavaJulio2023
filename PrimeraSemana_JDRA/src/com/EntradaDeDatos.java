package com;

import java.util.Scanner;

public class EntradaDeDatos {

	public static void main(String[] args) {
		
		//Introducir datos por teclado
		
		// primero declaramos una variable, en este caso de ejemplo una variable de tipo entero
		// en la que vamos a guardar u numero que post quisieramos utilizar
		
		int numero;
		
		// para introducir valores por teclado podemos apoyarnos en la creacion de un objeto
		//de la clase Scanner para "escuchar" esos datos por el teclado
		
		
		Scanner entrada= new Scanner(System.in);
		
		//enviamos un mensaje en consola para indicar que vamos a hacer con Scanner
		
		System.out.println("Introduce un numero");
		
		//procedo a asignar el valor que introduzca por teclado en la variable que declare para guardar
		//dicho valor
		
		numero = entrada.nextInt(); //String = .nextLine();
		
		System.out.println("La raiz cuadrada de " + numero + " es :");
		
		//System.out.println(Math.sqrt(numero));
		
		
		//dandole un formato mas corto a los decimales mostrados en la operacion
		System.out.printf("%.2f", Math.sqrt(numero));
		
		
	}

}
