package com;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Intanciar a un objeto empleado
		
		Empleado empleado1 = new Empleado();
		empleado1.setNombre("Osbaldo");
		empleado1.setSexo("Masculino");
		empleado1.setEdad(30);
		empleado1.setCurp("hgj45522");
		empleado1.setIdEmpleado(1001);
		empleado1.setNss(156895);
		empleado1.setPuesto("Dev Java");
		empleado1.setSalario(35000);
		
		Persona persona1 = new Persona();
		persona1.setNombre("Juan");
		persona1.setCurp("HGJU1526");
		
		System.out.println(empleado1);
		System.out.println(persona1);
		
		System.out.println(persona1.pensar());
		persona1.caminar();
	}

}
