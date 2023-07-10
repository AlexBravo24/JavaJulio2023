package com.arrays;

public class Array5_JDRA {

	public static void main(String[] args) {
		
		// 5. Crea dos arrays, uno para mostrar n productos y otro para mostrar sus 
		// respectivos precios. Muestra en consola la lista de productos y sus precios. 
		// Por lo menos 5 productos o artículos.
		
		String [] productos = {"Agua","azucar","pan bimbo","sabritas","chicle"};
		int [] precios = {10,22,35,16,2};
		
		for(int i=0; i<productos.length;i++) {
			
			System.out.println("El Producto "+ productos[i] +" ,tiene un precio de $"+precios[i]+" pesos");

		}
		
		for(int i=0; i<precios.length;i++) {
			
			//System.out.println("La posicion: "+ i +" tiene guardado el valor: "+valores[i]);	
		}
		

	}

}
