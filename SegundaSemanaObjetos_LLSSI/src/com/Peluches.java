package com;

public class Peluches {
	
	private String forma;
	private String relleno;
	private String accesorios;
	private String textura;
	private double tama�o;
	
	public Peluches () {
		
	}

	public Peluches(String forma, String relleno, String accesorios, String textura, double tama�o) {
		super();
		this.forma = forma;
		this.relleno = relleno;
		this.accesorios = accesorios;
		this.textura = textura;
		this.tama�o = tama�o;
	}

	public String getForma() {
		return forma;
	}

	public void setForma(String forma) {
		this.forma = forma;
	}

	public String getRelleno() {
		return relleno;
	}

	public void setRelleno(String relleno) {
		this.relleno = relleno;
	}

	public String getAccesorios() {
		return accesorios;
	}

	public void setAccesorios(String accesorios) {
		this.accesorios = accesorios;
	}

	public String getTextura() {
		return textura;
	}

	public void setTextura(String textura) {
		this.textura = textura;
	}

	public double getTama�o() {
		return tama�o;
	}

	public void setTama�o(double tama�o) {
		this.tama�o = tama�o;
	}

	@Override
	public String toString() {
		return "Peluches [forma=" + forma + ", relleno=" + relleno + ", accesorios=" + accesorios + ", textura="
				+ textura + ", tama�o=" + tama�o + "]";
	}
	
	
	
	
	
	
	

}
