package com;

public class Pizza {

	private String marca;
	private int numeroDeIngredientes;
	private String ingrediente;
	private boolean orillaRellena;
	
	public Pizza() {
		
	}

	public Pizza(String marca, int numeroDeIngredientes, String ingrediente, boolean orillaRellena) {
		super();
		this.marca = marca;
		this.numeroDeIngredientes = numeroDeIngredientes;
		this.ingrediente = ingrediente;
		this.orillaRellena = orillaRellena;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public int getNumeroDeIngredientes() {
		return numeroDeIngredientes;
	}

	public void setNumeroDeIngredientes(int numeroDeIngredientes) {
		this.numeroDeIngredientes = numeroDeIngredientes;
	}

	public String getIngrediente() {
		return ingrediente;
	}

	public void setIngrediente(String ingrediente) {
		this.ingrediente = ingrediente;
	}

	public boolean isOrillaRellena() {
		return orillaRellena;
	}

	public void setOrillaRellena(boolean orillaRellena) {
		this.orillaRellena = orillaRellena;
	}

	@Override
	public String toString() {
		return "Pizza [marca=" + marca + ", numeroDeIngredientes=" + numeroDeIngredientes + ", ingrediente="
				+ ingrediente + ", orillaRellena=" + orillaRellena + "]";
	}
	
	
}
