package com;

import java.util.Scanner;

public class EntradaDeDatos {

	public static void main(String[] args) {
		
		
		//Introducir datos por teclado
		
		//Primero declaramos una variable, en este caso de ejemplo
		//una variable de tipo entero en la que vamos a guardar
		//un número que posteriormente quisieramos utilizar
		
		int numero;
		
		//Para introducir valores por teclado podemos apoyarnos
		//en la creación de un objeto de la clase Scanner
		//para "escuchar" esos datos por el teclado
		
		Scanner entrada = new Scanner(System.in);
		
		//Enviamos un mensaje en consola para indicar
		//que vamos a hacer con este objeto Scanner
		System.out.println("Introduce un número");
	
		//Procedo a asignar el valor que introduzca por teclado
		//en la variable que declare para guardar dicho valor
		numero = entrada.nextInt();
		
		System.out.println("La raíz cuadrada de " + numero + " es ");
		
	//	System.out.println(Math.sqrt(numero));
		
		//Dandole un formato más corto a los decimales mostrados en operacion
		System.out.printf("%.4f",Math.sqrt(numero));
		
		//Para comentar multiples lineas de codigo, seleccionamos
		//las lineas y presionamos CTRL + 7

	}

}
