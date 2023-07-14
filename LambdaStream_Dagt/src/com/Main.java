package com;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main  {

	public static void main(String[] args) {
		/* Las expresiones lambda son funciones "anonimas" que 
		 * implementan un metodo declarado en una interfaz funcional
		 * (Que solo tiene un metodo abstracto)
		 */
		
		IFuncional suma = (a,b ) -> System.out.println("La suma es: " + (a+b));
		IFuncional resta =(a,b) -> System.out.println("La resta es: " +  (a-b));
		IFuncional multiplicacion = (a,b) -> System.out.println("La multiplicacion es: " +  (a*b));
		IFuncional division = (a,b) -> System.out.println("La division es: " + (a/b));
		
		suma.operacion(1, 10);
		
		
		
		/*Api Stream 
		 * Stream - Flujo - Arroyo - flujo de datos
		 */
	
		//Declaramos un flujo de datos
		//Stream <String> nombres = Stream.of("Diego","Alejandro","Manuel","Sarai","Eduardo","Felix").filter(a -> a.contains ("l"));
		//Asignando los valores del flujo de datos a una lista
		//List <String> lista = nombres.collect(Collectors.toList());
		//System.out.println(lista);
		
		//Creamos una lista de objetos persona
		List<Persona> listaPersonas = new ArrayList<>();
		
		//Ahora creamos una lista de objetos persona para almacenar las personas filtradas
		List<Persona> personasFiltradas = new ArrayList<>();
		
		//Añadir elementos a la lista de personas
		listaPersonas.add(new Persona("Diego",30,"Hombre"));
		listaPersonas.add(new Persona("Alejandro",24,"Hombre"));
		listaPersonas.add(new Persona("Alexis",23,"Hombre"));
		listaPersonas.add(new Persona("Felix",25,"Hombre"));
		listaPersonas.add(new Persona("Andrea",18,"Mujer"));
		listaPersonas.add(new Persona("Osbaldo",35,"Hombre"));
		listaPersonas.add(new Persona("Sarai",22,"Mujer"));
		listaPersonas.add(new Persona("Angel",27,"Hombre"));
		listaPersonas.add(new Persona("Raul",36,"Hombre"));
		listaPersonas.add(new Persona("Maria",21,"Mujer"));
		
	
		System.out.println(listaPersonas);
	
		//Filtrar a las personas por genero
		personasFiltradas = listaPersonas.stream().filter(a -> a.getGenero().equals("Mujer")).collect(Collectors.toList());
		//Sortear personas por edad
		personasFiltradas = listaPersonas.stream().sorted(Comparator.comparing(Persona::getEdad).reversed()).collect(Collectors.toList());
		//Filtrar todos los datos que cumplan una condicion determinada	
		 boolean mayoresEdad = listaPersonas.stream().allMatch(e -> e.getEdad() > 18);
		 System.out.println(mayoresEdad);
		//personasFiltradas.forEach(System.out::println);
		
		 
		 
		 /*Retornando un valor en la clase Optional
		  * La clase optional nos permite manejar valores que sean nulos
		  * Es decir, si el elemento existe, lo devuelve, si no, no devuelve el valor
		  * 
		  */
		
		 Optional <Persona> menorEdad= listaPersonas.stream().min(Comparator.comparing(Persona::getEdad));
		 System.out.println(menorEdad);
	}


}
