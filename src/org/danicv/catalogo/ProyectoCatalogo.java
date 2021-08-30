package org.danicv.catalogo;

import org.danicv.catalogo.implement.Producto;
import org.danicv.catalogo.implement.TvLcd;
import org.danicv.catalogo.interfaces.IElectronico;
import org.danicv.catalogo.interfaces.ILibro;
import org.danicv.catalogo.interfaces.IProducto;
import org.danicv.catalogo.implement.IPhone;
import org.danicv.catalogo.implement.Comics;
import org.danicv.catalogo.implement.Libro;

public class ProyectoCatalogo {

	public static void main(String[] args) {
		IProducto[] productos = new IProducto[4];
		productos[0] = new TvLcd(340000, "Sony", 40);
		productos[1] = new TvLcd(200000, "LG", 50);
		productos[2] = new IPhone(28000, "Samsung", "Galaxy", "negro");
		productos[3] = new Comics(2000, "Robert Kisman", "The walking dead", "AMC", "Rick Grimes");
		for (IProducto proc : productos) {

			if (proc instanceof IElectronico) {

				System.out.print("Fabricante: " + ((IElectronico) proc).getFabricante() + "");

				if (proc instanceof TvLcd) {
					System.out.print("\nPulgadas: " + ((TvLcd) proc).getPulgada() + " Precio: " + proc.getPrecio());
					System.out.println();
				}

				if (proc instanceof IPhone) {
					System.out.print(" Modelo: " + ((IPhone) proc).getModelo());
					System.out.print(" - ");
					System.out.print(" Color: " + ((IPhone) proc).getColor());
				}
			}

			if (proc instanceof ILibro) {
				System.out.print("\nTitulo: " + ((ILibro) proc).getTitulo());
				System.out.print(" - ");
				System.out.print("Autor: " + ((ILibro) proc).getAutor());

				if (proc instanceof Comics) {
					System.out.print(" - ");
					System.out.print("Personaje: " + ((Comics) proc).getPersonaje());
				}

			}

		}

	}

}