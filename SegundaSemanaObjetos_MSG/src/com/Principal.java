package com;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Crear objeto perro
		// Isntanciando un objeto perro "Vacio"
		//gracias al ocntructor vacio sin argumentos
		
		
		Perro doberman = new Perro();
		
		
		// Instanciando aun objeto perro con todos sus atributos o argumentos
		
		Perro dalmata = new Perro("Fido", "Dalamata", "Cafe", 1.2, "MAcho", 4, 10);
		
		//Asignando objetos a mi atributo vacio
		
		doberman.setNombre("Fido");
		doberman.setEdad(1);
		
		// Imprimir en pantalla o devolver el valor del nombre asignado ami objeto doberman
		
		System.out.println(doberman.getNombre());
		System.out.println(dalmata.getSexo());
		
		// que pasa si quiero imprimir tdos los datos de un objeto de una clase
		
		System.out.println(dalmata);
		System.out.println(doberman);
		
		// modelar 5 objetos, le definen a cada objeto 3 atributos minimo
		//crear metodos constructores y , getters y setters
		// 
		
		
		// Clase Computadora 
		
		
		Computadora Dell = new Computadora();
		
			Dell.setMarca("Dell");
			Dell.setMemoria(8);
		
		Computadora Asus = new Computadora("Asus", "Inspiron", "Windows", 8, 500, "Gris");
		
		System.out.println(Asus);
		System.out.println(Dell);

		
		// Clase palomitas
		
		Palomitas Cinepolis = new Palomitas("Takis", "Grande", "Barcel");
		
		Palomitas Cinemex = new Palomitas();
		
			Cinemex.setSabor("Takis");
			Cinemex.setMarca("Barcel");
		
		System.out.println(Cinepolis);
		System.out.println(Cinemex);
		
		// Clase Audifonos
		
		Audifonos Bose = new Audifonos("Bose", "Negros", "150 ohm", "Ultra");
		
		Audifonos Airpods = new Audifonos();
		
			Airpods.setMarca("Bose");
			Airpods.setColor("Blancos");
		
		System.out.println(Bose);
		System.out.println(Airpods);
		
		
		// Clase ciudades
		
		Ciudades CDMX = new Ciudades();
		
			CDMX.setPais("Mexico");
		
		Ciudades Guadalajara = new Ciudades("Guadalajara", "Mexico", 1236584);
		
		System.out.println(CDMX);
		System.out.println(Guadalajara);
		
		
		// Clase Bicicletas
		
		Bicicletas Benotto = new Bicicletas();
		
			Benotto.setTipo("De Monataña");
			Benotto.setColor("Rojo");
		
		Bicicletas Mercurio = new Bicicletas("Mercurio", "Azul", "Grande", "Carreras");
		
		System.out.println(Benotto);
		System.out.println(Mercurio);
		
		
		
		
	}

}
