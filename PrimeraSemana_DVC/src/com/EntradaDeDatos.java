package com;

import java.util.Scanner;

public class EntradaDeDatos {

	public static void main(String[] args) {

		//Introducir datos por teclado
		
		//Primero declaramos una variable, en este caso de ejemplo
		//una varibale de tipo entero , en la que vamos a guardar 
		//número que posteruormente quisieramos utilizar
		
		int numero;
		
		//Para introducir valor por teclado debemos apoyarnos
		// de un objeto de la calse Scanner
		//para "escuchar" esos datos por el teclado
		
		Scanner entrada = new Scanner (System.in);
		
		//Enviamos un mensaje en cosla para indicar
		//que vamos a hacer con este objeto Scanner
		
		System.out.println("Introduce un número");
		
		//Procedo a asignar el valor que introdusca por teclado
		//en la variabkle que declare para guardar dicho valor
		
		numero = entrada.nextInt();
		
		System.out.println("La raiz cuadrada de " + numero + " es " );
		
		//Con esta linea nos muestra casi todos los deciamales
		//System.out.println (Math.sqrt (numero));
		
		//Dandole un formato más corto a los decimales mostrados en operación
		System.out.printf("%.4f", Math.sqrt(numero));
		
		//Para poder comentar varias lineas con Ctrl +7
		//Para desseleccionar esas lineas Ctrl + 7
		
		
		
	}


	
}
