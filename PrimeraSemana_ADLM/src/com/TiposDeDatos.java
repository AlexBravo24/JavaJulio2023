package com;

import java.util.Scanner;

public class TiposDeDatos {
	public static void main(String[] args) {
		Scanner entradaDatos = new Scanner(System.in);
		System.out.println("Introduce un n�mero");
		int numeroEntrada = entradaDatos.nextInt();
		System.out.println("El n�mero que se ingreso fue: " + numeroEntrada);
	}
}