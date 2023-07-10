package com;

import java.util.Scanner;

public class Ejercicio7_JDRA {

	public static void main(String[] args) {
		
		/* 7. El director de una escuela est� organizando un viaje de estudios y requiere determinar cu�nto 
		debe cobrar a cada alumno y cu�nto debe pagar a la compa��a de viajes por el servicio. La forma de 
		cobrar es la siguiente:
		* Si son 100 alumnos o m�s, el costo por cada alumno es de 65 euros.
		* De 50 a 99 alumnos, el costo es de 70 euros.
		* De 30 a 49 alumnos, el costo es de 95 euros.
		* Menos de 30 alumnos, el costo de la renta del autob�s es de 4000 euros, sin importar el n�mero de 
		alumnos.
		Realiza un algoritmo que permita determinar el pago a la compa��a de autobuses y lo que debe 
		pagar cada alumno por el viaje
		*/
		
		int numAlum;
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Cuantos alumnos asistiran al viaje de estudios? : ");
		numAlum = entrada.nextInt();
		

		if ( numAlum >= 100 ) {
			int costo = 65;
			int total = numAlum * costo;
			
            System.out.println("El pago a la compa�ia de autobuses es de $ " + total + " euros");
            System.out.println("El pago por alumno es de $ " + costo);
            
        } else if ( numAlum >= 50 && numAlum <= 99 ) {
        	int costo = 70;
			int total = numAlum * costo;
			
            System.out.println("El pago a la compa�ia de autobuses es de $ " + total + " euros");
            System.out.println("El pago por alumno es de $ " + costo);
            
        } else if( numAlum >= 30 && numAlum <= 49 ) {
        	int costo = 95;
			int total = numAlum * costo;
			
            System.out.println("El pago a la compa�ia de autobuses es de $ " + total + " euros");
            System.out.println("El pago por alumno es de $ " + costo);
            
        } else if( numAlum < 30 ) {
			int total = 4000;
			
            System.out.println("El pago a la compa�ia de autobuses es de $ " + total + " euros");
			
		} 

	}

}
