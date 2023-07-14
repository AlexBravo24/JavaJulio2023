package com;

public class Principal {

	public static void main(String[] args) {
		// 
		
		//Crear a un objeto perro
		//(Instanciando a un objeto perro "Vacio")
		//gracias al constructor vacio (sin argumentos)
		
		Perro doberman = new Perro();
		
		//Instanciando a un objeto perro
		//Con todos sus argumentos y parametros
		Perro dalmata = new Perro("Fido", "Dalmada", "moteado", 1.9, "hembra", 1, 1);
				
		
		//Asignando atributos a mi objeto vacio
		doberman.setNombre("Spike");
		doberman.setEdad(1);
		doberman.setRaza("Doberman");
		
		
		
		//Imprimir en pantalla o devolver el valor del nombre asignado
		//a mi objeto doberman
		System.out.println(doberman.getNombre());
		System.out.println(dalmata.getSexo());
		
		//Que pasa si quiero imprimir todos los valores de un objeto
		System.out.println(dalmata);
		System.out.println(doberman);
		
		
//		MODELAR 5 OBJETOS / Es decir, creamos 
//		5 plantillas. los que Ustedes gusten. 
//		Le definen a cada objeto 3 atributos minimo
//		Crean sus metodos constructores
//		Sus getters y setters 
//		Su metodo ToString
//		y van a instanciarlos en esta clase Principal
//		Uno vacio al cual le asignan valores con setters
//		y uno con todos los argumentos
		
		//Plantilla 1
		
		Bicicleta Trek = new Bicicleta();
		Trek.setRodada(29);
		Trek.setMarca("Trek");
		
		Bicicleta Mercurio = new Bicicleta("Mercurio", 27.5, "montana", "negra");
		
		System.out.println(Trek);
		System.out.println(Mercurio);
		
		//Plantilla 2
		
		Lavadora LG = new Lavadora ();
		LG.setMarca("LG");
		
		Lavadora Mabe = new Lavadora("Mabe", "Automatica", 20);
		
		System.out.println(LG);
		System.out.println(Mabe);
		
		
		//Plantilla 3
		
		Futbolista Cr7 = new Futbolista();
		Cr7.setNombre("CR7");
		
		Futbolista Messi = new Futbolista("Messi", "Delantero", 10);
		
		System.out.println(Cr7);
		System.out.println(Messi);
		
		
		//Plantilla 4
		
		Ciudad Madrid = new Ciudad();
		Madrid.setCiudad("Madrid");
		
		Ciudad Chicago = new Ciudad("Chicago", "USA", "Ingles");
		
		System.out.println(Madrid);
		System.out.println(Chicago);
		
		//Plantilla 5 
		
		Unidadmedida Metro = new Unidadmedida();
		Metro.setUnidadmedida("Metro");
		
		Unidadmedida pie = new Unidadmedida("pie", "ingles", "5.5 ft");
		
		System.out.println(Metro);
		System.out.println(pie);
		
		

	}

}
