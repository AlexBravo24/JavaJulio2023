package com;

import java.util.Scanner;

public class Ejercicio11_BAFV {
    public static void main(String[] args) {
    	
    	/*
    	  Una compañía de transporte internacional tiene servicio en algunos países de América del Norte, América 
		  Central, América del Sur, Europa y Asia. El costo por servicio de transporte se basa en el peso del paquete y 
		  la zona a la que va dirigida. Lo anterior se muestra en la siguiente tabla:
		  ZONA UBICACIÓN COSTO/KILOGRAMO
		  
		  1 América del Norte 	24,00 euros
		  2 América Central 	20, 00 euros
		  3 América del Sur 	21,00 euros
		  4 Europa 				10,00 euros
		  5 Asia 				18,00 euros
		  
		Parte de su política implica que los paquetes con un peso superior a 5kg no son transportados, por 
		cuestiones de logística y seguridad.
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
                    System.out.println("Zona de destino inválida.");
                    return;
            }

            costoTotal = peso * costoPorKg;
            System.out.println("El costo por la entrega del paquete es: " + costoTotal + " euros.");
        } else {
            System.out.println("El paquete no puede ser transportado.");
        }
    }
}

