package Vehiculo;

public abstract class Vehiculo {

	private int peso;
	
	public final void setPeso(int p) { 
		peso = p; 
	}
	
	public abstract int getVelocidadActual();
	
	/*
	 * ¿Podrá tener descendencia esta clase?
	 * si, podra tener decendencia
	 * 
	 * ¿Se pueden sobreescribir todos sus métodos?
	 * se puede sobre escribir el abstract pero el final no.
	 */
}
