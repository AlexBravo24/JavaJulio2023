package com; //Nombre del paquete

public class TiposDeDatos { //Nombre de la clase y llave

	public static void main(String[] args) { //Apertura del main
		
	// Comentarios de una sola línea
		
	/*Comentarios
	 * de
	 * multiples
	 * lineas
	 * 
	 * Aumentar tamaño de fuente Ctrl y simbolo +
	 * Disminuirlo Ctrl y simbolo -
	 * 
	 * Atajo para el método main (escribimos la palabra main
	 * Ctrl + espacio)
	 * 
	 */
		
	/*
	 * TIPOS DE DATOS PRIMITIVOS
	 * NUMÉRICOS ENTEROS
	 */
		
		//Declarar variables sin asignarles un valor inicial
	
		byte b;
		short s, k;
		int i;
		long l;
		
		//Variables declaradas con un valor asignado inicialmente
		
		byte by = -128; //1 Byte
		short sh = 32767; // 2 Bytes
		int i1 = 2147483647; // 4 bytes
		long l1 = 452147483648l; //para aceptar valores más alla del rango
		//de los int, necesita un sufijo "L" para poder aceptarlo
		
		//La variable más común para guardar datos numéricos enteros
		// es la tipo int
		
		/*TIPOS DE DATOS PRIMITIVOS
		 * NUMÉRICOS EN PUNTO DECIMAL O COMA FLOTANTE
		 */
		
		float f = 789.6754f; //4 bytes
		double d = 10009.178907; //8 bytes
		
		//La variable más común utilizada para decimales es la de tipo
		//double
		
		d = 5.99; //Puedo asignar un valor posterior a una variable
		//Pero ahora esa variable tomará ese valor, y el inicial
		//pues quedará en deshuso
		
		//Guardar nuestro codigo con Ctrl + S
		
		
		//TIPOS DE DATOS PRIMITIVOS
		// BOOLEANOS = Aceptan valores true or false
		//Caracter = admiten caracteres, letras, simbolos, espacios, etc
		
		boolean boo = true; //Sirven para evaluar ciertas condiciones o
		//expresiones
		
		char caracter = '?'; //Solo admiten un caracter y ocupan 2 bytes
		//Son capaces de guardar ese caracter entre comilla simple
		
		
		
		/*TIPOS DE DATOS OBJETO, 
		 * O TIPOS DE DATOS ESTRUCTURADOS
		 * 
		 */
		
		//String - Cadena de texto
		
		String cadena = "Esto es una cadena de texto";
		
		String nombre;
		
		nombre = "Jorge Alejandro";
		
		//Las cadenas de texto o tipo de dato String admiten 
		//caracteres, simbolos, espacios, letras, enunciados, números
		//pero siempre en formato de texto
		
		String numero = "150";
		
		//TIPOS DE DATOS OBJETO - ENVOLTORIO o WRAPPER
		//Son clases que le otorgan comportamientos o propiedades
		// a los tipos de datos primitivos
		
		Byte b1 = -128;
		Short sh1 = 123;
		Integer x;
		Long l2;
		Double d1;
		
		//Salida de datos o mostrarlos en consola
		
		System.out.println("Hola mundo");
		
		//Mostrar en pantalla el valor de una variable
		//El atajo para escribir esta linea es con
		//syso + Ctrl + espacio
		System.out.println(nombre);
		
		System.out.println(sh1);
		
		
	} //Llave de cierre del main
	
	
}//Llave de cierre de la clase
