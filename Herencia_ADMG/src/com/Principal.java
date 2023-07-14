package com;

public class Principal {

	public static void main(String[] args) {
		
		
		//Instanciar a un objeto empleado
		
		Empleado empleado1 = new Empleado();
		empleado1.setNombre("Diego Alonso");
		empleado1.setSexo("Masculino");
		empleado1.setEdad(30);
		empleado1.setCurp("DIEGO932561PTG");
		empleado1.setIdEmpleado(1001);
		empleado1.setNss(1672096512);
		empleado1.setPuesto("Desarrollador Java");
		empleado1.setSalario(35000);
		
		//Al volver una clase abstracta, no puedo instanciarla
		//es decir, no puedo crear objetos de ella
		//Persona persona1 = new Persona("Alex", "ALEX901125GHB");
		
		System.out.println(empleado1);
		//System.out.println(persona1.getNombre());
		
		//Imprimiendo la accion de un metodo con un valor de retorno
		//System.out.println(persona1.pensar());
		
		//Ejecutando un metodo que no retorna un valor, pero si
		//ejecuta una accion
		//persona1.caminar();
		//Ejecutando un metodo polimorfico con sobrecarga de argumentos
		//persona1.caminar(" kilometros", 19);

		empleado1.comer();	
		
		empleado1.volar();
		
		//De donde toman comportamientos las clases?
		//1.Metodos propios
		//2.De clases abstractas
		//3. De interfaces
		
		
	}

}
