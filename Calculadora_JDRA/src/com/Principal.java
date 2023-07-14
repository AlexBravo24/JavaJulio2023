package com;

public class Principal {

	public static void main(String[] args) {
		
		Cientifica calcu = new Cientifica();
		calcu.setMarca("casio");
		calcu.setColor("gris");
		calcu.setPrecio(250);
		calcu.setModos(4);
		
		System.out.println(calcu);
		System.out.println();
		
		
		calcu.suma(0,0);  // Metodo pide por teclado numeros clase hijo
		
		calcu.resta(10, 5);
		calcu.division(20, 2);
		calcu.multiplicacion(10, 10);
		

	}

}
