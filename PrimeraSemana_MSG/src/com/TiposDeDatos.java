package com; // Nombre del paquete

public class TiposDeDatos {  // Nombre de la clase

	public static void main (String[] args) {  // Apertura del metodo main
		
		/*
		 * Atajo para el metodo main ctrl + espacio
		 */
		
		//TIPO DE DATOS PRIMITIVOS
		//NUMERICOS
		
		//Declarar variables sin asignarles un valor inicial
		
		byte b;
		short s, k;
		int i;
		long l;
		
		
		//Variables declaradas con un valor asignado inicialmente
		
		byte by = -128;
		short sh = 32767;
		int i1 = 2147483647;
		long l1 = 2147483648l; // para aceptar valores mas alla de los valores int, necesita un sufijo "L" para poder aceptarlo
		
		/*
		 * TIPOS DE DATOS PRIMITIVOS
		 *  NUMERICOS EN PUNTO DECIMAL O COMA FLOTANTE
		 */
		
		float f = 789.6754f;  // para que acepte muchos decimales se le coloca el sufijo "F"
		double d = 10009.178907; 
		
		// la variable mas usada para numeros decimales es DOUBLE
		
		d = 5.99; // puedo asignar un valor posterior a una variable pero ahora esa variable tomara ese valor, y el incial quedara en deshuso
		
		// TIPOS DE DATOS PRIMITIVOS 
		//BOLEANOS Acepatn valores de verdadero o falso
		// Caracter admiten caracteres, letras, simbolos, espacios
		
		boolean boo = true; // sirven para evaluar ciertas condiciones 
		
		char caracter = '$'; // solo admiten un caracter y ocupan 2 bytes en memoria, son capaces de guardar ese carater entre comillas simples
		
		/*
		 * TIPOS DE DATOS OBJETOS O TIPOS DE DATOS ESTRUCTURADOS
		 */
		
		// STRING - cadenas de texto
		
		String cadena = "Esto es una cadena de texto";
		
		String nombre;
		nombre = "Manuel Sanchez";
		
		// ENVOLTORIO O WRAPPER
		// Son clases que le otorgan compportamientos o propiedad a los tipo de datos primitivos
		
		Byte b1 = -128;
		Short sh1 = 123;
		Integer x;
		Long l2;
		Double d1;
		
		
		// salida de datos mostrando en consola
		
		System.out.println("Hola Mundo");
		
		// Mostar en pantalla el valor de una variable
		//Atjo para escribir esta liena syso + Ctrl + esoacio
		
		System.out.println(nombre);
		
		System.out.println(sh1);
		
		
		
		
	} // llave de cierre del main
	
	
	
} // llave de cierre de la clase
