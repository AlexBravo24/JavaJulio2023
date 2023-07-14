package com;

public class Principal {

	public static void main(String[] args) {
		
		
		//INSTANCIAR A UN OBJETO EMPLEADO
		
		Empleado empleado1 = new Empleado ();
		empleado1.setNombre("Sebastian");
		empleado1.setSexo("masculino");
		empleado1.setEdad(30);
		empleado1.setCurp("SEBASTIAN9875433");
		empleado1.setIdEmpleado(1001);
		empleado1.setNss(123456789);
		empleado1.setPuesto("Desarrollador Java");
		empleado1.setSalario(35000);
		
		//Al VOLVER UNA CLAS ABSTRACTA NO PUEDO INSTANCIAR ES DECIR NO PUEDO CREAR OBJETOS CON ELLA 
		//Persona persona1= new Persona ("Alex ","ALEX2344HMDF");
		
		//Persona persona1= new Persona ("Alex ","ALEX2344HMDF");
		
		
		
		System.out.println(empleado1);
		//System.out.println(persona1);
		
		//imprimiendo la accion de un metodo con un valor de retorno
		//System.out.println(persona1.pensar());
		
		
		// EJECUTANDO UN METODOO QUE NO RETORNA A UN VALOR PERO SI EJECUTA UNA ACCION
		//persona1.caminar();
		//EJECUTANDO UNMETODO POLIMORFICO CON SOBRE CARGA DE ARGUMENTOS 
		
		//persona1.caminar("Kilometros", 4);
		
		
		
		
		empleado1.volar();
		
		/*De donde toman cpmpotamientos las clases 
		 * 1: METODOS PROPIOS
		 * 2: DE CLASES ABSTRACTAS U OTRAS CLASES 
		 * 3: DE INTERFACES 
		 */
		
		
	}

}
