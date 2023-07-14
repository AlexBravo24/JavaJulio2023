package com;

import java.util.Vector;

public class Vectores {

	/*Un vector es una clase que implementa una estructura de datos similar al de una Lista
	 * Se utiliza para almacenar y manipular colecciones de elementos en un tamaño flexible
	 * El Vector es parte del paquete java.util y forma parte de las colecciones
	 */
	
	
	/*Caracteristicas
	 * Tiene un tamaño flexible y puede crecer o disminuir automaticamente segun se agreguen o eliminen elementos
	 * Se puede acceder a los elementos de un vector utilizando su indice
	 * A diferencia de las listas Vector es una estructura de datos sincronizada. Lo que significa que es seguro para hilos
	 * Algunos metodos para manipular vectores son: add(), remove(), get(), set(), size() y contains()
	 */
	
	
	//Declaracion de un Vector
	Vector <Integer> vector = new Vector <>();
	
	
	public void agregar() {
	//Agregando datos al vector
	vector.add(10);
	vector.add(20);
	vector.add(30);
	vector.add(40);
	
	
	//Obtener el tamaño del vector
	System.out.println("Tamaño del vector: " + vector.size());
	
	//Acceder a elementos por indice
	vector.get(2);
	
	//modificar elementos
	vector.set(0, 3);

	//Eliminar elementos 
	vector.remove(2);
	
	
	}	
	
}
