package com.arrays;

import java.util.Scanner;

public class Array5_BAFV {
	
	/*
	5.- Crea dos arrays, uno para mostrar n productos y otro para mostrar sus 
	respectivos precios. Muestra en consola la lista de productos y sus precios. 
	Por lo menos 5 productos o artículos 
	 
	 * */
	
	public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("ingrese la cantidad de productos: ");
        int cproductos = Integer.parseInt(entrada.nextLine());; // quitar el salto de linea

        String[] productos = new String[cproductos];
        double[] precios = new double[cproductos];

        System.out.println("ingrese los nombres y precios de los productos");
        
        
        for (int i=0;i<cproductos;i++) {
        	 System.out.print("producto " + (i + 1) + ": ");
             productos[i] = entrada.nextLine();
            
            
             	System.out.print("precio" + (i + 1) + ": ");
                
             		precios[i] = Double.parseDouble(entrada.nextLine());
            
        }
        
        System.out.println();
        System.out.println("Lista de productos y precios:");

        for (int j = 0; j < cproductos; j++) {
            System.out.println(productos[j] + ": $" + precios[j]);
        }
    }

}
