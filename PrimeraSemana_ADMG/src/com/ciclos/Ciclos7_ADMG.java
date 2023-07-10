package com.ciclos;

public class Ciclos7_ADMG {

	public static void main(String[] args) {
		
		//Una persona desea invertir $700.00 en un banco, el cual le otorga un 2% de interés 
		//mensual. ¿En cuántos meses tendrá más de $1500, si reinvierte cada mes todo su 
		//dinero?

		double capitalInicial = 700.00;
        double tasaInteresMensual = 0.02;
        double capitalMeta = 1500.00;

        int meses = 0;
        double capitalActual = capitalInicial;

        while (capitalActual < capitalMeta) {
            capitalActual = capitalActual * (1 + tasaInteresMensual);
            meses++;
        }

        System.out.println("La persona tendrá más de $1500 después de " + meses + " meses.");
		
		
	}

}
