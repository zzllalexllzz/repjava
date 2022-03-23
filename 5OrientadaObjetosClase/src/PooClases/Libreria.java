package PooClases;

import java.util.ArrayList;

public class Libreria {
	
	private ArrayList<Libro>vecLibreria;
	
	//constructor
	public Libreria() {
		vecLibreria = new ArrayList<>(1000);
	}
	
	/**
	 * metodo adquirir que que pasado un objeto libro  y un precio de compra
	 * asigna el precio  al objeto  y añade el objeto metido por parametro
	 * @param otro
	 * @param precioComp
	 */
	public void adquirir(Libro otro, double precioComp) {
		otro.setPrecioCompra(precioComp);
		vecLibreria.add(otro);
		
	}
	
	/**
	 * metodo vender le paso un objeto libro  y un preco de venta 
	 * asigan el precio a objeto  y cambia el atributo vendido a true
	 * @param otro
	 * @param precioVent
	 */
	public void vender(Libro otro, double precioVent) {
		for (Libro li : vecLibreria) {
			if (li.equals(otro)) {
				li.setPrecioVenta(precioVent);
				li.setVendido(true);
			}
		}
	}
	
	/**
	 * metodo que devuelve las ganacias 
	 * @return
	 */
	public double ganancias() {
		double ganancia=0;
		for (Libro libr : vecLibreria) {
			if (libr.isVendido()) {
				ganancia+=(libr.getPrecioVenta()-libr.getPrecioCompra());
			}
			
		}
		return ganancia;
	}
}
