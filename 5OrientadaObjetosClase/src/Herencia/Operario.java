package Herencia;

public class Operario extends Empleado {

	//atributos
	protected boolean haceHoraExtra;
	
	//constructor
	public Operario(String nombre, int edad, double salario, boolean haceHoraExtra) {
		super(nombre, edad, salario);
		this.haceHoraExtra = haceHoraExtra;
	}

	//setter y getters
	/**
	 * @return the haceHoraExtra
	 */
	public boolean isHaceHoraExtra() {
		return haceHoraExtra;
	}

	/**
	 * @param haceHoraExtra the haceHoraExtra to set
	 */
	public void setHaceHoraExtra(boolean haceHoraExtra) {
		this.haceHoraExtra = haceHoraExtra;
	}
	

}
