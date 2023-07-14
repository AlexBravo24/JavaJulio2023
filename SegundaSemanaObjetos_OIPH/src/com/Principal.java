package com;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Persona juan = new Persona();
		Persona luis = new Persona("Luis", "Lopez", 52, 'H');
		System.out.println(luis);
		
		Planta cafeto = new Planta();
		Planta naranjo = new Planta("Naranjo", 1.2, "verde", true);
		System.out.println(naranjo);
		
	}

}
