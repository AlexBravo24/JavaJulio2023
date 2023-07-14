package com;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Principal {

	public static void main(String[] args) {
		
		// Las expresiones Lambda son funciones "anonimas" que
		//implementan un método declarado en una interface funcional
		
		//Una interface funcional es una interface que sólo tiene
		//un método abstracto.
		
		//Cómo se declara o utilizan las expresiones Lambda es con
		//su operador que es "->".
		//Su sintaxis es la siguiente:
		//(parametros)-> {cuerpo de Lambda}
		//Si la función no es muy grande, es posible que no se necesite el cuerpo
		
		
		//Creamos una variable de nuestra interface funcional
		
		IMetodo suma = (a,b) -> System.out.println("La suma es :"+(a+b));
		IMetodo resta = (a,b) -> System.out.println("La resta es :"+(a-b));
		
		IMetodo multiplicacion = (a,b)->System.out.println("La multiplicacion es:"+(a*b));
		//Hasta que yo hago uso del méto que ya definí con la expresion
		//es cuando se ejecuta.
		
		Scanner entrada = new Scanner(System.in);
		int numeros;
		
		
		//suma.operacion(5, 10);
		//resta.operacion(88,43);
		
		//System.out.println();
		//System.out.println("Inserte la cantidad de números que desea multipliar");
		//numeros=entrada.nextInt();
//		for (int i=1;i<numeros;i++) {
//			System.out.println("Inserte el numero a: ");
//			int a,b;
//			a=entrada.nextInt();
//			System.out.println("Inserte el numero b:");
//			b=entrada.nextInt();
//			entrada.nextLine();
//			
//			multiplicacion.operacion(a, b);
//		}
		
		//API Stream- Funcionalidades que entraron a partir de Java 8
		//Stream- Flujo- Arroyo- Flujo de Datos- 
		
		//Declaramos un flujo de datos 
		
		Stream<String> nombres = Stream.of("Alejandro","Isaias","Sarai","Eduardo","Felix")
				.filter(a -> a.contains("l"));
		
		//Asignando los valores del flujo de datos a una lista
		
		List <String> lista = nombres.collect(Collectors.toList());
		
		//System.out.println(lista);
		
		//Crear una lista de objetos Persona.
		
		List<Persona> listaPersonas=new ArrayList<Persona>();
		
		//Crear una lista para almacenar elementos persona
		//De forma filtrada 0.o
		
		List<Persona> listaFiltrada= new ArrayList<Persona>();
		
		//Añadir elementos a la lista original 
		
		listaPersonas.add(new Persona("Alejandro", 24, "MASCULINO"));
		listaPersonas.add(new Persona("Alexis", 23, "MASCULINO"));
		listaPersonas.add(new Persona("Eduardo", 25, "MASCULINO"));
		listaPersonas.add(new Persona("Sarai", 22, "FEMENINO"));
		listaPersonas.add(new Persona("Osbaldo", 35, "MASCULINO"));
		listaPersonas.add(new Persona("Angel", 27, "MASCULINO"));
		listaPersonas.add(new Persona("Felix", 25, "MASCULINO"));
		listaPersonas.add(new Persona("Juan", 24, "MASCULINO"));
		listaPersonas.add(new Persona("Diego", 30, "MASCULINO"));
		listaPersonas.add(new Persona("Alma", 20, "FEMENINO"));
		
		//Mostrar por completo los elementos de una lista
		//System.out.println(listaPersonas);
		
		//Si queremos mostrar todos los elementos, pero individualmente
		//Se hace en un ciclo for
		
//		for(int i=0;i<listaPersonas.size();i++) {
//			System.out.println(listaPersonas.get(i));
//		}
		//forEach
//		for(Persona i:listaPersonas) {
//			
//			if(i.getEdad()>=30) {
//				System.out.println(i);
//			}
//			else {
//				System.out.println("Es menor de 30"+i.getNombre());
//			}
//				
//		}
		
		//forEach en una sola línea
		
//		listaPersonas.forEach(System.out::println);
		
		//Con el API Stream podemos solicitar elementos filtrados
		//ordenados, etc, sin necesidad de recurrir a ciclos
		//unicamente utilizando los filtros de API
		
		//Filtrar personas por genero
//		listaFiltrada = listaPersonas.parallelStream().filter(a ->a.getGenero()
//				.equalsIgnoreCase("FEMeNINO")).collect(Collectors.toList());
//		listaFiltrada.forEach(System.out::println);
		
//		//Ordenando los objetos por orden ascendente
//		listaFiltrada=listaPersonas.stream()
//				.sorted(Comparator.comparing(Persona::getEdad).reversed())
//				.collect(Collectors.toList());
//		listaFiltrada.forEach(System.out::println);
		
		//Todos cumplen una condición determinada
//		boolean todos = listaPersonas.parallelStream().allMatch(i -> i.getEdad()<30);
//		System.out.println(todos);
		
//		//Alguno cumple una condicion
//		boolean alguno = listaPersonas.parallelStream().anyMatch(i -> i.getEdad()<30);
//		System.out.println(alguno);
		
		//Compararlo con una condicion especific
//		boolean any =listaPersonas.parallelStream().anyMatch(i -> i.getNombre().equals("Eduardo"));
//		System.out.println(any);
		
		//Retornando un valor en la clase Optional
		//La clase Optional nos permite manejar valores que sean nulos
		//Es decir, si el elemento existe lo devuelve, si no, no devuelve 
		//el valor.
		
		Optional<Persona> menorEdad = listaPersonas.stream()
				.min(Comparator.comparing(Persona::getEdad));
		System.out.println(menorEdad);
				
		
	}

}
