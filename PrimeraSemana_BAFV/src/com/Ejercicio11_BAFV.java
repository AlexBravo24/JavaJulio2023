package com;

import java.util.Scanner;

public class Ejercicio11_BAFV {
    public static void main(String[] args) {
    	
    	/*
    	  Una compa��a de transporte internacional tiene servicio en algunos pa�ses de Am�rica del Norte, Am�rica 
		  Central, Am�rica del Sur, Europa y Asia. El costo por servicio de transporte se basa en el peso del paquete y 
		  la zona a la que va dirigida. Lo anterior se muestra en la siguiente tabla:
		  ZONA UBICACI�N COSTO/KILOGRAMO
		  
		  1 Am�rica del Norte 	24,00 euros
		  2 Am�rica Central 	20, 00 euros
		  3 Am�rica del Sur 	21,00 euros
		  4 Europa 				10,00 euros
		  5 Asia 				18,00 euros
		  
		Parte de su pol�tica implica que los paquetes con un peso superior a 5kg no son transportados, por 
		cuestiones de log�stica y seguridad.
		Realiza un algoritmo para determinar el cobro por la entrega de un paquete o, en su caso, el rechazo 
		de la entrega
    	 
    	 
    	 */
    	
        Scanner entrada = new Scanner(System.in);

        System.out.print("Ingrese el peso del paquete en kg: ");
        double peso = entrada.nextDouble();

        System.out.print("Ingrese la zona de destino (1-5): ");
        int zona = entrada.nextInt();

        double costoPorKg;
        double costoTotal;

        if (peso <= 5) {
            switch (zona) {
                case 1:
                    costoPorKg = 24.00;
                    break;
                case 2:
                    costoPorKg = 20.00;
                    break;
                case 3:
                    costoPorKg = 21.00;
                    break;
                case 4:
                    costoPorKg = 10.00;
                    break;
                case 5:
                    costoPorKg = 18.00;
                    break;
                default:
                    System.out.println("Zona de destino inv�lida.");
                    return;
            }

            costoTotal = peso * costoPorKg;
            System.out.println("El costo por la entrega del paquete es: " + costoTotal + " euros.");
        } else {
            System.out.println("El paquete no puede ser transportado.");
        }
    }
}

