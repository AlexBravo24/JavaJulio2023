package com;

public class Casa {
	
	private String Ubicacionciudad;
	private int numero_pisos;
	private int numero_cuarto;
	private int numero_de_baños;
	
	
	public Casa() {
		
	}
	
	public Casa(String ubicacionciudad, int numero_pisos, int numero_cuarto, int numero_de_baños) {
		super();
		Ubicacionciudad = ubicacionciudad;
		this.numero_pisos = numero_pisos;
		this.numero_cuarto = numero_cuarto;
		this.numero_de_baños = numero_de_baños;
	}
	public String getUbicacionciudad() {
		return Ubicacionciudad;
	}
	public void setUbicacionciudad(String ubicacionciudad) {
		Ubicacionciudad = ubicacionciudad;
	}
	public int getNumero_pisos() {
		return numero_pisos;
	}
	public void setNumero_pisos(int numero_pisos) {
		this.numero_pisos = numero_pisos;
	}
	public int getNumero_cuarto() {
		return numero_cuarto;
	}
	public void setNumero_cuarto(int numero_cuarto) {
		this.numero_cuarto = numero_cuarto;
	}
	public int getNumero_de_baños() {
		return numero_de_baños;
	}
	public void setNumero_de_baños(int numero_de_baños) {
		this.numero_de_baños = numero_de_baños;
	}
	@Override
	public String toString() {
		return "Casa [Ubicacionciudad=" + Ubicacionciudad + ", numero_pisos=" + numero_pisos + ", numero_cuarto="
				+ numero_cuarto + ", numero_de_baños=" + numero_de_baños + "]";
	}
	
	
	
	
	
	
	
	
	
	
	
	

}
