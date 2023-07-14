package com;

public class Auto {
	
	private String marca;
	private String modelo;
	private String color;
	
	private Motor motor;
	private Llanta llantas;
	private Audio eqaudio;
	
	public Auto () {}

	public Auto(String marca, String modelo, String color, Motor motor, Llanta llantas, Audio eqaudio) {
		super();
		this.marca = marca;
		this.modelo = modelo;
		this.color = color;
		this.motor = motor;
		this.llantas = llantas;
		this.eqaudio = eqaudio;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public Motor getMotor() {
		return motor;
	}

	public void setMotor(Motor motor) {
		this.motor = motor;
	}

	public Llanta getLlantas() {
		return llantas;
	}

	public void setLlantas(Llanta llantas) {
		this.llantas = llantas;
	}

	public Audio getEqaudio() {
		return eqaudio;
	}

	public void setEqaudio(Audio eqaudio) {
		this.eqaudio = eqaudio;
	}

	@Override
	public String toString() {
		return "Auto [\nmarca=" + marca + ", \nmodelo=" + modelo + ", \ncolor=" + color + ", \nmotor=" + motor + ", \nllantas="
				+ llantas + ", \neqaudio=" + eqaudio + "]";
	}
	
	
	
	

}
