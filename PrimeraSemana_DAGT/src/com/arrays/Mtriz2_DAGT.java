package com.arrays;

public class Mtriz2_DAGT {

	public static void main(String[] args) {

		String [][] matrizA ={{"5","x","9","4","t"},{"3","z","P","c","6"},{"8","3","f","i","7"}};
		String [][]matrizB = {{"7","P","4","g","8"},{"5","w","Y","1","2"},{"4","7","v","o","6"}};
		String [][] matrizC = new String[3][5];
		
		
		for (int i =0; i<matrizA.length;i++) {
			for (int j = 0; j< 5; j++) {
				matrizC[i][j] = sumarValores(matrizA[i][j],matrizB[i][j]); 
				System.out.print(matrizC[i][j]+ " ");
			}
			System.out.println();
		}
			
	}
	
	
	
	
	/*Metodo que recibe ambos valores de las matrices en formato de string
	 * trata de convertir los valores a int, si hay algun error regresa 0
	 * si tiene exito rergesa el resultado una vez mas en formato String
	 */
	public static String sumarValores(String valorA, String valorB) {
		try {
			int numeroA = Integer.parseInt(valorA);    //intenta convertir el valorA a int
			int numeroB = Integer.parseInt(valorB);		//intenta convertir el valorB a int
			return String.valueOf(numeroA + numeroB);	//si tiene exito, regresa el resultado de sumar los dos valores en formato string 
		}catch (NumberFormatException e) { 
			return "0";
		}
	}

}



