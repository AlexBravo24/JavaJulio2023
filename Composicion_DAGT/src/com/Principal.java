package com;

public class Principal {

	public static void main(String[] args) {

		Marca mustang = new Marca("Ford", "Mustang", "rojo", 1987);
		Tipo carro = new Tipo("carro", "Ciudad", 4, "Standard");
		Marca honda =new Marca("Honda", "Twister 125f", "negro", 2022);
		Tipo moto = new Tipo("Motocicleta", "todoterreno", 2, "Standard");
		Marca freightliner = new Marca("freightliner", "Cascadia 125", "Blanco", 2020);
		Tipo trailer = new Tipo("Trailer", "Carga", 12, "Standard");
		
		
		
		Vehiculo vehiculo1 =  new Vehiculo(carro, mustang);
		Vehiculo vehiculo2 = new Vehiculo(moto, honda);
		Vehiculo vehiculo3 = new Vehiculo(trailer, freightliner);
		
		System.out.println(vehiculo3);
		System.out.println(vehiculo1);
		System.out.println(vehiculo2);

	}

}
