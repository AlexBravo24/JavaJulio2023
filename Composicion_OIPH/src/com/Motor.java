package com;

public class Motor {
	private String nombreMotor;
	private double version;
	private String combustible;
	
	public Motor() {}

	public Motor(String nombreMotor, double version, String combustible) {
		super();
		this.nombreMotor = nombreMotor;
		this.version = version;
		this.combustible = combustible;
	}

	public String getNombreMotor() {
		return nombreMotor;
	}

	public void setNombreMotor(String nombreMotor) {
		this.nombreMotor = nombreMotor;
	}

	public double getVersion() {
		return version;
	}

	public void setVersion(double version) {
		this.version = version;
	}

	public String getCombustible() {
		return combustible;
	}

	public void setCombustible(String combustible) {
		this.combustible = combustible;
	}

	@Override
	public String toString() {
		return "Motor [nombreMotor=" + nombreMotor + ", version=" + version + ", combustible=" + combustible + "]";
	}
	
	
}
