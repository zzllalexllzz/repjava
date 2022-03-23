package GestionBibliotecas;

import java.util.ArrayList;


public class Biblioteca {

	//atributos
	private ArrayList<Publicacion>publicaciones;
	private String direccion;
	
	//constructor
	public Biblioteca(String direccion) {
		super();
		this.publicaciones = new ArrayList<>();
		this.direccion = direccion;
	}

	/**
	 * @return the direccion
	 */
	public String getDireccion() {
		return direccion;
	}

	/**
	 * @param direccion the direccion to set
	 */
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	
	public void adquirirMaterial(Publicacion unaPub) {
		publicaciones.add(unaPub);
	}
	
	/**
	 * metodo que devuelve un publicacion dado el titulo
	 * @param titulo
	 * @return
	 */
	public Publicacion buscar(String titulo) {
		for (Publicacion p : publicaciones) {
			if (p.titulo.equals(titulo)) {
				return p;
			}
		}
		return null;
	}
	
	/**
	 * metodo que devuelve todas las publicaciones dado un autor
	 * @param au
	 * @return
	 */
	public ArrayList<Publicacion>  buscar(Autor au) {
		ArrayList<Publicacion>librosDe=new ArrayList<>();
		for (Publicacion p : publicaciones) {
			for (Autor a : p.getAutores()) {
				if (a.equals(au)) {
					librosDe.add(p);
				}
			}
		}
		return librosDe;
		
	}
	
	
}
