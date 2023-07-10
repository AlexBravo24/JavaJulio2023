package com;

import java.util.Scanner;

public class ejercicios_cliclos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//ejercicio 1:programa un logaritmo que realice la tabla del 12 
//		int x = 1;
//		int y = 12;
//		while(x <= 10 ) {
//		System.out.println(y + " x "+ x + " = " + y * x);
//		x++;
//		}

//ejercicio 2: programa un logaritmo que que realice la tabla de multiplicar
		// de un numero introducido desde teclado, hasta la iteracion deseada por el
		// usuario.
//		Scanner sc = new Scanner(System.in);
//		System.out.println("ingrese el numero multiplicador");
//		int factor1 = sc.nextInt();
//		System.out.println("ingrese hasta que numero desea multiplicar");
//		int factor2 = sc.nextInt();
//		int factor3 = 1;
//		while(factor3<= factor2) {
//			System.out.println(factor1 + " x "+ factor3 + " = " + factor1 * factor3);
//			factor3++;
//		}

// ejercicio 3: realiza un codigo para determinar si un string es un palindromo 
//		Scanner sc= new Scanner(System.in); 
//				
//		System.out.println("introduzca la plabra o frase");
//		String palabra= sc.nextLine();
//		String palabraSinEspacios= palabra.replaceAll("\\s",""); //quita los espacios de la frase introducida
//		String palabraInvertida = "";
//		for(int i = palabraSinEspacios.length()-1; i>=0; i--) {
//			palabraInvertida += palabraSinEspacios.charAt(i);
//		}
//		if(palabraSinEspacios.equals(palabraInvertida)) {
//			System.out.println("es palindrom");
//		}else {
//			System.out.println("no es palindromo");
//		}

//ejercicio 4: Programa que reciba una frase y una letra por teclado. Deberá retornar como resultado 
		// cuántas veces existe esa letra dentro de la frase. Si no existe, imprimir un
		// mensaje
		// “Carácter no encontrado".

//ejercicio 5: 	Simular el comportamiento de un reloj digital, imprimiendo la hora, minutos y segundos 
		// de un día desde las 00:00:00 horas hasta las 23:59:59 horas

//		int horas = 24;
//		int minutos = 60;
//		int segundos = 60;
//		for (int h = 0; h < horas; h++) { // for anidado
//			for (int m = 0; m < minutos; m++) {// for anidado
//				for (int s = 0; s < segundos; s++) {// for anidado
//					System.out.println(h + ":" + m + ":" + s);
//				}
//			}
//		}

//ejercicio 6: Una persona desea invertir $1000.00 en un banco, el cual le otorga un 2% de interés 
		// mensual. ¿Cuál será la cantidad de dinero que esta persona tendrá al cabo de
		// un año si
		// todo el dinero lo reinvierte?

//		double inversion = 1000.00;
//		double interes = 20;
//		int meses = 12;
//		for (int m = 1; m <= meses; m++) {
//			System.out.println("mes" + m);
//			System.out.println( " interes " + (m * interes));	
//		}

		
//ejercicio 7: Una persona desea invertir $700.00 en un banco, el cual le otorga un 2% de interés 
               //mensual. ¿En cuántos meses tendrá más de $1500, si reinvierte cada mes todo su 
		       //dinero?
		
//		double inversion = 700;
//		int meses = 0;
//		double interes = 0.02;
//		while (inversion < 1500) {
//			inversion += inversion * interes;// += se llama agregar 
//			meses++;
//		}
//		System.out.println("se obtendran 1500 en:" + meses + "meses");


		
		
		
	}
}