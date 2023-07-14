package com;

import java.util.Vector;

public class Vector_ADLM {
	// La clase vector permite guardar elementos de manera dinamica.
	// Para declararlo, se le puede derterminar un tamaño inicial, así como el taño que va a crecer en el caso de sobrepasar ese limite
	// En caso de no colocar el número de espacios que va a crecer y unicamente se coloca un tamaño inicial, entonces el número de espacios se va a duplicar.
	// Cuando no se coloca un tamaño inicial, entonces el tamaño del vector de manera predeterminara será 10
	Vector vector_lista;

	public Vector_ADLM(Vector vector_lista) {
		super();
		this.vector_lista = vector_lista;
	}

	public Vector getVector_lista() {
		return vector_lista;
	}

	public void setVector_lista(Vector vector_lista) {
		this.vector_lista = vector_lista;
	}
	
	public void agregarDatos(Object e) {
		vector_lista.add(e);
	}
	
	public void verCuantosElementosContiene() {
		System.out.println(vector_lista.size());
	}
	
	public void capacidadVector() {
		System.out.println(vector_lista.capacity());
	}
	
	public void removerUnElemento(Object e) {
		vector_lista.removeElement(e);
	}
	
	public void removerElementoPorIndice(int i) {
		vector_lista.removeElementAt(i);
	}
	
	public void verElementos() {
		vector_lista.forEach(elemento ->{
			System.out.println(elemento);
		});
	}
}
