package Herencia2;

import java.util.ArrayList;

public class Banco {

	protected ArrayList<CuentaBancarias>cuentaBank;

	public Banco() {
		this.cuentaBank = new ArrayList<>();
	}
	
	public void addCuenta(CuentaBancarias cc) {
		cuentaBank.add(cc);
	}
	public CuentaBancarias getCuenta(String numeroCuent) {
		for (CuentaBancarias cuBa : cuentaBank) {
			if (cuBa.getNumeroCuenta().equals(numeroCuent)) {
				return cuBa;
			}
		}
		return null;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Banco [cuentaBank=");
		builder.append(cuentaBank);
		builder.append("]");
		return builder.toString();
	}
	
	
	
}
