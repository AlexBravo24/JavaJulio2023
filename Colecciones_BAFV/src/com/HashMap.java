package com;

import java.util.Vector;

public class HashMap {
    public static void main(String[] args) {
        // Declaración de un vector de cadenas
        Vector<String> vector = new Vector<>();

        // Agregar elementos al vector
        vector.add("Hola");
        vector.add("Mundo");

        // Acceder a los elementos del vector
        System.out.println("Elemento en la posición 1: " + vector.get(1));

        // Iterar sobre el vector
        for (String elemento : vector) {
            System.out.println(elemento);
        }
    }
}

