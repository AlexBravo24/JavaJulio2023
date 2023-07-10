package com.ciclos;

import java.util.Scanner;

public class Ciclos12_JDRA {

	public static void main(String[] args) {
		
		// 12.Se ingresan un conjunto de n edades de personas por teclado. El programa finalizara 
		// cuando el promedio de las edades sea superior a 25.
		
			
		  Scanner entrada=new Scanner(System.in);
		  
		  int Edad, Suma = 0,Contador = 0,Promedio=0;
		  
		  do {
		   System.out.println("Ingrese la edad de la persona: ");
		   Edad=entrada.nextInt();
		   
		   Suma=Suma+Edad;
		   Contador=Contador+1;
		   Promedio=Suma/Contador;
		   
		   System.out.println("El promedio actual es  de: " +Promedio+" años");
		   System.out.println("");
		   
		   if (Promedio>25) {
		   break;
		  
		  }
		   
		  } while (Edad>0);
		  System.out.println("La suma de las edades es: " + Suma + " años "+" / La Cantidad  de edades ingresadas fueron: "
		  + Contador);
		  
		  System.out.println("\nEl promedio es igual a: "+Promedio+" años");
		  
		  if (Promedio>25) {
		   System.out.println("El promedio fue superior a 25 años!");
		  }else {
			  
		   System.out.println("Reinicia el programa ya que el promedio no fue superior a 25");
		  }
		  

	}

}
