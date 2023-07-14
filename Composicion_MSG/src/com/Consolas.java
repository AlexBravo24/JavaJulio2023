package com;

public class Consolas {
	
	private String marca;
	private String modelo;
	
	private Almacenamiento disco;
	private Juegos juego;
	private Video tarjetavideo;
	
	public Consolas() {
		
	}

	public Consolas(String marca, String modelo, Almacenamiento disco, Juegos juego, Video tarjetavideo) {
		super();
		this.marca = marca;
		this.modelo = modelo;
		this.disco = disco;
		this.juego = juego;
		this.tarjetavideo = tarjetavideo;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public Almacenamiento getDisco() {
		return disco;
	}

	public void setDisco(Almacenamiento disco) {
		this.disco = disco;
	}

	public Juegos getJuego() {
		return juego;
	}

	public void setJuego(Juegos juego) {
		this.juego = juego;
	}

	public Video getTarjetavideo() {
		return tarjetavideo;
	}

	public void setTarjetavideo(Video tarjetavideo) {
		this.tarjetavideo = tarjetavideo;
	}

	@Override
	public String toString() {
		return "Consolas [\nmarca = " + marca + ", \nmodelo = " + modelo + ", \ndisco = " + disco + ", \njuego = " + juego
				+ ", \ntarjetavideo = " + tarjetavideo + "]";
	}

	
	
	
	

}
