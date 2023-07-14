package com;


import java.util.*;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<String> miLista1 = new ArrayList();
		Vector<String> miLista2 = new Vector();
		Map<Integer, String>miLista3 = new HashMap();

		List_ADLM listaList = new List_ADLM(miLista1);
		Vector_ADLM listaVector = new Vector_ADLM(miLista2);
		Map_ADLM listaMap = new Map_ADLM(miLista3);
		
		listaList.agregarElementos("Lunes");
		listaList.agregarElementos("Martes");
		listaList.agregarElementos("Miercoles");
		listaList.agregarElementos("Jueves");
		
		listaList.mostrarDatos();
		
		listaVector.agregarDatos("Enero");
		listaVector.agregarDatos("Febrero");
		listaVector.agregarDatos("Marzo");
		listaVector.agregarDatos("Abril");
		
		listaVector.capacidadVector();
		listaVector.verCuantosElementosContiene();
		
		listaVector.verElementos();
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Ingresa el número de elementos a almacenar");
		int j = entrada.nextInt();
		
		for(int i = 0; i < j; i++) {
			System.out.println("Inserta un elemento");
			String elemento = entrada.next();
			listaMap.agregarDatos(i, elemento);
		}
		
		listaMap.verElementos();
	}

}
