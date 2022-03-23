package SeriesVideojuegos;

public class Videojuego implements Entregable{
	
	//atributo
	private String titulo;
	private int horasEstimadas;
	private String genero;
	private String desarrolador;
	private boolean prestado;
	
	//constructor	
	public Videojuego() {
		this.titulo = "sin";
		this.horasEstimadas = 100;
		this.genero = "niguno";
		this.desarrolador = "sin";
		this.prestado = false;
	}

	public Videojuego(String titulo, int horasEstimadas) {
		super();
		this.titulo = titulo;
		this.horasEstimadas = horasEstimadas;
		this.genero = "niguno";
		this.desarrolador = "sin";
		this.prestado = false;
	}

	public Videojuego(String titulo, int horasEstimadas, String genero, String desarrolador) {
		super();
		this.titulo = titulo;
		this.horasEstimadas = horasEstimadas;
		this.genero = genero;
		this.desarrolador = desarrolador;
		this.prestado = false;
	}

	public Videojuego(Videojuego otro) {
		super();
		this.titulo = otro.titulo;
		this.horasEstimadas = otro.horasEstimadas;
		this.genero = otro.genero;
		this.desarrolador = otro.desarrolador;
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
	 * @return the horasEstimadas
	 */
	public int getHorasEstimadas() {
		return horasEstimadas;
	}

	/**
	 * @param horasEstimadas the horasEstimadas to set
	 */
	public void setHorasEstimadas(int horasEstimadas) {
		this.horasEstimadas = horasEstimadas;
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
	 * @return the desarrolador
	 */
	public String getDesarrolador() {
		return desarrolador;
	}

	/**
	 * @param desarrolador the desarrolador to set
	 */
	public void setDesarrolador(String desarrolador) {
		this.desarrolador = desarrolador;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Videojuego [titulo=");
		builder.append(titulo);
		builder.append(", horasEstimadas=");
		builder.append(horasEstimadas);
		builder.append(", genero=");
		builder.append(genero);
		builder.append(", desarrolador=");
		builder.append(desarrolador);
		builder.append(", prestado=");
		builder.append(prestado);
		builder.append("]");
		return builder.toString();
	}

	//metodo implemetado por entregable
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
