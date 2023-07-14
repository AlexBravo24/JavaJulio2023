package com;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Primero hay que instanciar y asignar valores a los objetos 
		//más pequeños, para después hacer los grandes.
		
		Almacenamiento disco= new Almacenamiento("WD","SSD", 480);
		
		Procesador cpu =new Procesador("AMD", "Ryzen 7", 4.8);
		
		Ram memoria = new Ram("ADATA", 8, 2166);
		
		//Instanciamos el objeto más grande
		
		Laptop lap =new Laptop("HP", "Negra", disco, cpu, memoria);
		
		System.out.println(lap);
		

	}

}
