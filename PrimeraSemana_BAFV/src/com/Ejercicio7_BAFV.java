package com;

import java.util.Scanner;

public class Ejercicio7_BAFV {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Ingrese el número de alumnos en el viaje: ");
        int numAlumnos = entrada.nextInt();

        double costoAlumno;
        double pagoCompania;

        if (numAlumnos >= 100) {
            costoAlumno = 65;
        } else if (numAlumnos >= 50) {
            costoAlumno = 70;
        } else if (numAlumnos >= 30) {
            costoAlumno = 95;
        } else {
            costoAlumno = 4000.0 / numAlumnos; // se dividen los 4000 entre el número total de alumnos
        }

        pagoCompania = costoAlumno * numAlumnos;

        System.out.println("El costo por alumno es: " + costoAlumno + " euros");
        System.out.println("El pago a la compañía de autobuses es: " + pagoCompania + " euros");
    }
}

