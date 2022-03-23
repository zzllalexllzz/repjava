package Herencia2;

import java.time.LocalDate;

public class TarjetaCredito extends Tarjeta {

	public TarjetaCredito(String nombre, LocalDate fechaVenci, double monto) {
		super(nombre, fechaVenci, monto);
		// TODO Auto-generated constructor stub
	}
	public TarjetaCredito() {
		super();
		// TODO Auto-generated constructor stub
	}

	
	public void comprar(double cant) {
			this.monto-=cant;
	}
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("TarjetaCredito [toString()=");
		builder.append(super.toString());
		builder.append("]");
		return builder.toString();
	}
	
	
}
