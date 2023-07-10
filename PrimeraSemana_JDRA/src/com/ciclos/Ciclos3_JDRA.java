package com.ciclos;

import java.util.Scanner;

public class Ciclos3_JDRA {

	public static void main(String[] args) {
		
		// 3. Realiza un programa para determinar si un String es palíndromo. 
		
		Scanner entrada= new Scanner(System.in);
        System.out.print("Introduce una frase: ");
        String s=entrada.nextLine();
        
        s=s.replace(" ", "");
        s=s.replace(",", "");
        s=s.replace(".", "");
        System.out.print(s);
        
        int fin = s.length()-1;
        int ini=0;
        
        boolean espalin=true;
        
        while(ini < fin){
            if(s.charAt(ini)!=s.charAt(fin)){
                espalin=false;
            }
        ini++;
        fin--;
        }
        if(espalin)
            System.out.print("\nEs palindromo");
        else
            System.out.print("\nNo es palindromo");
        
    }
}
		
	