package Scotify;


import java.util.ArrayList;
import java.util.Objects;

public class Multimedia implements Reproducible{

	//atributo
	protected String nombre;
	protected int duracion;
	protected int anio;
	protected ArrayList<Autor>autores;
	protected int reprodducciones;

	//constructor
	public Multimedia(String nombre, int duracion) {
		super();
		this.nombre = nombre;
		this.duracion = duracion;
		this.reprodducciones = 0 ;
		this.autores = new ArrayList<>();
	}

	/**
	 * @return the nombre
	 */
	public String getNombre() {
		return nombre;
	}

	/**
	 * @param nombre the nombre to set
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	/**
	 * @return the duracion
	 */
	public int getDuracion() {
		return duracion;
	}

	/**
	 * @param duracion the duracion to set
	 */
	public void setDuracion(int duracion) {
		this.duracion = duracion;
	}

	/**
	 * @return the anio
	 */
	public int getAnio() {
		return anio;
	}

	/**
	 * @param anio the anio to set
	 */
	public void setAnio(int anio) {
		this.anio = anio;
	}

	/**
	 * @return the autores
	 */
	public ArrayList<Autor> getAutores() {
		return autores;
	}

	/**
	 * @param autores the autores to set
	 */
	public void setAutores(ArrayList<Autor> autores) {
		this.autores = autores;
	}

	/**
	 * @return the reprodducciones
	 */
	public int getReprodducciones() {
		return reprodducciones;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Multimedia [nombre=");
		builder.append(nombre);
		builder.append(", duracion=");
		builder.append(duracion);
		builder.append("]");
		return builder.toString();
	}

	@Override
	public int hashCode() {
		return Objects.hash(duracion, nombre);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Multimedia other = (Multimedia) obj;
		return duracion == other.duracion && Objects.equals(nombre, other.nombre);
	}
	
	/**
	 * metdo que añade una autor al arraylist de autores
	 * @param au
	 */
	public void addAutor(Autor au) {
		autores.add(au);
	}
	
	/**
	 * metdo que elimina una autor al arraylist de autores
	 * @param au
	 */
	public void deleteAutor(Autor au) {
		autores.remove(au);
	}
	
	/**
	 * metodo implementado por reproducible
	 * que imprime el nombre de la cacion o potscat 
	 * y suma +1 a las reproducciones
	 */
	@Override
	public void reproducir() {
		System.out.println("Reproduciendo "+this.nombre);
		this.reprodducciones++;
	}
	
	
}
