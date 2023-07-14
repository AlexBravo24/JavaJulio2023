package com;

public class Principal {

	public static void main(String[] args) {
		
		Pantalla pantalla = new Pantalla("Piphone14", "full HD", 600);
		Bateria bateria = new Bateria("Batlit", 3900, "Litio");
		Camara camara = new Camara("Camiph", 14, 3);
		
		Celular iphone = new Celular("Apple", "14 Pro Max", pantalla, bateria, camara);
		
		System.out.println(iphone);

	}

}
