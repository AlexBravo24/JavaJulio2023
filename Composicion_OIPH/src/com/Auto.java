package com;

public class Auto {
	private String marca;
	private Modelo modelo;
	private Motor motor;
	private Neumatico neumatico;
	
	public Auto() {}

	public Auto(String marca, Modelo modelo, Motor motor, Neumatico neumatico) {
		super();
		this.marca = marca;
		this.modelo = modelo;
		this.motor = motor;
		this.neumatico = neumatico;
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

	public Neumatico getNeumatico() {
		return neumatico;
	}

	public void setNeumatico(Neumatico neumatico) {
		this.neumatico = neumatico;
	}

	@Override
	public String toString() {
		return "Auto [marca=" + marca + ", modelo=" + modelo + ", motor=" + motor + ", neumatico=" + neumatico + "]";
	}
	
	
	
}
