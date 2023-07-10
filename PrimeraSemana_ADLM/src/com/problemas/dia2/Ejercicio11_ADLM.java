package com.problemas.dia2;

import java.util.Scanner;

public class Ejercicio11_ADLM {

	public static void main(String[] args) {
		/* 11. Una compa��a de transporte internacional tiene servicio en algunos pa�ses de Am�rica 
		  del Norte, Am�rica Central, Am�rica del Sur, Europa y Asia. El costo por servicio de transporte 
		  se basa en el peso del paquete y la zona a la que va dirigida. Lo anterior se muestra en la 
		  siguiente tabla: 
		  ZONA UBICACI�N COSTO/KILOGRAMO
			1 Am�rica del Norte 24,00 euros
			2 Am�rica Central 20, 00 euros
			3 Am�rica del Sur 21,00 euros
			4 Europa 10,00 euros
			5 Asia 18,00 euros
		Parte de su pol�tica implica que los paquetes con un peso superior a 5kg no son transportados, por 
		cuestiones de log�stica y seguridad.
		Realiza un algoritmo para determinar el cobro por la entrega de un paquete o, en su caso, el rechazo 
		de la entrega.*/
		Scanner entrada = new Scanner(System.in);
		System.out.println("Ingresa el peso del paquete");
		double peso = entrada.nextDouble();
		if(peso > 5) {
			System.out.println("El paquete no puede ser transportado");
		}else {
			System.out.println("Ingresa el destino: \n 1: Am�rica del Norte \n 2: Am�rica Central"
					+ " \n 3: Am�rica del Sur \n 4: Europa \n 5: Asia");
			int destino = entrada.nextInt();
			switch(destino) {
				case 1:
					System.out.println("Total: " + peso * 2400 + " euros");
					break;
				case 2:
					System.out.println("Total: " + peso * 2000 + " euros");
					break;
				case 3:
					System.out.println("Total: " + peso * 2100 + " euros");
					break;
				case 4:
					System.out.println("Total: " + peso * 1000 + " euros");
					break;
				case 5:
					System.out.println("Total: " + peso * 1800 + " euros");
					break;
				default:
					System.out.println("No valido");
					break;
			}
		}
	}

}
