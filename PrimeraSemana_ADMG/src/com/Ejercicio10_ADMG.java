package com;

import java.util.Scanner;

public class Ejercicio10_ADMG {

	//Realiza un programa que pida un n�mero entero entre uno y doce e imprima el n�mero de d�as que tiene el 
	//mes correspondiente.

	
	
	public static void main(String[] args) {
		
		//Realiza un programa que pida un n�mero entero entre uno y doce e imprima el n�mero de d�as que tiene el 
		//mes correspondiente.
		
		Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese un n�mero entero entre 1 y 12: ");
        int numeroMes = scanner.nextInt();

        int diasMes;

        if (numeroMes == 1) {
            diasMes = 31;
        } else if (numeroMes == 2) {
            diasMes = 28;
        } else if (numeroMes == 3) {
            diasMes = 31;
        } else if (numeroMes == 4) {
            diasMes = 30;
        } else if (numeroMes == 5) {
            diasMes = 31;
        } else if (numeroMes == 6) {
            diasMes = 30;
        } else if (numeroMes == 7) {
            diasMes = 31;
        } else if (numeroMes == 8) {
            diasMes = 31;
        } else if (numeroMes == 9) {
            diasMes = 30;
        } else if (numeroMes == 10) {
            diasMes = 31;
        } else if (numeroMes == 11) {
            diasMes = 30;
        } else if (numeroMes == 12) {
            diasMes = 31;
        } else {
            diasMes = -1; // Valor inv�lido
        }

        if (diasMes != -1) {
            System.out.println("El mes correspondiente al n�mero ingresado tiene " + diasMes + " d�as.");
        } else {
            System.out.println("ERROR: n�mero incorrecto");
            
        }
	}
}
		
		
		
		

	

