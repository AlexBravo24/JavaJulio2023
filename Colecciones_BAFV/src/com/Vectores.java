package com;

/*
 * Vector es una clase que implementa la interfaz List y es sincronizada. 
 * */

import java.util.Vector;

public class Vectores {
    public static void main(String[] args) {
        // Declaración de un vector de cadenas
        Vector<String> vector = new Vector<>();

        // Agregar elementos al vector
        vector.add("Hola");
        vector.add("Mundo");

        // Acceder
        System.out.println("imprimiendo " + vector.get(1));

        // Iterar sobre el vector
        for (String elemento : vector) {
            System.out.println(elemento);
        }
    }
}

