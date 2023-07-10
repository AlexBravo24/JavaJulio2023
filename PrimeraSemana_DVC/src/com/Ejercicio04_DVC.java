package com;

import java.util.Scanner;

public class Ejercicio04_DVC {
    public static void main(String[] args) {
    
        Scanner entrada = new Scanner(System.in);

     
        System.out.print("Ingresa una cadena: ");
        String cadena = entrada.nextLine();

        // Verificar si la cadena contiene solo una letra y es may�scula
        
        if (cadena.length() == 1 && Character.isUpperCase(cadena.charAt(0))) {
            System.out.println("La cadena ingresada es una letra may�scula.");
        } else {
            System.out.println("La cadena ingresada no es una letra may�scula.");
        }
//        se utiliza el m�todo Character.isUpperCase() para verificar si el primer car�cter de 
//        la cadena es una letra may�scula. La condici�n adicional cadena.length() == 1 se utiliza 
//        para asegurarse de que la cadena contenga solo un car�cter.
        
        
    }
}
