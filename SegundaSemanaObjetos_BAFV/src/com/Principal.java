package com;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// crear un objeto perro
		// la clase es la plantilla y el objeto es la instancia
		//(Instanciando a un objeto perro "vacio")
		//gracias al contructor vacio (sin argumentos)
		Perro doberman = new Perro();
		
		//instanciado un objeto perro con todos sus atributos y argumentos
		Perro dalmata = new Perro("Fido","dalmata","cafe",1.9,"Hembra",4,2);
		
		//Asignado atributos a mi objeto vacio
		//doberman.nombre= "Fido";
		// OBJETO PERRO
		doberman.setNombre("Filimón");
		doberman.setEdad(1);
		
		// si quiero impimir en pantalla el valor del nombre asignado
		// ami objeto doberman
		System.out.println(doberman.getNombre());
		System.out.println(dalmata.getSexo());
		// Que pasa si quiero imprimir todos los datos de un objeto/clase
		System.out.println(dalmata);
		System.out.println(doberman);
		//________________________________________________________________________________
		// OBJETO FRUTA
		Fruta manzana = new Fruta();
		manzana.setNombre("Manzana");
		Fruta naranja = new Fruta("Naranja","Tropical",105);
		
		System.out.println(manzana);
		System.out.println(naranja);
		
		// OBJETO CELULAR
		Celular celular1 = new Celular();
		celular1.setMarca("Apple");
		Celular celular2 = new Celular("Samsung Galaxy Note 20","Samsung","negro",19000);
		
		System.out.println(celular1);
		System.out.println(celular2);
		
		//LIBRO
		Libro libro1 = new Libro();
		libro1.setTitulo("Harry Potter");
		Libro libro2 = new Libro("1984","George Orwell",1949,"Distopía");
		
		System.out.println(libro1);
		System.out.println(libro2);
		
		//COCHE
		//public Coche(String marca, String modelo, String color, int anioFabricacion) {
		Coche coche1 = new Coche();
		coche1.setMarca("Nissan");
		Coche coche2 = new Coche("Ford","Mustang","rojo",2021);
		System.out.println(coche1);
		System.out.println(coche2);
		
		//CUENTA BANCARIA
		CuentaBancaria cuenta1 = new CuentaBancaria();
		cuenta1.setTitular("Alfonso");
		CuentaBancaria cuenta2  =  new CuentaBancaria("Alexis","10209192912",10000,5);
		System.out.println(cuenta1);
		System.out.println(cuenta2);
		
		//
		
		
		
		
	}
	
	// van a modelar 5 objetos, creamos 5 plantillas. Los que ustedes gsuten.
	//Le definen a cadaa objeto 3 atributos minimo
	//crean sus metodos constructores
	// sus getters y setters
	//su metodo toString 
	// y van a instanciarlos con esta clase principal
	

}
