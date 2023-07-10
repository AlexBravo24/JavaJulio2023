package com.problemas.dia3;

public class Ejercicio7_ADLM {

	public static void main(String[] args) {
		/* 7- Una persona desea invertir $700.00 en un banco, el cual le otorga un 2% de interés 
		mensual. ¿En cuántos meses tendrá más de $1500, si reinvierte cada mes todo su 
		dinero? */
		
		double inversion = 700.00;
		int meses = 0;
		
		while(inversion < 1500.00) {
			inversion *= 1.02;
			meses++;
		}
		
		
		System.out.println("La cantidad de: " + inversion + " se obtendra en un total de " + meses + " meses");
	}

}
