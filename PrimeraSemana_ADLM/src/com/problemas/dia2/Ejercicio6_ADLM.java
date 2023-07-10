package com.problemas.dia2;

import java.util.Scanner;

public class Ejercicio6_ADLM {

	public static void main(String[] args) {
		/* 6. La asociación de vinicultores tiene como política fijar un precio inicial al kilo de uva, 
		   	la cual se clasifica en tipos (A y B), y además en tamaños (1 y 2). Cuando se realiza la venta 
		   	del producto, ésta es de un sólo tipo y tamaño, se requiere determinar cuánto recibirá un 
		   	productor por la uva que entrega en un embarque considerando lo siguiente:
		 	Si es de tipo A, se le cargan 20 céntimos al precio inicial cuando es de tamaño 1 y 30 
		 	céntimos si es de tamaño 2.
		 	Si es de tipo B, se rebajan 30 céntimos cuando es de tamaño 1, y 50 céntimos cuando es de 
			tamaño 2.
			Precio inicial se recibe desde teclado
		 */
		
		Scanner entrada = new Scanner(System.in);
		System.out.println("Ingresa el precio inicial de la uva");
		double precio = entrada.nextDouble();
		System.out.println("Ingresa el tipo de uva A o B");
		String tipo = entrada.next().toUpperCase();
		System.out.println("Ingresa el tamaño de la uva 1 o 2");
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
