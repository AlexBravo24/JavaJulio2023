package com;

public class Motor {
	
	private boolean electrico;
	private boolean hibrido;
	private int cilindros;
	
	public Motor() {
		
	}

	public Motor(boolean electrico, boolean hibrido, int cilindros) {
		super();
		this.electrico = electrico;
		this.hibrido = hibrido;
		this.cilindros = cilindros;
	}

	public boolean isElectrico() {
		return electrico;
	}

	public void setElectrico(boolean electrico) {
		this.electrico = electrico;
	}

	public boolean isHibrido() {
		return hibrido;
	}

	public void setHibrido(boolean hibrido) {
		this.hibrido = hibrido;
	}

	public int getCilindros() {
		return cilindros;
	}

	public void setCilindros(int cilindros) {
		this.cilindros = cilindros;
	}

	@Override
	public String toString() {
		return "Motor [electrico=" + electrico + ", hibrido=" + hibrido + ", cilindros=" + cilindros + "]";
	}
	
	

}
