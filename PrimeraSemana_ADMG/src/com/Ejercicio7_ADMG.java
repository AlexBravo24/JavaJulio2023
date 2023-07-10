package com;

import java.util.Scanner;

public class Ejercicio7_ADMG {

	public static void main(String[] args) {
		
//		//El director de una escuela está organizando un viaje de estudios y requiere determinar cuánto 
//		debe cobrar a cada alumno y cuánto debe pagar a la compañía de viajes por el servicio. La forma de 
//		cobrar es la siguiente:
//		* Si son 100 alumnos o más, el costo por cada alumno es de 65 euros.
//		* De 50 a 99 alumnos, el costo es de 70 euros.
//		* De 30 a 49 alumnos, el costo es de 95 euros.
//		* Menos de 30 alumnos, el costo de la renta del autobús es de 4000 euros, sin importar el número de 
//		alumnos.
//		Realiza un algoritmo que permita determinar el pago a la compañía de autobuses y lo que debe 
//		pagar cada alumno por el viaje.
		
		Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el número de alumnos: ");
        int numAlumnos = scanner.nextInt();

        int costoAlumno;
        int costoTotal;

        if (numAlumnos >= 100) {
            costoAlumno = 65;
            costoTotal = numAlumnos * costoAlumno;
        } else if (numAlumnos >= 50) {
            costoAlumno = 70;
            costoTotal = numAlumnos * costoAlumno;
        } else if (numAlumnos >= 30) {
            costoAlumno = 95;
            costoTotal = numAlumnos * costoAlumno;
        } else {
            costoAlumno = 0; 
            costoTotal = 4000;
        }

        System.out.println("El costo por alumno es de: " + costoAlumno + " euros.");
        System.out.println("El pago a la compañía de autobuses es de: " + costoTotal + " euros.");


		
		
		
	}

}
