package com.ciclos;

import java.text.DecimalFormat;

public class Ciclos6_ADMG {

	public static void main(String[] args) {
		
		//Una persona desea invertir $1000.00 en un banco, el cual le otorga un 2% de inter�s 
		//mensual. �Cu�l ser� la cantidad de dinero que esta persona tendr� al cabo de un a�o si 
		//todo el dinero lo reinvierte?

		double capitalInicial = 1000.00;
        double tasaInteresMensual = 0.02;
        int periodos = 12; // 12 meses en un a�o

        double capitalFinal = calcularInteresCompuesto(capitalInicial, tasaInteresMensual, periodos);

        DecimalFormat formato = new DecimalFormat("#.00");
        String capitalFinalFormateado = formato.format(capitalFinal);

        System.out.println("Despu�s de un a�o, la cantidad de dinero ser�: $" + capitalFinalFormateado);
    }

    private static double calcularInteresCompuesto(double capitalInicial, double tasaInteresMensual, int periodos) {
        double capitalFinal = capitalInicial;

        for (int i = 0; i < periodos; i++) {
            capitalFinal = capitalFinal * (1 + tasaInteresMensual);
        }

        return capitalFinal;
		
		
		
	}

}
