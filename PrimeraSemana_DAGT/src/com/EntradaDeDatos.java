package com;

import java.util.Scanner;

public class EntradaDeDatos {

	public static void main(String[] args) {
		/*Introducir datos por teclado
		 * Primero declarar una variable, en este caso una variable de tipo entero en la que se va a guardar un numero
		 * para despues utilizarlo
		 */

		int numero;
		
		/*Para introducir valores por teclado podemos apoyarnos
		 * en la creacion de un objeto de la clase Scanner
		 * para "escuchar" esos datos por el teclado
		 */
		
		Scanner entrada = new Scanner(System.in);
		
		//Envia una instruccion en pantalla que pida un numero
		System.out.println("Introduce un numero:");
		
		/*Procedo a asignar el valor que introduzca por teclado 
		 * en la variable que seleccione 
		 */
		numero = entrada.nextInt();
		
		System.out.println("La raiz cuadrada de : " + numero + " es ");
		System.out.println(Math.sqrt(numero));

		
	}

}
