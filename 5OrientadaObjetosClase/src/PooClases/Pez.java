package PooClases;

import java.util.Objects;

public class Pez {

	//atributo
	private String nombre;
	private static int numPeces=0;

	/**
	 * constructor
	 * @param nombre
	 */
	public Pez(String nombre) {
		super();
		this.nombre = nombre;
		Pez.numPeces++;
	}
	
	/**
	 * construcor copia
	 * @param otro
	 */
	public Pez(Pez otro) {
		this.nombre=otro.nombre;
		Pez.numPeces++;
	}
	
	/**
	 * to string
	 */
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Pez [nombre=");
		builder.append(nombre);
		builder.append("]");
		return builder.toString();
	}
	
	/**
	 * @return the nombre
	 */
	public String getNombre() {
		return this.nombre;
	}

	/**
	 * @param nombre the nombre to set
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	/**
	 * @return the numPeces
	 */
	public static int getNumPeces() {
		return numPeces;
	}

	/**
	 * metodo clone profundo
	 */
	@Override
	protected Pez clone() throws CloneNotSupportedException {
		Pez p1 = new Pez(this);
		return p1;
	}

	/**
	 * metodo equals
	 */
	@Override
	public int hashCode() {
		return Objects.hash(nombre);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Pez other = (Pez) obj;
		return Objects.equals(nombre, other.nombre);
	}
	
	
	
	
}
