package com;

public class Cuenta {
	
	// Plantilla del objeto que contendra los datos de una cuenta de banco y la almacenaremos
	// en un HashMap para simular una pequeña BD
	// En este caso como HashMap almacena los valores en pares (CLAVE-VALOR)
	// la clave funcionara como ID o num de cuenta
	
	private String nombre;
	private double saldo;
	private String nip;
	private String tipoCuenta;
	private double saldoMin;
	private double saldoMax;
	
	public Cuenta () {}

	public Cuenta(String nombre, double saldo, String nip, String tipoCuenta, double saldoMin, double saldoMax) {
		super();
		this.nombre = nombre;
		this.saldo = saldo;
		this.nip = nip;
		this.tipoCuenta = tipoCuenta;
		this.saldoMin = saldoMin;
		this.saldoMax = saldoMax;
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

	public String getTipoCuenta() {
		return tipoCuenta;
	}

	public void setTipoCuenta(String tipoCuenta) {
		this.tipoCuenta = tipoCuenta;
	}

	public double getSaldoMin() {
		return saldoMin;
	}

	public void setSaldoMin(double saldoMin) {
		this.saldoMin = saldoMin;
	}

	public double getSaldoMax() {
		return saldoMax;
	}

	public void setSaldoMax(double saldoMax) {
		this.saldoMax = saldoMax;
	}

	@Override
	public String toString() {
		return "Cuenta [nombre=" + nombre + ", saldo=" + saldo + ", nip=" + nip + ", tipoCuenta=" + tipoCuenta
				+ ", saldoMin=" + saldoMin + ", saldoMax=" + saldoMax + "]";
	}
	
	

}
