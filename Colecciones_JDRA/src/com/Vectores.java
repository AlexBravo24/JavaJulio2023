package com;

import java.util.Scanner;

public class Vectores {
	
	/*
	 * Un vector es una estructura de datos que permite almacenar un CONJUNTO de datos del MISMO tipo.
	Con un único nombre se define un vector y por medio de un subíndice hacemos referencia a 
	cada elemento del mismo (componente)
	 */
	
    private Scanner teclado;
    private int[] sueldos;
	
    public void cargar()
    {
        teclado=new Scanner(System.in);
        sueldos=new int[5];
        for(int f=0;f<5;f++) {
            System.out.print("Ingrese valor de la componente:");
            sueldos[f]=teclado.nextInt();
        }	
    }
	
    public void imprimir() {
        for(int f=0;f<5;f++) {
            System.out.println(sueldos[f]);
        }
    }
	
    public static void main(String[] ar) {
    	Vectores pv=new Vectores();
        pv.cargar();
        pv.imprimir();
    }

}
