package com;

public class Cuenta {
	
	/*PLANTILLA DEL PROYECTO QUE CONTENDRA LOS DATOS DE UNA CUENTA DE BARCO Y LA ALMACENAREMOS
	 * EN UN HashMap PARA SIMULAR UNA PEQUEÑA BASE DE DATOS EN ESTECASO 
	 * COMO EL HashMap ALMACENA LOS VALORES EN PARES (Clave - valor )
	 * LA CLAVE DEL HashMap funcionara como un id o numero de cuenta 
	 */
	
	
	private String nombre;
	private double saldo;
	private String nip;
	private String tipodecuenta;
	private double saldoMin;
	private double saldoMax;
	
	public Cuenta () {
		
	}

	public Cuenta(String nombre, double saldo, String nip, String tipodecuenta, double saldoMin, double saldoMax) {
		super();
		this.nombre = nombre;
		this.saldo = saldo;
		this.nip = nip;
		this.tipodecuenta = tipodecuenta;
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

	public String getTipodecuenta() {
		return tipodecuenta;
	}

	public void setTipodecuenta(String tipodecuenta) {
		this.tipodecuenta = tipodecuenta;
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
		return "Cuenta [nombre=" + nombre + ", saldo=" + saldo + ", nip=" + nip + ", tipodecuenta=" + tipodecuenta
				+ ", saldoMin=" + saldoMin + ", saldoMax=" + saldoMax + "]";
	}
	
	

}
