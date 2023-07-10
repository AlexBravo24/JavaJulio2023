package com.ciclos;

public class StringCiclos {

	public static void main(String[] args) {
		
//		// Metodos de la clase String
//		// Al  ser una clase, un tipo de dato estructurado u objeto este puede tener comportamientos que nos 
//		// ayudan a devolver ciertos valores que pueden ayudarnos en las cadenas de texto en este caso
//		
//		String cadena = "Hoy es 5 Julio del 2023";
//		
//		// .length() - Nos devuelve el tamaño de nuestra cadena de texto en un valor numerico entero
//		
//		System.out.println(cadena.length());
//		
//		// .chatArt() - Nos devuelve el caracter que se encuentra en el indice o posicion especifica
//		
//		System.out.println(cadena.charAt(5));
//		
//		// .substring - Nos devuelve una subcadena a partir de un indice especificado
//		
//		System.out.println(cadena.substring(10));
//		
//		// .toLowerCase / .toUpperCase - El primero nos convierte toda la cadena de texto a minisculas y el
//		// segundo la convierte a mayusculas
//		
//		System.out.println(cadena.toLowerCase());
//		System.out.println(cadena.toUpperCase());
//		
//		// .equals - Comparar el valor del String contra otro objeto o podemos comparar dos Strings
//		System.out.println(cadena.equals("Hoy es 5 Julio del 2023"));
//		
//		// .equalsIgnoreCase - compara un String contra otro e ignora el uso de mayusculas y minusculas
//		System.out.println(cadena.equalsIgnoreCase("hOy Es 5 Julio del 2023"));
		
		
		// CICLOS o tambien llamados bucles
		// Son estructuras que nos van a permitir repetir sentencias o procesos de acuerdo a una condicion
		
		// while - Miestras (se compla una condicion)
		
		int x = 1;
		
		while ( x < 5 ) { //miestras x sea menor a 5 realiza lo siguiente
//			System.out.println("Hola Mundo");
			
			x++; //incrementa el valor de x para que se rompa el ciclo
		}
		
		// DO-WHILE - Ejecuta el codigo al menos una vez, y despues pregunta si se sigue realizando
		// Aseguramos que se ejecute al menos 1 vez el programa
		
//		int y = 5;
//		
//		do {
//			System.out.println("Hola Mundo");
//			
//		} while (y>6);
		
		// FOR (para las siguientes condiciones o argumentos)
		
		for (int i = 1; i < 5; i++) {
			System.out.println("Hola Mundo");
			
		}
		

	}

}
