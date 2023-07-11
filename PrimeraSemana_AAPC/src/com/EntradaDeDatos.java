package com;

import java.util.Scanner;

public class EntradaDeDatos {

	public static void main(String[] args) {
		
		
	//Introducir datos por teclado
		
		//Primero declaramos una varibale, en este caso de ejemplo
		//una variable de tipo entero en la que vamos a guardar 
		//un número que posteriormente quisieramos utilizar.
		
		int numero;	
		//para introducir valors pore teclado podemos apoyarnos  en la 
		//creacion de un objeto de clase scanner 
		//para escuchar esos datos por el teclado 
		
		Scanner entrada = new Scanner(System.in);
		//Enviamos un mensaje en consola para indicar
		//que vamos a ahcer con este objeto Scanner
		System.out.println("Introduce un número");
		
		//Procedo a asignar el valor que introduzca por teclado 
		//en la variable que declare para guardar dicho valor
		
		numero= entrada.nextInt();
		System.out.println("La raiz cuadrada de "+ numero + " es ");
		//System.out.println(Math.sqrt(numero));
		//dandole un formato mas corto a los decimales mostrados en operacion
		System.out.printf("%.2f",Math.sqrt(numero));
		// se comentam multiples lineas con ctrl + 7 para que no se ocupe el codigo
		
		
		
				

	}

}
