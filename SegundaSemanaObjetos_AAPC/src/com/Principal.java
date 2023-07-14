package com;

public class Principal {

	public static void main(String[] args) {
		// crear un obejto perro
		//instanciando a un objeto perro "vacio")
		//gracias al constructor vacio (sin argumentos)
		
	Perro doberman = new Perro ();
	
	
	
	// instanciando a un objeto perro con todos sus atributos o argumentos
Perro dalmata = new Perro("fido", "dalmata", "moteado", 1.9, "hembra", 4, 10);
	
	
//asignando atributos a mi objeto vacio
doberman.setNombre("spike");
	doberman.setEdad(1);
	System.out.println(doberman.getNombre());
System.out.println(doberman.getEdad());
System.out.println(dalmata);

	



Fruta manzana= new Fruta();
manzana.setNombre("manzana");

Fruta naranja = new Fruta("naranja","tropical",105);

		System.out.println(manzana.getNombre());
		System.out.println(naranja);
		
		///////////////////////////////////////////////	1
		Auto leon = new Auto ();
		leon.setModelo("leon");
		Auto jetta = new Auto("Volswagen", "Jetta", "Sedan", "Nuevo",2012 );
		System.out.println(leon.getModelo());
		System.out.println(jetta);
		//////////////////////////////////////////////	2	
		Pais Mexico= new Pais();
		Mexico.setNombre("Mexico");		
		Pais Canada= new Pais("Canada", "Ottawa", 38929902);
		System.out.println(Mexico.getNombre());
		System.out.println(Canada);
		/////////////////////////////////////////////////3		
		Casa Puebla=new Casa();
		Puebla.setUbicacionciudad("Puebla");
		Casa Xalapa = new Casa("Xalapa",3 ,5, 3);
		System.out.println(Puebla.getUbicacionciudad());
		System.out.println(Xalapa);
		/////////////////////////////////////////////////////	4	
		Celular Nokia=new Celular();
		Nokia.setMarca("Nokia");
		Celular Iphone=new Celular("Apple","Iphone X",2017,"sesenta y cuatro gigas");
		System.out.println(Nokia.getMarca());
		System.out.println(Iphone);
		/////////////////////////////////////////////////////// 5
		Laptop Acer=new Laptop ();
		Acer.setMemoria_ram(12);
		Laptop Hp = new Laptop("Hp", "Elitebook",8);
		System.out.println(Acer.getMemoria_ram());
		System.out.println(Hp);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	

}
