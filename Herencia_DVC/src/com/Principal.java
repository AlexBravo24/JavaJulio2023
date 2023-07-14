package com;

public class Principal {

	public static void main(String[] args) {
		
		Empleado empleado1 = new Empleado();
		empleado1.setCargo("Desarrolador");
		empleado1.setCurp("DGET213523");
		empleado1.setEdad(30);
		empleado1.setIdempleado(12345678);
		empleado1.setNombre("Diego");
		empleado1.setNomina(30000);
		empleado1.setNss(789456123);
		empleado1.setSexo("Hombre");
		
		//AL volver una clase abstracta no puedo instanciarla
		//es decir no puedo crear objetos de ella
		//Persona persona1 = new Persona ("Alex", "ALEX2109457");
		
		System.out.println(empleado1);
//		System.out.println(persona1);
//		
//		//Imprimiendo la acción de un método con un valor de retorno
//		System.out.println(persona1.pensar());
//		//Ejecutando un método que no retorna un valor pero si una acción
//		persona1.caminar();
//		//ejecutando un método polimorfico con sobrecarga de argumentos
//		persona1.caminar(" kilometros ", 4);
		
		
		empleado1.comer();
		empleado1.volar();
		
		/*De donde toman comportamientos as clases?
		 * 
		 * 1. Métodos propios
		 * 2. De clases abstractas u otras clases
		 * 3. De interfaces
		 */
		
	}

}
