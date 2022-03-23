package SeriesVideojuegos;

public class Serie implements Entregable {

	//atributos
	private String titulo;
	private int numTemporadas;
	private String genero;
	private String creador;
	private boolean prestado;
	
	//constructor
	public Serie() {
		this.titulo = "sin";
		this.numTemporadas = 3;
		this.genero = "ninguno";
		this.creador = "sin";
		this.prestado = false;
	}

	public Serie(String titulo, String creador) {
		this.titulo = titulo;
		this.numTemporadas = 3;
		this.genero = "ninguno";
		this.creador = creador;
		this.prestado = false;
	}

	public Serie(String titulo, int numTemporadas, String genero, String creador) {
		this.titulo = titulo;
		this.numTemporadas = numTemporadas;
		this.genero = genero;
		this.creador = creador;
		this.prestado = false;
	}

	public Serie(Serie otro) {
		this.titulo = otro.titulo;
		this.numTemporadas = otro.numTemporadas;
		this.genero = otro.genero;
		this.creador = otro.creador;
		this.prestado = otro.prestado;
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
	 * @return the numTemporadas
	 */
	public int getNumTemporadas() {
		return numTemporadas;
	}

	/**
	 * @param numTemporadas the numTemporadas to set
	 */
	public void setNumTemporadas(int numTemporadas) {
		this.numTemporadas = numTemporadas;
	}

	/**
	 * @return the genero
	 */
	public String getGenero() {
		return genero;
	}

	/**
	 * @param genero the genero to set
	 */
	public void setGenero(String genero) {
		this.genero = genero;
	}

	/**
	 * @return the creador
	 */
	public String getCreador() {
		return creador;
	}

	/**
	 * @param creador the creador to set
	 */
	public void setCreador(String creador) {
		this.creador = creador;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Serie [titulo=");
		builder.append(titulo);
		builder.append(", numTemporadas=");
		builder.append(numTemporadas);
		builder.append(", genero=");
		builder.append(genero);
		builder.append(", creador=");
		builder.append(creador);
		builder.append(", prestado=");
		builder.append(prestado);
		builder.append("]");
		return builder.toString();
	}

	//metodos integrados por el interfaz entregable
	@Override
	public boolean entregar() {
		return this.prestado=true;
	}

	@Override
	public boolean devolver() {
		return this.prestado=false;
	}

	@Override
	public boolean isPestado() {
		return this.prestado;
	}
	

}
