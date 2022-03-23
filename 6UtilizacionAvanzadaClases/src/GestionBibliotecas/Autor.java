package GestionBibliotecas;

import java.util.Objects;

public class Autor {

	private String nombre;
	private String apelidos;
	private int edad;
	private String ciudad;
	private String direccion;
	private String email;
	
	public Autor(String nombre, String apelidos, int edad, String ciudad, String direccion, String email) {
		super();
		this.nombre = nombre;
		this.apelidos = apelidos;
		this.edad = edad;
		this.ciudad = ciudad;
		this.direccion = direccion;
		this.email = email;
	}
	

	public Autor(String nombre, String apelidos) {
		super();
		this.nombre = nombre;
		this.apelidos = apelidos;
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
	 * @return the apelidos
	 */
	public String getApelidos() {
		return apelidos;
	}

	/**
	 * @param apelidos the apelidos to set
	 */
	public void setApelidos(String apelidos) {
		this.apelidos = apelidos;
	}

	/**
	 * @return the edad
	 */
	public int getEdad() {
		return edad;
	}

	/**
	 * @param edad the edad to set
	 */
	public void setEdad(int edad) {
		this.edad = edad;
	}

	/**
	 * @return the ciudad
	 */
	public String getCiudad() {
		return ciudad;
	}

	/**
	 * @param ciudad the ciudad to set
	 */
	public void setCiudad(String ciudad) {
		this.ciudad = ciudad;
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

	/**
	 * @return the email
	 */
	public String getEmail() {
		return email;
	}

	/**
	 * @param email the email to set
	 */
	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Autor [nombre=");
		builder.append(nombre);
		builder.append(", apelidos=");
		builder.append(apelidos);
		builder.append(", edad=");
		builder.append(edad);
		builder.append(", ciudad=");
		builder.append(ciudad);
		builder.append(", direccion=");
		builder.append(direccion);
		builder.append(", email=");
		builder.append(email);
		builder.append("]");
		return builder.toString();
	}

	@Override
	public int hashCode() {
		return Objects.hash(apelidos, nombre);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Autor other = (Autor) obj;
		return Objects.equals(apelidos, other.apelidos) && Objects.equals(nombre, other.nombre);
	}
	
}
