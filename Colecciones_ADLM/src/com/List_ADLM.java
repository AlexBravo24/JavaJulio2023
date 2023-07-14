package com;

import java.util.*;

public class List_ADLM {
	// List pertenece al api de colecciones de java
	// Los list permiten almacenar una colecci�n de objetos y siempre estar�n en el mismo orden en el que fueron colocados, adem�s el ta�o es din�mico, es decir, puedes guardar tantos elementos como requieras
	
	List miLista;

	public List_ADLM(List miLista) {
		super();
		this.miLista = miLista;
	}

	public List getMiLista() {
		return miLista;
	}

	public void setMiLista(List miLista) {
		this.miLista = miLista;
	} 

	public void agregarElementos(Object e) {
		miLista.add(e);
	}
	
	public void eliminarElementos(int e) {
		miLista.remove(e);
	}
	
	public void mostrarDatos() {
		miLista.forEach( elemento ->{
			System.out.println(elemento);
		});
	}
	
	public void verSize() {
		System.out.println(miLista.size());
	}
	
	public void borrarTodosLosDatos() {
		miLista.clear();
	}
	
	public void verificarExistenciaElemento(Object e) {
		miLista.contains(e);
	}
}
