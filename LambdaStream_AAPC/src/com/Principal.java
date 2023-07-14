package com;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Principal {

	public static void main(String[] args) {
		//Las expresiones Lambda son funciones "anonimas"
		//que implementan un metodo declarado en una interface funcional
		
		//Como se declaran o utilizan las expresiones lambda 
		//es a traves de un operador es (->) 
		//y su sintaxis es la siguiente
		//(paramentros) -> {cuerpo de lambda}
		//si la funcion no es muy "larga" o grande, podremos no necesitar el cuerpo el uso
		//de {}
		
		//creamos una varibale de nuestra interface funcional
		
		IMetodo suma = (a,b) -> System.out.println("La suma es: " +  (a+b));
		IMetodo resta = (a,b) -> System.out.println("La resta es: " + (a-b));
		
		
		//HAsta que yo hago uso del metodo que ya deini con la expresion
		//lambda, es cuando se ejecuta
		suma.operacion(10,55);
		resta.operacion(100,88);
		
		//API Stream - Funcionalidades que entraron a partir de java 8
		//Stream - Flujo - arroyo - flujo de datos
		
		//Declaramos un flujo de datos
		
		Stream<String> nombres = Stream.of("Alejandro","Isaias","Sarai","Eduardo","Felix").filter(a->a.contains("l"));
		
				
		
		//asignando los valores del flujo de datos a una lista
		
		List<String> lista = nombres.collect(Collectors.toList());
		
		System.out.println(lista);
		
		//Crear una lista de objetos persona.
		
		List<Persona> listaPersonas = new ArrayList <Persona>();
		
		//Crear una lista para almacenar elementos Persona filtrados
		List<Persona> listaFiltrada = new ArrayList <Persona>();
		
		//Añadir elementos a nuestra lista original
		
		listaPersonas.add(new Persona("Alejandro",24,"Masculino"));
		listaPersonas.add(new Persona("Alexis",23,"Masculino"));
		listaPersonas.add(new Persona("Eduardo",25,"Masculino"));
		listaPersonas.add(new Persona("Sarai",22,"Femenino"));
		listaPersonas.add(new Persona("Osbaldo",35,"Masculino"));
		listaPersonas.add(new Persona("Angel",27,"Masculino"));
		listaPersonas.add(new Persona("Felix",25,"Masculino"));
		listaPersonas.add(new Persona("Juan",25,"Masculino"));
		listaPersonas.add(new Persona("Diego",30,"Masculino"));
		listaPersonas.add(new Persona("Alma",20,"Femenino"));
		//Mostrar por completo los elementos de una lista
		System.out.println(listaPersonas);
		
		//Si queremos mostrar todos los elementos, pero individualmente 
		//lo hacemos con un ciclo for de una forma declarativa 
		
//		for (int i = 0; i < listaPersonas.size(); i++) {
//			System.out.println(listaPersonas.get(i));					}
		
		//forEach
//		for(Persona i: listaPersonas) {
//			System.out.println(i);
//		}
		
		//for each en una sola linea
		listaPersonas.forEach(System.out::println);
		
//		//con el API Stream podemos solicitar elementos filtrados, ordenados
//		etc, sin utilizar ciclos, recurriendo unicamente a los metodos que nos 
//		ofrece esta API.
		
		//filtrar personas por genero
//		
//		listaFiltrada = listaPersonas.stream()	.filter(a->a.getGenero().equals("Femenino")).collect(Collectors.toList());
//		listaFiltrada.forEach(System.out::println);
//		
//		//ordenando nuestro objetos por edad ascendente
//	listaFiltrada = listaPersonas.stream().sorted(Comparator.comparing(Persona::getEdad)).collect(Collectors.toList()	);
//	listaFiltrada.forEach(System.out::println);

		//todos cumplen una condicion determinada
		boolean todos = listaPersonas.stream().allMatch(i->i.getEdad()<30);
		System.out.println(todos);

		//alguno cumple con una condicion
		
		boolean alguno =listaPersonas.stream().anyMatch(i->i.getEdad()<30);
		System.out.println(alguno);
		
		//C+ompararlo contra una condicion especifica
		boolean any= listaPersonas.stream().anyMatch(i->i.getNombre().equals("Eduardo"));
		System.out.println(any);
		
		//Retornando un valor en la clase optional
		//la clase optional nos permite manejar valores que sean nulos
		//es decir, si el elemento existe, lo devuelve, si no, no devuelve el valor 
		
		Optional<Persona> menorEdad = listaPersonas.stream().min(Comparator.comparing(Persona::getEdad));
		
		System.out.println(menorEdad);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
