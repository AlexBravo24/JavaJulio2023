package com;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Almacenamiento disco = new Almacenamiento("Kingston", 1000, "Solido");
		Juegos game = new Juegos("Call of Duty", "Activision", "Guerra", "Digital");
		Video tarjeta = new Video("Nvidia", "GForce", 420);
		
		
		Consolas consola = new Consolas("Xbox", "SeriesX", disco, game, tarjeta);
		
		System.out.println(consola);
		
		
	}

}
