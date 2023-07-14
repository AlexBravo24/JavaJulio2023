package com;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Principal {

	public static void main(String[] args) {
		// Las expresiones Lambda son funciones "anonimas" que implementan un metodo
		// declarando en una interface funcional
		
		// como se declaran o utilizan las expresiones Lambda
		// su operador es (->)
		//y su sintaxis es la sig.
		// (parametros) -> {cuerpo de lambda}
		
		// si la funcion no es muy "larga" o grande,
		// podemos no necesitar el cuerpo (llaves).
		
		// Creamos una variable de nuestra interface funcional
		
		IMetodo suma = (a,b) -> System.out.println("La suma es: "+ (a+b));
		IMetodo resta = (a,b) -> System.out.println("La resta es: "+ (a-b));
		
		//Hasta que yo haga uso del metodo que ya defini con la expresion lambda, es cuando se ejecuta
//		suma.operacion(10, 20);
//		resta.operacion(10, 5);

		
		
		// API Stream - Funcionalidades que entraron a partir de Java 8
		// Stream - Flujo - Arroyo - Flujo de datos
		
		//Declaramos un flujo de datos
		
		Stream<String> nombres = Stream.of("Diego","Juan","Pedro").filter(a -> a.contains("e"));
		
		//Asignando los valores del flujo de datos a una lista
		List<String> lista = nombres.collect(Collectors.toList());
//		System.out.println(lista);
		
		// crear una lista de objetos persona
		
		List<Persona> listaPersonas = new ArrayList<Persona>();
		
		// crear una lista para almacenar elementos Persona filtrados
		List<Persona> listaFiltrada = new ArrayList<Persona>();
		
		//Añadir elemntos a nuestra lista persona
		
		listaPersonas.add(new Persona("Diego",25,"MASCULINO"));
		listaPersonas.add(new Persona("Juan",24,"MASCULINO"));
		listaPersonas.add(new Persona("Pedro",30,"MASCULINO"));
		listaPersonas.add(new Persona("Vivian",29,"FEMENINO"));
		listaPersonas.add(new Persona("Regina",20,"FEMENINO"));
		listaPersonas.add(new Persona("Marcos",35,"MASCULINO"));
		listaPersonas.add(new Persona("Isaias",31,"MASCULINO"));
		listaPersonas.add(new Persona("Sarai",23,"FEMENINO"));
		
		//Mostrar por completo los elementos de una lista
		//System.out.println(listaPersonas);
		
		//si queremos mostar todos los elementos, pero individualmente lo hacemos con un ciclo for, de una forma
		//declarativa
		
//		for (int i = 0; i < listaPersonas.size(); i++) {
//			System.out.println(listaPersonas.get(i));
//		}
		
		//forEach
//		for(Persona i: listaPersonas) {
//			System.out.println(i);
//		}
		
		//forEach en una sola linea
		//listaPersonas.forEach(System.out::println);
		
		// Con el API Stream podemos solicitar elementos filtrados, ordenados, etc.
		// Sin utilizar ciclos, recurriendo unicamente a los metodos que nos ofrece esta API
		
		// filtrar a las personas por genero
		listaFiltrada = listaPersonas.stream().filter(a -> a.getGenero()
				.equals("FEMENINO")).collect(Collectors.toList());
		
		//listaFiltrada.forEach(System.out::println);
		
		//ordenando nuestros objetos por edad ascendente
		
		listaFiltrada = listaPersonas.stream().sorted(Comparator.comparing(Persona::getEdad))
				.collect(Collectors.toList());
		
		//listaFiltrada.forEach(System.out::println);
		
		System.out.println();
		
		//ordenar edad descendente
		
		
		listaFiltrada = listaPersonas.stream().sorted(Comparator.comparing(Persona::getEdad).reversed())
				.collect(Collectors.toList());
		
		//listaFiltrada.forEach(System.out::println);
		
		
		//Filtrar todos los datos que cumplan una condicion determinada
		boolean todos = listaPersonas.stream().allMatch(i -> i.getEdad()<30);
		System.out.println(todos);
		
		//Alguno cumple alguna condicion

		boolean alguno = listaPersonas.stream().anyMatch(i -> i.getEdad()<30);
		System.out.println(alguno);
		
		//compararlo contra una condicion especifica
		boolean any = listaPersonas.stream().anyMatch(i -> i.getNombre().equals("Diego"));
		System.out.println(any);
		
		//retornando un valor en la clase optional
		// la clase optional nos permite manejar valores que sean nulos
		// es decir, si el elemento existe, lo devulve, si no, no devuelve el valor
		
		Optional<Persona> menorEdad = listaPersonas.stream().min(Comparator.comparing(Persona::getEdad));
		System.out.println(menorEdad);

	}

}
