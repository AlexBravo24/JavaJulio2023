package com.ciclos;

public class Ciclos7_BAFV{
    public static void main(String[] args) {
    	
    	/*
    	 7- Una persona desea invertir $700.00 en un banco, el cual le otorga un 2% de interés 
		mensual. ¿En cuántos meses tendrá más de $1500, si reinvierte cada mes todo su 
		dinero?
    	 */
    	
        double inicial = 700.00;
        double interes = 0.02; // 2 % de interes
        double objetivo = 1500.00; // meta 

        
        int meses = 0; // contador
        double valorActual = inicial;

        while (valorActual < objetivo) { // mientras el valor que tenemos actualmete sea menor que el objetico de 1500.00
        	valorActual += valorActual * interes;
            meses++; 
        }


        System.out.println("Se necesitan " + meses + " meses para alcanzar más de $1500.00.");
    }


}
