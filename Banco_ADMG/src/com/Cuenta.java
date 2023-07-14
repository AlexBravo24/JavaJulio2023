package com;

public class Cuenta {
	//Plantilla del objeto que contendra los datos
	//de una cuenta de banco y la almacenaremos 
	//en un HashMap para simular una pequena base de datos
	//En este caso como en HashMap almacena HashMap
	//funcionara como un id o numero de cuenta
	
	private String nombre;
	private double saldo;
	private String nip;
	private String tipoCuenta;
	private double saldomin;
	private double saldomax;
	
	public Cuenta() {}

	public Cuenta(String nombre, double saldo, String nip, String tipoCuenta, double saldomin, double saldomax) {
		super();
		this.nombre = nombre;
		this.saldo = saldo;
		this.nip = nip;
		this.tipoCuenta = tipoCuenta;
		this.saldomin = saldomin;
		this.saldomax = saldomax;
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

	public double getSaldomin() {
		return saldomin;
	}

	public void setSaldomin(double saldomin) {
		this.saldomin = saldomin;
	}

	public double getSaldomax() {
		return saldomax;
	}

	public void setSaldomax(double saldomax) {
		this.saldomax = saldomax;
	}

	@Override
	public String toString() {
		return "Cuenta [nombre=" + nombre + ", saldo=" + saldo + ", nip=" + nip + ", tipoCuenta=" + tipoCuenta
				+ ", saldomin=" + saldomin + ", saldomax=" + saldomax + "]";
	}
	
	
	
	

}
