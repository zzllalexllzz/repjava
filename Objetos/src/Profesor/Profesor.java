package Profesor;

import java.time.LocalDate;

public abstract class Profesor {

	//atributos
	protected int numRegPersonal;
	protected String nombre;
	protected String apellido1;
	protected String apellido2;
	protected LocalDate fechaNacimiento;
	protected double nominaBase;
	
	//constructor
	public Profesor(int numRegPersonal, String nombre, String apellido1, String apellido2, LocalDate fechaNacimiento,
			double nominaBase) {
		super();
		this.numRegPersonal = numRegPersonal;
		this.nombre = nombre;
		this.apellido1 = apellido1;
		this.apellido2 = apellido2;
		this.fechaNacimiento = fechaNacimiento;
		this.nominaBase = nominaBase;
	}

	public Profesor() {
		super();
		
	}

	public Profesor(Profesor otro) {
		super();
		this.numRegPersonal = otro.numRegPersonal;
		this.nombre = otro.nombre;
		this.apellido1 = otro.apellido1;
		this.apellido2 = otro.apellido2;
		this.fechaNacimiento = otro.fechaNacimiento;
		this.nominaBase = otro.nominaBase;
	}

	//setter y getters
	/**
	 * @return the numRegPersonal
	 */
	public int getNumRegPersonal() {
		return numRegPersonal;
	}

	/**
	 * @param numRegPersonal the numRegPersonal to set
	 */
	public void setNumRegPersonal(int numRegPersonal) {
		this.numRegPersonal = numRegPersonal;
	}

	/**
	 * @return the nombre
	 */
	public String getNombre() {
		return nombre;
	}

	/**
	 * @param nombre the nombre to set
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	/**
	 * @return the apellido1
	 */
	public String getApellido1() {
		return apellido1;
	}

	/**
	 * @param apellido1 the apellido1 to set
	 */
	public void setApellido1(String apellido1) {
		this.apellido1 = apellido1;
	}

	/**
	 * @return the apellido2
	 */
	public String getApellido2() {
		return apellido2;
	}

	/**
	 * @param apellido2 the apellido2 to set
	 */
	public void setApellido2(String apellido2) {
		this.apellido2 = apellido2;
	}

	/**
	 * @return the fechaNacimiento
	 */
	public LocalDate getFechaNacimiento() {
		return fechaNacimiento;
	}

	/**
	 * @param fechaNacimiento the fechaNacimiento to set
	 */
	public void setFechaNacimiento(LocalDate fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}

	/**
	 * @return the nominaBase
	 */
	public double getNominaBase() {
		return nominaBase;
	}

	/**
	 * @param nominaBase the nominaBase to set
	 */
	public void setNominaBase(double nominaBase) {
		this.nominaBase = nominaBase;
	}

	//to string
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Profesor [numRegPersonal=");
		builder.append(numRegPersonal);
		builder.append(", nombre=");
		builder.append(nombre);
		builder.append(", apellido1=");
		builder.append(apellido1);
		builder.append(", apellido2=");
		builder.append(apellido2);
		builder.append(", fechaNacimiento=");
		builder.append(fechaNacimiento);
		builder.append(", nominaBase=");
		builder.append(nominaBase);
		builder.append("]");
		return builder.toString();
	}
	
	public abstract double importeNomina();
	
	
	
}
