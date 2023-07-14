package com;

public class Modelo {
	
	private String version;
	private boolean quemacocos;
	private boolean sensore;
	private String equipoDesonido;
	
	public Modelo() {
		
	}

	public Modelo(String version, boolean quemacocos, boolean sensore, String equipoDesonido) {
		super();
		this.version = version;
		this.quemacocos = quemacocos;
		this.sensore = sensore;
		this.equipoDesonido = equipoDesonido;
	}

	public String getVersion() {
		return version;
	}

	public void setVersion(String version) {
		this.version = version;
	}

	public boolean isQuemacocos() {
		return quemacocos;
	}

	public void setQuemacocos(boolean quemacocos) {
		this.quemacocos = quemacocos;
	}

	public boolean isSensore() {
		return sensore;
	}

	public void setSensore(boolean sensore) {
		this.sensore = sensore;
	}

	public String getEquipoDesonido() {
		return equipoDesonido;
	}

	public void setEquipoDesonido(String equipoDesonido) {
		this.equipoDesonido = equipoDesonido;
	}

	@Override
	public String toString() {
		return "Modelo [version=" + version + ", quemacocos=" + quemacocos + ", sensore=" + sensore
				+ ", equipoDesonido=" + equipoDesonido + "]";
	}
	
	

}
