package com.arrays;

public class Arrays02_DVC {

	public static void main(String[] args) {
		
		
		int [] num = new int [100];
		int r = 0, i;
		double m;
		
		for ( i = 0; i < 100; i++) {
			num[i] = i +1;
		    r += num [i];
		
		}
		m =(double) r /i;
		System.out.println("La suma es "+ r);
		System.out.println("La media es " + m);
		
	

	}

}
