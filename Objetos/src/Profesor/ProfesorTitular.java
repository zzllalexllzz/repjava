package Profesor;

import java.time.LocalDate;

public class ProfesorTitular extends Profesor {

	private boolean catedratico;
	
	
	public ProfesorTitular(int numRegPersonal, String nombre, String apellido1, String apellido2,
			LocalDate fechaNacimiento, double nominaBase, boolean catedratico) {
		super(numRegPersonal, nombre, apellido1, apellido2, fechaNacimiento, nominaBase);
		this.catedratico = catedratico;
	}
	

	public ProfesorTitular(ProfesorTitular otro) {
		super(otro);
		this.catedratico = otro.catedratico;
	}


	/**
	 * @return the catedratico
	 */
	public boolean isCatedratico() {
		return catedratico;
	}

	/**
	 * @param catedratico the catedratico to set
	 */
	public void setCatedratico(boolean catedratico) {
		this.catedratico = catedratico;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("ProfesorTitular [catedratico=");
		builder.append(catedratico);
		builder.append(", toString()=");
		builder.append(super.toString());
		builder.append("]");
		return builder.toString();
	}

	@Override
	public double importeNomina() {
		return this.nominaBase*1.3;
	}
	
	

}
