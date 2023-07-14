package com;

import java.util.*;
import java.util.function.*;
import java.util.stream.*;

public class Principal {

	public static void main(String[] args) {
		/*Las expresiones Lambda son funciones anonimas que
		 * implementan un método declarado en una interface
		 * funcional
		*/
		BiConsumer<Integer, Integer> resta = (a, b) -> System.out.println("La resta es: " + ( a - b));
		//resta.accept(10, 20);
		
		IMetodo suma = (a, b) -> System.out.println("La suma es: " + (a + b));
		//suma.operacion(10, 20);
		
		Stream<String> nombres = Stream.of("Alejandro", "Isaías", "Sarai", 
				"Eduardo", "Felix").filter(a -> a.contains("l"));
		
		List<String> lista = nombres.collect(Collectors.toList());
		
		//lista.forEach(elemento -> {
		//	System.out.println(elemento);
		//});
		
		List<Persona> listaPersonas = new ArrayList();
		List<Persona> listaFiltrado = new ArrayList();
		
		// Añadir elementos
		
		listaPersonas.add(new Persona("Karla", "F", 24));
		listaPersonas.add(new Persona("Alejandro", "M", 24));
		listaPersonas.add(new Persona("Pamela", "F", 24));
		listaPersonas.add(new Persona("Roberto", "M", 25));
		listaPersonas.add(new Persona("Shakira", "F", 27));
		listaPersonas.add(new Persona("Carol", "F", 21));
		listaPersonas.add(new Persona("Jimena", "F", 23));
		listaPersonas.add(new Persona("Diego", "M", 38));
		
		//System.out.println(listaPersonas);
		//listaFiltrado = listaPersonas.stream().filter(a -> a.getGenero().equals("F")).collect(Collectors.toList());
		//listaFiltrado = listaPersonas.stream().sorted(Comparator.comparing(Persona::getEdad)).collect(Collectors.toList());
		
		//listaFiltrado.forEach(System.out::println);
		
		boolean todos = listaPersonas.stream().allMatch(i -> i.getEdad()<30);
		System.out.println(todos);
		
		boolean alguno = listaPersonas.stream().anyMatch(i -> i.getEdad()<30);
		System.out.println(alguno);
		
		boolean any = listaPersonas.stream().anyMatch( i -> i.getNombre().equals("Karla"));
		System.out.println(any);
		
		Optional<Persona> menorEdad = listaPersonas.stream().max
				(Comparator.comparing(Persona::getEdad));
		System.out.println(menorEdad);
	}
}