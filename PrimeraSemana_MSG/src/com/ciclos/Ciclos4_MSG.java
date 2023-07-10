package com.ciclos;

import java.util.Scanner;

public class Ciclos4_MSG {

	public static void main(String[] args) {
		
		
		String frase;
		String letra;
		int x = 0;
		
		
		
	
		Scanner entrada1 = new Scanner(System.in);
			System.out.println("Ingresar Frase: ");
			frase = entrada1.nextLine();
			
		Scanner entrada2 = new Scanner(System.in);
			System.out.println("Ingresar letra a buscar: ");
			letra = entrada2.nextLine();
			
//			char letras[] = frase.toCharArray();
		
			for (int i = 0; i < frase.length(); i++) {
				
				if(frase.charAt(i)== letra.charAt(0) ){
					
				x ++;
				}
			}

				if (x != 0) {
					
					System.out.println("El caracter "+letra.charAt(0)+ " se repite " + x + " veces");
					
				} else {
					
				System.out.println("El caracter no se encuentra en esta frase");
				
				}
			
			
			
			
			
			
			
			
			
//		for ( int x = 0; x < frase.length(); x++) {
//			letras[x] = frase.charAt(x);
//			
//			System.out.println("La frase tiene la letra " + letra +" " + letra + " Veces");
//			
//			
//		} 
		
		

	} // Cierre Main

} // Cierre Class
