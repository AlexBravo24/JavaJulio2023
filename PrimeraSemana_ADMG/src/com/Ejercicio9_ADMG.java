package com;

import java.util.Scanner;

public class Ejercicio9_ADMG {

	public static void main(String[] args) {
		
		//Realiza un programa que pida el día de la semana (del 1 al 7) y escriba el día correspondiente. Si 
		//introducimos otro número nos da un error

		Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el número del día de la semana (1 al 7): ");
        int numeroDia = scanner.nextInt();

        String diaSemana;

        if (numeroDia == 1) {
            diaSemana = "Lunes";
        } else if (numeroDia == 2) {
            diaSemana = "Martes";
        } else if (numeroDia == 3) {
            diaSemana = "Miércoles";
        } else if (numeroDia == 4) {
            diaSemana = "Jueves";
        } else if (numeroDia == 5) {
            diaSemana = "Viernes";
        } else if (numeroDia == 6) {
            diaSemana = "Sábado";
        } else if (numeroDia == 7) {
            diaSemana = "Domingo";
        } else {
            diaSemana = "ERROR: número incorrecto";
        }

        System.out.println("El día correspondiente al número ingresado es: " + diaSemana);
		
		
		
	}

}
