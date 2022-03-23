package Herencia;

public class Repartidor extends Operario {

	//atributos
	private String zona;

	//constructor
	public Repartidor(String nombre, int edad, double salario, boolean haceHoraExtra, String zona) {
		super(nombre,edad,salario, haceHoraExtra);
		this.zona = zona;
	}

	//getters y setters
	/**
	 * @return the zona
	 */
	public String getZona() {
		return zona;
	}

	/**
	 * @param zona the zona to set
	 */
	public void setZona(String zona) {
		this.zona = zona;
	}

	//to sring
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Repartidor [zona=");
		builder.append(zona);
		builder.append(", HaceHoraExtra=");
		builder.append(isHaceHoraExtra()+" ");
		builder.append(super.toString());
		builder.append("]");
		return builder.toString();
	}

	//metodos
	public void metodoPlus() {
		if (this.edad<25 && this.zona.equals("zona 3") ) {
			this.salario+=this.PLUS;
		}
		if (this.haceHoraExtra==true) {
			this.salario+=(this.PLUS*2);
		}
	}

	
}
