package com.ciclos;

public class StringCliclos {

	public static void main(String[] args) {
		
		// Métodos de la clase String
		//Al ser una clase, un tipo de dato estructurado u objeto
		//Este puede tener comportamientos que nos ayudab a
		//devolver ciertos valores que pueden ayudarnos en
		// las cadeas de texto en este caso
		
//		String cadena = "Hoy es 5 de Julio de 2023";
//		
//		// .length()  nos devuelve el tamaño de nuestra cadena de texto
//		//en un valor numerico entero
//		System.out.println(cadena.length());
//		//25
//		
//		// .charAt - Nos devuelve el caracter que se encuentra 
//		//en el indic o posición especificado
//		System.out.println(cadena.charAt(5));
//		//S
//		
//		// .substring - Devolver una subcadena a partir 
//		//de un indice especificado
//		System.out.println(cadena.substring(10));
//		//e Julio de 2023
//		
//		//.tolwerCase/ .toUpperCase - 
//		//El primero convierte toda la cadea a ninusculas
//		//El segundo lo comvierte todo a MAYUSCULAS
//		System.out.println(cadena.toLowerCase());
//		//hoy es 5 de julio de 2023
//		System.out.println(cadena.toUpperCase());
//		//HOY ES 5 DE JULIO DE 2023
//		
//		// .equals - Comparar el valor del String contra otro objeto
//		//o podemos comparar dos Strings 
//		System.out.println(cadena.equals("Hoy es 7 de Julio de 2023"));
//		//false
//		System.out.println(cadena.equals("Hoy es 5 de Julio de 2023"));
//		//true
//		
//		// .equalsIgnoresCase - Compara un String contra otro e ignora
//		//el uso de mayusculas y minusculas
//		System.out.println(cadena.equalsIgnoreCase("hoy Es 5 de julio De 2023"));
//		//true
		
		//Ciclo o tambien llamados buvles
		//Son estructuras que nos van a permitir repetir setencias
		//o procesos de acuerdo a una condición
		
		//while - mientras se cumpla una condición se termina el proceso
//		int x = 1;
//		
//		while (x < 5) { //Mientras x < 5 el ciclo no termina
//			System.out.println("Hola mundo");
//			x ++; //para romper el ciclo incrementamos el valor de x
//		}
		
		//DO-WHILE - Ejecuta el codigo al menos una vez, y despues pregunta
		// si se sigue realizando
		//aseguramoss que se ejecute el programa almenos una vez
		//Si es que nos topamos con un paranoma en el que haya una condición 
		//"imposible"
		
//		int y = 5;
//		do {
//			System.out.println("Hola mundo");	
//		}while (y>6);
		
		// FOR - Para las siguientes codiciones o argumentos
		// for (variable de control, codición, incremento de la variable)
		for (int i = 1; i < 5; i++) {
			System.out.println("Hola Mundo");
		}

	}

}
