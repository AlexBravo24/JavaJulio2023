package com.clases;

public class Contacto {
	private String telefonoCasa, telefonoCelular;

	public Contacto(String telefonoCasa, String telefonoCelular) {
		super();
		this.telefonoCasa = telefonoCasa;
		this.telefonoCelular = telefonoCelular;
	}

	public String getTelefonoCasa() {
		return telefonoCasa;
	}

	public void setTelefonoCasa(String telefonoCasa) {
		this.telefonoCasa = telefonoCasa;
	}

	public String getTelefonoCelular() {
		return telefonoCelular;
	}

	public void setTelefonoCelular(String telefonoCelular) {
		this.telefonoCelular = telefonoCelular;
	}
	
	
}
