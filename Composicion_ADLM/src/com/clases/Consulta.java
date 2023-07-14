package com.clases;

public class Consulta {
	private Mascota mascota;
	private Persona due�o;
	private Contacto contactoDue�o;
	private String sintomas, fecha;
	
	public Consulta(Mascota mascota, Persona due�o, Contacto contactoDue�o, String sintomas, String fecha) {
		super();
		this.mascota = mascota;
		this.due�o = due�o;
		this.contactoDue�o = contactoDue�o;
		this.sintomas = sintomas;
		this.fecha = fecha;
	}
	public Mascota getMascota() {
		return mascota;
	}
	public void setMascota(Mascota mascota) {
		this.mascota = mascota;
	}
	public Persona getDue�o() {
		return due�o;
	}
	public void setDue�o(Persona due�o) {
		this.due�o = due�o;
	}
	public Contacto getContactoDue�o() {
		return contactoDue�o;
	}
	public void setContactoDue�o(Contacto contactoDue�o) {
		this.contactoDue�o = contactoDue�o;
	}
	public String getSintomas() {
		return sintomas;
	}
	public void setSintomas(String sintomas) {
		this.sintomas = sintomas;
	}
	public String getFecha() {
		return fecha;
	}
	public void setFecha(String fecha) {
		this.fecha = fecha;
	}
	@Override
	public String toString() {
		return "Consulta [mascota=" + mascota.getNombre() + ", due�o=" + due�o.getNombre() + ", Casa=" + contactoDue�o.getTelefonoCasa() + ", Celular=" + contactoDue�o.getTelefonoCelular() + ", sintomas="
				+ sintomas + ", fecha=" + fecha + "]";
	}
	
	
	
}
