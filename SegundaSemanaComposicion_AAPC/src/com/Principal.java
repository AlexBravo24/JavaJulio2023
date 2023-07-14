package com;

public class Principal {

	public static void main(String[] args) {
		// Primero debemos instanciar y asignarle
		//valor a los objetos mas pequeños
		//Para posterior crear o asignar al mas grande
		
		Almacenamiento disco = new Almacenamiento("WD", "SSD",480);
		Procesador cpu = new Procesador("AMD","Ryzen 7", 4.8);
		Ram memoria = new Ram("ADATA",8,2166);
		//instanciamos una nueva laptop y podemos pasarle el valor de los
		//Obejtos mas pequeños
		
		Laptop lapt = new Laptop("HP","Plata",disco, cpu, memoria);
		System.out.println(lapt);
		
		
		
		
		
		
		
		
		
	}

}
