package com;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*Primero debemos instanciar y asignarle valor 
		 * a los objetos mas pequeños 
		 * para posteriormente crear o asignar valores al mas grande
		 * 
		 */
		
		Almacenamiento disco = new Almacenamiento ("WD","SSD",480);
		Procesador cpu = new Procesador ("AMD","Ryzen 7",4.8);
		Ram  memoria = new Ram ("ADATA", 8 , 2166);
		
		Laptop lap = new Laptop ("Hp","Plata", disco,cpu,memoria);
		System.out.println(lap);

	}

}
