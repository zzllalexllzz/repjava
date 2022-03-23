package Scotify;

import java.time.LocalDate;
import java.util.ArrayList;

public class Disco {
	
	//atributos
	protected String titulo;
	protected LocalDate fecha;
	protected Autor autor;
	protected String discografica;
	protected ArrayList<Cancion> canciones;
	
	//constructor
	public Disco(String titulo, LocalDate fecha, Autor autor, String discografica) {
		super();
		this.titulo = titulo;
		this.fecha = fecha;
		this.autor = autor;
		this.discografica = discografica;
		this.canciones = new ArrayList<>();
	}

	/**
	 * @return the titulo
	 */
	public String getTitulo() {
		return titulo;
	}

	/**
	 * @param titulo the titulo to set
	 */
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	/**
	 * @return the fecha
	 */
	public LocalDate getFecha() {
		return fecha;
	}

	/**
	 * @param fecha the fecha to set
	 */
	public void setFecha(LocalDate fecha) {
		this.fecha = fecha;
	}

	/**
	 * @return the autor
	 */
	public Autor getAutor() {
		return autor;
	}

	/**
	 * @param autor the autor to set
	 */
	public void setAutor(Autor autor) {
		this.autor = autor;
	}

	/**
	 * @return the discografica
	 */
	public String getDiscografica() {
		return discografica;
	}

	/**
	 * @param discografica the discografica to set
	 */
	public void setDiscografica(String discografica) {
		this.discografica = discografica;
	}

	/**
	 * @return the canciones
	 */
	public ArrayList<Cancion> getCanciones() {
		return canciones;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Disco [titulo=");
		builder.append(titulo);
		builder.append(", fecha=");
		builder.append(fecha);
		builder.append(", autor=");
		builder.append(autor);
		builder.append(", discografica=");
		builder.append(discografica);
		builder.append(", canciones=");
		builder.append(canciones);
		builder.append("]");
		return builder.toString();
	}
	
	/**
	 * metodo que a�ade una cancion al arraylist de canciones
	 * @param ca
	 */
	public void addCancion(Cancion ca) {
		//A�adimos el disco a la canci�n
		ca.setDisco(this);
		//A�adimos la canci�n a la lista que tiene el disco
		this.canciones.add(ca);
	}
	
	/**
	 * metodo que elimina una cancion del arraylist de canciones
	 * @param ca
	 */
	public void delCancion(Cancion ca) {
		this.canciones.remove(ca);
	}
	
	/**
	 * metodo que suma la duracion de todad las canciones
	 * @return
	 */
	public int getDuracion() {
		int duracion=0;
		for(Cancion c: canciones) {
			duracion += c.getDuracion();
		}
		return duracion;
	}
}
