package Herencia2;

public class CuentaCorriente extends CuentaBancarias {

	//atributo
	private final double modifComisiones=0.4;
	TarjetaCredito tarCred;
	TarjetaDebito tarDebit;
	
	public CuentaCorriente(double saldo, double comisionesAnual) {
        super(saldo, comisionesAnual);
        this.comisionesAnuales *= this.modifComisiones;
        this.saldo -= this.comisionesAnuales;
        this.tieneTarjetaCredito=true;
        this.tieneTarjetaDebito=true;
        this.tarDebit = new TarjetaDebito();
        this.tarCred = new TarjetaCredito();
    }

	/**
	 * @return the tarCred
	 */
	public TarjetaCredito getTarCred() {
		return tarCred;
	}

	/**
	 * @param tarCred the tarCred to set
	 */
	public void setTarCred(TarjetaCredito tarCred) {
		this.tarCred = tarCred;
	}

	/**
	 * @return the tarDebit
	 */
	public TarjetaDebito getTarDebit() {
		return tarDebit;
	}

	/**
	 * @param tarDebit the tarDebit to set
	 */
	public void setTarDebit(TarjetaDebito tarDebit) {
		this.tarDebit = tarDebit;
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
		builder.append("CuentaCorriente [modifComisiones=");
		builder.append(modifComisiones);
		builder.append(", tarCred=");
		builder.append(tarCred);
		builder.append(", tarDebit=");
		builder.append(tarDebit);
		builder.append(", toString()=");
		builder.append(super.toString());
		builder.append("]");
		return builder.toString();
	}
	
	

}
