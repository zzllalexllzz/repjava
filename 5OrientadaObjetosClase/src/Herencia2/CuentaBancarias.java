package Herencia2;

import java.util.Objects;

public class CuentaBancarias {

	//atributo
	protected String numeroCuenta;
	protected double saldo;
	protected boolean tieneTarjetaCredito;
	protected boolean tieneTarjetaDebito;
	protected double comisionesAnuales;
	
	//constructor parametrizado
	public CuentaBancarias(double saldo, double comisionesAnuales) {
		this.numeroCuenta = generaNumCuenta();
		this.saldo = saldo;
		this.tieneTarjetaCredito = false;
		this.tieneTarjetaDebito = false;
		this.comisionesAnuales = comisionesAnuales;
	}
	//constructor copia
	public CuentaBancarias(CuentaBancarias otro) {
		this.numeroCuenta = otro.numeroCuenta;
		this.saldo = otro.saldo;
		this.tieneTarjetaCredito = otro.tieneTarjetaCredito;
		this.tieneTarjetaDebito = otro.tieneTarjetaDebito;
		this.comisionesAnuales = otro.comisionesAnuales;
	}
	
	//getters y setters
	/**
	 * @return the numeroCuenta
	 */
	public String getNumeroCuenta() {
		return numeroCuenta;
	}
	/**
	 * @return the saldo
	 */
	public double getSaldo() {
		return saldo;
	}
	/**
	 * @return the tieneTarjetaCredito
	 */
	public boolean isTieneTarjetaCredito() {
		return tieneTarjetaCredito;
	}
	/**
	 * @return the tieneTargetaCredito
	 */
	public boolean isTieneTargetaCredito() {
		return tieneTarjetaDebito;
	}
	/**
	 * @return the comisionesAnuales
	 */
	public double getComisionesAnuales() {
		return comisionesAnuales;
	}
	
	//to string
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("CuentaBancarias [numeroCuenta=");
		builder.append(numeroCuenta);
		builder.append(", saldo=");
		builder.append(saldo);
		builder.append(", tieneTarjetaCredito=");
		builder.append(tieneTarjetaCredito);
		builder.append(", tieneTargetaDebito=");
		builder.append(tieneTarjetaDebito);
		builder.append(", comisionesAnuales=");
		builder.append(comisionesAnuales);
		builder.append("]");
		return builder.toString();
	}
	
	//metodo equals
	@Override
	public int hashCode() {
		return Objects.hash(numeroCuenta);
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		CuentaBancarias other = (CuentaBancarias) obj;
		return Objects.equals(numeroCuenta, other.numeroCuenta);
	}
	
	/**
	 * metodo que genera numero de cuenta
	 * @return
	 */
	public String generaNumCuenta() {
		StringBuilder id = new StringBuilder("ES");
		
		for(int i=0; i<20;i++) {
			id.append((char) (Math.random()*(48-57)+57));
		}
		return id.toString();
	}
	
	/**
	 * metodo suma al saldo la cantidad determinada 
	 * @param cant
	 */
	public void ingresar(double cant) {
		if (cant>0) {
			this.saldo+=cant;
		}
	}
	
	/**
	 * metodo resta al saldo la cantidad determaina
	 * @param cant
	 */
	public void retirar(double cant) {
		if (cant>0 && this.saldo>0 && cant<=this.saldo) {
			this.saldo-=cant;
		}
	}
}
