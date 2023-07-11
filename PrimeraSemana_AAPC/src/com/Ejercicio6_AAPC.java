package com;

import java.util.Scanner;

public class Ejercicio6_AAPC {

	public static void main(String[] args) {
		// . La asociaci�n de vinicultores tiene como pol�tica fijar un precio inicial al kilo de uva,
		//la cual se clasifica en tipos (A y B), y adem�s en tama�os (1 y 2). Cuando se realiza 
		//la venta del producto, �sta es de un s�lo tipo y tama�o, se requiere determinar 
		//cu�nto recibir� un productor por la uva que entrega en un embarque considerando lo siguiente:
		//* Si es de tipo A, se le cargan 20 c�ntimos al precio inicial cuando es de tama�o
		//1 y 30 c�ntimos si es de tama�o 2. * Si es de tipo B, se rebajan 30 c�ntimos cuando 
		//es de tama�o 1, y 50 c�ntimos cuando es de tama�o 2. Precio inicial se recibe desde teclado 

	
	        Scanner scanner = new Scanner(System.in);

		        // Obtener el precio inicial del kilo de uva desde el teclado
		        System.out.println("Ingrese el precio inicial del kilo de uva: ");
		        double precioInicial = scanner.nextDouble();

		        // Obtener el tipo de uva desde el teclado (A o B)
		        System.out.println("Ingrese el tipo de uva (A/B): ");
		        String tipoUva = scanner.next();

		        // Obtener el tama�o de uva desde el teclado (1 o 2)
		        System.out.println("Ingrese el tama�o de uva (1/2): ");
		        int tama�oUva = scanner.nextInt();

		        // Calcular el monto a recibir por el productor
		        double montoRecibido = precioInicial;

		        if (tipoUva.equalsIgnoreCase("A")) {
		            if (tama�oUva == 1) {
		                montoRecibido += 0.20; // Se cargan 20 c�ntimos
		            } else if (tama�oUva == 2) {
		                montoRecibido += 0.30; // Se cargan 30 c�ntimos
		            }
		        } else if (tipoUva.equalsIgnoreCase("B")) {
		            if (tama�oUva == 1) {
		                montoRecibido -= 0.30; // Se rebajan 30 c�ntimos
		            } else if (tama�oUva == 2) {
		                montoRecibido -= 0.50; // Se rebajan 50 c�ntimos
		            }
		        }

		        // Imprimir el monto a recibir por el productor
		        System.out.println("El monto a recibir por el productor es: " + montoRecibido);
		    }
		
		
		
	}

