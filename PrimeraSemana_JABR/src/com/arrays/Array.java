package com.arrays;

public class Array {

	public static void main(String[] args) {
		
		/*Los arrays son una estructura de datos que almacenan
		 * un tipo de ellos en com�n y una vez declarado su tama�o
		 * o longitud este no puede crecer o cambiar en tiempo de
		 * ejecuci�n
		 * 
		 */
		
		//Declarando un array con su tama�o
		int [] numero = new int [7]; //Un array de numeros enteros
		//con su tama�o declarado
		
		//Introducir datos en nuestro array indicando la posici�n
		//en la que se almacenara dicho dato
		
		numero[0]=101;
		numero[1]=102;
		numero[2]=103;
		numero[3]=104;
		numero[4]=105;
		numero[5]=106;
		numero[6]=107;
		
		//Si quiero mostrar un determinado valor de una poscici�n
		System.out.println(numero[6]);
		
		//Otra manera de declarar e iniciar un array ya con sus valores
		//asignados
		int [] numeros = {1,2,3,4,5,6,7,8,9};
		
		
		//Imprimir en consola todos los valores del array
		
//		for (int i = 0; i < numeros.length; i++) {
//			System.out.println("La posici�n " 
//		+ i + " tiene guardado el valor " + numeros[i]);
//		}
		
		//Imprimiendo todos los valores de mi array con un ciclo
		//for each
		
		for (int i:numeros) {
			System.out.println(i);
		}
		
		//Podemos almacenar objetos, String, char, etc

		
	}

}
