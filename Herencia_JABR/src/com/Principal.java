package com;

public class Principal {

	public static void main(String[] args) {
		
		
		//Instanciar a un objeto empleado
		
		Empleado empleado1 = new Empleado();
		empleado1.setNombre("Diego Alonso");
		empleado1.setSexo("Masculino");
		empleado1.setEdad(30);
		empleado1.setCurp("DIEGO92767HDA");
		empleado1.setIdEmpleado(1001);
		empleado1.setNss(1672096512);
		empleado1.setPuesto("Desarrollador Java");
		empleado1.setSalario(35000);
		
		//Al volver una clase abstracta, no puedo instanciarla
		//es decir, no puedo crear objetos de ella
		//Persona persona1 = new Persona("Alex", "ALEX2189899");
		
		System.out.println(empleado1);
		//System.out.println(persona1.getNombre());
		
		//Imprimiendo la acción de un método con un valor de retorno
		//System.out.println(persona1.pensar());
		
		//Ejecutando un método que no retorna un valor, pero si
		//ejecuta una acción
		//persona1.caminar();
		 //Ejecutando un método polimorfico con sobrecarga de argumentos
		//persona1.caminar(" kilometros", 19);
		
		empleado1.comer();
		
		empleado1.volar();
		
		//¿De donde toman comportamientos las clases?
		/* 
		 * 1. Métodos propios
		 * 2. De clases abstractas u otras clases
		 * 3. De Interfaces
		 * 
		 */
		
		
	}

}
