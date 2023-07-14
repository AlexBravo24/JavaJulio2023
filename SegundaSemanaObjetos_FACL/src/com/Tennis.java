package com;

public class Tennis {

		private String modelo;
		private double talla;
		private String color;
		private String tipoDeAmortiguamiento;
		
		public Tennis() {
			
		}

		public Tennis(String modelo, double talla, String color, String tipoDeAmortiguamiento) {
			super();
			this.modelo = modelo;
			this.talla = talla;
			this.color = color;
			this.tipoDeAmortiguamiento = tipoDeAmortiguamiento;
		}

		public String getModelo() {
			return modelo;
		}

		public void setModelo(String modelo) {
			this.modelo = modelo;
		}

		public double getTalla() {
			return talla;
		}

		public void setTalla(double talla) {
			this.talla = talla;
		}

		public String getColor() {
			return color;
		}

		public void setColor(String color) {
			this.color = color;
		}

		public String getTipoDeAmortiguamiento() {
			return tipoDeAmortiguamiento;
		}

		public void setTipoDeAmortiguamiento(String tipoDeAmortiguamiento) {
			this.tipoDeAmortiguamiento = tipoDeAmortiguamiento;
		}

		@Override
		public String toString() {
			return "Tennis [modelo=" + modelo + ", talla=" + talla + ", color=" + color + ", tipoDeAmortiguamiento="
					+ tipoDeAmortiguamiento + "]";
		}
		
}
