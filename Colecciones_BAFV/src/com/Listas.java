package com;

import java.util.List;

import java.util.ArrayList;

/*
 * List es una interfaz que define una colección ordenada de elementos y permite duplicados. 
 * 
 * */
public class Listas {
    public static void main(String[] args) {
        // Declaración de una lista de enteros
        List<Integer> lista = new ArrayList<>();

        // Agregar elementos a la lista
        lista.add(10);
        lista.add(20);
        lista.add(30);

        // Acceder a los elementos de la lista
        System.out.println("traer elemento 0 de la lista: " + lista.get(0));

        // Iterar sobre la lista
        for (Integer elemento : lista) {
            System.out.println(elemento);
        }
    }
}

