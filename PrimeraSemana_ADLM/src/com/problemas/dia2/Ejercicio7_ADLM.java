package com.problemas.dia2;

import java.util.Scanner;

public class Ejercicio7_ADLM {

	public static void main(String[] args) {
		/* 7. El director de una escuela está organizando un viaje de estudios y requiere determinar cuánto 
			debe cobrar a cada alumno y cuánto debe pagar a la compañía de viajes por el servicio. 
			La forma de cobrar es la siguiente:
		 	* Si son 100 alumnos o más, el costo por cada alumno es de 65 euros.
		 	* De 50 a 99 alumnos, el costo es de 70 euros.
		 	* De 30 a 49 alumnos, el costo es de 95 euros.
		 	* Menos de 30 alumnos, el costo de la renta del autobús es de 4000 euros, sin importar 
		 	el número de alumnos.
			Realiza un algoritmo que permita determinar el pago a la compañía de autobuses y lo que debe 
			pagar cada alumno por el viaje.*/
		Scanner entrada = new Scanner(System.in);
		System.out.println("Ingresa el numero de alumnos");
		int alumnos = entrada.nextInt();
		double costoAlumno, costoTotal;
		if(alumnos >= 100) {
			System.out.println("Cada alumno paga 65 euros");
			System.out.println("El pago total es " + alumnos * 65 + " euros");
		}else if(alumnos >= 50) {
			System.out.println("Cada alumno paga 70 euros");
			System.out.println("El pago total es " + alumnos * 70 + " euros");
		}else if(alumnos >= 30) {
			System.out.println("Cada alumno paga 95 euros");
			System.out.println("El pago total es " + alumnos * 95 + " euros");
		}else {
			System.out.println("Cada alumno paga " + (4000 / alumnos) +" euros");
			System.out.println("El pago total es 4000 euros");
		}
	}

}
