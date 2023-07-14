package com;

public class Audio {
	
	private String marca;
	private String calidad;
	private int numerodebocinas;
	
	public Audio () {}

	public Audio(String marca, String calidad, int numerodebocinas) {
		super();
		this.marca = marca;
		this.calidad = calidad;
		this.numerodebocinas = numerodebocinas;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getCalidad() {
		return calidad;
	}

	public void setCalidad(String calidad) {
		this.calidad = calidad;
	}

	public int getNumerodebocinas() {
		return numerodebocinas;
	}

	public void setNumerodebocinas(int numerodebocinas) {
		this.numerodebocinas = numerodebocinas;
	}

	@Override
	public String toString() {
		return "Audio [marca=" + marca + ", calidad=" + calidad + ", numerodebocinas=" + numerodebocinas + "]";
	}
	
	

}
