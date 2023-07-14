package com;
import java.util.Random;

public class Cientifica extends Calculadora{
	private double numero1, numero2, resultado;
	
	public Cientifica(String marca, String color, double numero1, double numero2) {
		super(marca, color);
		this.numero1 = numero1;
		this.numero2 = numero2;
	}

	public double getNumero1() {
		return numero1;
	}

	public void setNumero1(double numero1) {
		this.numero1 = numero1;
	}

	public double getNumero2() {
		return numero2;
	}

	public void setNumero2(double numero2) {
		this.numero2 = numero2;
	}



	@Override
	public double sumar() {
		resultado = numero1 + numero2;
		return resultado;
	}

	@Override
	public double restar() {
		resultado = numero1 - numero2;
		return resultado;
	}

	@Override
	public double multiplicar() {
		resultado = numero1 * numero2;
		return resultado;
	}

	@Override
	public double dividir() {
		resultado = numero1 / numero2;
		return resultado;
	}
	
	public double potencia() {
		resultado = Math.pow(numero1, numero2);
		return resultado;
	}
	
	public double numeroRandom() {
		Random random = new Random();
		resultado = random.nextInt((int) numero1);
		return resultado;
	}
	
}
