package com;

import java.util.Map;

public class Map_ADLM {
	// Map es una coleccion de datos que necesita de un identificar para cada elementos que se agregue
	Map listaMap;

	public Map_ADLM(Map listaMap) {
		super();
		this.listaMap = listaMap;
	}

	public Map getListaMap() {
		return listaMap;
	}

	public void setListaMap(Map listaMap) {
		this.listaMap = listaMap;
	}
	
	public void agregarDatos(Object i, Object j) {
		listaMap.put(i, j);
	}
	
	public void verElementoPorClave(Object i) {
		listaMap.get(i);
	}
	
	public void verficarSiExisteElementoPorClave(Object i) {
		listaMap.containsKey(i);
	}
	
	public void verficarSiExisteElementoPorElemento(Object i) {
		listaMap.containsValue(i);
	}
	
	public void verElementos() {
		listaMap.values().forEach(elemento ->{
			System.out.println(elemento);
		});
	}
}
