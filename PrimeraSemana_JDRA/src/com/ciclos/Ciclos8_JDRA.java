package com.ciclos;

import java.util.Scanner;

public class Ciclos8_JDRA {

	public static void main(String[] args) {
		
		// 8. Programa Java que lea dos n�meros y muestre los n�meros desde el menor hasta el 
		// mayor 
		
        Scanner sc = new Scanner(System.in);
        
        int numero1, numero2, menor, mayor;
       
        do {
            System.out.print("Introduce un n�mero entero: ");
            numero1 = sc.nextInt();
            
            System.out.print("Introduce otro n�mero entero diferente al anterior: ");                   
            numero2 = sc.nextInt();
            
            if(numero1 == numero2){
                System.out.println("Debes introducir dos n�meros distintos");
            }
            
        } while (numero1 == numero2);
       
        
        if (numero1 > numero2) {
            mayor = numero1;
            menor = numero2;
            
        } else {
            mayor = numero2;
            menor = numero1;
        }
       
       
        System.out.println("\nN�meros desde " + menor + " hasta " + mayor + " : ");
        for (int i = menor; i <= mayor; i++) {
            System.out.println(i);
        }

	}

}
