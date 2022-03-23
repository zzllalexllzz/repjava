package Herencia;

public class MozoAlmacen extends Operario {

	//atributos
	private String peligrosidad;
	
	//constructor
	public MozoAlmacen(String nombre, int edad, double salario, boolean haceHoraExtra, String peligrosidad) {
		super(nombre, edad, salario,haceHoraExtra);
		this.peligrosidad = peligrosidad;
	}

	//getters y settes
	/**
	 * @return the peligrosidad
	 */
	public String getPeligrosidad() {
		return peligrosidad;
	}

	/**
	 * @param peligrosidad the peligrosidad to set
	 */
	public void setPeligrosidad(String peligrosidad) {
		this.peligrosidad = peligrosidad;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("MozoAlmacen [peligrosidad=");
		builder.append(peligrosidad);
		builder.append(", HaceHoraExtra=");
		builder.append(isHaceHoraExtra());
		builder.append(" ");
		builder.append(super.toString());
		builder.append("]");
		return builder.toString();
	}
	
	/**
	 * metodo suma un plus segun su condicion
	 */
	public void metodoPlus() {
		if (this.peligrosidad.equals("peligrosidad 3")) {
			this.salario+=this.PLUS;
		}else if (this.peligrosidad.equals("peligrosidad 2") && this.edad>30) {
			this.salario+=this.PLUS;
		}else if (this.peligrosidad.equals("peligrosidad 1") && this.edad<30) {
			this.salario+=this.PLUS;
		}else if (this.haceHoraExtra==true) {
			this.salario+=(this.PLUS*2);
		}
	}

}
