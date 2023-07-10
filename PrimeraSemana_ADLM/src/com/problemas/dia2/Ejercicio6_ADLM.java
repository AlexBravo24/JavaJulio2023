package com.problemas.dia2;

import java.util.Scanner;

public class Ejercicio6_ADLM {

	public static void main(String[] args) {
		/* 6. La asociaci�n de vinicultores tiene como pol�tica fijar un precio inicial al kilo de uva, 
		   	la cual se clasifica en tipos (A y B), y adem�s en tama�os (1 y 2). Cuando se realiza la venta 
		   	del producto, �sta es de un s�lo tipo y tama�o, se requiere determinar cu�nto recibir� un 
		   	productor por la uva que entrega en un embarque considerando lo siguiente:
		 	Si es de tipo A, se le cargan 20 c�ntimos al precio inicial cuando es de tama�o 1 y 30 
		 	c�ntimos si es de tama�o 2.
		 	Si es de tipo B, se rebajan 30 c�ntimos cuando es de tama�o 1, y 50 c�ntimos cuando es de 
			tama�o 2.
			Precio inicial se recibe desde teclado
		 */
		
		Scanner entrada = new Scanner(System.in);
		System.out.println("Ingresa el precio inicial de la uva");
		double precio = entrada.nextDouble();
		System.out.println("Ingresa el tipo de uva A o B");
		String tipo = entrada.next().toUpperCase();
		System.out.println("Ingresa el tama�o de la uva 1 o 2");
		int size = entrada.nextInt();
		if(tipo.equals("A") && size == 1) {
			System.out.println("El precio total es: " + (precio + 0.20));
		}else if(tipo.equals("A") && size == 2) {
			System.out.println("El precio total es: " + (precio + 0.30));
		}else if(tipo.equals("B") && size == 1) {
			System.out.println("El precio total es: " + (precio - 0.30));
		}else if(tipo.equals("B") && size == 2) {
			System.out.println("El precio total es: " + (precio - 0.50));
		}
	}

}
