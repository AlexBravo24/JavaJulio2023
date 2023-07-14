package com;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Principal {

	public static void main(String[] args) {
		//Las expreciones lambda son funciones "anonimas" que implementan 
		//un metodo declarado en una interface funcional
		
		//Como se declaran o utilizan las expreciones lambda 
		//Su operador es " -> "
		//Y su sintaxis es la siguiente
		// (parametro) -> {cuerpo de lambda}
		//Si la funcion no es muy grande podemos no necesitar el cuerpo
		//{llaves}
		
		//Creamos una variable de nuestra interface funcional
		
		IMetodo suma = (a,b) -> System.out.println("La suma es:  " +(a+b) );
		IMetodo resta = (a,b) -> System.out.println("La resta es:  " +(a-b) );
		IMetodo multiplicacion = (a,b) -> System.out.println("La multiplicación es:  " +(a*b) );
		IMetodo division = (a,b) -> System.out.println("La división es:  " +(a/b) );


		//Hasta que yo hago uso del metodo que ya defini con la expresion
		//lambda es cuando se efectua
		
//		suma.operación(10, 55);
//		resta.operación(55, 10);
//		multiplicacion.operación(45, 2);
//		division.operación(10, 5);
		
		//API Stream - Funcionalidades que entran apartir de Jav 8
		//Stream - Flujo - arroyo - flujo de datos
		
		//Declaramos un flujo de datos
		
		Stream<String> nombres = Stream.of("Alejandro", "Isaias", "Sarai","Eduardo", "Felix")
				.filter(a -> a.contains("l"));
		
		//Asiganando los valores del flujo de datos a una lista
		
		List<String> lista = nombres.collect(Collectors.toList());
		System.out.println(lista);
		
		//Vamos a crear una lista de objetos Persona
		List<Persona> listaPersonas = new ArrayList<Persona>();
		
		//Crear una lista para alamacenar elementos Persona filtrados
		List<Persona> listaFiltrada = new ArrayList<Persona>();
		
		 // Añadir elementos a nuestra lista original
		listaPersonas.add(new Persona("Daniel", 25, "MASCULINO"));
		listaPersonas.add(new Persona("Alejandro",24, "MASCULINO"));
		listaPersonas.add(new Persona("Alexis",23, "MASCULINO"));
		listaPersonas.add(new Persona("Eduardo",25, "MASCULINO"));
		listaPersonas.add(new Persona("Sarai",22, "FEMENINO"));
		listaPersonas.add(new Persona("Oswaldo",35, "MASCULINO"));
		listaPersonas.add(new Persona("Angel",27, "MASCULINO"));
		listaPersonas.add(new Persona("Felix",25, "MASCULINO"));
		listaPersonas.add(new Persona("Juan",25, "MASCULINO"));
		listaPersonas.add(new Persona("Diego",30, "MASCULINO"));
		listaPersonas.add(new Persona("Alma",20, "FEMENINO"));
		
		//Mostrar por completo los elementos de una lista
//		System.out.println(listaPersonas);
		
		//Siq queremos mostrar todos los elemmentos, pero de manera individual
		//lo hacemos con un ciclo de for, de una forma declarativa
		
//		for (int i = 0; i < listaPersonas.size(); i++) {
//			System.out.println(listaPersonas.get(i));
//			}
	
		//ForEach
//		for (Persona i: listaPersonas) {
//			System.out.println(i);
//		}
		
		//forEach en una sola linea
		//listaPersonas.forEach(System.out::println);
		
		//Con el API Stream podemos solicitar elementos diltrados,
		//ordenados, etc.Sin utilizar ciclos, recurriendo unicamente 
		//a los metodos que nos ofrece esta API
		
		//Filtrar a las personas por genero
		
//		listaFiltrada = listaPersonas.stream().filter(a->a.getGenero()
//				.equalsIgnoreCase("masculino")).collect(Collectors.toList());
//		listaFiltrada.forEach(System.out::println);
		
		//Ordenar nuestros objetos por edad ascendente/ con el .reversed()
//		listaFiltrada = listaPersonas.parallelStream()
//				.sorted(Comparator.comparing(Persona::getEdad).reversed())
//				.collect(Collectors.toList());
//		listaFiltrada.forEach(System.out::println);
		
		//Todos cumplen una condición determinada
		boolean todos = listaPersonas.stream().allMatch(i -> i.getEdad()<30);
		System.out.println(todos);
		
		//alguno cumple una condición
		boolean alguno = listaPersonas.stream().anyMatch(i -> i.getEdad()<30);
		System.out.println(alguno);
		
		//Compararlo contra una condición especifica
		boolean any = listaPersonas.stream().anyMatch(i -> i.getNombre().contentEquals("Eduardo"));
		System.out.println(any);
		
		//Retornando un valor en la clase Optional
		//La clase Optionla nos permite manjear valores que sean nulos
		//Es decir si el elemento existe, si no, no devulve el valor
		
		Optional<Persona>menorEdad = listaPersonas.stream().min(Comparator.
				comparing(Persona::getEdad));
		System.out.println(menorEdad);
		
	}  
	
	}


