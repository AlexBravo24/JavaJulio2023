package com;

import java.util.Scanner;

public class Ejercicio3_JDRA {

	public static void main(String[] args) {
		
		/* 3.Crea un programa que pida al usuario dos números y muestre el resultado de su división. Si el 
		//segundo número es 0, debe mostrar un mensaje de error.
		*/
		
		Scanner entrada = new Scanner(System.in);
		
        double dividendo, divisor;
        
        System.out.print("Introduzca el dividendo: ");
        dividendo = entrada.nextDouble();
        
        System.out.print("Introduzca el divisor: ");
        divisor = entrada.nextDouble();
        
        if( divisor == 0 ){
           System.out.println("No se puede dividir por cero"); 
           
        } else{
            System.out.println(dividendo + " / " + divisor + " = " + dividendo/divisor);         
        }
		

	}

}
