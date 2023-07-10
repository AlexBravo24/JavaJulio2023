package com.arrays;

public class Array2_ADMG {

	public static void main(String[] args) {
		
//		Crea un array de números de 100 posiciones, que contendrá los números del 
//		1 al 100. Obtén la suma de todos ellos y la media
		
		int[] numeros = new int[100];

        // Completar el array con los números del 1 al 100
        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = i + 1;
        }

        // Calcular la suma de los números
        int suma = 0;
        for (int i = 0; i < numeros.length; i++) {
            suma += numeros[i];
        }

        // Calcular la media
        double media = (double) suma / numeros.length;

        // Mostrar resultados
        System.out.println("Suma de los números: " + suma);
        System.out.println("Media de los números: " + media);

	}

}
