package com; //Nombre del paquete 

public class TiposDeDatos { //Nombre de la clase y su llave de apertura 

	public static void main (String [] args) {  //Apertura del metodo main
		
		// comntarios de una sola linea
		/*
		 * Comentarios
		 * de multiple
		 * liena
		 * 
		 * Atajo del metodo main (escribimos la palabra main 
		 * Ctrl + espacio=
		 */
		
		/*
		 * Tipos de Datos 
		 * N�mericos enteros
		 */
		
		// Declarar variables sin asiganrle sun valor inicial
		
		byte b;
		short s, k;
		int i;
		long l;
		
		// Varibales delcaradas con una vlor asignado inicialmente
		
		byte  by = -127; //1 byte 
		short sh = 32767; //2 bytes
		int i1 = 2147483647; // 4 bytes 
		long l1 = 2147483648L;   //Para aceptar valores m�s alla del rango de int, 
		//necesita un sufijo "L" para poder aceptarlo
		
		//La variables m�s com�n para guardar datos n�mericos enteros
		// es la tipo int
		
		/*
		 * Tipos de datos primitivos
		 * N�mericos en punto decimal o coma flotante 
		 * 
		 */
		
		float f =  789.6754f; // 4 bytes, Necesita un sufijo "F" para poder caeptar 
		double d = 10009.178907; // 8 bytes de memoria 
		
		// la variable m�s compun utilizada para decimales es la de tipo
		//double
		
		d = 5.99;  // Puedo asignar un valor posterior a una varible
		// Pero ahora tomar� el nuevo valor y el inicial
		// se  reemplazar�, pero antes de su reemplanzo aun se puede usar
		// la variable inicial 
		   
		// Guardar c�digo con "Ctrl + S"
		
		// TIPOS DE DATOS PRIMITIVOS 
		// BOOLEANOS = Aceptan valores true or false
		//Carcater = admiten caracteres, letras, simbolos, espacios, etc
		
		boolean boo = true; // Sirven para evaluar ciertas condiciones o expresiones
		
		char caracter = '%';  //solo admited un caracter y ocupan 2 bytes
		// Son capaces de guardar ese caracter entre comilla simple (alt  + 39)
		
		
		/* Tipos de DATOS OBJETOS
		 * O TIPOS DE DATOS ESTRUCTURADOS
		 */
		
		//String - Cadena de Texto
		
		//String siempre debe ir en mayuscula la letra inicial
		
		String cadena = "Esto es una cadena de texto"; 
		
		String nombre;
		
		nombre = "Daniel Valdivia";
		
		//Las cadenas de texto o tipo de dato string admiten 
		//caracteres, sibolos, espacios, letras, enunciados, n�meros
		//pero siempre en formato de texto 
		
		String numero = "150";  // se reconoce como texto no como un n�mero
		
		//Tipos de datos objeto  - Envoltorio o WHAPPER
		//Son clases le otrogan comportamientos o propiedades
		//a los tipos de datos primitivos
		//Los tipos de datos ahora inician con mayuscula 
		
		Byte b1 = -128;
		Short sh1 = 123;
		Integer x;
		Long l2;
		Double d1;
		
		//Salda de datos o mostrarlos en consola
		
		System.out.println("Hola Mundo");
		
		//Mostrar en pantalla el valor de una variable
		//el atajo para escribir est� linea es con
		//syso + Ctrl + espacio
		
		System.out.println(nombre);
			
		System.out.println(sh1);
		
	} //Llave de cierre del main 
	
	
} // Llave de cierre de la clase
