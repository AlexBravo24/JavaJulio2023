package com.ciclos;

public class Ciclos6_BAFV {
    public static void main(String[] args) {
    	/*
    	6.- - Una persona desea invertir $1000.00 en un banco, el cual le otorga un 2% de interés 
		mensual. ¿Cuál será la cantidad de dinero que esta persona tendrá al cabo de un año si 
		todo el dinero lo reinvierte?
    	  
    	*/
        double montoInicial = 1000.00;
        double Interes = 0.02; // ya que el interes es de 2% se expresaria de la siguiente manera
     
        
        double montoFinal = montoInicial; //inicializamos la varible monto final, asignado el monto incial sin intereses

        for (int i = 0; i < 12; i++) { // intera 12 veces que son los meses del año
            montoFinal += montoFinal * Interes; // el monto final se irá reinvertiendo en cada interacion con un interes del 2%
        }

        System.out.println("El monto final después de un año es: $" + montoFinal);
    }

   
}

