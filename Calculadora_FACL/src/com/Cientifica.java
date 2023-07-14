package com;

public class Cientifica extends Calculadora {
	
	//Definir como hacer las operaciones anteriormente llamadas
	
	private double n1;
	private double n2;
	
	public Cientifica() {
		
	}

	public Cientifica(String color, String marca, boolean tapa, double n1, double n2) {
		super(color, marca, tapa);
		this.n1 = n1;
		this.n2 = n2;
	}

	public double getN1() {
		return n1;
	}

	public void setN1(double n1) {
		this.n1 = n1;
	}

	public double getN2() {
		return n2;
	}

	public void setN2(double n2) {
		this.n2 = n2;
	}

	@Override
	public String toString() {
		return "Cientifica [n1=" + n1 + ", n2=" + n2 + ", toString()=" + super.toString() + "]";
	}

	@Override
	public void suma() {
		// TODO Auto-generated method stub
		double rs;
		rs=n1+n2;
		System.out.println("El resultado de sumarlos es: "+rs);
	}

	@Override
	public void resta() {
		// TODO Auto-generated method stub
		double rr;
		rr=n1-n2;
		System.out.println("El resultado de restarlos es: "+rr);
	}

	@Override
	public void division() {
		// TODO Auto-generated method stub
		double rd;
		rd=n1/n2;
		System.out.println("El resultado de dividirlos es: "+rd);
	}

	@Override
	public void multiplicacion() {
		// TODO Auto-generated method stub
		double rm;
		rm=n1*n2;
		System.out.println("El resultado de multiplicarlos es: "+rm);
		
	}
	
	

}
