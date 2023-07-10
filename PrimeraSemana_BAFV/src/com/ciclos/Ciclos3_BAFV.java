package com.ciclos;

import java.util.Scanner;

public class Ciclos3_BAFV {
    public static void main(String[] args) {
    	
    	/*3. Realiza un programa para determinar si un String es palíndromo. */
        
    	Scanner entrada = new Scanner(System.in);

        System.out.print("Ingrese una palabra: ");
        String palabra = entrada.nextLine();
        
        // Eliminar espacios y convertir a minúsculas
        palabra = palabra.replace(" ", "").toLowerCase();

        // Comparar la palabra original con su reverso
        //StringBuilder es una clase que permite crear un objeto que en este caso es llamado reverso
        // al final se obtiene llamando a toString()
        String reverso = new StringBuilder(palabra).reverse().toString();
    
        
        if (palabra.equals(reverso)) { //utlizamos equals ya que estmos comparando un objeto
            System.out.println("La palabra es un palíndromo.");
        } else {
            System.out.println("La palabra no es un palíndromo.");
        }
        
    }

    
}
