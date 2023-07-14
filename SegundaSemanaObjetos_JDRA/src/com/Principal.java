package com;

public class Principal {

	public static void main(String[] args) {
		
		// Crear a un objeto perro
		
		
		Perro doberman = new Perro(); //(Instanciando a un objeto perro "vacio") gracias al constructor vacio
		// (sin argumentos)
		
		//instanciando a objeto perro con todos sus atributos
		Perro dalmata = new Perro("Chokis","Dalmata","Gris",1.9,"hembra",4,5); 
		
		//Asignando atributos a mi objeto vacio
		doberman.setNombre("Fido");
		doberman.setEdad(1);
		
		// Imprimir en pantalla o devolver el valor del nombre asignado a mi objeto doberman
		
//		System.out.println(doberman.getNombre());				
//		System.out.println(dalmata.getSexo());
		
		// Que pasa si quiero imprimir todos los datos de un objeto/clase
//		System.out.println(dalmata);
//		System.out.println(doberman);
		
		
		
		// Modelar 5 objetos. definir a cada objeto 3 atributos minimo
		// crear metodos constructores setters & getters
		// metodo toString
		// Instanciarlos clase principal 1 vacio 1 con argumentos
		
		
		//AUTO
		
		Auto sentra = new Auto(); //instanciado vacio
		sentra.setMarca("Nissan");
		
		Auto civic = new Auto("Honda","Civic",2022,4);//instanciado con atributos
		
		System.out.println();
		System.out.println(sentra);
		System.out.println(civic);
		
		
		//COMPUTADORA
		
		Computadora huawei = new Computadora();
		huawei.setMarca("Huawei");
		
		Computadora hp = new Computadora("hp", 2022, 8, 512);
		
		System.out.println();
		System.out.println(huawei);
		System.out.println(hp);
		
		
		// CELULAR
		
		Celular motorola = new Celular();
		motorola.setMarca("Motorola");
		
		Celular iphone = new Celular("Apple", "IOS", 2, 128);
		
		System.out.println();
		System.out.println(motorola);
		System.out.println(iphone);
		
		
		//RELOJ
		
		Reloj casio = new Reloj();
		casio.setMarca("Casio");
		
		Reloj bulova = new Reloj("Bulova", "Mecanico", 2022);
		
		System.out.println();
		System.out.println(casio);
		System.out.println(bulova);
		
		
		//ARBOL
		
		Arbol ficus = new Arbol();
		ficus.setTipo("Ficus");
		
		Arbol pino = new Arbol("Pino", 30, 100);
		
		System.out.println();
		System.out.println(ficus);
		System.out.println(pino);
		
	
	}

}
