package Parking;

import java.time.Duration;
import java.time.LocalDateTime;
import java.util.Objects;

public abstract class Vehiculo implements Descontable {

	//atributos
	protected String matricula;
	protected String marca;
	protected LocalDateTime fechaEntrada;
	protected int minutos;
	protected PlazaAparcamiento plaza;
	
	//constructor
	public Vehiculo() {
		super();
		this.matricula = "";
		this.marca = "";
		this.fechaEntrada = LocalDateTime.now().withMinute(0);
	}

	public Vehiculo(String matricula, String marca) {
		super();
		this.matricula = matricula;
		this.marca = marca;
		this.fechaEntrada = LocalDateTime.now().withMinute(0);
	}
	
	public Vehiculo(Vehiculo v) {
		super();
		this.matricula = v.matricula;
		this.marca = v.marca;
	
	}
	
	public PlazaAparcamiento getPlazaAparcamiento() {
		return this.plaza;
	}

	/**
	 * @param fechaEntrada the fechaEntrada to set
	 */
	public void setFechaEntrada(LocalDateTime fechaEntrada) {
		this.fechaEntrada = fechaEntrada;
	}

	/**
	 * @return the matricula
	 */
	public String getMatricula() {
		return matricula;
	}

	/**
	 * @return the fechaEntrada
	 */
	public LocalDateTime getFechaEntrada() {
		return fechaEntrada;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Vehiculo [matricula=");
		builder.append(matricula);
		builder.append(", marca=");
		builder.append(marca);
		builder.append(", fechaEntrada=");
		builder.append(fechaEntrada);
		builder.append(", minutos=");
		builder.append(minutos);
		builder.append("]");
		return builder.toString();
	}

	@Override
	public int hashCode() {
		return Objects.hash(matricula);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Vehiculo other = (Vehiculo) obj;
		return Objects.equals(matricula, other.matricula);
	}

	/**
	 * calcula los minutos entre la fecha de hoy y la fecha de entrada
	 * @return
	 */
	public int calcularMinutos() {
		LocalDateTime ahora = LocalDateTime.now();
		Duration tiempo = Duration.between(fechaEntrada.toLocalTime(), ahora.toLocalTime());
		this.minutos=(int)tiempo.toMinutes();
		return this.minutos;
	}


	@Override
	public abstract double descuento();
	
	public abstract double calcularImporte();

	/**
	 * @param plaza the plaza to set
	 */
	public void setPlaza(PlazaAparcamiento plaza) {
		this.plaza = plaza;
	}
	
	
	

}
