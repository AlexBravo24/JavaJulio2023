package com;

import java.util.Scanner;

public class Ejercicio6_JDRA {

	public static void main(String[] args) {
		
		/* 6. La asociación de vinicultores tiene como política fijar un precio inicial al kilo de uva, la cual se 
		clasifica en tipos (A y B), y además en tamaños (1 y 2). Cuando se realiza la venta del producto, ésta 
		es de un sólo tipo y tamaño, se requiere determinar cuánto recibirá un productor por la uva que 
		entrega en un embarque considerando lo siguiente:
		
		* Si es de tipo A, se le cargan 20 céntimos al precio inicial cuando es de tamaño 1 y 30 céntimos si 
		es de tamaño 2.
		
		* Si es de tipo B, se rebajan 30 céntimos cuando es de tamaño 1, y 50 céntimos cuando es de 
		tamaño 2.
		Precio inicial se recibe desde teclado
		*/
		
		double precioInic;
		int Tipo;
		int Tamaño;
		double cargo;
		
		Scanner entrada= new Scanner(System.in);
		
		System.out.println("Introduzca el precio del KG de la uva: $ ");
		precioInic = entrada.nextDouble();
		
		System.out.println("Introduzca el tipo de uva ( 1 - Tipo A / 2 - Tipo B ) : ");
		Tipo = entrada.nextInt();
		
		System.out.println("Introduzca el tamaño de uva ( 1 - Tamaño 1 / 2 - Tamaño 2 ) : ");
		Tamaño = entrada.nextInt();
		
		if (Tipo == 1 && Tamaño == 1) {
			cargo = .20;
			double total = precioInic + cargo;
			
			System.out.println("El precio del KG de uva debe ser de $ " + total + " pesos");
			
		} else if (Tipo == 1 && Tamaño == 2) {
			cargo = .30;
			double total = precioInic + cargo;
			
			System.out.println("El precio del KG de uva debe ser de $ " + total + " pesos");
			
			
		} else if (Tipo == 2 && Tamaño == 1) {
			cargo = .30;
			double total = precioInic - cargo;
			
			System.out.println("El precio del KG de uva debe ser de $ " + total + " pesos");
			
		} else if (Tipo == 2 && Tamaño == 2) {
			cargo = .50;
			double total = precioInic - cargo;
			
			System.out.println("El precio del KG de uva debe ser de $ " + total + " pesos");
			
		}
			
	}

}
