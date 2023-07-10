package com.ciclos;

public class Ciclos06_DVC {

	public static void main(String[] args) {
		double inv = 1000;
		double gn, tt = 0;
		for (int x = 1; x <= 12; x++) {		
			gn = inv * .2;
			tt = inv + gn;
			inv = tt;
		}
		System.out.println(tt);

	}

}
