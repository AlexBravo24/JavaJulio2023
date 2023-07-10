package com;

import java.util.Scanner;

public class Entradadedatos {

	public static void main(String[] args) {
		
		//Introducir datos por teclado
		
		//Primero declaramos una variable, en este caso de ejemplo
		//Una variable de tipo entero en la que vamos a guardar un numero
		// que posteriormente quisieramos utilizar
		
		int numero; 
		
		//Para introducir valores por teclado, debemos apoyarnos en la creacion
		// de un objeto de clase Scanner para "escuchar"esos datos por el teclado
		
		Scanner entrada = new Scanner(System.in);
		
		//Enviamos un mensaje en consola para indicar que vamos a hacer 
		// con este objeto Scanner 
		System.out.println("Introduce un numero");
		
		//Procedo a asignar el valor que introduzca por teclado la variable que
		// declare para guardar dicho valor  
		numero = entrada.nextInt();
		
		System.out.println("La raiz cuadrada de " + numero + " es" );
		
		//System.out.println(Math.sqrt(numero));
		
		//Dandole un formato mas corto a los decimales mostrados en operacion
		System.out.printf("%.2f",Math.sqrt(numero));
		
		
		//Para comentar multiples lineas de codigo, seleccionamos las lineas y 
		//presionamos Ctrl + 7 
		//para quitar las // igual Ctrrl + 7
		
		
		
		
		
			

	}

}
