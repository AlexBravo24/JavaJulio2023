package com;

public class Principal {

	public static void main(String[] args) {
		
		//Primero debemos instanciar y asignarle valor a los
		//objetos m�s peue�os para posteriormente
		//crear o asignar valores al m�s grande
		
		Almacenamiento disco = new Almacenamiento("W.D", "SSD", 480);
		Procesador cpu = new Procesador("AMD", "Ryzen7", 4.8);
		RAM ram = new RAM("ADATA", 8, 3200);
		
		//Instanciamos una nueva laptop y podemos pasarle el valor
		//de los objetos m�s peque�os
		
		Laptop lap = new Laptop("HP", "Plata", disco, cpu, ram);
		
		System.out.println(lap);
		

	}

}
