package com;

import java.util.Scanner;

public class Cientifica extends Calculadora {
	
	private double numero1;
	private double numnero2;
	private double total;
	
	public Cientifica () {
		
	}

	public Cientifica(String tipo, String operacion, String marca, double numero1, double numnero2, double total) {
		super(tipo, operacion, marca);
		this.numero1 = numero1;
		this.numnero2 = numnero2;
		this.total = total;
	}

	public double getNumero1() {
		return numero1;
	}

	public void setNumero1(double numero1) {
		this.numero1 = numero1;
	}

	public double getNumnero2() {
		return numnero2;
	}

	public void setNumnero2(double numnero2) {
		this.numnero2 = numnero2;
	}

	public double getTotal() {
		return total;
	}

	public void setTotal(double total) {
		this.total = total;
	}

	@Override
	public String toString() {
		return "Cientifica [numero1=" + numero1 + ", numnero2=" + numnero2 + ", total=" + total + ", toString()="
				+ super.toString() + "]";
	}
	
	Scanner entrada1 = new Scanner(System.in);
	Scanner entrada2 = new Scanner(System.in);

	public void suma () {
		System.out.println("numero1:");
		numero1=entrada1.nextDouble();
		System.out.println("numero2:");
		numnero2=entrada2.nextDouble();
		
		total=numero1+numnero2;
		
		System.out.println("Tu total de la suma es: " + total);
	}
	
	public void resta () {
		System.out.println("numero1:");
		numero1=entrada1.nextDouble();
		System.out.println("numero2:");
		numnero2=entrada2.nextDouble();
		
		total=numero1-numnero2;
		
		System.out.println("Tu total de la resta es: " + total);
	}
	
	public void division () {
		System.out.println("numero1:");
		numero1=entrada1.nextDouble();
		System.out.println("numero2:");
		numnero2=entrada2.nextDouble();
		
		total=numero1/numnero2;
		
		System.out.println("Tu total de la division es: " + total);
	}
	
	public void multiplicacion () {
		System.out.println("numero1:");
		numero1=entrada1.nextDouble();
		System.out.println("numero2:");
		numnero2=entrada2.nextDouble();
		
		total=numero1*numnero2;
		
		System.out.println("Tu total de la multiplicacion es: " + total);
	}

} //Cierre class
