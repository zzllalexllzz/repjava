package PooClases;

import java.util.ArrayList;

public class Agenda {

	//atributos
	private ArrayList<Contactos>contac;

	//constructor
	public Agenda() {
		super();
		this.contac = new ArrayList<>();
	}
	
	/**
	 * metodo que pasando un objeto contacto verifica si existe en el arraylist
	 * @param con
	 * @return
	 */
	public boolean existeContacto(Contactos con) {
		for (Contactos conta : contac) {
			if (conta.equals(con)) {
				return true;
			}
		}
		return false;
	}
	
	/**
	 * metodo añadir contaccto que no devuelve nada pero le pasamos un objeto contacto
	 * y con la ayuda del metod existe verificamos si ya existe en el arraylist
	 * y si no lo añade al arraylist 
	 * @param con
	 */
	public void addContacto(Contactos con) {
		if (existeContacto(con)==false) {
			contac.add(con);
		}
	}
	
	/**
	 * metodo listar contactos muestra los contactos añadidos en el arraylist
	 */
	public void listarContactos() {
		for (Contactos conta : contac) {
			System.out.println(conta);
		}
	}
	
	/**
	 * metodo buscar contacto, pasamos un string un (nombre) para que conpara dentro 
	 * del arraylist si existe un contacto el mismo nombre y devuelve el telefono
	 * @param nom
	 * @return
	 */
	public String buscarContacto(String nom) {
		String tel="No existe el contacto";
		for (Contactos conta : contac) {
			if (nom.equals(conta.getNombre())) {
				tel=conta.getTelefono();
			}
		}
		return tel;
	}
	
	/**
	 * metodo eliminar contacto pasamos un contacto  y con el metodo existe  contacto 
	 * verificamos si existe dentro del array y si existe lo eliminamos
	 * @param con
	 */
	public void eliminarContacto(Contactos con) {
			if (existeContacto(con)) {
				contac.remove(con);
			}
	}
	
	
	
}
