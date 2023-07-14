package com;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Principal {

	public static void main(String[] args) {
		
		// Las expresiones Lambda son funciones "anónimas"
		//que implementan un método declarado en
		//una interface funcional
		//Cómo se declaran o utilizan las expresiones Lambda
		//Su operador es (->)
		//Y su sintaxis es la siguiente
		// (parametros) -> {cuerpo de lambda}
		//Si la función no es muy "larga" o grande, 
		//podemos no necesitar el cuerpo (llaves)
		
		//Creamos una variable de nuestra interface funcional
		
		IMetodo suma = (a,b) -> System.out.println("La suma es: " + (a+b));
		IMetodo resta = (a,b) -> System.out.println("La resta es: " + (a-b));
		//Hasta que yo hago uso del método que ya defini con la expresion
		//lambda, es cuando se ejecuta
		
		//suma.operacion(10, 55);
		//resta.operacion(88, 43);
		
		//API Stream - Funcionalidades que entraron a partir de Java 8
		//Stream - Flujo - arroyo -  flujo de datos
		
		//Declaramos un flujo de datos
		
		Stream<String> nombres = Stream.of("Alejandro","Isaías","Sarai","Eduardo","Felix")
				.filter(a -> a.contains("l"));
		
		//Asignando los valores del flujo de datos a una lista
		List<String> lista = nombres.collect(Collectors.toList());
		//System.out.println(lista);
		
		//Crear una lista de objetos Persona
		
		List<Persona> listaPersonas = new ArrayList<Persona>();
		
		//Crear una lista para almacenar elementos Persona filtrados
		List<Persona> listaFiltrada = new ArrayList<Persona>();
		
		//Añadir elementos a nuestra lista original
		
		listaPersonas.add(new Persona("Alejandro", 24, "MASCULINO"));
		listaPersonas.add(new Persona("Alexis", 23, "MASCULINO"));
		listaPersonas.add(new Persona("Eduardo", 25, "MASCULINO"));
		listaPersonas.add(new Persona("Sarai", 22, "FEMENINO"));
		listaPersonas.add(new Persona("Osbaldo", 35, "MASCULINO"));
		listaPersonas.add(new Persona("Ángel", 27, "MASCULINO"));
		listaPersonas.add(new Persona("Félix", 25, "MASCULINO"));
		listaPersonas.add(new Persona("Juan", 25, "MASCULINO"));
		listaPersonas.add(new Persona("Diego", 30, "MASCULINO"));
		listaPersonas.add(new Persona("Alma", 20, "FEMENINO"));
		
		//Mostrar por completo los elementos de una lista
		System.out.println(listaPersonas);
		
		//Si queremos mostrar todos los elementos, pero individualmente
		//lo hacemos con un ciclo for, de una forma declarativa
		
//		for (int i = 0; i < listaPersonas.size(); i++) {
//			System.out.println(listaPersonas.get(i));
//		}
		
		//forEach
//		for(Persona i: listaPersonas) {
//			System.out.println(i);
//		}
		
		//forEach en un sola linea
		//listaPersonas.forEach(System.out::println);
		
		//Con el API Stream podemos solicitar elementos filtrados,
		//ordenados, etc. Sin utilizar ciclos, recurriendo unicamente
		//a los métodos que nos ofrece esta API
		
		//Filtrar a las personas por genero
//		listaFiltrada = listaPersonas.stream().filter(item-> item.getGenero()
//				.equalsIgnoreCase("masculino")).collect(Collectors.toList());
//		listaFiltrada.forEach(System.out::println);
		
		//Ordenando nuestros objetos por edad ascendente/descentende con .reversed
//		listaFiltrada = listaPersonas.stream()
//				.sorted(Comparator.comparing(Persona::getEdad).reversed())
//				.collect(Collectors.toList());
//		listaFiltrada.forEach(System.out::println);
		
		//Todos cumplen una condicion determinada
		boolean todos = listaPersonas.stream().allMatch(i -> i.getEdad()<30);
		System.out.println(todos);
		
		//Alguno cumple una condicion
		boolean alguno = listaPersonas.stream().anyMatch(i -> i.getEdad()<30);
		System.out.println(alguno);
		
		//Compararlo contra una condicion especifica
		boolean any = listaPersonas.stream().anyMatch(i -> i.getNombre().equals("Eduardo"));
		System.out.println(any);
		
		//Retornando un valor en la clase Optional
		//La clase Optional nos permite manejar valores que sean nulos
		//Es decir, si el elemento existe, lo devuelve, si no, no devuelve el valor
		
		Optional<Persona> menorEdad = listaPersonas.stream()
				.min(Comparator.comparing(Persona::getEdad));
		System.out.println(menorEdad);
		
	}

}
