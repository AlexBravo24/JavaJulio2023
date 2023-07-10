package com.arrays;

import java.util.Scanner;

public class Array3_JDRA {

	public static void main(String[] args) {
		
		// 3. Pide al usuario por teclado una frase y pasa sus caracteres a un array de 
		// caracteres.
		
		Scanner entrada=new Scanner(System.in);
        
        System.out.println("Escriba una frase: ");
        String frase=entrada.nextLine(); 
         
        //Creamos un array de caracteres usando el metodo String
        char caracteres[]=frase.toCharArray();
         
        
        for(int i=0;i<frase.length();i++){ 
            System.out.println(caracteres[i]);
        }

	}

}
