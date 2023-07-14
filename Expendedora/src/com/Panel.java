package com;

public class Panel {
	
	private String nombreProdcuto;
	private double precio;
	private int cantiProducto;
	private String marca;
	private String tipo;
	
	public Panel () {
		
	}
	
	

	public Panel(String nombreProdcuto, double precio, int cantiProducto) {
		super();
		this.nombreProdcuto = nombreProdcuto;
		this.precio = precio;
		this.cantiProducto = cantiProducto;
	}



	public Panel(String nompro, double precio, int cantpro, String marca, String tipo) {
		super();
		this.nombreProdcuto = nompro;
		this.precio = precio;
		this.cantiProducto = cantpro;
		this.marca = marca;
		this.tipo = tipo;
	}

	public String getNompro() {
		return nombreProdcuto;
	}

	public void setNompro(String nompro) {
		this.nombreProdcuto = nompro;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	public int getCantpro() {
		return cantiProducto;
	}

	public void setCantpro(int cantpro) {
		this.cantiProducto = cantpro;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	@Override
	public String toString() {
		return "Panel [nombreProdcuto=" + nombreProdcuto + ", precio=" + precio + ", cantiProducto=" + cantiProducto
				+ ", marca=" + marca + ", tipo=" + tipo + "]";
	}
	
	

	
	
	
	

}
