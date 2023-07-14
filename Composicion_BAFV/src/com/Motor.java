package com;

public class Motor {
	
	/*Tipo de motor (gasolina, diésel, eléctrico, híbrido)
Cilindrada
Potencia*/

	private String tipoMotor;
	private double cilindraje;
	private double potencia;
	
	public Motor() {
		
	}

	public Motor(String tipoMotor, double cilindraje, double potencia) {
		super();
		this.tipoMotor = tipoMotor;
		this.cilindraje = cilindraje;
		this.potencia = potencia;
	}

	public String getTipoMotor() {
		return tipoMotor;
	}

	public void setTipoMotor(String tipoMotor) {
		this.tipoMotor = tipoMotor;
	}

	public double getCilindraje() {
		return cilindraje;
	}

	public void setCilindraje(double cilindraje) {
		this.cilindraje = cilindraje;
	}

	public double getPotencia() {
		return potencia;
	}

	public void setPotencia(double potencia) {
		this.potencia = potencia;
	}

	@Override
	public String toString() {
		return "Motor [tipoMotor=" + tipoMotor + ", cilindraje=" + cilindraje + ", potencia=" + potencia + "]";
	}
	
	
}
