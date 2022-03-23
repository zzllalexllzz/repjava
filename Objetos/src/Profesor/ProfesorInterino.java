package Profesor;

import java.time.LocalDate;
import java.time.Period;

public class ProfesorInterino extends Profesor {

	private LocalDate inicioInterinidad;
	
	public ProfesorInterino(int numRegPersonal, String nombre, String apellido1, String apellido2,
			LocalDate fechaNacimiento, double nominaBase, LocalDate inicioInterinidad) {
		super(numRegPersonal, nombre, apellido1, apellido2, fechaNacimiento, nominaBase);
		this.inicioInterinidad = inicioInterinidad;
	}
	

	public ProfesorInterino(ProfesorInterino otro) {
		super(otro);
		this.inicioInterinidad = otro.inicioInterinidad;
	}


	/**
	 * @return the inicioInterinidad
	 */
	public LocalDate getInicioInterinidad() {
		return inicioInterinidad;
	}

	/**
	 * @param inicioInterinidad the inicioInterinidad to set
	 */
	public void setInicioInterinidad(LocalDate inicioInterinidad) {
		this.inicioInterinidad = inicioInterinidad;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("ProfesorInterino [inicioInterinidad=");
		builder.append(inicioInterinidad);
		builder.append(", toString()=");
		builder.append(super.toString());
		builder.append("]");
		return builder.toString();
	}

	@Override
	public double importeNomina() {
		return this.nominaBase*1.1;
	}
	
	public void tiempoTrabajado() {
		LocalDate inicio = this.inicioInterinidad;
		LocalDate fin = LocalDate.now();
		Period tieTrab = Period.between(inicio, fin);
		System.out.printf("periodo años %a mes %m dia %a",tieTrab.getYears(),tieTrab.getMonths(),tieTrab.getDays());
		
	}

}
