package com;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Principal {

	public static void main(String[] args) {
		/*LAS EXPRECIONES LAMBDA
		 * SON FUNCIONES ANONIMAS QUE IMPLEMENTAN UN METODO DECLARADO EN UNA INTERFACE FUNCIONALO
		 * 
		 * COMO SE DECLARAN O UTILIZAN LAS EXPRESIONES LAMBDA SU OPERADOR ES (->
		 * Y SU SINTAXIS ES LA SIGUENTE 
		 * (parametros)-> {CUERPO DE LAMBDA}
		 * SI LA FUNCION NO ES MUY LARGA O GRANDE PODEMOS NO NECESITAR EL CUERPO (LLAVES)
		 * 
		 * 
		 * CREAMOS UNA VARIABLE EN NUESTRA INTERFACE FUNCIONAL
		 */
		
		IMetodo suma = (a,b) -> System.out.println("LA SUMA ES "+ (a+b));
		IMetodo resta = (a,b) -> System.out.println("LA RESTA ES "+ (a-b));
		
		//Hata que yo hago uso del metodo que ya identifique con la expresion lambda es cuando se ejecutara 
		
		suma.operacion(10, 55);
		resta.operacion(88, 55);
		
		
		
		
		//API STREAM
		//Stream flujo - arroyo-flujo de datos 
		
		Stream<String> nombres = Stream.of("ALEJANDRO","ISAIAS","SARAI","EDUARDO","FELIX")
				.filter(a -> a.contains("l"));
		
		//ASIGNANDO LOS VALORES DEL FLUJO DE DATOS A UNA LISTA 
		List<String> lista = nombres.collect(Collectors.toList());
		System.out.println(lista);
		
		//CREAR UNA LISTA DE OBJETOS PERSONA
		
		List<Persona> listaPersonas = new ArrayList<Persona>();
		
		//CREAR UNA LISTA PARA ALMACENAR ELEMENTOS FILTRADOS 
		List<Persona> listaFiltrada = new ArrayList<Persona>();
		
		//AÑADIR ELEMENTOS A NUESTRA LISTA ORIGINAL
		
		listaPersonas.add(new Persona("ALEJANDRO",24,"MASCULINO"));
		listaPersonas.add(new Persona("ALEXIS",23,"MASCULINO"));
		listaPersonas.add(new Persona("EDUARDO",25,"MASCULINO"));
		listaPersonas.add(new Persona("SARAI",22,"FEMENINO"));
		listaPersonas.add(new Persona("OSBALDO",35,"MASCULINO"));
		listaPersonas.add(new Persona("ANGEL ",27,"MASCULINO"));
		listaPersonas.add(new Persona("FELIX",25,"MASCULINO"));
		listaPersonas.add(new Persona("JUAN",25,"MASCULINO"));
		listaPersonas.add(new Persona("DIEGO",30,"MASCULINO"));
		listaPersonas.add(new Persona("ALMA",20,"FEMENINO"));
		
		//MOSTRAR POR COMPLETO LOS ELEMENTOS 
		System.out.println(listaPersonas);
		
		//SI QUEREMOS MOSTRAR TODOS LOS ELEMENTOS PERO INDIVIDUALMENTE LO HACEMOS CON UN  CICLO FOR 
		
//		for(int i=0; i<listaPersonas.size();i++) {
//			System.out.println(listaPersonas.get(i));
//		}
//		forEach
//		for(Persona i: listaPersonas) {
//			System.out.println(i);
//	}
		
		listaPersonas.forEach(System.out::println);
		
		/*CON EL API STREAM PODEMOS SOLICITAR ELEMENTOS FILTRADOS ORDENADOS ETC. SIN UTILIZAR CICLOS RECRRIENDO
		 * SIN UTILIZAR CICLOS RECCURRIENDO A LOS MATODOS QUE NOS OFRECEN ESTA API
		 */
		
		//Filtrar a las personas por genero
//		listaFiltrada = listaPersonas.stream().filter(a-> a.getGenero()
//				.equals("FEMENINO")) .collect(Collectors.toList());
//		listaFiltrada.forEach(System.out::println);
//		
//		listaFiltrada = listaPersonas.stream()
//				.sorted(Comparator.comparing(Persona::getEdad)).collect(Collectors.toList());
//				listaFiltrada.forEach(System.out::println);
		
		//ordenar nuestros objetos por edad ascendente / desendente con .reverse
//				
		
		//TODOS CUMPLEN CON UNA COINCIDENCIA 
		
		boolean todos = listaPersonas.parallelStream().allMatch(i -> i.getEdad()<30);
		System.out.println(todos);
		
		//ALGUNO CUMPLKE UNA COINCIDENCIA
		boolean alguno = listaPersonas.parallelStream().anyMatch(i -> i.getEdad()<30);
		System.out.println(alguno);
		
		//COMPARARLO CONTRA UNA COINCIDENCIA ESPECIFICA
		boolean any = listaPersonas.parallelStream().anyMatch(i -> i.getNombre().contentEquals("SARAI"));
		System.out.println(any);
		
		/*RETORNANDO UN VALOR EN LA CLASE OPTIONAL 
		 * LA CLASE OPTIONAL NOS PERMITE MANEJAR VALORES QUE SEAN NULOS 
		 * ES DECIR SI EL ELEMENTO EXIXTE LO DEVUELVE SI NO DEVUELVE EÑ VALOR 
		 */
		
		Optional<Persona> menorEdad = listaPersonas.stream()
				.min (Comparator.comparing(Persona::getEdad));
		System.out.println(menorEdad);
		
				
			
		
		
		
		

	}

}
