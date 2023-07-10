package com.ciclos;

import java.util.Scanner;

public class Ciclos02_DVC {

	public static void main(String[] args) {
		int ent, lim, r, x;
		Scanner entrada = new Scanner(System.in);
		System.out.println("Introduce un numero");
		ent = entrada.nextInt();
		System.out.println("Hasta que número quieres multiplicar");
		lim = entrada.nextInt();
		x= 1;
		while (x <= lim) {
			r = ent * x;
			System.out.println(ent + " x " + x + " = " + r);
			x++;
		}

	}

}
