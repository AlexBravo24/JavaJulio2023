package com;

import java.util.Scanner;

public class EntradaDeDatos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Introducir datos por teclado
		//Primero declaramos una variable, es este caso de ejemplo
		//una variable de tipo entero en la que vamos a guardar
		//un número que posteriormente quisieramos utilizar
		
		int numero;
		
		//para introducit valores por teclado podemos apoyarnos
		//en la creacion de un objeto de la clase Scanner
		//para "escuchar" esos datos por el teclado
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Introduce un número: ");
		
		// Procedo a asignar el valor que introduzc por el teclado
		//en la variable que declare para gurdar dicho valor
		numero = entrada.nextInt();
		
		System.out.println("La raiz cuadrada de "+ numero +" es");
		//System.out.println(Math.sqrt(numero));
		 System.out.printf("%.2f", Math.sqrt(numero));
		 
		 //para comentar multiples linea de  codigo, seleccionamos
		 //las lineas y presionaos CTRL + 7
		 
		
	}

}
