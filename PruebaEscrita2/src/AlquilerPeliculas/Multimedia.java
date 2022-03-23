package AlquilerPeliculas;

import java.util.Objects;

public class Multimedia {

	//atributos
	protected long codigo;
	protected static int autoIncremental=0;
	protected String titulo;
	protected boolean plus;
	protected double precio;
	protected Genero genero;
	
	//constructors
	public Multimedia() {
		super();
		this.codigo=Multimedia.autoIncremental++;
		this.titulo = "";
		this.plus = false;
		this.precio = 0;
		this.genero = Genero.ACCION;
	}

	public Multimedia(String titulo, boolean plus, double precio) {
		super();
		this.codigo=Multimedia.autoIncremental++;
		this.titulo = titulo;
		this.plus = plus;
		this.precio = precio;
		this.genero = Genero.ACCION;
	}

	//gettes y setters
	/**
	 * @return the codigo
	 */
	public long getCodigo() {
		return codigo;
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
	 * @return the plus
	 */
	public boolean isPlus() {
		return plus;
	}

	/**
	 * @param plus the plus to set
	 */
	public void setPlus(boolean plus) {
		this.plus = plus;
	}

	/**
	 * @return the precio
	 */
	public double getPrecio() {
		return precio;
	}

	/**
	 * @param precio the precio to set
	 */
	public void setPrecio(double precio) {
		this.precio = precio;
	}

	/**
	 * @return the genero
	 */
	public Genero getGenero() {
		return genero;
	}

	/**
	 * @param genero the genero to set
	 */
	public void setGenero(Genero genero) {
		this.genero = genero;
	}

	/**
	 * metodo equals
	 */
	@Override
	public int hashCode() {
		return Objects.hash(codigo);
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
		return codigo == other.codigo;
	}

	/**
	 * metodo to string
	 */
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Multimedia [codigo=");
		builder.append(codigo);
		builder.append(", titulo=");
		builder.append(titulo);
		builder.append(", plus=");
		builder.append(plus);
		builder.append(", precio=");
		builder.append(precio);
		builder.append(", genero=");
		builder.append(genero);
		builder.append("]");
		return builder.toString();
	}
	
	
	
	
}
