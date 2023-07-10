package com;

import java.util.Scanner;

public class Ejercicio07 { // Apertura Class

	public static void main(String[] args) { // Apertura Main
		
		int cantidad;
		int total;
		
		Scanner entrada1 = new Scanner(System.in);
			System.out.println("Cantidad de Alumnos que viajaran:");
			cantidad = entrada1.nextInt();
		
		if (cantidad < 30) {
			total = 4000 / cantidad;
			System.out.println("El total es de 4000 euros y cada alumno pagara " + total + " euros");
		} else if (cantidad >= 30 && cantidad <= 49) {
			total = 95 * cantidad;
			System.out.println("El total es de " + total + " euros y cada alumno pagara 95 euros");
		} else if (cantidad >= 50 && cantidad <=99) {
			total = 70 * cantidad;
			System.out.println("El total es de " + total + " euros y cada alumno pagara 70 euros");
		} else if (cantidad >= 100) {
			total = 65 * cantidad;
			System.out.println("El total es de " + total + " euros y cada alumno pagara 65 euros");
		} else {
			System.out.println("Introduce valores validos");
		}
		
		

	} // Cierre Main

} // Cierre Class
