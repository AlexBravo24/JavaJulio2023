package com.ciclos;

import java.util.Scanner;

public class Ciclos4_BAFV {
    public static void main(String[] args) {
    	
    	/*
    	 
    	  4.Programa que reciba una frase y una letra por teclado. Deberá retornar como resultado 
			cuántas veces existe esa letra dentro de la frase. Si no existe, imprimir un mensaje 
			“Carácter no encontrado”.
    	 */
        Scanner entrada = new Scanner(System.in);

        System.out.print("Ingrese una frase: ");
        String frase = entrada.nextLine();

        System.out.print("Ingrese una letra: ");
        char letra = entrada.next().charAt(0);
        
        //____________________
        
        int contador = 0;

        for (int i = 0; i < frase.length(); i++) {
            if (frase.charAt(i) == letra) { // obtenemos el caracter especifico con .charAt()
                contador++;
            }
        }

        //____________________

 

        if (contador > 0) {
            System.out.println("' aparece " + contador + " veces en la frase.");
        } else {
            System.out.println("Carácter no encontrado.");
        }
    }


}
