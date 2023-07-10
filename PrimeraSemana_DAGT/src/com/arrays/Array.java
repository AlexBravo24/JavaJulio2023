package com.arrays;

public class Array {

	public static void main(String[] args) {
		
		/*Los arrays son una estructura de datos que almacenan 
		 * un tipo de datos en comun, una vez declarado su tamaño
		 * o longitud ese no puede crecer o cambiar en tiempo de ejecucion
		 */
		
		//Declarando un array con su tamaño
		int [] array = new int [5]; //Array de numeros enteros con tamaño declarado
		
		//Introducir datos en el array indicando la posicion en la que almacenara el dato
		array[3]=2;
		
		
		//otra manera de declarar e iniciar un array ya con sus valores asignados
		int [] array2 = {1,2,3,4,5,6,7,8};
		
		
		//imprimir en consolas todos los valores del array
		for (int i=0;i < array2.length; i++) {
			System.out.println(array2[i]);
			
		}

		//imprimiendo los valores del array con un ciclo for each
		for(int i:array2) {
			System.out.print(i);
		}
		
		
	}

}
