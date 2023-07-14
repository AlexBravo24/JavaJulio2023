package com;

public class Principal {

	public static void main(String[] args) {
		
		// Crear un objeto perro
		//(Instanciando a un objeto perro "Vacio")
		//Gracias al constuctor vacio (sin argumentos)
		Perro pug = new Perro();
		
	//Instanciando a un objeto perro
		//con todos sus atributos o argumentos
		Perro dalmata = new Perro("Fida", "Dalmata", "Moteado", 1.9, "Hembra", 4, 2);
		
		//Asiganando atributos a mi objeto vacio
		pug.setNombre("Spike");
		pug.setEdad(1);
		
		//Imprimir en pantalla o devolver el valor del nombre asigando
		//a mi obeto pug
//		System.out.println(pug.getNombre());
//		System.out.println(dalmata.getSexo());
//		//Que pasa si quiero imprimir todos los datos de un objeto/clase
//		System.out.println(dalmata);
//		System.out.println(pug);
//		
		
		Fruta manzana = new Fruta("Manzana", "Temporada", 105);
		Fruta naranja = new Fruta();
		
//		System.out.println(manzana);
//		System.out.println(naranja);
		
		//1
		Pan concha = new Pan ("concha", "sencillo", "mediano");
		Pan pambazo = new Pan();
		
		pambazo.setNombre("pambazo");
		pambazo.setTamano("chico");
		pambazo.setTipo("sal");
		
		System.out.println(concha);
		System.out.println(pambazo);
		System.out.println();
		
		//2
		Persona pedro = new Persona("Pedro", 24, 1.85);
		Persona carlos = new Persona();
		
		carlos.setEdad(25);
		carlos.setEstatura(1.60);
		carlos.setNombre("Carlos");
		
		System.out.println(pedro);
		System.out.println(carlos);
		System.out.println();
		
		//3
		GPU rtx = new GPU("RTX 3060", 12,"MSI");
		GPU gtx = new GPU ();
		
		gtx.setMarca("ASUS");
		gtx.setModelo("GTX 1660 SUPPER");
		gtx.setRam(6);
		
		System.out.println(rtx);
		System.out.println(gtx);
		System.out.println();
		
		//4
		CPU ryzen3 = new CPU ("Ryzen", 8, "3 3100");
		CPU inteli3 = new CPU ();
		
		inteli3.setMarca("Intel");
		inteli3.setModelo("i3 3100f");
		inteli3.setNucleos(4);
		
		System.out.println(ryzen3);
		System.out.println(inteli3);
		System.out.println();
		
		//5
		Almacenamiento ssd = new Almacenamiento("Solido", 448, "Kignston");
		Almacenamiento hdd = new Almacenamiento ();
		
		hdd.setCapacidad(960);
		hdd.setMarca("Seagate");
		hdd.setTipo("Mecanico");
		
		System.out.println(ssd);
		System.out.println(hdd);
		

	}
	
	//modeloar 5 objetos
	//definir a cada objeto tres atributos minimo
	//Crear sus metodos constructores
	//sus getters y Setters
	//su metodo toString
	//Y van a isntanciarlos en esta clase principal 
	//uno vacio al cual se le asigan 
	//valores con setter y uno con argumentos
	

}
