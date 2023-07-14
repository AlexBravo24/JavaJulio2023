package com;

public class Principal {

	public static void main(String[] args) {

		Empleado empleado1 = new Empleado();
		empleado1.setNombre("Diego Alonso");
		empleado1.setEdad(30);
		empleado1.setSexo("Hombre");
		empleado1.setCurp("GUTD920915HMNJRG01");
		empleado1.setIdEmpleado(1);
		empleado1.setNss(1234123);
		empleado1.setPuesto("Gerente");
		empleado1.setSalario(40500.45);

		System.out.println(empleado1.pensar());
		
		
		empleado1.comer();
	}

}
