package com;

public class Tipo {
	
	private String tipo;
	private String uso;
	private int numLLantas;
	private String transmision;
	
	
	public Tipo() {
	}


	public Tipo(String tipo, String uso, int numLLantas, String transmision) {
		super();
		this.tipo = tipo;
		this.uso = uso;
		this.numLLantas = numLLantas;
		this.transmision = transmision;
	}


	public String getTransmision() {
		return transmision;
	}


	public void setTransmision(String transmision) {
		this.transmision = transmision;
	}


	public int getNumLLantas() {
		return numLLantas;
	}
	public void setNumLLantas(int numLLantas) {
		this.numLLantas = numLLantas;
	}
	
	public String getTipo() {
		return tipo;
	}


	public void setTipo(String tipo) {
		this.tipo = tipo;
	}


	public String getUso() {
		return uso;
	}


	public void setUso(String uso) {
		this.uso = uso;
	}


	@Override
	public String toString() {
		return "Tipo [tipo=" + tipo + ", uso=" + uso + ", numLLantas=" + numLLantas + ", transmision=" + transmision
				+ "]";
	}



	
	
	
	
	

}
