package com;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Creación del objeto "P"
		//(Instanciando a un objeto "P") sin argumentos
		Perro doberman=new Perro();
		
		//Instanciando un objeto con todos sus argumentos desde el inicio
		Perro dalmata=new Perro("Fido", "Dalmata", "Moteado", 1.9, "Hembra", 4, 2);
		
		
		//Asignando atributos al objeto vacío
		
		doberman.setNombre("Scooby");
		doberman.setEdad(1);
		doberman.setColor("Café");
		
		System.out.println(doberman.getNombre());
		
		//Qué pasa si quiero imprimir todos los datos de un objeto
		System.out.println(dalmata);
		
		
		PersonajesDeOnePiece law=new PersonajesDeOnePiece();
			law.setEsUsuario(true);
			law.setHaki(true);
			law.setTripulacion("Corazon");
			
			System.out.println(law);
			
		PersonajesDeOnePiece chopper = new PersonajesDeOnePiece("Mugiwara", "Chopper", true, "Zoan", false, "No tiene");
		System.out.println(chopper);
		
		JugadorDeBasket felix =new JugadorDeBasket();
		
		felix.setHablidad("Defensa");
		felix.setNumero(3);
		felix.setPosicion("Ala");
		System.out.println(felix);
		
		JugadorDeBasket giannis = new JugadorDeBasket("Ala Pivot", 2, 17, "Manejo de la Pintura");
		System.out.println(giannis);
		
		Quesos hebra = new Quesos();
		hebra.setEsArtesanal(true);
		hebra.setPeso(3.5);
		hebra.setTipo("Oaxaca");
		System.out.println(hebra);
		
		Quesos manchego = new Quesos("Manchego", 2.5, false, 3);
		System.out.println(manchego);
		
		
		Tennis kyrie7 = new Tennis("Kyrie 7", 27.5, "Negro", "Nick zoom");
		System.out.println(kyrie7);
		Tennis lebron20 = new Tennis();
		lebron20.setColor("Blanco");
		lebron20.setModelo("Lebron 20");
		lebron20.setTipoDeAmortiguamiento("Nike Zoom Air");
		System.out.println(lebron20);
		
		Pizza hawaina = new Pizza();
		hawaina.setNumeroDeIngredientes(2);
		hawaina.setMarca("Domino's");
		hawaina.setIngrediente("Jamón y Piña");
		System.out.println(hawaina);
		
		Pizza peperoni = new Pizza("Pizza Hot", 1, "Peperoni", false);
		System.out.println(peperoni);
		
		
		
		
		
		
		
	}

}
