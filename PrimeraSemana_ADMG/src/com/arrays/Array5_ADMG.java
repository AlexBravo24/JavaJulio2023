package com.arrays;

public class Array5_ADMG {

	public static void main(String[] args) {
		
//		//Crea dos arrays, uno para mostrar n productos y otro para mostrar sus 
//		respectivos precios. Muestra en consola la lista de productos y sus precios. 
//		Por lo menos 5 productos o artículos
		
		
		String[] productos = {"Producto 1", "Producto 2", "Producto 3", "Producto 4", "Producto 5"};
        double[] precios = {12.55, 22.12, 3.50, 102.60, 89.00};

        System.out.println("Lista de productos y precios:");

        for (int i = 0; i < productos.length; i++) {
            System.out.println(productos[i] + ": $" + precios[i]);
        }
		

	}

}
