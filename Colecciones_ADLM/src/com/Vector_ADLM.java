package com;

import java.util.Vector;

public class Vector_ADLM {
	// La clase vector permite guardar elementos de manera dinamica.
	// Para declararlo, se le puede derterminar un tama�o inicial, as� como el ta�o que va a crecer en el caso de sobrepasar ese limite
	// En caso de no colocar el n�mero de espacios que va a crecer y unicamente se coloca un tama�o inicial, entonces el n�mero de espacios se va a duplicar.
	// Cuando no se coloca un tama�o inicial, entonces el tama�o del vector de manera predeterminara ser� 10
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
