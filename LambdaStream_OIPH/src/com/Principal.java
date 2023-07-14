package com;

import java.util.stream.Collectors;
import java.util.stream.Stream;
import java.util.*;

public class Principal {

	public static void main(String[] args) {
		// Las expresiones Lambda son funciones anónimas que implemntan un método declarado en una
		// interface funcional
		// Cómo se declaran o utilizan las exprersiones Lambda
		// Su operador es ->
		// Y su sintaxis es la siguiente
		//(parametros) -> {cuerpo de la lambda}
		// Sila función no es muy grande, podemos no necesitar el cuerpo (llaves)
		
		//Creamos una variable de nuestra interface funcional
		
		IMetodo suma = (a,b) -> System.out.println("La suma es: " + (a+b));
		
		//Hasta que hacemos uso del método definido con la expresión lambda es cuando se ejecuta
		
		suma.operacion(5, 8);
		System.out.println(suma);
		
		//API Stream - Funcionalidades que entraron a partir de Java 8
		// Stream - Flujo - arroyo - flujo de datos
		
		//Declaramos un flujo de datos
		
		Stream<String> nombres =Stream.of("Alejandro", "Isaias", "Sarai", "Eduardo", "Felix")
				.filter(a -> a.contains("l"));
		
		//Asignando los valores del flujo de datos a una lista
		List<String> lista =  nombres.collect(Collectors.toList());
		
		System.out.println(lista);
		
		//Crear una lista de objetos Persona
		List<Persona> listaPersonas = new ArrayList<Persona>();
		
		//Crear una lista para almacenar elementos Persona filtrados
		
		List<Persona> listaFiltrada = new ArrayList<Persona>();
		
		//Añadir elementos a nuestra lista original
		listaPersonas.add(new Persona("Alejandro", 24, "Masculino"));
		listaPersonas.add(new Persona("Alexis", 23, "Masculino"));
		listaPersonas.add(new Persona("Eduardo", 25, "Masculino"));
		listaPersonas.add(new Persona("Sarai", 22, "Femenino"));
		listaPersonas.add(new Persona("Osbaldo", 35, "Masculino"));
		listaPersonas.add(new Persona("Angel", 27, "Masculino"));
		listaPersonas.add(new Persona("Felix", 25, "Masculino"));
		listaPersonas.add(new Persona("Juan", 25, "Masculino"));
		listaPersonas.add(new Persona("Diego", 30, "Masculino"));
		listaPersonas.add(new Persona("Alma", 20, "Femenino"));

		//Mostrar por completo los elementos de una lista
		
		System.out.println(listaPersonas);
		
		// Si queremos mostrar todos los elementos , pero individualmente
		// lo hacemos con un ciclo for, de una forma declarativa
		
		/*
		for(int i=0; i<listaPersonas.size(); i++) {
			System.out.println(listaPersonas.get(i));
		}*/
		
		//forEach
		/*
		for(Persona i: listaPersonas) {
			System.out.println(i);
		}*/
		
		//forEach en una sóla línea
		listaPersonas.forEach(System.out::println);
		//Con el API Stream podemos solicitar elementos filtrados,
		// ordenados, etc. Sin utilizar ciclos, recurriendo unicámente
		// a los métodos que nos ofrece esta API
		
		System.out.println();
		//Filtrar a las personas por género
		/*
		listaFiltrada = listaPersonas.stream()
				.filter(item -> item.getGenero().equals("Femenino")).collect(Collectors.toList());
		listaFiltrada.forEach(System.out::println);*/
		
		//Ordenando nuestros objetos por edad ascendente
		listaFiltrada = listaPersonas.stream()
				.sorted(Comparator.comparing(Persona::getEdad))
				.collect(Collectors.toList());
		listaFiltrada.forEach(System.out::println);

	}

}
