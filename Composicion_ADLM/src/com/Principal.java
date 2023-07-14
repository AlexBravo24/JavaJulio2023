package com;

import com.clases.*;

public class Principal {

	public static void main(String[] args) {
		Persona dueño = new Persona("Dana", "Perez", "Rodriguez");
		Mascota mascota = new Mascota("Toby", "Bulldog", 1.2);
		Contacto contacto = new Contacto("223518786", "123723186");
		Consulta consulta = new Consulta(mascota, dueño, contacto, "No come", "11 Julio 2023");
		
		System.out.println(consulta.toString());
	}

}
