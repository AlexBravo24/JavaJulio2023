package com.ciclos;

import java.util.Scanner;

public class Ciclos11_JDRA {

	public static void main(String[] args) {
		
		// 11.Dibuja un cuadrado, como en la imagen que acompaña, introducir desde teclado el 
		// ancho y el alto. Ejemplo: 8 x 8
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Ingrese el ancho del cuadrado: ");
		int ancho = entrada.nextInt();
		
		System.out.print("Ingrese el alto del cuadrado: ");
		int alto = entrada.nextInt();
		
		if(ancho == alto){
		
		for (int fila = 1; fila <= ancho; fila++) {
			for (int columna = 1; columna <= alto; columna++)
				System.out.print("*");
			
			System.out.println();
		}
		} else {
			System.out.println("Debes introducir dos lados iguales para formar un cuadrado");
		}

	}

}
