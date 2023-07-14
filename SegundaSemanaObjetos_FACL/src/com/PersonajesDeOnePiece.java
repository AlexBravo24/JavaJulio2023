package com;

public class PersonajesDeOnePiece {
	
	private String tripulacion;
	private String nombre;
	private boolean esUsuario;
	private String tipoDeFruta;
	private boolean haki;
	private String tipoDeHaki;
	
	
	public PersonajesDeOnePiece() {
		
	}


	public PersonajesDeOnePiece(String tripulacion, String nombre, boolean esUsuario, String string, boolean haki,
			String tipoDeHaki) {
		super();
		this.tripulacion = tripulacion;
		this.nombre = nombre;
		this.esUsuario = esUsuario;
		this.tipoDeFruta = string;
		this.haki = haki;
		this.tipoDeHaki = tipoDeHaki;
	}


	public String getTripulacion() {
		return tripulacion;
	}


	public void setTripulacion(String tripulacion) {
		this.tripulacion = tripulacion;
	}


	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public boolean isEsUsuario() {
		return esUsuario;
	}


	public void setEsUsuario(boolean esUsuario) {
		this.esUsuario = esUsuario;
	}


	public String isTipoDeFruta() {
		return tipoDeFruta;
	}


	public void setTipoDeFruta(String tipoDeFruta) {
		this.tipoDeFruta = tipoDeFruta;
	}


	public boolean isHaki() {
		return haki;
	}


	public void setHaki(boolean haki) {
		this.haki = haki;
	}


	public String getTipoDeHaki() {
		return tipoDeHaki;
	}


	public void setTipoDeHaki(String tipoDeHaki) {
		this.tipoDeHaki = tipoDeHaki;
	}


	@Override
	public String toString() {
		return "PersonajesDeOnePiece [tripulacion=" + tripulacion + ", nombre=" + nombre + ", esUsuario=" + esUsuario
				+ ", tipoDeFruta=" + tipoDeFruta + ", haki=" + haki + ", tipoDeHaki=" + tipoDeHaki + "]";
	}
	
	

}
