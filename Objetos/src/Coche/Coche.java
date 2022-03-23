/**
 * 
 */
package Coche;

/**
 * @author darge
 *
 */
public class Coche {

	private int velocidad;


	/**
	 * @param velocidad
	 */
	public Coche() {
		this.velocidad = 0;
	}

	/**
	 * @return the velocidad
	 */
	public int getVelocidad() {
		return velocidad;
	}

	/**
	 * @param velocidad the velocidad to set
	 */
	public void setVelocidad(int velocidad) {
		this.velocidad = velocidad;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Coche [velocidad=");
		builder.append(velocidad);
		builder.append("]");
		return builder.toString();
	}
	
	public void acelera(int mas) {
		velocidad+=mas;
	}
	public void frena(int menos) {
		velocidad-=menos;
	}
}
