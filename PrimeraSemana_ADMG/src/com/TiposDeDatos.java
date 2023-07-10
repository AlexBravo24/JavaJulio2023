package com;//Nombre del paquete

public class TiposDeDatos {//Nombre de la clase y llave de apertura
	
	public static void main(String[] args) {//Apertura del main
		
		
		//Comentarios de una sola linea
		
		/*comentario
		 * de multiples
		 * lienas
		 * 
		 * Atajo para el metodo main (escribimos la palabra main Ctrl + espacio)
		 */
		
	
	
	/*
	 * TIPO DE DATOS PRIMITIVOS
	 * NUMEROS ENTEROS
	 */

	//Derclarar variables sin asignarles un valor inicial
	
	byte b; 
	short s, k;
	int i;
	long l;
	
	//Variables declaradas con un valor asignado inicialmente
	
	byte by = -128;
	short sh = 32767;
	int i1 = 2147483647;
	long l1 = 2147483648l;//Para aceptar valores mas alla del rango de los int, necesita un sufijo "L"
	//para poder aceptarlo
	
	//La variable mas comun para guardar datos numericos enteros en la tipo int
	
	/*TIPOS DE DATOS PRIMITIVOS
	 * NUMERICOS EN PUNTO DECIMAL O COMA FLOTANTE  
	 */
	
	float f = 784.6754f;//4 bytes
	double d = 10009.178907; //8 bytes
	
	//La variable mas comun utilizada para decimales es la de tipo double 
	
	d = 5.99; //Puedo asignar un valor posterior a una variable pero ahora esa variable
	//tomara ese valor, y el incial pues quedara en deshuso
	
	//Guardar nuestro codigo con Ctrl + S
	
	/*TIPO DE DATOS PRIMITIVOS
	 * BOOLEANOS = Aceptan valores true or false
	 * Caracter = admiten caracteres, simbolos, letras, espacios, etc
	 */
	
	boolean boo = false;//sirven para evaluar ciertas condiciones o expresiones
	
	char caracter = '?';//solo admiten un caracter y ocupan 2 bytes son capaces de guardar
	//ese caracter entre comilla simple
	
	
	
	/*TIPOS DE DATOS OBJETO, 
	 * O TIPOS DE DATOS ESTRUCTURADOS 
	 * 
	 */
	
	//String - Cadena de texto 
	
	String cadena = "Esto es una cadena de texto";
	
	String nombre;
	
	nombre = "Angel";
	
	//LAs cadenas de texto o tipo de dato String admiten caracteres, simbolos, espacios,
	//letras, enunciados, numeros, pero siempre en formato de texto
	
	String numero = "150";
	
	
	//TIPOS DE DATOS OBJETO - ENVOLTORIO O WRAPPER
	//Son clases que se le otorgan comportamientos o propiedades a los tipod de datos
	//primitivos
	
	Byte b1 = -127;
	Short sh1 = 123;
	Integer x;
	Long l2;
	Double d1;
	
	//Salida de datos o mostrarlos en consola
	
	System.out.println("Hola mundo");
	
	//Mostrar en pantalla el valor de una variable 
	//El atajo para escribir esta linea es con
	// syso + Ctrl + espacio
	System.out.println(nombre);
	
	System.out.println(sh1);
	
	
	
	
	
	
	
	
	}//Llave del cierre del main
			
			
			
			
			
			
			
			
			
}//Llave del cierre de la clase

