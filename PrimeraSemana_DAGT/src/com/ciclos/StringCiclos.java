package com.ciclos;

public class StringCiclos {

	public static void main(String[] args) {
		/* Metodos de la clase String
		 * Al ser una clase, un tipo de dato estructurado u objeto
		 * Este puede tener comportamientos que nos ayudan a 
		 * devolver ciertos valores que puedan ayudarnos en
		 * las cadenas de texto en este caso
		 */
		
		String cadena = "Hoy es 5 de Julio de 2023";
		String cadena2 = "Hoy es 6 de Julio de 2023";
		// .length()- Devuelve el tamaño de nuestra cadena
		//de texto en un valor numerico entero
		
		System.out.println(cadena.length());
		
		//.charAt - Devuelve el caracter que se encuentra
		//en el indice o posicion especificada
		System.out.println(cadena.charAt(5));
		
		
		//.substring - Devuelve una subcadena a partir de un indice especificado
		System.out.println(cadena.substring(5,15));

		/*.toLowerCase - Convierte el valor de la cadena a minusculas
		 *.toUppperCase - Convierte el valor de la cadena a mayusculas
		 */
		
		System.out.println(cadena.toLowerCase());
		System.out.println(cadena.toUpperCase());
		
		//.equals - Compara el valor del string contra otro objeto, o se puede comparar con otro String
		System.out.println(cadena.equals("Hoy es 5 de Julio de 2023"));
		
		//.equalsIgnoreCase - Compara un String contra otro e ignora el uso de mayusculas
		System.out.println(cadena.equalsIgnoreCase("HoY es 5 DE JuliO de 2023"));

	
		int x = 1;
		
		while (x<10) {
			System.out.println(x);
			x++;
		}
	
		/*Do-While - Ejecuta el codigo al menos una vez, y despues pregunta
		 * si se sigue realizando
		 * Aseguramos que se ejecute nuestro programa al menos una vez
		 * Si es que nos topamos con un panorama en el que haya una condcion "imposible
		 */
		
		int y = 5;
		do {
			System.out.println("Hola mundo");
		}while (y>6);
		
		
		for (int i = 0; i <= 5 ;i++) {
			System.out.println(i);
		}
		
		
		
	
	
	}

	
	
	
}
