package com.arrays;

public class Array4_JDRA {

	public static void main(String[] args) {
		
		/* 4. Dado un array de números de 5 posiciones con los siguientes valores:
		{1,2,3,4,5}. Guardar los valores de este array en otro array distinto pero con 
		los valores invertidos, es decir, que el segundo array deberá tener los valores 
		{5,4,3,2,1}.
		*/
		
		int [] arreglo = {1,2,3,4,5};
		
		int[] arreglo2=new int[arreglo.length];
        
        for(int i=(arreglo.length-1),j=0;i>=0;i--,j++){
        	
        	arreglo2[j]=arreglo[i];
           System.out.println(arreglo2[j]);
        }
		
		
	}

}
