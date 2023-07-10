package com;

import java.util.Scanner;

public class Ejercicio11_ADMG {

	public static void main(String[] args) {
		
//		Una compa��a de transporte internacional tiene servicio en algunos pa�ses de Am�rica del Norte, Am�rica 
//		Central, Am�rica del Sur, Europa y Asia. El costo por servicio de transporte se basa en el peso del paquete y 
//		la zona a la que va dirigida. Lo anterior se muestra en la siguiente tabla:
//		ZONA UBICACI�N COSTO/KILOGRAMO
//		1 Am�rica del Norte 24,00 euros
//		2 Am�rica Central 20, 00 euros
//		3 Am�rica del Sur 21,00 euros
//		4 Europa 10,00 euros
//		5 Asia 18,00 euros
//		Parte de su pol�tica implica que los paquetes con un peso superior a 5kg no son transportados, por 
//		cuestiones de log�stica y seguridad.
//		Realiza un algoritmo para determinar el cobro por la entrega de un paquete o, en su caso, el rechazo 
//		de la entrega.
		
		Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese la zona de destino (1-5): ");
        int zona = scanner.nextInt();

        System.out.print("Ingrese el peso del paquete en kilogramos: ");
        double peso = scanner.nextDouble();

        double costoTransporte;

        if (peso > 5) {
            System.out.println("El paquete excede el peso m�ximo permitido. Entrega rechazada.");
            return;
        }

        if (zona == 1) {
            costoTransporte = 24.00;
        } else if (zona == 2) {
            costoTransporte = 20.00;
        } else if (zona == 3) {
            costoTransporte = 21.00;
        } else if (zona == 4) {
            costoTransporte = 10.00;
        } else if (zona == 5) {
            costoTransporte = 18.00;
        } else {
            System.out.println("Zona de destino inv�lida. Entrega rechazada.");
            return;
        }

        double costoTotal = costoTransporte * peso;

        System.out.println("El costo por la entrega del paquete es de: " + costoTotal + " euros.");
		
		
		
		

	}

}
