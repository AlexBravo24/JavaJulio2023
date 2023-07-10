package com.arrays;

public class Array2_BAFV {
    public static void main(String[] args) {
    	
    	/*
    	 Crea un array de números de 100 posiciones, que contendrá los números del 
	1 al 100. Obtén la suma de todos ellos y la media. 
    	 
    	 * */
        int[] numeros = new int[100];

        System.out.println("Ingese los 100 numeros");
        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = i + 1;
        }

        // Contador
        int suma = 0;
        for (int numero : numeros) { // for each para obtener los nuemeros del arrat
            suma += numero;  // contador necesario para hacer las sumas
        }

        // calcualar la media de los numeros sumados
        double media = (double) suma / numeros.length;

        System.out.println("suma: " + suma);
        System.out.println("media: " + media);
    }
}
