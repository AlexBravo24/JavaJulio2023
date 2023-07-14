package com;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Calculadora calc =  new Cientifica();
		
		calc.setColor("Roja");
		calc.setMarca("Casio");
		calc.operacion();
		
		}
	

}
