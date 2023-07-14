package com;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Empleado empleado1 = new Empleado();
		
		empleado1.setNombre("Jose");
		empleado1.setCurp("Jose65121541");
		empleado1.setIdEmpelado(1001);
		
		//Al volver una clase abstracta no puedo instancearla es decir, no puedo crear objetos de ella
		
		//Persona persona1 = new Persona("ALex", "Alex6841616");
		
		System.out.println(empleado1);
		// System.out.println(persona1);
		
		
		// imprimiendo la accion de un metodo  con un valor de retorno
		// System.out.println(persona1.pensar());
		
		//ejecuntado un metodo que no retorna un valor pero si ejecuta una accion
		// persona1.caminar();
		
		//Ejecuntado un metodo polimorfico con sobrecarga de argumentos
		
		//persona1.caminar(" Kilometros ", 4); 
		
		empleado1.comer();
		empleado1.volar();
		
		// De donde toman comportamientos las clases?
		// - de Metodos propios
		// - de Clases Absractas
		// - Interfaces
		
	}

}
