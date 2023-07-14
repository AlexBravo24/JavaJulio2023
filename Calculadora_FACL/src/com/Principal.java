package com;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a,b;
		Scanner entrada = new Scanner (System.in);
		
		Cientifica numeros = new Cientifica();
		
		numeros.setColor("Negro");
		numeros.setMarca("Casio");
		numeros.setTapa(true);
		
		System.out.println("Ingrese el número 1");
		a=entrada.nextInt();
		numeros.setN1(a);
		
		System.out.println("Ingrese el numero 2");
		b=entrada.nextInt();
		numeros.setN2(b);
		
		numeros.division();
		numeros.multiplicacion();
		numeros.resta();
		numeros.suma();
		
	}

}
