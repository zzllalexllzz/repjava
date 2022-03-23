package AlquilerPeliculas;

public class Peliculas extends Multimedia {

	//atributos
	private int duracion;
	
	/**
	 * constructores
	 * @param titulo
	 * @param plus
	 * @param precio
	 * @param duracion
	 */
	public Peliculas(String titulo, boolean plus, double precio,int duracion) {
		super(titulo, plus, precio);
		this.duracion= duracion;
	}

	/**
	 * @return the duracion
	 */
	public int getDuracion() {
		return duracion;
	}

	/**
	 * @param duracion the duracion to set
	 */
	public void setDuracion(int duracion) {
		this.duracion = duracion;
	}

	/**
	 * metodo to string
	 */
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Peliculas [duracion=");
		builder.append(duracion);
		builder.append(", toString()=");
		builder.append(super.toString());
		builder.append("]");
		return builder.toString();
	}

	

}
