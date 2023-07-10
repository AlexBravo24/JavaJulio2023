package com;

import java.util.Scanner;

public class Ejercicio6_BAFV {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        /*
         6. La asociación de vinicultores tiene como política fijar un precio inicial al kilo de uva, la cual se 
			clasifica en tipos (A y B), y además en tamaños (1 y 2). Cuando se realiza la venta del producto, ésta 
			es de un sólo tipo y tamaño, se requiere determinar cuánto recibirá un productor por la uva que 
			entrega en un embarque considerando lo siguiente:
         	* Si es de tipo A, se le cargan 20 céntimos al precio inicial cuando es de tamaño 1 y 30 céntimos si 
			es de tamaño 2.
 			Si es de tipo B, se rebajan 30 céntimos cuando es de tamaño 1, y 50 céntimos cuando es de 
			tamaño 2.
			Precio inicial se recibe desde teclado
          
          
         */

        System.out.print("Ingrese el precio inicial por kilo de uva: ");
        double precioInicial = entrada.nextDouble();

        System.out.print("Ingrese el tipo de uva (A ó B): ");
        char tipoUva = entrada.next().charAt(0);

        System.out.print("Ingrese el tamaño de uva (1 ó 2): ");
        int tamanoUva = entrada.nextInt();

        double montoRecibido = 0;

        if (tipoUva == 'A') {
            if (tamanoUva == 1) {
                montoRecibido = precioInicial + 0.20;
            } else if (tamanoUva == 2) {
                montoRecibido = precioInicial + 0.30;
            } else {
                System.out.println("Tamaño de uva inválido. No se puede calcular el monto.");
               
            }
        } else if (tipoUva == 'B') {
            if (tamanoUva == 1) {
                montoRecibido = precioInicial - 0.30;
            } else if (tamanoUva == 2) {
                montoRecibido = precioInicial - 0.50;
            } else {
                System.out.println("Tamaño de uva inválido. No se puede calcular el monto.");
                
            }
        } else {
            System.out.println("Tipo de uva inválido. No se puede calcular el monto.");
           
        }

        System.out.println("El monto recibido por el productor es: " + montoRecibido);
    }
}

