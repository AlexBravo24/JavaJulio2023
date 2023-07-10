package com;

import java.util.Scanner;

public class TiposDeDatos {
	public static void main(String[] args) {
		Scanner entradaDatos = new Scanner(System.in);
		System.out.println("Introduce un número");
		int numeroEntrada = entradaDatos.nextInt();
		System.out.println("El número que se ingreso fue: " + numeroEntrada);
	}
}