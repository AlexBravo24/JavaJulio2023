package com;

public class Principal {

	public static void main(String[] args) {
		
		//Crear a un objeto perro
		//(Instanciando a un objeto perro "Vacío")
		//gracias al constructor vacío (sin argumentos)
		Perro doberman = new Perro();
		
		//Instanciando a un objeto perro
		//con todos sus atributos o argumentos
		Perro dalmata = new Perro("Fido", "Dalmata", "Moteado", 1.9, "Hembra", 4, 2);
		
		//Asignando atributos a mi objeto vacío
		doberman.setNombre("Spike");
		doberman.setEdad(1);
		
		//Imprimir en pantalla o devolver el valor del nombre asignado
		//a mi objeto doberman
		System.out.println(doberman.getNombre());
		System.out.println(dalmata.getSexo());
		//Que pasa si quiero imprimir todos los datos de un objeto/clase
		System.out.println(dalmata);
		System.out.println(doberman);
		
		
		Fruta manzana = new Fruta();
		manzana.setNombre("Manzana");
		Fruta naranja = new Fruta("Naranja", "Tropical", 105);
		
		System.out.println(manzana);
		System.out.println(naranja);
		
		//Van a modelar 5 objetos /Es decir, creamos
		//5 plantillas. Los que ustedes gusten.
		//Le definen a cada objeto 3 atributos minimo
		//Crean sus metodos constructores
		//Sus getters y Setters
		//Su método toString
		//Y van a instanciarlos en esta clase Principal
		//Uno vacio, al cual le asignan
		//valores con setters y uno con todos los argumentos
		
	}
	
	

}
