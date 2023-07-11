package com;

import java.util.Scanner;

public class Ejercicio11_AAPC {

	public static void main(String[] args) {
		// Una compañía de transporte internacional tiene servicio en algunos países de América del Norte,
		//América Central, América del Sur, Europa y Asia. El costo por servicio de transporte
		//se basa en el peso del paquete y la zona a la que va dirigida. 
		//Lo anterior se muestra en la siguiente tabla: 
		//ZONA UBICACIÓN COSTO/KILOGRAMO 
		//1 América del Norte 24,00 euros 
		//2 América Central 20, 00 euros 
		//3 América del Sur 21,00 euros 
		//4 Europa 10,00 euros 
		//5 Asia 18,00 euros 
		//Parte de su política implica que los paquetes con un peso superior a 5kg no son
		//transportados, por cuestiones de logística y seguridad. Realiza un algoritmo para
		//determinar el cobro por la entrega de un paquete o, en su caso, el rechazo de la 
		//entrega. 
		 
		
		        Scanner scanner = new Scanner(System.in);

		        // Obtener el peso del paquete desde el teclado
		        System.out.println("Ingrese el peso del paquete en kilogramos: ");
		        double pesoPaquete = scanner.nextDouble();

		        // Obtener la zona de destino del paquete desde el teclado
		        System.out.println("Ingrese la zona de destino del paquete (1-5): ");
		        int zonaDestino = scanner.nextInt();

		        // Verificar el peso del paquete y determinar el cobro o rechazo de la entrega
		        double costoTotal;

		        if (pesoPaquete <= 5) {
		            switch (zonaDestino) {
		                case 1:
		                    costoTotal = pesoPaquete * 24.00;
		                    break;
		                case 2:
		                    costoTotal = pesoPaquete * 20.00;
		                    break;
		                case 3:
		                    costoTotal = pesoPaquete * 21.00;
		                    break;
		                case 4:
		                    costoTotal = pesoPaquete * 10.00;
		                    break;
		                case 5:
		                    costoTotal = pesoPaquete * 18.00;
		                    break;
		                default:
		                    costoTotal = 0.00; // Indicador de zona inválida
		                    break;
		            }

		            // Imprimir el costo total o el mensaje de rechazo de la entrega
		            if (costoTotal == 0.00) {
		                System.out.println("ERROR: zona de destino incorrecta");
		            } else {
		                System.out.println("Cobro por la entrega del paquete: " + costoTotal + " euros");
		            }
		        } else {
		            System.out.println("El paquete no puede ser transportado debido a su peso");
		        }
		    }
		

		
		
		

	}


