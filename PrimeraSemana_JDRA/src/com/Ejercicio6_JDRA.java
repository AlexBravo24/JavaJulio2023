package com;

import java.util.Scanner;

public class Ejercicio6_JDRA {

	public static void main(String[] args) {
		
		/* 6. La asociaci�n de vinicultores tiene como pol�tica fijar un precio inicial al kilo de uva, la cual se 
		clasifica en tipos (A y B), y adem�s en tama�os (1 y 2). Cuando se realiza la venta del producto, �sta 
		es de un s�lo tipo y tama�o, se requiere determinar cu�nto recibir� un productor por la uva que 
		entrega en un embarque considerando lo siguiente:
		
		* Si es de tipo A, se le cargan 20 c�ntimos al precio inicial cuando es de tama�o 1 y 30 c�ntimos si 
		es de tama�o 2.
		
		* Si es de tipo B, se rebajan 30 c�ntimos cuando es de tama�o 1, y 50 c�ntimos cuando es de 
		tama�o 2.
		Precio inicial se recibe desde teclado
		*/
		
		double precioInic;
		int Tipo;
		int Tama�o;
		double cargo;
		
		Scanner entrada= new Scanner(System.in);
		
		System.out.println("Introduzca el precio del KG de la uva: $ ");
		precioInic = entrada.nextDouble();
		
		System.out.println("Introduzca el tipo de uva ( 1 - Tipo A / 2 - Tipo B ) : ");
		Tipo = entrada.nextInt();
		
		System.out.println("Introduzca el tama�o de uva ( 1 - Tama�o 1 / 2 - Tama�o 2 ) : ");
		Tama�o = entrada.nextInt();
		
		if (Tipo == 1 && Tama�o == 1) {
			cargo = .20;
			double total = precioInic + cargo;
			
			System.out.println("El precio del KG de uva debe ser de $ " + total + " pesos");
			
		} else if (Tipo == 1 && Tama�o == 2) {
			cargo = .30;
			double total = precioInic + cargo;
			
			System.out.println("El precio del KG de uva debe ser de $ " + total + " pesos");
			
			
		} else if (Tipo == 2 && Tama�o == 1) {
			cargo = .30;
			double total = precioInic - cargo;
			
			System.out.println("El precio del KG de uva debe ser de $ " + total + " pesos");
			
		} else if (Tipo == 2 && Tama�o == 2) {
			cargo = .50;
			double total = precioInic - cargo;
			
			System.out.println("El precio del KG de uva debe ser de $ " + total + " pesos");
			
		}
			
	}

}
