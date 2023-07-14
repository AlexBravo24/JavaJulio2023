package com;

public class Rendimiento {
	
	/*Potencia del motor
Aceleración
Velocidad máxima*/
	
	private String potenciaMotor;
	private String acelaracion;
	private String velocidad;
	
	public Rendimiento() {
		
	}

	public Rendimiento(String potenciaMotor, String acelaracion, String velocidad) {
		super();
		this.potenciaMotor = potenciaMotor;
		this.acelaracion = acelaracion;
		this.velocidad = velocidad;
	}

	public String getPotenciaMotor() {
		return potenciaMotor;
	}

	public void setPotenciaMotor(String potenciaMotor) {
		this.potenciaMotor = potenciaMotor;
	}

	public String getAcelaracion() {
		return acelaracion;
	}

	public void setAcelaracion(String acelaracion) {
		this.acelaracion = acelaracion;
	}

	public String getVelocidad() {
		return velocidad;
	}

	public void setVelocidad(String velocidad) {
		this.velocidad = velocidad;
	}

	@Override
	public String toString() {
		return "Rendimiento [potenciaMotor=" + potenciaMotor + ", acelaracion=" + acelaracion + ", velocidad="
				+ velocidad + "]";
	}
	
	

}
