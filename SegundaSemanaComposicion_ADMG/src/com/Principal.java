package com;

public class Principal {

	public static void main(String[] args) {
		
		//Primero debemos instancear y asignarle valor a 
		//los objetos mas pequenos para posteriormente
		//crear o asignar valores al mas grande
		
		
		Almacenamiento disco = new Almacenamiento("WD", "SSD", 480);
		Procesador cpu = new Procesador("AMD", "Ryzen 7", 4.8);
		Ram memoria = new Ram("ADATA", 8, 2166);
		
		
		//Instanceamos una nueva Laptop y podemos pasarle el valor
		//de los objetos mas pequenos
		
		Laptop lap = new Laptop("HP", "Plata", disco, cpu, memoria);
		System.out.println(lap);
		
		
		
		
		

	}

}
