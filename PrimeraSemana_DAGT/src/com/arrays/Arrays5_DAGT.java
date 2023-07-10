package com.arrays;

import java.util.Scanner;

public class Arrays5_DAGT {

	public static void main(String[] args) {
        System.out.println("Cuantos productos daras de alta? ");
        Scanner scanner = new Scanner(System.in);

        int total = scanner.nextInt();
        scanner.nextLine(); // Consumir el carácter de nueva línea pendiente

        String[] productos = new String[total];
        double[] precios = new double[total];

        for (int i = 0; i < productos.length; i++) {
            System.out.print("Introduce el nombre del producto: ");
            productos[i] = scanner.nextLine();
            System.out.print("Introduce el precio del producto: ");
            precios[i] = scanner.nextDouble();
            scanner.nextLine(); // Consumir el carácter de nueva línea después de leer el precio
        }

    	System.out.println("________________________________________________");

        for (int i = 0; i < productos.length; i++) {
            System.out.println("Producto: " + productos[i] + " Precio: $" + precios[i]);
        }
    }

}
