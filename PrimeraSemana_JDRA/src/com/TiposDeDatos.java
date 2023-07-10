package com;

public class TiposDeDatos {
	
	public static void main(String[] args) {
		
		// comentarios 1 linea
		
		/* comentarios 
		 * de 
		 * varias 
		 * lineas
	     */
		
		/* TIPOS DE DATOS PRIMITIVOS
		 * NUMERICOS ENTEROS
		 */
		
		// DECLARAR VARIABLES SIN ASIGNARLES UN VALOR INICIAL
		
		byte b;
		short a, c;
		int i;
		long l;
		
		//VARIABLES DECLARADAS CON UN VALOR ASIGNADO INICIALMENTE
		
		byte by = -128;
		short sh = 32767;
		int i1 = 2147483647;
		long l1 = 2147483648L; //para aceptar numeros > rango int necesita un sufijo "l/L" para aceptarlo
		
		// la variable mas comun para guardar datos numericos enteros es tipo INT
		
		
		
		/* TIPOS DE DATOS PRIMITIVOS
		 * NUMERICOS EN PUNTO DECIMAL O COMA FLOTANTE
		 */
		
		float f = 123.504f; //4 bytes
		double d = 12904.6854; //NO NECESITAN SUFIJO "F" / 8 bytes
		
		// la variable mas comun para guardar decimales es tipo DOUBLE
		
		d = 5.99;  // puedo asignar un valor posterior a una variable pero ahora esa 
		//variable tomara el nuevo valor
		
		
		
		/* TIPOS DE DATOS PRIMITIVOS
		 * BOOLEANOS = ACEPTAN VALORES TRUE OR FALSE
		 * caracter = admiten caracteres, letras, simbolos, espacios, etc
		 */
		
		boolean boo = true; //sirven para evauar ciertas condiciones o expresiones
		
		char caracter = 'a'; //solo admite un caracter y ocupan 2 bytes
		
		
		
		
		
		/* TIPOS DE DATOS OBJETO O TIPO DE DATOS ESTRUCTURADOS
		 * 
		 */
		
		//String = cadena de texto
		
		String cadena = "Esto es una cadena de texto";
		
		String nombre;
		
		nombre = "Juan Diego Reza Arce";
		
		// las cadenas de texto o tipo de dato String admiten caracteres, simbolos, espacios, letras
		// enunciados, numeros pero siempre en formato de texto
		
		String numero = "123";
		
		
		
		
		/* TIPOS DE DATOS OBJETO - ENVOLTORIO O WRAPPER
		 * 
		 * Son clases que le otorgan comportamientos o propiedades a los tipos de datos primitivos
		 * 
		 */
		
		Byte b1 = -128;
		Short sh1 = 123;
		Integer x;
		Long l2;
		Double d1;
		
		
		
		//Salida de datos o mostrarlos en consola 
		
		// System.out.print( variable / "Hola Mundo" );
		
		System.out.println("Hola Mundo");
		
		//mostrar el valor de una variable
		// atajo syso + Ctrl + espacio 
		
		System.out.println(nombre);
		
		System.out.println(sh1);
		
		
		
		
		
		
		
		
		
		
	}

}
