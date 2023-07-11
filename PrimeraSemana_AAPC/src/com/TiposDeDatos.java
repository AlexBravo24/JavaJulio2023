package com; // Nombre del paquete 

public class TiposDeDatos { // Nombre de la clase y llave 

	public static void main(String[] args) { // Apertura del main
		
		// Comentarios de una sola línea 
		
		
	
	/*
	 * comentarios 
	 * de 
	 * multiples
	 * lineas
	 * Aumentar tamaño de fuente ctrl y simbolo + 
	 * disminuirlo ctrl y simbolo -
	 * Atajo para el metodo main (escribimos main ctrl espacio)
	 * 
	 *
	 *	 */
	/*
	 * Tipos de datos primitivos
	 * numericos enteros
	 */
	// Declarar variables sin asignarles un valor inicial
	
	byte b;
	short s, k;
	int i;
	long l;
	
	//Variables declaradas con un valor asignado inicialmente
	
	byte by = -128; // 1 byte de memoria 
	short sh = 32767;// 2 bytes
	int i1 = 2147483647; // 4 bytes 
	long l1 = 2147483648L; // Para aceptar valores mas alla del rango del int, 
	//necesita un sufijo L para poder aceptarlo
	
	//La variable mas comun para guardar datos numericos enteros es la tipo int
	
	/*Tipos de datos primitivos
	 * numericos en punto decimal o coma flotante
	 * 
	 */
	float f = 789.6754f; //4 bytes, para aceptar valores con decimal, requiere un sufijo F
	double d = 10009.178907;//8 bytes
			
	//La variable más común utilizada para decimales es la de tipo double
	
     d= 5.99; // puedo asignar un valor posterior a una variable 
     // pero ahora esa variable tomara ese valor, y el inicial queda en deshuso
     // Guardar nuestro codido con ctrl + S
     
     
     
    /* Tipos de datos primitivos
     * Boleanos - aceptan valores true or false 
     * Caracter - admiten caracteres, letras, simbolos, espacios, etc
     */

     boolean boo = true; // sirven para evaluar ciertas condiciones o expresiones
     
     char caracter = '?';// solo admiten un caracter y ocupan 2 bytes de memoria 
     // son capaces de guardar ese caracter entre comilla simple
     
     /*Tipos de datos objeto,
      * o tipos de datos estructurados
      * 
      */
     //STRING- Cadena de texto 
     
     String cadena = "Esto es una cadena de texto";
     String nombre;
     nombre = "Andre Alexis";
     
     //Las cadenas de texto o tipo de dato string admiten 
     // caracteres, simbolos, espacios, letras, enunciados, números 
     // pero siempre en formato de texto 
     String numero= "150";
     
     /*TIPOS DE DATOS OBJETO - ENVOLTORIO O WRAPPER
      * Son clases que otorgan comportamientos o propiedades 
      * a los tipos de datos primitivos 
      */
     
     Byte b1=-128;
     Short sh1 = 123;
     Integer x;
     Long l2;
     Double d1;
     
    //Salida de datos o mostrarlos en consola
	//Mostrar en pantalla el valor de una variable 
     // el atajo para escribir esta linea es con syso + ctrl

    System.out.println("Hola mundo");
    
    
    
    System.out.println(nombre);
    
    
    System.out.println(sh1);   
    
	} // Llave del cierre del main
}     