package PooClases;

import java.util.Objects;

public class Libro {

	//atributos
	private String isbn;
	private String titulo;
	private String autor;
	private int numeroPaginas;
	private double precioCompra;
	private double precioVenta;
	private boolean vendido;
	
	//constructor
	public Libro(String titulo, String autor, int numeroPaginas) {
		super();
		this.isbn = generarIsbn();
		this.titulo = titulo;
		this.autor = autor;
		this.numeroPaginas = numeroPaginas;
		this.precioCompra = 0;
		this.precioVenta = 0;
		this.vendido = false;
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
	 * @return the autor
	 */
	public String getAutor() {
		return autor;
	}

	/**
	 * @param autor the autor to set
	 */
	public void setAutor(String autor) {
		this.autor = autor;
	}

	/**
	 * @return the numeroPaginas
	 */
	public int getNumeroPaginas() {
		return numeroPaginas;
	}

	/**
	 * @param numeroPaginas the numeroPaginas to set
	 */
	public void setNumeroPaginas(int numeroPaginas) {
		this.numeroPaginas = numeroPaginas;
	}

	/**
	 * @return the precioCompra
	 */
	public double getPrecioCompra() {
		return precioCompra;
	}

	/**
	 * @param precioCompra the precioCompra to set
	 */
	public void setPrecioCompra(double precioCompra) {
		this.precioCompra = precioCompra;
	}

	/**
	 * @return the precioVenta
	 */
	public double getPrecioVenta() {
		return precioVenta;
	}

	/**
	 * @param precioVenta the precioVenta to set
	 */
	public void setPrecioVenta(double precioVenta) {
		this.precioVenta = precioVenta;
	}

	/**
	 * @return the vendido
	 */
	public boolean isVendido() {
		return vendido;
	}

	/**
	 * @param vendido the vendido to set
	 */
	public void setVendido(boolean vendido) {
		this.vendido = vendido;
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
		
		builder.append("El libro ");
		builder.append(titulo);
		builder.append(" con ISBN ");
		builder.append(isbn);
		builder.append(" creado por el autor ");
		builder.append(autor);
		builder.append(" y tiene ");
		builder.append(numeroPaginas);
		builder.append(" paginas.");
		return builder.toString();
	}

	/**
	 * genera un codigo de 10 digitos q sera el ISBN
	 * @return
	 */
	public String generarIsbn() {
		StringBuilder id = new StringBuilder();
		
		for(int i=0; i<10;i++) {
			id.append((char) (Math.random()*(48-57)+57));
		}
		return id.toString();
	}

	//METODO EQUALS
	@Override
	public int hashCode() {
		return Objects.hash(autor, isbn, numeroPaginas, precioCompra, precioVenta, titulo, vendido);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Libro other = (Libro) obj;
		return Objects.equals(autor, other.autor) && Objects.equals(isbn, other.isbn)
				&& numeroPaginas == other.numeroPaginas
				&& Double.doubleToLongBits(precioCompra) == Double.doubleToLongBits(other.precioCompra)
				&& Double.doubleToLongBits(precioVenta) == Double.doubleToLongBits(other.precioVenta)
				&& Objects.equals(titulo, other.titulo) && vendido == other.vendido;
	}
	
	
	
	
}
