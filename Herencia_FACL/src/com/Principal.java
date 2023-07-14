package com;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Empleado empleado1=new Empleado();
		empleado1.setNombre("Felix");
		empleado1.setSexo("Masculino");
		empleado1.setEdad(26);
		empleado1.setCurp("FACL123456AL");
		empleado1.setIdEmpleado(1001);
		empleado1.setNss(123456780);
		empleado1.setSalario(35000);
		empleado1.setPuesto("Desarrollador Java");
		
		//AL volver una clase abstracta no puedo instanciar
		//un objeto de la misma
		
		//Persona persona1 =new Persona("Arturo", "Masculino", 25, "123116asdd6");
			
		System.out.println(empleado1);
		System.out.println();
		//System.out.println(persona1.getNombre());
		
		System.out.println();
		
		//System.out.println(persona1.pensar());
		
		empleado1.caminar();
		
		//persona1.caminar("7 kilometros");
		
		empleado1.caminar("millas",5);
		
		empleado1.comer();
		
		empleado1.volar();
		
		//¿De dónde toman comportamientos las clase?
		/*1. De métodos propios
		 * 2. De clases abstractas u otras clases
		 * 3. De interfaces
		 * 
		 */
		
		
	}

}
