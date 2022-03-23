    package GestionBibliotecas;

import java.util.ArrayList;
import java.util.Objects;

public class Publicacion {
	
	//atributo
	protected String isbn;
	protected String titulo;
	protected int anio;
	protected int paginas;
	protected ArrayList<Autor>autores;
	
	//constructor
	public Publicacion( String titulo, int anio, int paginas) {
		super();
		this.isbn = generarIsbn();
		this.titulo = titulo;
		this.anio = anio;
		this.paginas = paginas;
		this.autores = new ArrayList<>();
	}
	
	/**
	 * genara un un numero aleatorio 
	 * @return
	 */
	public String generarIsbn() {
		StringBuilder id = new StringBuilder();
		
		for(int i=0; i<5;i++) {
			id.append((char) (Math.random()*(48-57)+57));
		}
		return id.toString();
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
	 * @return the paginas
	 */
	public int getPaginas() {
		return paginas;
	}

	/**
	 * @param paginas the paginas to set
	 */
	public void setPaginas(int paginas) {
		this.paginas = paginas;
	}

	/**
	 * @return the isbn
	 */
	public String getIsbn() {
		return isbn;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Publicacion [isbn=");
		builder.append(isbn);
		builder.append(", titulo=");
		builder.append(titulo);
		builder.append(", anio=");
		builder.append(anio);
		builder.append(", paginas=");
		builder.append(paginas);
		builder.append(", autores=");
		builder.append(autores);
		builder.append("]");
		return builder.toString();
	}

	@Override
	public int hashCode() {
		return Objects.hash(titulo);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Publicacion other = (Publicacion) obj;
		return Objects.equals(titulo, other.titulo);
	}
	
	/**
	 * metodo que añade un autor al arraylist
	 * @param nombre
	 * @param apellidos
	 */
	public void addAutor(String nombre, String apellidos) {
		autores.add(new Autor(nombre, apellidos));
	}
	
	/**
	 * metodo que elimina un autor del arraylist
	 * @param nombre
	 * @param apellidos
	 */
	public void deleteAutor(String nombre, String apellidos) {
		autores.remove(new Autor(nombre, apellidos));
	}

	/**
	 * @return the autores
	 */
	public ArrayList<Autor> getAutores() {
		return autores;
	}

	
}
