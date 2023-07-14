package com.clases;

public class Consulta {
	private Mascota mascota;
	private Persona dueño;
	private Contacto contactoDueño;
	private String sintomas, fecha;
	
	public Consulta(Mascota mascota, Persona dueño, Contacto contactoDueño, String sintomas, String fecha) {
		super();
		this.mascota = mascota;
		this.dueño = dueño;
		this.contactoDueño = contactoDueño;
		this.sintomas = sintomas;
		this.fecha = fecha;
	}
	public Mascota getMascota() {
		return mascota;
	}
	public void setMascota(Mascota mascota) {
		this.mascota = mascota;
	}
	public Persona getDueño() {
		return dueño;
	}
	public void setDueño(Persona dueño) {
		this.dueño = dueño;
	}
	public Contacto getContactoDueño() {
		return contactoDueño;
	}
	public void setContactoDueño(Contacto contactoDueño) {
		this.contactoDueño = contactoDueño;
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
		return "Consulta [mascota=" + mascota.getNombre() + ", dueño=" + dueño.getNombre() + ", Casa=" + contactoDueño.getTelefonoCasa() + ", Celular=" + contactoDueño.getTelefonoCelular() + ", sintomas="
				+ sintomas + ", fecha=" + fecha + "]";
	}
	
	
	
}
