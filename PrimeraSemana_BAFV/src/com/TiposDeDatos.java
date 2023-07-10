package com;

public class TiposDeDatos {
	
	public static void main(String [] args) {
		
		/*tipos de datos primitivos
		 
		 numericos punto decimal o coma flotante
		 
		 
		 * */
		
		float f = 789.6754f;
		double d = 10009.178907;
		
		//la variable mas comun utilizado para decimales es la de tipo
		//double
		
		d= 5.99; //puedo asignar un valor posterior en una varibale
		//pero ahora esa variable tomará ese valor, y el inicial
		//pues quedará en deshuso
		
		
		/*
		 	TIPOS DE DATOS OBJETOS
		 	O TIPOS DE DATOS ESTRUCTURADA
		 
		 */
		
		//String - cadena en texto
		String cadena = "Esto es una cadena de texto";
		String nombre;
		
		nombre = "Bertín Alexis Fabián Velásquez";
		
		//Las cadenas de texto o tipo de datos String aadmite
		//caracteres, simbolos, espacios, letras, enunciados, números
		//pero siempre en formato de texto
		
		String numero = "150";
		
		//TIPOS DE DATOS OBJETOS - ENVOLTORIO o WRAPPER
		//son clases que otorgan comportamientos o propiedades
		//a los tipos de datos primitivos
		
		Byte b1 =-128;
		Short sh1 = 123;
		Integer x;
		Long l2;
		Double d1;
		
		//Salida de datos o mostrarlos en consola
		System.out.println("Hola mundo");
		
		//Mostrar en pantalla el valor de una variable 
		//el atajo para escribir en esta linea es con 
		//syso + ctrl + espacio
		System.out.println(nombre);
		System.out.println(sh1);
		
	}

}
