package com.ciclos;

public class Ejercicio6_AAPC {

	public static void main(String[] args) {
		// Una persona desea invertir $1000.00 en un banco, el cual le otorga un 2% de interés mensual.
		//¿Cuál será la cantidad de dinero que esta persona tendrá al cabo de un año si todo el dinero lo reinvierte? 
		 
		
		double x = 1000.00;
		double interes  = .02;
		int periodo = 12;
		double montoAcumulado = x * Math.pow(1+interes, periodo);
		System.out.println("El monto acumulado al cabo del año es de : $"+ montoAcumulado);
		
		
				
		
		
		
		
		
		
		
		

	}

}
