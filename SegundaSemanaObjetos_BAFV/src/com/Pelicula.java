package com;

public class Pelicula {

	 private String titulo;
	    private String director;
	    private int anioEstreno;
	    private String genero;
	    
	    public Pelicula() {
	    	
	    }

		public Pelicula(String titulo, String director, int anioEstreno, String genero) {
			super();
			this.titulo = titulo;
			this.director = director;
			this.anioEstreno = anioEstreno;
			this.genero = genero;
		}

		public String getTitulo() {
			return titulo;
		}

		public void setTitulo(String titulo) {
			this.titulo = titulo;
		}

		public String getDirector() {
			return director;
		}

		public void setDirector(String director) {
			this.director = director;
		}

		public int getAnioEstreno() {
			return anioEstreno;
		}

		public void setAnioEstreno(int anioEstreno) {
			this.anioEstreno = anioEstreno;
		}

		public String getGenero() {
			return genero;
		}

		public void setGenero(String genero) {
			this.genero = genero;
		}

		@Override
		public String toString() {
			return "Pelicula [titulo=" + titulo + ", director=" + director + ", anioEstreno=" + anioEstreno
					+ ", genero=" + genero + "]";
		}
	    
	    
		
}
