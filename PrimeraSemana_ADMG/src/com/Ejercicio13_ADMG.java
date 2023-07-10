package com;

import java.util.Scanner;

public class Ejercicio13_ADMG {

	public static void main(String[] args) {
		
//		Una instituci�n ben�fica recibe anualmente una donaci�n proveniente de Europa y lo reparte entre un 
//		centro de salud, un comedor de ni�os y una parte lo invierte en la bolsa de acuerdo a lo siguiente:
//		Si el monto de la donaci�n es de $10000 o m�s: 30% se destina al centro de salud, 50% al comedor de ni�os 
//		y el resto se invierte en la bolsa.
//		Si el monto de la donaci�n es menor que $10000: 25% se destina al centro de salud, 60% al comedor de 
//		ni�os y el resto se invierte en la bolsa.
//		La instituci�n desea saber cu�nto de dinero destinar� a cada rubro anualmente.

		Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el monto de la donaci�n: $");
        double montoDonacion = scanner.nextDouble();

        double montoCentroSalud;
        double montoComedor;
        double montoBolsa;

        if (montoDonacion >= 10000) {
            montoCentroSalud = montoDonacion * 0.30;
            montoComedor = montoDonacion * 0.50;
            montoBolsa = montoDonacion - montoCentroSalud - montoComedor;
        } else {
            montoCentroSalud = montoDonacion * 0.25;
            montoComedor = montoDonacion * 0.60;
            montoBolsa = montoDonacion - montoCentroSalud - montoComedor;
        }

        System.out.println("Monto destinado al centro de salud: $" + montoCentroSalud);
        System.out.println("Monto destinado al comedor de ni�os: $" + montoComedor);
        System.out.println("Monto destinado a invertir en la bolsa: $" + montoBolsa);
		
		
		
		
	}

}
