package com;

import java.util.HashMap;
import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		
		HashMap <Integer, Panel> productos = new HashMap<Integer, Panel>();
		Scanner entrada = new Scanner (System.in);
		
		productos.put(0001, new Panel("Coca",20,3,"Femsa","Lata"));
		productos.put(0002, new Panel("Gansito",18,10,"Marinela","Normal"));
		productos.put(0003, new Panel("Chips Originiales",25,1,"Barcel","Estandar"));
		productos.put(0004, new Panel("Chips Fuego",25,15,"Barcel","Estandar"));
		productos.put(0005, new Panel("Roles",18,5,"BIMBO","Pa Compartir"));
		productos.put(0006, new Panel("Fanta",15,2,"Femsa","Botella"));
		
		System.out.println();
		int x= 0;
	Maquina maquina1 = new Maquina("ITSX",productos);
	int i = 0;
	while ( i == 0) {
		System.out.println("Eligda su producto:  ");
	
	
	
	System.out.println(maquina1.buscarProducto(0001));
	System.out.println(maquina1.comprar(0001, 39, 2));
	System.out.println(maquina1.buscarProducto(0001));

	}
	}

}
