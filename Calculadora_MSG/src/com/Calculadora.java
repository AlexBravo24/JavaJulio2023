package com;

public abstract class Calculadora {
	
	private String tipo;
	private String operacion;
	private String marca;
	
	public Calculadora () {
		
	}

	public Calculadora(String tipo, String operacion, String marca) {
		super();
		this.tipo = tipo;
		this.operacion = operacion;
		this.marca = marca;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public String getOperacion() {
		return operacion;
	}

	public void setOperacion(String operacion) {
		this.operacion = operacion;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	@Override
	public String toString() {
		return "Calculadora [tipo=" + tipo + ", operacion=" + operacion + ", marca=" + marca + "]";
	}
	
	public abstract void suma();
	public abstract void resta();
	public abstract void division();
	public abstract void multiplicacion();

}
