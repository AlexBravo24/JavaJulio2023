package com.ciclos;

import java.util.Scanner;

public class Ciclos6_JDRA {

	public static void main(String[] args) {
		
		/* 6.- Una persona desea invertir $1000.00 en un banco, el cual le otorga un 2% de interés 
		mensual. ¿Cuál será la cantidad de dinero que esta persona tendrá al cabo de un año si 
		todo el dinero lo reinvierte?
		
		*/
		
		Scanner entrada = new Scanner(System.in);
		
        int inversion = 1000;
        int meses = 12;
        double rendimiento = .02;
        double total;
        
        
        for (int i = 1; i<=meses; i++){
        	total = (inversion * rendimiento) * i + inversion;
             System.out.println(" TOTAL DE DINERO: $" + total+ " pesos - "+ i +" mes");                                                     
        }
        
	}

}
