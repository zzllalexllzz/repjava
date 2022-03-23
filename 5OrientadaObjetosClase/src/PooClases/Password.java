package PooClases;

public class Password {

	//atributo
	private int longitud;
	private String contrasena;
	
	//constructor
	public Password() {
		super();
		this.longitud = 8;
		this.contrasena = this.generarPassword();
	}
	
	public Password(int longitud) {
		super();
		this.longitud = longitud;
		this.contrasena = this.generarPassword();
	}
	
	public Password(Password otro) {
		this.longitud=otro.longitud;
		this.contrasena=otro.contrasena;
	}
	
	//to string
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Password [longitud=");
		builder.append(longitud);
		builder.append(", contrasena=");
		builder.append(contrasena);
		builder.append("]");
		return builder.toString();
	}
	
	//getters y setters
	/**
	 * @return the longitud
	 */
	public int getLongitud() {
		return longitud;
	}
	/**
	 * @param longitud the longitud to set
	 */
	public void setLongitud(int longitud) {
		this.longitud = longitud;
	}
	/**
	 * @return the contrasena
	 */
	public String getContrasena() {
		return contrasena;
	}
	
	//metodos
	/**
	 * cuenta  cuantas mayusculas, minusculas, numeros y caracteres especiales
	 * hay y si cumple con los requisitos de una contrasena fuerte es true si no 
	 * false. 
	 * @return
	 */
	public boolean esFuerte() {
		int contMayus=0;
		int contMinus=0;
		int contNum=0;
		int contSinbo=0;
		for (int i = 0; i < this.contrasena.length(); i++) {
			if (this.contrasena.charAt(i)>='A' && this.contrasena.charAt(i)<='Z' ) {
				contMayus++;
			} else if (this.contrasena.charAt(i)>='a' && this.contrasena.charAt(i)<='z'){
				contMinus++;
			} else if (this.contrasena.charAt(i)>='0' && this.contrasena.charAt(i)<='9'){
				contNum++;
			}else {
				contSinbo++;
			}
		}
		if (this.longitud==8 && contMayus>=1 && contMinus>=2 && contNum>=2 && contSinbo>=1) {
			return true;
		} else {
			return false;
		}
	}
	
	/**
	 * genera una contraseña aleatoria usando el rango de la tabla de ascii
	 * @return
	 */
	public String generarPassword() {
		StringBuilder pass = new StringBuilder(this.longitud);
		
		for(int i=0; i<this.longitud;i++) {
			pass.append((char) (Math.random()*(122-33)+33));
		}
		return pass.toString();
	}
	
}
	