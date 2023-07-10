package com.ciclos;

public class StringCiclos {

	public static void main(String[] args) {
		
		// Métodos de la clase String
		//Al ser una clase, un tipo de dato estructurado u objeto
		//Este puede tener comportamientos que nos ayudan a
		//devolver ciertos valores que pueden ayudarnos en
		//las cadenas de texto en este caso
		
		
//		String cadena = "Hoy es 5 de Julio de 2023";
//		
//		//.length() - Nos devuelve el tamaño de nuestra cadena
//		//de texto en un valor númerico entero
//		System.out.println(cadena.length());
//		
//		//.charAt - Nos devuelve el caracter que se encuentra
//		//en el indice o posicion especificado
//		System.out.println(cadena.charAt(5));
//		
//		//.substring - Nos devuelve una subcadena a partir
//		// de un indice especificado
//		System.out.println(cadena.substring(10));
//		
//		//.toLowerCase/.toUpperCase - El primero nos convierte
//		//toda la cadena de texto a minusculas
//		//y el segundo la convierte a mayusculas
//		System.out.println(cadena.toUpperCase());
//		
//		//.equals - Comparar el valor del String contra otro objeto
//		//o podemos comparar dos Strings
//		System.out.println(cadena.equals("Hoy es 5 de Julio de 2023"));
//		
//		//.equalsIgnoreCase - Compara un String contra otro e ignora
//		//el uso de mayusculas y minusculas
//		System.out.println(cadena.equalsIgnoreCase("hOy Es 5 De JuliO de 2023"));
		
		
		//CICLOS o también llamados bucles
		//Son estructuras que nos van a permitir repetir setencias
		//o procesos de acuerdo a una condición
		
		//while - Mientras (se cumpla una condicion)
		
//		int x = 1;
//		
//		while (x<5) { //Mientras x sea menor a 5, realiza lo siguiente
//			System.out.println("Hola mundo");
//			x++; //incrementamos el valor de x para que se rompa el ciclo
//		}
		
		
		//DO-WHILE - Ejecuta el codigo al menos una vez, y después pregunta
		//si se sigue realizando
		//Aseguramos que se ejecute nuestro programa al menos una vez
		//Si es que nos topamos con un panorama en el que haya una condición
		//"imposible"
		
//		int y = 5;
//		
//		do {
//			System.out.println("Hola mundo");
//		}while(y>6);
		
		
		
		//FOR (Para las siguientes condiciones o argumentos)
		
		//for (variable de control; condición; incremento de la variable)
		for (int i = 1; i < 5; i++) {
			System.out.println("Hola mundo");
		}
		
		

	}

}
