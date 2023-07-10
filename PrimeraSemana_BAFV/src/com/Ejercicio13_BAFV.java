package com;

import java.util.Scanner;

public class Ejercicio13_BAFV {
    public static void main(String[] args) {
        
    	/*
    	 Una institución benéfica recibe anualmente una donación proveniente de Europa y lo reparte entre un 
		centro de salud, un comedor de niños y una parte lo invierte en la bolsa de acuerdo a lo siguiente:
		Si el monto de la donación es de $10000 o más: 30% se destina al centro de salud, 50% al comedor de niños 
		y el resto se invierte en la bolsa.
		Si el monto de la donación es menor que $10000: 25% se destina al centro de salud, 60% al comedor de 
		niños y el resto se invierte en la bolsa.
		La institución desea saber cuánto de dinero destinará a cada rubro anualmente
    	  
    	  */
    	Scanner entrada = new Scanner(System.in);
        
        System.out.print("Ingrese el monto de la donación: $");
        double montoDonacion = entrada.nextDouble();

        double montoCentroSalud;
        double montoComedor;
        double montoBolsa;

        if (montoDonacion >= 10000) {
            montoCentroSalud = montoDonacion * 0.3;
            montoComedor = montoDonacion * 0.5;
            montoBolsa = montoDonacion - montoCentroSalud - montoComedor;
        } else {
            montoCentroSalud = montoDonacion * 0.25;
            montoComedor = montoDonacion * 0.6;
            montoBolsa = montoDonacion - montoCentroSalud - montoComedor;
        }

        System.out.println("Cantidad correspondiente:");
        System.out.println("Centro de Salud: $" + montoCentroSalud);
        System.out.println("Comedor de Niños: $" + montoComedor);
        System.out.println("Inversión en la Bolsa: $" + montoBolsa);
    }
}

