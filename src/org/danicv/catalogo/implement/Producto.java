package org.danicv.catalogo.implement;

import org.danicv.catalogo.interfaces.IProducto;

public abstract class Producto implements IProducto {
	private int precio;

	public Producto(int precio) {
		this.precio = precio;
	}

	public int getPrecio() {
		return precio;
	}

}
