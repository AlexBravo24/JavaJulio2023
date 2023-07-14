package com;

public class Principal {

	public static void main(String[] args) {
		
		Procesador cpu = new Procesador("Snapdragon", 3.5, 4);
		RAM ram = new RAM("Samsung", 8, 4400);
		Camara camara = new Camara("Sony", 18, 2);
		Bateria bateria = new Bateria("LG", 5000, 100);
		
		Celular cel = new Celular("Samsung", "Azul", cpu, ram, camara, bateria);
		System.out.println(cel);

	}

}
