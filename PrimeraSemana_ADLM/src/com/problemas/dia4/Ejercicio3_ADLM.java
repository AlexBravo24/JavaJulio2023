package com.problemas.dia4;

import java.util.Scanner;

public class Ejercicio3_ADLM {

	public static void main(String[] args) {
		/* 3. Pide al usuario por teclado una frase y pasa sus caracteres a un array de 
		caracteres.*/
		
		Scanner entrada = new Scanner(System.in);
		System.out.println("Coloca una frase");
		String msg = entrada.nextLine().replace(" ", "");
		char[] letraMsg = new char[msg.length()];

		for(int i = 0; i <= letraMsg.length -1 ; i++) {
			letraMsg[i] = msg.charAt(i);
		}
		
		for(char letra: letraMsg) {
			System.out.println(letra);
		}
	}

}
