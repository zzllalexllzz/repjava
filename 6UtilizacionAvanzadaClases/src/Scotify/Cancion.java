package Scotify;

public class Cancion extends Multimedia {

	public enum Tipo {
		ROCK, POP, DISCO, HIPHOP, TRAP, SOUL, JAZZ, ELECTRONICA, METAL, CLASICA, LATINO
	}
	
	//atributo
	protected Tipo genero;
	protected int posicion;
	protected Disco disco;

	//constructor
	public Cancion(String nombre, int duracion, int posicion, Tipo genero, Disco disco) {
		super(nombre, duracion);
		this.posicion = posicion;
		this.genero = genero;
		this.disco = disco;
	}

	/**
	 * @return the genero
	 */
	public Tipo getGenero() {
		return genero;
	}

	/**
	 * @param genero the genero to set
	 */
	public void setGenero(Tipo genero) {
		this.genero = genero;
	}

	/**
	 * @return the posicion
	 */
	public int getPosicion() {
		return posicion;
	}

	/**
	 * @param posicion the posicion to set
	 */
	public void setPosicion(int posicion) {
		this.posicion = posicion;
	}
	
	/**
	 * @return the disco
	 */
	public Disco getDisco() {
		return disco;
	}

	/**
	 * @param disco the disco to set
	 */
	public void setDisco(Disco disco) {
		this.disco = disco;
	}

	
	
	
	
	
}
