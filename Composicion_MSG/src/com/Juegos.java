package com;

public class Juegos {
	
	private String nombre;
	private String productora;
	private String tipo;
	private String formato;
	
	public Juegos() {
		
	}

	public Juegos(String nombre, String productora, String tipo, String formato) {
		super();
		this.nombre = nombre;
		this.productora = productora;
		this.tipo = tipo;
		this.formato = formato;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getProductora() {
		return productora;
	}

	public void setProductora(String productora) {
		this.productora = productora;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public String getFormato() {
		return formato;
	}

	public void setFormato(String formato) {
		this.formato = formato;
	}

	@Override
	public String toString() {
		return "Juegos [nombre=" + nombre + ", productora=" + productora + ", tipo=" + tipo + ", formato=" + formato
				+ "]";
	}
	
	
	

}
