package com;

import java.util.Scanner;

public class Ejercicio8_BAFV {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        /*
        8.- Realiza un programa que pida por teclado el resultado (dato entero) obtenido al lanzar un dado de 
			seis caras y muestre por pantalla el n�mero en letras (dato cadena) de la cara opuesta al resultado 
			obtenido.
			Nota 1: En las caras opuestas de un dado de seis caras est�n los n�meros: 1-6, 2-5 y 3-4.
			Nota 2: Si el n�mero del dado introducido es menor que 1 o mayor que 6, se mostrar� el mensaje: 
			�ERROR: n�mero incorrecto�. 
         */
        System.out.print("Ingrese el resultado obtenido al lanzar el dado: ");
        int resultado = entrada.nextInt();

        String caraOpuesta;

        switch (resultado) {
            case 1:
                caraOpuesta = "Seis";
                break;
            case 2:
                caraOpuesta = "Cinco";
                break;
            case 3:
                caraOpuesta = "Cuatro";
                break;
            case 4:
                caraOpuesta = "Tres";
                break;
            case 5:
                caraOpuesta = "Dos";
                break;
            case 6:
                caraOpuesta = "Uno";
                break;
            default:
                System.out.println("ERROR: n�mero incorrecto");
                return;
        }

        System.out.println("La cara opuesta al n�mero " + resultado + " es: " + caraOpuesta);
    }
}

