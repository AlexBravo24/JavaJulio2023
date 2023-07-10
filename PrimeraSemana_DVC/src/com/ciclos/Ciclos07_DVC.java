package com.ciclos;

public class Ciclos07_DVC {

	public static void main(String[] args) {
		double inv = 700, gn,tt;
		int x = 1;
		while (inv <= 1500) {
			gn = inv *.2;
			tt = inv + gn;
			inv = tt;
			x++;
		}
		System.out.println("Meses requeridos para ganar 1500 de inversion serian = "+ x);

	}

}
