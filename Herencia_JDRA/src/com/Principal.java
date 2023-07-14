package com;

public class Principal {

	public static void main(String[] args) {
		
		
		Empleado empleado1 = new Empleado();
		empleado1.setNombre("Diego");
		empleado1.setSexo("Masculino");
		empleado1.setEdad(25);
		empleado1.setIdEmpleado(1);
		empleado1.setNss(16091201);
		empleado1.setPuesto("Desarrollador Java");
		empleado1.setSalario(20000);
		
		// al volver una clase abstracta, no puedo instanciarla
		//es decir, no puedo crear objetos de ella
		//Persona persona1 = new Persona("Diego",26);
		
		System.out.println(empleado1);
		//System.out.println(persona1);
		System.out.println(empleado1.getNombre());
		
		
		
		
		//System.out.println(persona1.pensar()); // imprimiendo la accion de un metodo con un valor de retorno
		
		//persona1.caminar(); // ejecutando un metodo que no retorna un valor, pero si ejecuta una accion
		
		
		// ejecutando un metodo POLIMORFICO con sobrecarga de argumentos
		//persona1.caminar(" kilometros", 5);
		
		empleado1.comer();
		
		empleado1.volar();
		
		// de donde toman comportamientos las clases?
		// 1. Metodos propios
		// 2. De clases abstractas u otras clases
		// 3. De interfaces

	}

}
