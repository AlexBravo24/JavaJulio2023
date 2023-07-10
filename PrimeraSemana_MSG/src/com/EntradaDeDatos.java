package com;

import java.util.Scanner;

public class EntradaDeDatos {

	public static void main(String[] args) { // apertura de main
		
		//Introducir datos por teclado
		// primero se declara una variable de tipo entero y vamos a guardar el numero que quisieramos utilizar
		
		int numero;
		
		// introducir valores por teclado utlizar un objeto de clase scanner para leer esos datos
		
		Scanner entrada = new Scanner(System.in);
		
		// Enviar un mensaje en consola para especificar la accion
		
		System.out.println("Introduce un numero:");
		
		// se asigna un valor dependiendo lo que se introdusca por teclado
		
		numero = entrada.nextInt();
		
		System.out.println("La raiz cuadrada de " + numero + " es ");
		
	//	System.out.println(Math.sqrt(numero));
		
		// PARA DAR UN FORMATO MAS CORTO EN DECIMALES
		
		System.out.printf("%.2f", Math.sqrt(numero)); // 2 decimales
		
		
		//PARA COMENTAR MULTIPLES LINEAS DE CODIGO SELECCIONAMOS LAS LINEAS CON "CTRL + 7" Y PARA DESCOMENTAR MISMA CONVINACION DE TECLAS
		
		
		

	} // cierre de main

} // cierre de la clase
