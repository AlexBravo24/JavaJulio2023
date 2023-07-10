package com.ciclos;

import java.util.Scanner;

public class Ciclos12_DVC {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int sumaEdades = 0;
        int contadorEdades = 0;


        while (true) {
            System.out.print("Ingresa una edad (o ingresa -1 para finalizar): ");
            int edad = scanner.nextInt();

            if (edad == -1) {
                break;
            }

            sumaEdades += edad;
            contadorEdades++;
            
            double promedio = (double) sumaEdades / contadorEdades;

            if (promedio > 25) {
                System.out.println("El promedio de edades es superior a 25.");
                break;
            }
        }
    }
}