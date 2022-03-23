package Parking;

import java.util.Objects;

public class PlazaAparcamiento {

	//atributos
	private int numeroPlaza;
	private boolean libre;
	
	//contructor
	public PlazaAparcamiento() {
		super();
		this.numeroPlaza = 0;
		this.libre = true;
	}

	public PlazaAparcamiento(int plaza, boolean libre) {
		super();
		this.numeroPlaza = plaza;
		this.libre = libre;
	}

	

	/**
	 * @return the numeroPlaza
	 */
	public int getNumeroPlaza() {
		return numeroPlaza;
	}

	/**
	 * @param numeroPlaza the numeroPlaza to set
	 */
	public void setNumeroPlaza(int numeroPlaza) {
		this.numeroPlaza = numeroPlaza;
	}

	/**
	 * @return the libre
	 */
	public boolean isLibre() {
		return libre;
	}

	/**
	 * @param libre the libre to set
	 */
	public void setLibre(boolean libre) {
		this.libre = libre;
	}

	

	@Override
	public int hashCode() {
		return Objects.hash(numeroPlaza);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		PlazaAparcamiento other = (PlazaAparcamiento) obj;
		return numeroPlaza == other.numeroPlaza;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("PlazaAparcamiento [plaza=");
		builder.append(numeroPlaza);
		builder.append(", libre=");
		builder.append(libre);
		builder.append("]");
		return builder.toString();
	}
}
