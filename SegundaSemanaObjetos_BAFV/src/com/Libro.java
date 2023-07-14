package com;

public class Libro {

	private String titulo;
	private String autor;
	private int  a�o;
	private String genero;
	
	public Libro() {
		
	}

	public Libro(String titulo, String autor, int a�o, String genero) {
		super();
		this.titulo = titulo;
		this.autor = autor;
		this.a�o = a�o;
		this.genero = genero;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public int  getA�o() {
		return a�o;
	}

	public void setA�o(int  a�o) {
		this.a�o = a�o;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	@Override
	public String toString() {
		return "Libro [titulo=" + titulo + ", autor=" + autor + ", a�o=" + a�o + ", genero=" + genero + "]";
	}
	
	
	
}
