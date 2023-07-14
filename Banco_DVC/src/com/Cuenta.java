package com;

public class Cuenta {
	//Plantilla de l objeto que contendrá los datos
	//de una cuenta de baco y la almacenaremos en un
	//HasMap para simular una pequeña base de datos
	//En este caso el HasMap almacena los valores
	//En pares (Clave- Valor), la clave del HasMap
	//funcionará como un id o número de cuenta
	
	private String nombre;
	private double saldo;
	private String nip;
	private String tipcuen;
	private double salmin;
	private double salmax;
	
	public Cuenta () {
		
	}

	public Cuenta(String nombre, double saldo, String nip, String tipcuen, double salmin, double salmax) {
		super();
		this.nombre = nombre;
		this.saldo = saldo;
		this.nip = nip;
		this.tipcuen = tipcuen;
		this.salmin = salmin;
		this.salmax = salmax;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public String getNip() {
		return nip;
	}

	public void setNip(String nip) {
		this.nip = nip;
	}

	public String getTipcuen() {
		return tipcuen;
	}

	public void setTipcuen(String tipcuen) {
		this.tipcuen = tipcuen;
	}

	public double getSalmin() {
		return salmin;
	}

	public void setSalmin(double salmin) {
		this.salmin = salmin;
	}

	public double getSalmax() {
		return salmax;
	}

	public void setSalmax(double salmax) {
		this.salmax = salmax;
	}

	@Override
	public String toString() {
		return "Cuenta [nombre=" + nombre + ", saldo=" + saldo + ", nip=" + nip + ", tipcuen=" + tipcuen + ", salmin="
				+ salmin + ", salmax=" + salmax + "]";
	}
	
	
	
	

}
