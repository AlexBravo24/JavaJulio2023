package com;

public class Principal {
	
	public static void main (String[] args) {
		
		/*CREAR UN OBJETO PERRO 
		 * INSTANCIANDO A UN OBJETO PERRO 
		 * 
		 */
		
		Perro doberman = new Perro();
		
		/*METODO CONSTRUCTOR CON TODOS LOS ATRIBUTOS 
		 * O PARAMETROS
		 */
		
		Perro dalmata = new Perro ("Luna", "Dalmata", "Moteado,",1.9,"Hembra",4,2);
		
		/*ASIGNANDO ATRIBUTOS AMI OBJETO VACIO
		 */
		
		doberman.setNombre("Luna");
		doberman.setEdad(1);
		
		
		/*IMPRIMIR VALORES EN PANTALLA O DEVOLVER EL VALOR DEL NOMBRE 
		 * A MI OBJETO DOBERMAN
		 */
		System.out.println(doberman.getNombre());
		System.out.println(dalmata.getSexo());
		
		System.out.println(dalmata);
		System.out.println(doberman);
		
		
		
		
		//*************************** C A N I C A S *************************************
		
		System.out.println(" ********************** C A N I C A S ***********************");
		
	Canicas negras = new Canicas();
	
	Canicas lineas = new Canicas ("Rojas","series","lisas","chicas",2);
	
	
	negras.setColor("Azul");
	negras.setTamaño("Grande");
	
	System.out.println(negras.getColor());
	System.out.println(lineas.getLinea());
	
	
	System.out.println(lineas);
	System.out.println(negras);
	
	
	    //*************************** CANICAS *************************************
		
	System.out.println(" ********************** G O R R A S ***********************");
	
	Gorras nike = new Gorras ();
	Gorras pirma = new Gorras ("Roja","Redonda","Grande","nike","unisex");
	
	nike.setColor("Blanca");
	nike.setSexo("Femenino");
	
	System.out.println(nike.getColor());
	System.out.println(pirma.getTamaño());
	
	System.out.println(pirma);
	System.out.println(nike);
	
	
	//*************************** Pantalones  *************************************
	
		System.out.println(" ********************** P A N T A L O N E S  ***********************");
	
		Pantalones mezclilla = new Pantalones ();
		Pantalones formal = new Pantalones (5,"Formal","Rosa","Tiro alto","Alola");
		
		mezclilla.setColor("Negro");
		mezclilla.setTipo("Mezclilla");
		
		System.out.println(mezclilla.getColor());
		System.out.println(formal.getLargo());
		
		System.out.println(mezclilla);
		System.out.println(formal);
	
		//*************************** Osos *************************************
		
		System.out.println(" ********************** O S O S  ***********************");
		
		Osos pardo = new Osos ();
		Osos polar = new Osos ("Polar","Recien nacido","Animales marinos","Polo norte",6);
		
		pardo.setAlimentacion("Frutos");
		pardo.setRaza("Pardo");
		
		System.out.println(pardo.getRaza());
		System.out.println(polar.getVivienda());
		
		System.out.println(pardo);
		System.out.println(polar);
		
		
		
		
		//*************************** Osos *************************************
		
		System.out.println(" ********************** P E L U C H E S   ***********************");
		
		Peluches gato = new Peluches();
		Peluches pato = new Peluches ("Pato","Algodon","Corona","Terciopelo",10.5);
		
		gato.setForma("Gato");
		gato.setRelleno("Esponja");
		
		System.out.println(gato.getForma());
		System.out.println(pato.getTextura());
		
		System.out.println(gato);
		System.out.println(pato);
		
		
	
	
	
	
	
	
	
	
	
	}

}
