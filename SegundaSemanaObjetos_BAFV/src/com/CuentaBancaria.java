package com;

public class CuentaBancaria {

	private String titular;
    private String numeroCuenta;
    private double saldoActual;
    private double tasaInteres;
	
	public CuentaBancaria() {
		
	}

	public CuentaBancaria(String titular, String numeroCuenta, double saldoActual, double tasaInteres) {
		super();
		this.titular = titular;
		this.numeroCuenta = numeroCuenta;
		this.saldoActual = saldoActual;
		this.tasaInteres = tasaInteres;
	}

	public String getTitular() {
		return titular;
	}

	public void setTitular(String titular) {
		this.titular = titular;
	}

	public String getNumeroCuenta() {
		return numeroCuenta;
	}

	public void setNumeroCuenta(String numeroCuenta) {
		this.numeroCuenta = numeroCuenta;
	}

	public double getSaldoActual() {
		return saldoActual;
	}

	public void setSaldoActual(double saldoActual) {
		this.saldoActual = saldoActual;
	}

	public double getTasaInteres() {
		return tasaInteres;
	}

	public void setTasaInteres(double tasaInteres) {
		this.tasaInteres = tasaInteres;
	}

	@Override
	public String toString() {
		return "CuentaBancaria [titular=" + titular + ", numeroCuenta=" + numeroCuenta + ", saldoActual=" + saldoActual
				+ ", tasaInteres=" + tasaInteres + "]";
	}
	
	
	
}
