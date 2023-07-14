package com;

public class Coche {

	private String marca;
	private String color;
	
	private Rendimiento rendimiento;
	private Motor motor;
	private Transmicion transmicion;
	
	public Coche () {
		
	}

	public Coche(String marca, String color, Rendimiento rendimiento, Motor motor, Transmicion transmicion) {
		super();
		this.marca = marca;
		this.color = color;
		this.rendimiento = rendimiento;
		this.motor = motor;
		this.transmicion = transmicion;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public Rendimiento getRendimiento() {
		return rendimiento;
	}

	public void setRendimiento(Rendimiento rendimiento) {
		this.rendimiento = rendimiento;
	}

	public Motor getMotor() {
		return motor;
	}

	public void setMotor(Motor motor) {
		this.motor = motor;
	}

	public Transmicion getTransmicion() {
		return transmicion;
	}

	public void setTransmicion(Transmicion transmicion) {
		this.transmicion = transmicion;
	}

	@Override
	public String toString() {
		return "Coche [marca=" + marca + ", color=" + color + ", rendimiento=" + rendimiento + ", motor=" + motor
				+ ", transmicion=" + transmicion + "]";
	}
	
	
}
