package com.ciclos;

public class Ejercicio7_AAPC {

	public static void main(String[] args) {
		// Una persona desea invertir $700.00 en un banco, el cual le otorga un 2% de inter�s mensual. 
		//�En cu�ntos meses tendr� m�s de $1500, si reinvierte cada mes todo su dinero?

		
		        double inversionInicial = 700.00;
		        double tasaInteresMensual = 0.02;
		        double meta = 1500.00;

		        int meses = 0;
		        double montoAcumulado = inversionInicial;

		        while (montoAcumulado < meta) {
		            meses++;
		            montoAcumulado += montoAcumulado * tasaInteresMensual;

		            if (meses > 1200) { // Evitar bucle infinito en caso de que la meta no sea alcanzada
		                System.out.println("La meta de $1500 no ser� alcanzada en un plazo razonable.");
		                return;
		            }
		        }

		        System.out.println("Se alcanzar� la meta de $1500 en " + meses + " meses.");
		    }
		}

	
	
