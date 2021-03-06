/**
 * 
 */
package Tienda;

import java.time.LocalDate;
import java.time.LocalDateTime;
import org.apache.commons.codec.digest.DigestUtils; 


/**
 * @author alumno
 *
 */
public class ClienteRegistrado extends Cliente implements Descontable {
	protected String email;
	protected String password;
	protected LocalDate fechaNacimiento;
	protected LocalDateTime fechaRegistro;
	protected static double descuento=5;
	
	@Override
	public double descuento() {
		return ClienteRegistrado.descuento;
	}

	public ClienteRegistrado(String nombre, String apellidos, String dni, String localidad, String direccion, String email, String password, LocalDate fecha) {
		super(nombre, apellidos, dni, localidad, direccion);
		this.email = email;
		this.password = DigestUtils.sha256Hex(password);
		this.fechaNacimiento = fecha;
		this.fechaRegistro = LocalDateTime.now();
	}

	public ClienteRegistrado(ClienteRegistrado otro) {
		super(otro);
		this.email = otro.email;
		this.password = otro.password;
		this.fechaNacimiento = otro.fechaNacimiento;
		this.fechaRegistro = otro.fechaRegistro;
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

	/**
	 * @return the password
	 */
	public String getPassword() {
		return password;
	}

	/**
	 * @param password the password to set
	 */
	public void setPassword(String password) {
		this.password = password;
	}

	/**
	 * @return the fechaNacimiento
	 */
	public LocalDate getFechaNacimiento() {
		return fechaNacimiento;
	}

	/**
	 * @param fechaNacimiento the fechaNacimiento to set
	 */
	public void setFechaNacimiento(LocalDate fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}

	/**
	 * @return the descuento
	 */
	public static double getDescuento() {
		return descuento;
	}

	/**
	 * @param descuento the descuento to set
	 */
	public static void setDescuento(double descuento) {
		ClienteRegistrado.descuento = descuento;
	}

	/**
	 * @return the fechaRegistro
	 */
	public LocalDateTime getFechaRegistro() {
		return fechaRegistro;
	}
	
	//ToString
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("ClienteRegistrado [email=");
		builder.append(email);
		builder.append(", password=");
		builder.append(password);
		builder.append(", fechaNacimiento=");
		builder.append(fechaNacimiento);
		builder.append(", fechaRegistro=");
		builder.append(fechaRegistro);
		builder.append(", nombre=");
		builder.append(nombre);
		builder.append(", apellidos=");
		builder.append(apellidos);
		builder.append(", dni=");
		builder.append(dni);
		builder.append(", localidad=");
		builder.append(localidad);
		builder.append(", direccion=");
		builder.append(direccion);
		builder.append("]");
		return builder.toString();
	}
	
	/**
	 * comprueba queo un password coincide encriptado con el que tenemos guardado
	 * @param pass
	 * @return
	 */
	public boolean chekPassword(String pass) {
		if (password.equals(DigestUtils.sha256Hex(pass))) {
			return true;
		}
		return false;
	}
	
	
	
	
	

	
	
	

}
