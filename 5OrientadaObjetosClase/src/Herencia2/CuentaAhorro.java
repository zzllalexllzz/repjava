package Herencia2;

public class CuentaAhorro extends CuentaBancarias {

	
	//atributo
	private double tipoInteres;
	private final double modifComisiones=0.5;
	 
	//constructor
	public CuentaAhorro(double saldo, double comisionesAnuales, double tipoInteres) {
		super(saldo, comisionesAnuales);
        this.comisionesAnuales*=modifComisiones;
        this.saldo -= comisionesAnuales;
        this.saldo=(tipoInteres*this.saldo)+this.saldo;
    }

	/**
	 * @return the tipoInteres
	 */
	public double getTipoInteres() {
		return tipoInteres;
	}

	/**
	 * @param tipoInteres the tipoInteres to set
	 */
	public void setTipoInteres(double tipoInteres) {
		this.tipoInteres = tipoInteres;
	}

	/**
	 * @return the modifComisiones
	 */
	public double getModifComisiones() {
		return modifComisiones;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("CuentaAhorro [tipoInteres=");
		builder.append(tipoInteres);
		builder.append(", modifComisiones=");
		builder.append(modifComisiones);
		builder.append(", toString()=");
		builder.append(super.toString());
		builder.append("]");
		return builder.toString();
	}
	
	
	

}
