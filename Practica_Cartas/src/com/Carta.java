package com;

public class Carta {

	//Declaracion de variables
	private int valor;
	private String palo;
	
	


	//Constructor vacio
	public Carta () {}
	//Constructor con variables
	
	public Carta (int valor, String palo) {
		this.valor = valor;
		this.palo = palo;	
		
	}
	
	
	//GET y SET para variable valor
	public int getValor() {
		return valor;
	}
	public void setValor(int valor) {	
		this.valor = valor;
	}
	
	//GET ySET para la variable palo
	public String getPalo() {
		return palo;
	}
	public void setPalo(String palo) {
		this.palo = palo;
	}
		
	@Override
	public String toString() {
		return "Carta [valor=" + valor + ", palo=" + palo + "]";
	}
}
