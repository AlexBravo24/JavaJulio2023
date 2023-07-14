package com;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// instanciar a un objeto empleado
		
		Empleado empleado1 = new Empleado();
		empleado1.setNombre("Alexis");
		empleado1.setSexo("Masculino");
		empleado1.setEdad(23);
		empleado1.setCurp("Alexis12jdnanjad");
		empleado1.setIdEmpleado(1001);
		empleado1.setNss(19199219);
		empleado1.setPuesto("Desarrollador java");
		empleado1.setSalario(35000);
		
		// AL VOLVER UNA CLASE ABSTRACTA NO LA PUEDO INSTANCIAR
		// es decir no puedo crear objetos de ella
		//Persona persona1  = new Persona("alrxi","kaks");
		
		// multiherencia en java no exite
		// una clase hija no puede tener dos clases padre
		System.out.println(empleado1);
//		System.out.println(persona1);
		//imprimiedno la accion de un metodo con numero de retorno
	//	System.out.println(persona1.pensar());
		//persona1.caminar();
		//ejecutando un metodo polimorfico con sobrecarga de argumetos
		//persona1.caminar("kilometros", 4);
		
		empleado1.comer();
		
		empleado1.volar();
		
		/*¿De donde toman compotamiento las clases?
		 * 
		 * 1.- Metodos propios
		 * 2.- De clases abstrectas u otras clases
		 * 3.- De interfaces
		 * */
		
		
	}

}
