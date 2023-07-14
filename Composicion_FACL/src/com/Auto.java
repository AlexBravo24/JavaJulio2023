package com;

public class Auto {
	
	private String marca;
	
	
	private Modelo modelo;
	private Motor motor;
	private Neumatico llantas;
	
	private String transmision;
	
	public Auto() {
		
	}

	public Auto(String marca, Modelo modelo, Motor motor, Neumatico llantas, String transmision) {
		super();
		this.marca = marca;
		this.modelo = modelo;
		this.motor = motor;
		this.llantas = llantas;
		this.transmision = transmision;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public Modelo getModelo() {
		return modelo;
	}

	public void setModelo(Modelo modelo) {
		this.modelo = modelo;
	}

	public Motor getMotor() {
		return motor;
	}

	public void setMotor(Motor motor) {
		this.motor = motor;
	}

	public Neumatico getLlantas() {
		return llantas;
	}

	public void setLlantas(Neumatico llantas) {
		this.llantas = llantas;
	}

	public String getTransmision() {
		return transmision;
	}

	public void setTransmision(String transmision) {
		this.transmision = transmision;
	}

	@Override
	public String toString() {
		return "Auto [\nmarca=" + marca + ", \nmodelo=" + modelo + ", \nmotor=" + motor + ", \nllantas=" + llantas
				+ ", transmision=" + transmision + "]";
	}
	
	
	

}
