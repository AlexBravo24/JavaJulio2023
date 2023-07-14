package com;

public class OnePiece {
	
	public String nombre;
	public String tripulacion;
	public boolean esUsuario;
	public String fruta;
	public boolean haki;
	public String tipoDeHaki;
	
	public OnePiece() {
		
	}

	public OnePiece(String nombre, String tripulacion, boolean esUsuario, String fruta, boolean haki,
			String tipoDeHaki) {
		super();
		this.nombre = nombre;
		this.tripulacion = tripulacion;
		this.esUsuario = esUsuario;
		this.fruta = fruta;
		this.haki = haki;
		this.tipoDeHaki = tipoDeHaki;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getTripulacion() {
		return tripulacion;
	}

	public void setTripulacion(String tripulacion) {
		this.tripulacion = tripulacion;
	}

	public boolean isEsUsuario() {
		return esUsuario;
	}

	public void setEsUsuario(boolean esUsuario) {
		this.esUsuario = esUsuario;
	}

	public String getFruta() {
		return fruta;
	}

	public void setFruta(String fruta) {
		this.fruta = fruta;
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
		return "OnePiece [nombre=" + nombre + ", tripulacion=" + tripulacion + ", esUsuario=" + esUsuario + ", fruta="
				+ fruta + ", haki=" + haki + ", tipoDeHaki=" + tipoDeHaki + "]";
	}
	
	
	

}
