package com;

public class Unidadmedida {
	
	public String Unidadmedida;
	public String Sistemametrico;
	public String Ejemplo;
	
	public Unidadmedida () {}

	public Unidadmedida(String unidadmedida, String sistemametrico, String ejemplo) {
		super();
		Unidadmedida = unidadmedida;
		Sistemametrico = sistemametrico;
		Ejemplo = ejemplo;
	}

	public String getUnidadmedida() {
		return Unidadmedida;
	}

	public void setUnidadmedida(String unidadmedida) {
		Unidadmedida = unidadmedida;
	}

	public String getSistemametrico() {
		return Sistemametrico;
	}

	public void setSistemametrico(String sistemametrico) {
		Sistemametrico = sistemametrico;
	}

	public String getEjemplo() {
		return Ejemplo;
	}

	public void setEjemplo(String ejemplo) {
		Ejemplo = ejemplo;
	}

	@Override
	public String toString() {
		return "Unidadmedida [Unidadmedida=" + Unidadmedida + ", Sistemametrico=" + Sistemametrico + ", Ejemplo="
				+ Ejemplo + "]";
	}
	
	

}
