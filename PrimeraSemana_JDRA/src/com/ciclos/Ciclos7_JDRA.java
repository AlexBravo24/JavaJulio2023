package com.ciclos;

import java.util.Scanner;

public class Ciclos7_JDRA {

	public static void main(String[] args) {
		
		/* 7- Una persona desea invertir $700.00 en un banco, el cual le otorga un 2% de interés 
		mensual. ¿En cuántos meses tendrá más de $1500, si reinvierte cada mes todo su 
		dinero?
		*/
		
		Scanner entrada = new Scanner(System.in);
		
//        int inversion = 700;
//        int tope = 1500;
//        double rendimiento = .02;
//        double total;
//        
//        
//        for (int i = 1; i<=tope; i++){
//        	total = (inversion * rendimiento) * i + inversion;
//             System.out.println(" TOTAL DE DINERO: $" + total+ " pesos - "+ i +" mes");                                                     
//        }
		double inversion = 700;
		int mes = 1;
		
		for (;;) {
			
		inversion = inversion * 1.02;
		
		if (inversion >= 1500) break;
		
		mes++;
		
		}
		System.out.println("Mes: "+mes);
		System.out.println("TOTAL DE DINERO: $"+inversion);

	}

}
