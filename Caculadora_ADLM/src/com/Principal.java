package com;

public class Principal {

	public static void main(String[] args) {
		Cientifica operacion = new Cientifica("Casio", "negro", 20, 20);
		
		System.out.println(operacion.sumar());
		System.out.println(operacion.dividir());
		System.out.println(operacion.multiplicar());
		System.out.println(operacion.restar());
		System.out.println(operacion.potencia());
		System.out.println(operacion.numeroRandom());
	}

}
