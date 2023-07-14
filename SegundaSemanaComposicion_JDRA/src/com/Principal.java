package com;

public class Principal {

	public static void main(String[] args) {
		
		// Primero debemos instanciar y asignarle valor a los objetos mas pequeños para
		// posteriormente crear o asignar valores al mas grande
		
		Almacenamiento disco = new Almacenamiento("WD", "SSD", 480);
		Procesador cpu = new Procesador("AMD", "Ryzen 7", 4.8);
		Ram memoria = new Ram("ADATA", 8, 2166);
		
		// instanciamos una nueva laptop y podemos pasarle el valor de los objetos mas pequeños
		
		Laptop lap = new Laptop("HP", "Dorado", disco, cpu, memoria);
		
		System.out.println(lap);

	}

}
