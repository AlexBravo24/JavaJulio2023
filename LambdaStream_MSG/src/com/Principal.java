package com;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Principal {

	public static void main(String[] args) {

		// Las expresiones Lambda son funciones anonimas que implemnetan un metodo declrado en un interface funcional
		
		//como se declaran o ytilizan las expresiones lambda
		// su operador es ->
		// su sintaxis es (parametros) -> cuerpo de lambda
		//si la funcion no es grande podemos no necesitar el cuerpo (llaves)
		
		// creamos una variable de nuestra interface fucional
		
//		IMetodo suma = (a,b) -> System.out.println("La suma es: " + (a+b));
//		IMetodo resta = (a,b) -> System.out.println("La resta es: " + (a-b));
//		IMetodo division = (a,b) -> System.out.println("La division es: " + (a/b));
//		
		
		// hasta que yo haga uso el metodo que ya defini cn la expresion lambda es cuando se ejcuta
		
//		suma.operacion(10, 55);
//		resta.operacion(88, 43);
//		division.operacion(12, 2);
		
		//API STREAM
		// Stream - Flujo - Arrollo - Flujo de datos
		
		//Stream<String> nombres = Stream.of("Alejandro", "Isaias", "Sarai").filter(a -> a.contains("l"));
		
		//Asignamos los valores del flujo de datos a una kista
		
		//List<String> lista = nombres.collect(Collectors.toList());
		//System.out.println(lista);
		
		// crear una lista de objetos persona
		
		List <Personas> ListaPersonas = new ArrayList <Personas>();
		
		// Crear una lista para alamcenar elementos personas filtrados
		
		List <Personas> ListaFiltrada = new ArrayList <Personas>();
		
		// añadir elemnetos a nustra lista original
		
		ListaPersonas.add(new Personas("Alejandro", "MASCULINO", 24));
		ListaPersonas.add(new Personas("Alexis", "MASCULINO", 24));
		ListaPersonas.add(new Personas("Eduardo", "MASCULINO", 22));
		ListaPersonas.add(new Personas("Sarai", "FEMENINO", 24));
		ListaPersonas.add(new Personas("Osbaldo", "MASCULINO", 23));
		ListaPersonas.add(new Personas("Angel", "MASCULINO", 24));
		ListaPersonas.add(new Personas("Felix", "MASCULINO", 23));
		ListaPersonas.add(new Personas("Juan", "MASCULINO", 28));
		ListaPersonas.add(new Personas("Diego", "MASCULINO", 27));
		ListaPersonas.add(new Personas("Alma", "FEMENINO", 26));
		
		// mostrar po completo los elemntos de las listas
		//System.out.println(ListaPersonas);
		
		//si queremos mstar todos los elementos pero individualmente
		//lo hacemos con un ciclo for, de una froma declarativa
		
//		for (int i = 0; i < ListaPersonas.size(); i++) {
//			System.out.println(ListaPersonas.get(i));
//			
//		}
		
		
		// con el API Stream podemos solicitar elementos filtrados, ordenados, etc. sin utilizar ciclos, recorriendo
		// unicamente a los metodos que nos ofrece esta API
		
		// Filtrar a las personas por genero
		
//		ListaFiltrada = ListaPersonas.stream().filter(a ->a.getGenero().equals("MASCULINO")).collect(Collectors.toList());
//		ListaFiltrada.forEach(System.out::println);
		
		// ordenar nuestros objetos por edad ascendente
//		
//		ListaFiltrada = ListaPersonas.stream().sorted(Comparator.comparing(Personas::getEdad).reversed()).collect(Collectors.toList());
//		ListaFiltrada.forEach(System.out::println);
		
		
		// Todos cumplen con una condicion determinada
		boolean todos = ListaPersonas.stream().allMatch(i -> i.getEdad()<30);
		System.out.println(todos);
		
		// Alguno cumple una condicion
		boolean alguno =ListaPersonas.stream().anyMatch(i -> i.getEdad()<30);
		System.out.println(alguno);
		
		// comparando contra una condicion especifica
		boolean any = ListaPersonas.stream().anyMatch(i -> i.getNombre().equals("Eduardo"));
		
		//Retornando un valor en la clase optional
		//La clase optional nos permite manejar valores que sean nulos
		// es decir si el elemnto existe lo devuelve, si no, no lo devuelve
		Optional<Personas> menorEdad = ListaPersonas.stream().min(Comparator.comparing(Personas::getEdad));
		System.out.println(menorEdad);
		
		
		
		
		
	} // cierre main

} // cierre class
