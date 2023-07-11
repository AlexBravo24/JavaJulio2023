package com;

import java.util.Scanner;

public class Ejercicio6_AAPC {

	public static void main(String[] args) {
		// . La asociación de vinicultores tiene como política fijar un precio inicial al kilo de uva,
		//la cual se clasifica en tipos (A y B), y además en tamaños (1 y 2). Cuando se realiza 
		//la venta del producto, ésta es de un sólo tipo y tamaño, se requiere determinar 
		//cuánto recibirá un productor por la uva que entrega en un embarque considerando lo siguiente:
		//* Si es de tipo A, se le cargan 20 céntimos al precio inicial cuando es de tamaño
		//1 y 30 céntimos si es de tamaño 2. * Si es de tipo B, se rebajan 30 céntimos cuando 
		//es de tamaño 1, y 50 céntimos cuando es de tamaño 2. Precio inicial se recibe desde teclado 

	
	        Scanner scanner = new Scanner(System.in);

		        // Obtener el precio inicial del kilo de uva desde el teclado
		        System.out.println("Ingrese el precio inicial del kilo de uva: ");
		        double precioInicial = scanner.nextDouble();

		        // Obtener el tipo de uva desde el teclado (A o B)
		        System.out.println("Ingrese el tipo de uva (A/B): ");
		        String tipoUva = scanner.next();

		        // Obtener el tamaño de uva desde el teclado (1 o 2)
		        System.out.println("Ingrese el tamaño de uva (1/2): ");
		        int tamañoUva = scanner.nextInt();

		        // Calcular el monto a recibir por el productor
		        double montoRecibido = precioInicial;

		        if (tipoUva.equalsIgnoreCase("A")) {
		            if (tamañoUva == 1) {
		                montoRecibido += 0.20; // Se cargan 20 céntimos
		            } else if (tamañoUva == 2) {
		                montoRecibido += 0.30; // Se cargan 30 céntimos
		            }
		        } else if (tipoUva.equalsIgnoreCase("B")) {
		            if (tamañoUva == 1) {
		                montoRecibido -= 0.30; // Se rebajan 30 céntimos
		            } else if (tamañoUva == 2) {
		                montoRecibido -= 0.50; // Se rebajan 50 céntimos
		            }
		        }

		        // Imprimir el monto a recibir por el productor
		        System.out.println("El monto a recibir por el productor es: " + montoRecibido);
		    }
		
		
		
	}

