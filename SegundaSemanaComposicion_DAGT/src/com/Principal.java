package com;

public class Principal {

	public static void main(String[] args) {
		
		/*Primero debemos instanciar y asignar un valor 
		 * a los objetos mas pequeños 
		 * para posteriormente crear o asignar valores al mas grande
		 */
		
		Almacenamiento hd = new Almacenamiento("WD", "SSD", 512);
		Procesador cpu  = new Procesador("AMD", "ryzen 7", 4.8);
		Ram memoria = new Ram("ADATA", 8, 2166);
		
		Laptop laptop = new Laptop("HP", "Plata", hd, cpu, memoria);
		
		System.out.println(laptop);
		
	}

}
