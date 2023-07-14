package com;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Stack;

public class Listas {
	/*Las listas son un conjunto de elementos relacionados entre si que 
	 * tienen un determinado orden, su tamaño es dinamico y existen 3 tipos de listas:
	 * ArrayLists - FIFO (First In First Out) 
	 * LinkedLists - FIFO (First In First Out) 
	 * Stack - LIFO (Last In First Out)
	 */
	
	/*Caracteristicas
	 * Es una clase que se representa como una matriz dinamica que permite almacenar elementos.
	 * Hereda de la clase AbstractList, la cual implementa interfaz List
	 * Permite colecciones o elementos duplicados
	 * El orden de los registros es el orden en que fueron insertados
	 * Permite acceso aleatorio (tiene indice)
	 * Manipulacion lenta (recorrer todo el arraylist para hacer un cambio)
	 * Almacenan objetos no tipos primitivos
	 */
	
	
	/*ArrayList
	 * proporciona una implementación de una lista dinámica
	 *  (tamaño flexible) respaldada por una matriz (array).  
	 *  Se utiliza para almacenar y manipular una colección ordenada de elementos.
	 */
	
	//Declarando un ArrayList que contendra datos del tipo int
	List <Integer> arrayList = new ArrayList<>();
	
	
	//Metodos para interactuar con el ArrayList
	void modificarLista() {
		//Agregando vaolores a la lista con .add()
		arrayList.add(2);
		arrayList.add(4);
		arrayList.add(16);
		arrayList.add(56);
		
		//Accediendo a valores de la lista con .get()
		int temp = arrayList.get(1);
		
		//Obteniendo el tamaño del ArrayList con .size()
		System.out.print(arrayList.size());
		
		//Quitando valor de la lista con .remove()
		arrayList.remove(2);
		
		//Ordenando de manera ascendente los elementos de la lista
		Collections.sort(arrayList);	
		
		//Recorriendo los valores de la lista
		for(int i:arrayList) {
			System.out.println(i);
		}
		
	}
	
	
	
	/*LinkedList
	 * Es una estructura  de datos que se compone de nodos, 
	 * donde cada nodo contiene un elemento y una referencia al siguiente nodo en la lista.
	 * A diferencia de un ArrayList, una lista enlazada no almacena sus elementos en una matriz contigua,
	 * sino que cada nodo está vinculado al siguiente nodo a traves de referencias
	 */
	
	
	//Declarando una Linked List que almacenara datos de tipo String	
	LinkedList  <String> linkedList = new LinkedList <> ();
	
	void modificarListaEnlazada() {
		//Agregando vaolores al final de la lista con .add()
		linkedList.add("manzana");
		linkedList.add("banana");
		linkedList.add("uvas");
		linkedList.add("fresas ");
		
		//Agregando vaolores al principio de la lista con .addFirst()
		linkedList.addFirst("manzana");
		linkedList.addFirst("banana");
		
		
		//Accediendo a valores de la lista con .get()
		String temp = linkedList.get(1);
		
		//Accediendo al primer valor de la lista con .getFirst()
		 temp = linkedList.getFirst();
		
		 //Accediendo al ultimo valor de la lista con .getFirst()
		 temp = linkedList.getLast();
		
		//Obteniendo el tamaño del ArrayList con .size()
		System.out.print(linkedList.size());
		
		//Quitando valores de la lista con .removeFirst() .removeLast() y .remove(i)
		linkedList.removeLast();
		linkedList.removeFirst();
		linkedList.remove(2);

		
		//Recorriendo los valores de la lista
		for(String i:linkedList) {
			System.out.println(i);
		}
		
	}
	
	
	/*Stack
	 * Es una estructura de datos en la que el ultimo elemento agregado
	 * es el primero en ser eliminado
	 */
	
	//Declarando un Stack que contendra datos del tipo int
	Stack <Integer> stack = new Stack<>();
	
	
	//Metodos para interactuar con el Stack
	void modificarStack() {
		
		//Agrega un elemento a la parte superior con el metodo .push()
		stack.push(2);
		stack.push(4);
		stack.push(6);
		stack.push(8);
		
		// Obtener el elemento superior sin eliminarlo con .peek()
		int temp = stack.peek();
		
		// Elimina el elemento superior de la pila con .pop()
		stack.pop();
		
		//Obteniendo el tamaño del ArrayList con .size()
		System.out.print(stack.size());
		
		// Verificar si la pila está vacía con .isEmpty()
		
		boolean x = stack.isEmpty();
		
		//Recorriendo los valores de la lista
		for(int i:stack) {
			System.out.println(i);
		}
		
	}


}
