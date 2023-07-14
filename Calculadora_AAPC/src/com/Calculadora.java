package com;

public abstract class Calculadora {
    private String color;
    private String modelo;
    private String tipo;
    
    public Calculadora() {
    	
    }

	public Calculadora(String color, String modelo, String tipo) {
		super();
		this.color = color;
		this.modelo = modelo;
		this.tipo = tipo;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	@Override
	public String toString() {
		return "Calculadora [color=" + color + ", modelo=" + modelo + ", tipo=" + tipo + "]";
	}
    
    
    public abstract void suma(int n1, int n2);
    public abstract void resta (int n1, int n2); 
    public abstract void multiplicacion (int n1, int n2);
    public abstract void division (int n1, int n2);
    
    
}
