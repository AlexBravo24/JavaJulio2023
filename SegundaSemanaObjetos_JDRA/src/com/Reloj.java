package com;

public class Reloj {
	
	//atributos
	private String marca;
	private String movimiento;
	private int año;
	
	// metodo constructor vacio
	public Reloj() {
	}

	
	// Metodo constructor con todos los atributos o paramateros
	public Reloj(String marca, String movimiento, int año) {
		super();
		this.marca = marca;
		this.movimiento = movimiento;
		this.año = año;
	}


	
	//GETTERS & SETTERS
	public String getMarca() {
		return marca;
	}


	public void setMarca(String marca) {
		this.marca = marca;
	}


	public String getMovimiento() {
		return movimiento;
	}


	public void setMovimiento(String movimiento) {
		this.movimiento = movimiento;
	}


	public int getAño() {
		return año;
	}


	public void setAño(int año) {
		this.año = año;
	}


	
	//Metodo toString
	@Override
	public String toString() {
		return "Reloj [marca=" + marca + ", movimiento=" + movimiento + ", año=" + año + "]";
	}

}
