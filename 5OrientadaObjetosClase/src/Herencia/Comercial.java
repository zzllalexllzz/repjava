package Herencia;

public class Comercial extends Empleado {

	//atributo
	private double comision;
	
	//constructor
	public Comercial(String nombre, int edad, double salario, double comision) {
		super(nombre, edad, salario);
		this.comision = comision;
	}

	//setters y getters
	/**
	 * @return the comision
	 */
	public double getComision() {
		return comision;
	}

	/**
	 * @param comision the comision to set
	 */
	public void setComision(double comision) {
		this.comision = comision;
	}

	//to string
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Comercial [comision=");
		builder.append(comision);
		builder.append(" ");
		builder.append(super.toString());
		builder.append("]");
		return builder.toString();
	}

	//metodos
	public void metodoPlus() {
		if (this.edad>30 && this.comision>200) {
			this.salario+=this.PLUS;
		}
	}
	
	
}
