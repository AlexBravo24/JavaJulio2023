package com;

import java.util.Scanner;

public class Ejercicio06_DVC {

	public static void main(String[] args) {
		//La asociaci�n de vinicultores tiene como pol�tica fijar un precio inicial
//		al kilo de uva, la cual se clasifica en tipos (A y B), y adem�s en tama�os (1 y 2).
//		Cuando se realiza la venta del producto, �sta es de un s�lo tipo y tama�o, 
//		se requiere determinar cu�nto recibir� un productor por la uva que entrega en un embarque
//		considerando lo siguiente:
//			* Si es de tipo A, se le cargan 20 c�ntimos al precio inicial cuando es de tama�o 1 y 30 c�ntimos
//			si es de tama�o 2. * Si es de tipo B, se rebajan 30 c�ntimos cuando es de tama�o 1, y 50 c�ntimos 
//			cuando es de tama�o 2. Precio inicial se recibe desde teclado

		double precio, pref = 0;
		int  tamano;
		char tipo;
		Scanner entrada = new Scanner (System.in);
		System.out.println("Introduce el precio por kilo de la UVA");
		precio = entrada.nextDouble();
		System.out.println("Intorduce el tipo de uva A/B");
		tipo = entrada.next().charAt(0);
		System.out.println("Introduce el tama�o 1 o 2");
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