package com.arrays;

public class Array {

	public static void main(String[] args) {
		
		// Los arrays son una estructura de datos que almacenan un tipo de ellos en comun y una vez
		// declarando su tamaño o longitud este no puede crecer o cambiar en tiempo de ejecucion
		
		// declarando un array con su tamaño
		int [] numero = new int [5];
		
		//introducir datos en nuestro array indicando la posicion en la que se almacenara dicho dato
		
		numero[0]=101;
		numero[1]=102;
		numero[2]=103;
		numero[3]=104;
		numero[4]=105;
		
		// si quiero mostrar un determinado valor de una posicion
		
		System.out.println(numero[3]);
		
		// otra manera de declarar e iniciar un array ya con sus valores
		int [] numeros = {1,2,3,4,5,6,7,8,9};
		
		System.out.println(numeros[0]);
		
		// imprimir en consola todos los valores del array
		
//		for (int i=0; i <numeros.length; i++) {
//			System.out.println("La posicion "+ i +" tiene guardado el valor "+numeros[i]);
//		}
		
		// imprimientod todos los valores de mi array con un ciclo for each
		
		for (int i:numeros) {
			System.out.println(i);
		}
		
		// podemos almacenar objetos, String, char, etc

	}

}
