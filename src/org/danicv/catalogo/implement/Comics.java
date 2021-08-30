package org.danicv.catalogo.implement;

public class Comics extends Libro {
	private String personaje;

	public Comics(int precio, String autor, String titulo, String editorial, String personaje) {
		super(precio, autor, titulo, editorial);
		this.personaje = personaje;
	}

	public String getPersonaje() {
		return personaje;
	}

	@Override
	public double getPrecioVenta() {
		// TODO Auto-generated method stub
		return super.getPrecioVenta();
	}

	
}
