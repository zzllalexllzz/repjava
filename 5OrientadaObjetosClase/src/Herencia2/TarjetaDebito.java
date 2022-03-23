package Herencia2;

import java.time.LocalDate;

public class TarjetaDebito extends Tarjeta {

	public TarjetaDebito(String nombre, LocalDate fechaVenci, double monto) {
		super(nombre, fechaVenci, monto);
		// TODO Auto-generated constructor stub
	}
	
	public TarjetaDebito() {
		super();
		// TODO Auto-generated constructor stub
	}

	public void comprar(double cant) {
		if (cant>0 && this.monto>0 && cant<=this.monto) {
			this.monto-=cant;
		}
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("TarjetaDebito [toString()=");
		builder.append(super.toString());
		builder.append("]");
		return builder.toString();
	}
	
	
}
