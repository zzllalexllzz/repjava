package Scotify;

import java.time.LocalDate;

public class Podcast extends Multimedia implements Reproducible {

	//atributos
	private LocalDate fecha;
	private String capitulo;
	
	//constructor
	public Podcast(String nombre, int duracion, LocalDate fecha, String capitulo) {
		super(nombre, duracion);
		this.fecha = fecha;
		this.capitulo = capitulo;
	}
	
	/**
	 * @return the fecha
	 */
	public LocalDate getFecha() {
		return fecha;
	}

	/**
	 * @param fecha the fecha to set
	 */
	public void setFecha(LocalDate fecha) {
		this.fecha = fecha;
	}

	/**
	 * @return the capitulo
	 */
	public String getCapitulo() {
		return capitulo;
	}

	/**
	 * @param capitulo the capitulo to set
	 */
	public void setCapitulo(String capitulo) {
		this.capitulo = capitulo;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Podcast [fecha=");
		builder.append(fecha);
		builder.append(", capitulo=");
		builder.append(capitulo);
		builder.append(", nombre=");
		builder.append(nombre);
		builder.append(", duracion=");
		builder.append(duracion);
		builder.append(", anio=");
		builder.append(anio);
		builder.append(", autores=");
		builder.append(autores);
		builder.append(", reprodducciones=");
		builder.append(reprodducciones);
		builder.append("]");
		return builder.toString();
	}

	/**
	 * metodo que imprime nombre , fecha y capitulo 
	 */
	public void reproducir() {
		System.out.println("Reproduciendo "+this.nombre+" en "+this.fecha+" capitulo "+this.capitulo);
	}

	
}
