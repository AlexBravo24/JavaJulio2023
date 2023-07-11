package com.arrays;

public class Ejercicio5_AApc {

	public static void main(String[] args) {
		// Crea dos arrays, uno para mostrar n productos y otro para mostrar sus respectivos precios. Muestra en consola la lista de productos y sus precios. 
		//Por lo menos 5 productos o artículos
		
		        String[] productos = {"Producto A", "Producto B", "Producto C", "Producto D", "Producto E"};
		        double[] precios = {10.90, 110.50, 125.75, 31.99, 122.25};

		        System.out.println("Lista de productos y precios:");

		        for (int i = 0; i < productos.length; i++) {
		            System.out.println(productos[i] + ": $" + precios[i]);
		        }
		    }
		}


	


