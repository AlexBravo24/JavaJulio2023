package com;

public class Inventarios {
		private int id;
		private String producto;
		private double cantidad;
		
		public Inventarios() {
			
		}

		public Inventarios(int id, String producto, double cantidad) {
			super();
			this.id = id;
			this.producto = producto;
			this.cantidad = cantidad;
		}

		public int getId() {
			return id;
		}

		public void setId(int id) {
			this.id = id;
		}

		public String getProducto() {
			return producto;
		}

		public void setProducto(String producto) {
			this.producto = producto;
		}

		public double getCantidad() {
			return cantidad;
		}

		public void setCantidad(double cantidad) {
			this.cantidad = cantidad;
		}

		@Override
		public String toString() {
			return "Inventarios [id = " + id + ", producto = " + producto + ", cantidad = " + cantidad + "]";
		}

		
		
		
		
}// cierre class
