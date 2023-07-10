package com;

import java.util.Scanner;

public class Ejercicio5_BAFV {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        /*
         	5. Realiza un programa que calcule la aceptación de una solicitud en base a los siguientes 
			parámetros: edad, nota y sexo.
			Mínimo: Nota (5), edad (18), sexo M -> POSIBLE
 			Mínimo: Nota (5), edad (18), sexo F -> ACEPTADA
 			Otros casos -> NO ACEPTADA
        */

        System.out.print("Ingrese la edad: ");
        int edad = entrada.nextInt();

        System.out.print("Ingrese la nota: ");
        int nota = entrada.nextInt();

        System.out.print("Ingrese el sexo (M/F): ");
        char sexo = entrada.next().charAt(0);

        if (nota >= 5 && edad >= 18) {
            if (sexo == 'M') {
                System.out.println("POSIBLE");
            } else if (sexo == 'F') {
                System.out.println("ACEPTADA");
            } else {
                System.out.println("NO ACEPTADA");
            }
        } else {
            System.out.println("NO ACEPTADA");
        }
    }
}

