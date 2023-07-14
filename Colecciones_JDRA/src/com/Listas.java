package com;

import java.util.ArrayList;
import java.util.List;

public class Listas {
	
	/*Las listas son colecciones ordenadas de objetos. Son similares a las secuencias en matemáticas 
	 * en ese sentido. Sin embargo, son diferentes a los conjuntos que no tienen un cierto orden.

	Un par de cosas a tener en cuenta: las listas pueden tener elementos duplicados y nulos. 
	Son tipos de referencia o de objeto y, como todos los objetos en Java, se almacenan en las pilas.

	Una lista en Java es una interfaz y hay muchos tipos de listas que implementan esta interfaz.
	 * 
	 */
	
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("hello");
        list.add(1, "world");
        list.add(2, "all");
        
        list.remove("hello"); //remover 
        
        System.out.println(list);

    }
	
}
