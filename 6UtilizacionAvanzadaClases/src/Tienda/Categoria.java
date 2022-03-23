/**
 * 
 */
package Tienda;

/**
 * @author alumno
 *
 */
public class Categoria {
	
	protected String nombre;
	
	//constructor
	public Categoria(String nombre) {
		super();
		this.nombre = nombre;
	}
	
	//getters y setters
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
	
}
