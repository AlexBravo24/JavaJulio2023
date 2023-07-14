package com;

public class Maquillaje {
	
	private String marca;
	private Sombras nude;
	private Rimen mascara;
	private Labiales matte;
	
	public Maquillaje () {
		
	}

	public Maquillaje(String marca, Sombras nude, Rimen mascara, Labiales matte) {
		super();
		this.marca = marca;
		this.nude = nude;
		this.mascara = mascara;
		this.matte = matte;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public Sombras getNude() {
		return nude;
	}

	public void setNude(Sombras nude) {
		this.nude = nude;
	}

	public Rimen getMascara() {
		return mascara;
	}

	public void setMascara(Rimen mascara) {
		this.mascara = mascara;
	}

	public Labiales getMatte() {
		return matte;
	}

	public void setMatte(Labiales matte) {
		this.matte = matte;
	}

	@Override
	public String toString() {
		return "Maquillaje [marca=" + marca + ", nude=" + nude + ", mascara=" + mascara + ", matte=" + matte + "]";
	}
	
	

}
