package Herencia2;

public class CuentaJoven extends CuentaBancarias {

	//atributo
	private final double modifComisiones=0.25;
	
	//constructor
	public CuentaJoven(double saldo, double comisionesAnual) {
        super(saldo, comisionesAnual);
        this.comisionesAnuales *=this.modifComisiones;
        this.saldo -= comisionesAnual;
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
		builder.append("CuentaJoven [modifComisiones=");
		builder.append(modifComisiones);
		builder.append(", toString()=");
		builder.append(super.toString());
		builder.append("]");
		return builder.toString();
	}
	

}
