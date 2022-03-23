/**
 * 
 */
package Tienda;

/**
 * @author alumno
 *
 */
public class ClienteNoRegistrado extends Cliente implements Descontable {
	
	public ClienteNoRegistrado(String nombre, String apellidos, String dni, String localidad, String email) {
		super(nombre, apellidos, dni, localidad, email);
		// TODO Auto-generated constructor stub
	}
	
	public ClienteNoRegistrado(ClienteNoRegistrado otro) {
		super(otro);
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public double descuento() {
		return 0;
	}

}
