package com;

public class Ciudad {

	public String Ciudad;
	public String Pais;
	public String idioma;
	
	public Ciudad () {}

	public Ciudad(String ciudad, String pais, String idioma) {
		super();
		Ciudad = ciudad;
		Pais = pais;
		this.idioma = idioma;
	}

	public String getCiudad() {
		return Ciudad;
	}

	public void setCiudad(String ciudad) {
		Ciudad = ciudad;
	}

	public String getPais() {
		return Pais;
	}

	public void setPais(String pais) {
		Pais = pais;
	}

	public String getIdioma() {
		return idioma;
	}

	public void setIdioma(String idioma) {
		this.idioma = idioma;
	}

	@Override
	public String toString() {
		return "Ciudad [Ciudad=" + Ciudad + ", Pais=" + Pais + ", idioma=" + idioma + "]";
	}
	
	
}
