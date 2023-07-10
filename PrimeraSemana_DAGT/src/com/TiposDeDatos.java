package com; //Nombre del paquete

public class TiposDeDatos { //Nombre de la clase
 
	public static void main(String[] args) { //Metodo principal main
				
		/**
		 * Valores maximos de los tipos de datos
		 */
		
		byte by = 127; // 1 byte de memoria
		short sh = 32767; // 2 bytes de memoria
		int i = 2147483647; // 4 bytes de memoria
		long l = 2147483648L; // 8 bytes de memoria, para aceptar valores mas alla del rango de los int necesita un sufio L para aceptarlo
		
		/*Tipos de datos primitivos
		 * numerios en punto decimal o tipo flotante
		 */
		
		float f = 789.12345f; // Necesitan sufijo f para ser aceptados, usan 4 bytes 
		double d = 12123123.123123123123; //No necesitan el sufijo, usan 8 bytes
		
		
		d = 123456.123456; //reasignacion de valor de la variable 
		
		/*Tipos de datos primitivos
		 * Booleanos = Aceptan valores true or false
		 * Caracter =  admiten caracteres, letras, simbolos, espacios, etc
		 */
		
		boolean boo = true;
		char caracter = 'a'; //usan 2 bytes en memria, usar comilla simple
		char test = '?';
		
		
		/*Tipos de datos Objeto
		 * o tipos estructurados
		 * String - Cadenas de Texto con comillas dobles Empiezan con Mayuscula
		 */
		
		String str = "Esto es una cadena de texto";
		String nombre;
		nombre = "Diego Guajardo";
		
		/*Tipos de datos Objeto - Envoltorio o Wrapper
		 * Son clases que le otorgan comportamientos o propiedades
		 * a los tipos de datos primitivos
		 */
		
		Byte b1 = -127;
		Short ss = 123;
		Integer x = 123456;
		Long w = 123123L;
		Double d1;
		
		
		//Salida de datos o mostrarlos en consola
		System.out.println("Hola mundo");
		
		//Mostrar en pantalla el valor de una variable
		System.out.println(nombre);
		System.out.println(ss);
		
		
		
	}// Cierre Main

} //Cierre clase
