package com;

public class Principal {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//instanciar 
		Empleado empleado1= new Empleado();
		empleado1.setNombre("Diego Alonso");
		empleado1.setSexo("Masculino");
		empleado1.setEdad(30);
		empleado1.setCurp("DAGO12313hvzrs");
		empleado1.setIdEmpleado(1200);
		empleado1.setNss(16784555);
		empleado1.setPuesto("Desarrollador java");
		empleado1.setSalario(35000);
		System.out.println(empleado1);
		
		//al volver una clase abstracta, no puedo instanciarla
		//es decir no puedo crear obejtos de ella
		
//		Persona persona1 = new Persona("alex","Alex123123");
		System.out.println(empleado1);
//		System.out.println(persona1);
		
		//imprimiendo la accion de un metodo con un valor de retorno
//					System.out.println(persona1.pensar());
						
		//ejecutando un metodo que no retorna un valor pero si una accion
//					persona1.caminar();

		//aplicando un metodo polimorfico con sobrecarga de argumentos
					
//		persona1.caminar(" kilometros ",  4 );
		empleado1.comer();
		empleado1.volar();
		//¿De donde toman comportamientos las clases?
		/* 1. metodos propios
		 * 2. De clases abstractas u otras clases
		 * 3. De interfaces
		 */
		
}
}