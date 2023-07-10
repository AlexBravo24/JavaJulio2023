package com.arrays;

public class ArrayBidireccional2_ADMG {

	public static void main(String[] args) {
		
//		Crea las siguientes matrices. Ejemplo: String matrizA [] [] = new String [3][5];
//	Para que muestre los siguientes valores:
//	Matriz A
//	“5” “x” “9” “4” “t”
//	“3” “z” “P” “c” “6”
//	“8” “3” “f” “i” “7”
//	Matriz B
//	“7” “P” “4” “g” “8”
//	“5” “w” “Y” “10” “2”
//	“4” “7” “v” “o” “6”
//	Una vez creadas, deberás crear un algoritmo que convierta los valores numéricos a 
//	enteros y los sume de acuerdo a su posición en una tercera matriz (Ejemplo, valor 
//	String de Matriz A 0,0=”5“+ valor String de Matriz B 0,0=”7”, entonces en la 
//	coordenada 0,0 de la Matriz C debería mostrarse la suma, quedando como Matriz 
//	C 0,0=”12”. Aplicando la lógica de que solo se pueden sumar los valores que son 
//	numéricos, si las coordenadas tienen valores de letras o un valor numérico y una 
//	letra, entonces en la Matriz C 0,1 se deberá mostrar un valor = “0”.

		
		String[][] matrizA = {
                {"5", "x", "9", "4", "t"},
                {"3", "z", "P", "c", "6"},
                {"8", "3", "f", "i", "7"}
        };

        String[][] matrizB = {
                {"7", "P", "4", "g", "8"},
                {"5", "w", "Y", "10", "2"},
                {"4", "7", "v", "o", "6"}
        };

        int filas = matrizA.length;
        int columnas = matrizA[0].length;

        int[][] matrizC = new int[filas][columnas];

        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                if (esNumero(matrizA[i][j]) && esNumero(matrizB[i][j])) {
                    int valorA = Integer.parseInt(matrizA[i][j]);
                    int valorB = Integer.parseInt(matrizB[i][j]);
                    matrizC[i][j] = valorA + valorB;
                } else {
                    matrizC[i][j] = 0;
                }
            }
        }

        System.out.println("Matriz C:");
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                System.out.print(matrizC[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static boolean esNumero(String valor) {
        try {
            Integer.parseInt(valor);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
		
		
	}

}
