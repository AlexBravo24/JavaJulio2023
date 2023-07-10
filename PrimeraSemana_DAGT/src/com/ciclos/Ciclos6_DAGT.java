package com.ciclos;

public class Ciclos6_DAGT {

	public static void main(String[] args) {

		double principal = 1000.00; // Cantidad inicial a invertir
        double tasaInteres = 0.02; // 2% de interés mensual
        int meses = 12; // Número de meses en un año

        double monto = principal;
        
        for (int i = 0; i < meses; i++) {
            monto += monto * tasaInteres;
        }

        System.out.println("La cantidad de dinero al cabo de un año es: $" + monto);
	}

}
