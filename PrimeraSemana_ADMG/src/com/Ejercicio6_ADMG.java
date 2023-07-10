package com;

import java.util.Scanner;

public class Ejercicio6_ADMG {

	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el precio inicial por kilo de uva: ");
        double precioInicial = scanner.nextDouble();

        System.out.print("Ingrese el tipo de uva (A/B): ");
        char tipo = scanner.next().charAt(0);

        System.out.print("Ingrese el tamaño de uva (1/2): ");
        int tamaño = scanner.nextInt();

        double precioFinal = precioInicial;

        if (tipo == 'A' || tipo == 'a') {
            if (tamaño == 1) {
                precioFinal +=0.20;
            } else if (tamaño == 2) {
                precioFinal += 0.30;
            }
        } else if (tipo == 'B' || tipo == 'b') {
            if (tamaño == 1) {
                precioFinal -= 0.30;
            } else if (tamaño == 2) {
                precioFinal -= 0.50;
            }
        }

        System.out.println("El monto a recibir por el productor es: " + precioFinal);

        scanner.close();
    }
}
