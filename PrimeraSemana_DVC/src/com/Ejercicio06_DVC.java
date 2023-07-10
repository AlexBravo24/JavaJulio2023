package com;

import java.util.Scanner;

public class Ejercicio06_DVC {

	public static void main(String[] args) {
		//La asociación de vinicultores tiene como política fijar un precio inicial
//		al kilo de uva, la cual se clasifica en tipos (A y B), y además en tamaños (1 y 2).
//		Cuando se realiza la venta del producto, ésta es de un sólo tipo y tamaño, 
//		se requiere determinar cuánto recibirá un productor por la uva que entrega en un embarque
//		considerando lo siguiente:
//			* Si es de tipo A, se le cargan 20 céntimos al precio inicial cuando es de tamaño 1 y 30 céntimos
//			si es de tamaño 2. * Si es de tipo B, se rebajan 30 céntimos cuando es de tamaño 1, y 50 céntimos 
//			cuando es de tamaño 2. Precio inicial se recibe desde teclado

		double precio, pref = 0;
		int  tamano;
		char tipo;
		Scanner entrada = new Scanner (System.in);
		System.out.println("Introduce el precio por kilo de la UVA");
		precio = entrada.nextDouble();
		System.out.println("Intorduce el tipo de uva A/B");
		tipo = entrada.next().charAt(0);
		System.out.println("Introduce el tamaño 1 o 2");
		tamano = entrada.nextInt();
		
		if (tipo == 'A') {
            if (tamano == 1) {
            	pref = precio + 0.20;
            } else if (tamano == 2) {
               pref = precio + 0.30;
            }
        } else if (tipo == 'B') {
            if (tamano == 1) {
            	pref = precio -  0.30;
            } else if (tamano == 2) {
            	pref = precio - 0.50;
            }
           
        }
		 System.out.println("El precio por kilo de UVA es " + pref); 
}
		
	}