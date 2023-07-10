package com.problemas.dia4;

import java.util.Scanner;

public class Ejercicio5_ADLM {

	public static void main(String[] args) {
		/* 5. Crea dos arrays, uno para mostrar n productos y otro para mostrar sus 
		respectivos precios. Muestra en consola la lista de productos y sus precios. 
		Por lo menos 5 productos o artículos */
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Productos que se van a registrar");
		int noProductos = entrada.nextInt();
		int i = 0;
		
		String[] productos = new String[noProductos];
		int[] precios = new int[noProductos];
		
		while(i < noProductos) {
			System.out.println("Producto: ");
			String producto = entrada.next();
			System.out.println("Precio: ");
			int precio = entrada.nextInt();
			
			productos[i] = producto;
			precios[i] = precio;
			i++;
		}
		
		for(int j = 0; j < productos.length; j++) {
			System.out.println("Nombre: " + productos[j] + " Precio: $" + precios[j]);
		}
		
	
		/*String[] productos = {"Monitor", "Teclado", "Mouse", "CPU", "RAM"};
		double[] precios = {2500.00, 200.00, 150.00, 1500.00, 800.00};
		
		for(int i = 0; i < productos.length; i++) {
			System.out.println("Nombre: " + productos[i] + " Precio: $" + precios[i]);
		}*/
	}

}
