package Herencia2;

import java.time.LocalDate;

public class Tarjeta  {

	protected String nombre;
	protected String numTarjeta;
	protected String cvv;
	protected LocalDate fechaVenci;
	protected double monto;
	
	public Tarjeta(String nombre, LocalDate fechaVenci, double monto) {
		super();
		this.nombre = nombre;
		this.numTarjeta = generaCvv();
		this.cvv = generaNumTarjeta();
		this.fechaVenci = fechaVenci;
		this.monto = monto;
	}
	
	
	public Tarjeta() {
		super();
		this.nombre = nombre;
		this.numTarjeta =generaNumTarjeta();
		this.cvv = generaCvv();
		this.fechaVenci = fechaVenci;
		this.monto = monto;
	}


	/**
	 * @return the monto
	 */
	public double getMonto() {
		return monto;
	}

	/**
	 * @param monto the monto to set
	 */
	public void setMonto(double monto) {
		this.monto = monto;
	}

	/**
	 * metodo que genera numero de cuenta
	 * @return
	 */
	public String generaCvv() {
		StringBuilder id = new StringBuilder();
		
		for(int i=0; i<3;i++) {
			id.append((char) (Math.random()*(48-57)+57));
		}
		return id.toString();
	}
	/**
	 * metodo que genera numero de cuenta
	 * @return
	 */
	public String generaNumTarjeta() {
		StringBuilder id = new StringBuilder();
		
		for(int i=0; i<3;i++) {
			id.append((char) (Math.random()*(48-57)+57));
		}
		return id.toString();
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
	 * @return the numTarjeta
	 */
	public String getNumTarjeta() {
		return numTarjeta;
	}

	/**
	 * @return the cvv
	 */
	public String getCvv() {
		return cvv;
	}

	/**
	 * @return the fechaVenci
	 */
	public LocalDate getFechaVenci() {
		return fechaVenci;
	}

	/**
	 * @param fechaVenci the fechaVenci to set
	 */
	public void setFechaVenci(LocalDate fechaVenci) {
		this.fechaVenci = fechaVenci;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Tarjeta [nombre=");
		builder.append(nombre);
		builder.append(", numTarjeta=");
		builder.append(numTarjeta);
		builder.append(", cvv=");
		builder.append(cvv);
		builder.append(", fechaVenci=");
		builder.append(fechaVenci);
		builder.append(", monto=");
		builder.append(monto);
		builder.append("]");
		return builder.toString();
	}

	
	
	
	
	
	

	

}
