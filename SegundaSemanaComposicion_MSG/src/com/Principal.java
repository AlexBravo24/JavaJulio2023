package com;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Primero debemos instancear y asignar valor a los objegtos mas pequeños
		// para posteriormente asignar y crear valorees al mas grande
		
		Almacenamiento disco = new Almacenamiento("WD", "SSD", 480);
		Procesador cpu = new Procesador("AMD", "Rizen 7", 4.8);
		Ram memoria = new Ram("ADATA", 8, 216);
		
		// instancimao una nueva laptop y podemos pasarle el valor de los objetos mas pequeños
		
		Laptop lap = new Laptop("HP", "Plata", disco, cpu, memoria);
		
		System.out.println(lap);

	}

}
