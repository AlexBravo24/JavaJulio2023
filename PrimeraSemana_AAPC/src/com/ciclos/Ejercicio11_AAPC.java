package com.ciclos;

import java.util.Scanner;

public class Ejercicio11_AAPC {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		        Scanner scanner = new Scanner(System.in);

		        System.out.print("Ingrese el ancho del cuadrado: ");
		        int ancho = scanner.nextInt();

		        System.out.print("Ingrese el alto del cuadrado: ");
		        int alto = scanner.nextInt();

		        for (int i = 0; i < alto; i++) {
		            for (int j = 0; j < ancho; j++) {
		                if (i == 0 || i == alto - 1 || j == 0 || j == ancho - 1) {
		                    System.out.print("* ");
		                } else {
		                    System.out.print("  ");
		                }
		            }
		            System.out.println();
		        }
		    }
		

	}


