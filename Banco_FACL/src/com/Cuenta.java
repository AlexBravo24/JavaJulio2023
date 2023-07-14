package com;

public class Cuenta {
	//plantilla del objeto que contendrá los datos dde
	//Una cuenta de banco y almacenaremos en un HashMap
	//Para simular una mini BD
	
	//En pares (Clave-Valor), La clave funionará como un id
	
	
	
	private String usuario;
	private double saldo;
	private String nip;
	private String tipoCuenta;
	private double saldoMin;
	private double saldoMax;
	
	public Cuenta() {
		
	}

	public Cuenta(String usuario, double saldo, String nip, String tipoCuenta, double saldoMin, double saldoMax) {
		super();
		this.usuario = usuario;
		this.saldo = saldo;
		this.nip = nip;
		this.tipoCuenta = tipoCuenta;
		this.saldoMin = saldoMin;
		this.saldoMax = saldoMax;
	}

	public String getUsuario() {
		return usuario;
	}

	public void setUsuario(String usuario) {
		this.usuario = usuario;
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
		return "Cuenta [usuario=" + usuario + ", saldo=" + saldo + ", nip=" + nip + ", tipoCuenta=" + tipoCuenta
				+ ", saldoMin=" + saldoMin + ", saldoMax=" + saldoMax + "]";
	}
	
	
	

}
