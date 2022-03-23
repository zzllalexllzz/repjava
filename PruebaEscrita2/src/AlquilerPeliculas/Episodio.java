package AlquilerPeliculas;

public class Episodio {
 
	//atributos
	private String titulo;
	private int duracion;
	private Temporada temporadas;
	
	//constructores
	public Episodio(String titulo, int duracion) {
		super();
		this.titulo = titulo;
		this.duracion = duracion;
		this.temporadas = null;
	}

	public Episodio() {
		super();
		this.titulo = "";
		this.duracion = 0;
		this.temporadas = null;
	}

	//getters y setters
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
	 * @return the temporadas
	 */
	public Temporada getTemporadas() {
		return temporadas;
	}

	/**
	 * @param temporadas the temporadas to set
	 */
	public void setTemporadas(Temporada temporadas) {
		this.temporadas = temporadas;
	}

	/**
	 * metodo to string
	 */
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Episodio [titulo=");
		builder.append(titulo);
		builder.append(", duracion=");
		builder.append(duracion);
		builder.append(", temporadas=");
		builder.append(temporadas);
		builder.append("]");
		return builder.toString();
	}
	
	
	
	
	
}
