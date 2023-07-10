package com;

import java.util.Scanner;

public class EntradaDeDatos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Introducir datos por teclador
		
		int numero;
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Inserte el numero que desea guardar");
		
		numero = entrada.nextInt();
		
		System.out.println("La raiz cuadrada de: "+numero+" es :");
		
		//Para recortar decimales en operaciones
		
		System.out.printf("%.2f", Math.sqrt(numero));
		
		
		//PAra comentar varias líeas de código se seleccionan y
		//Se ponen CTRL + 7;
		

	}

}
