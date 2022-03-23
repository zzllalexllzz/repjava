package Parking;

public class Coche extends Vehiculo {

	enum Combustible {
		ELECTRICO, HIDROGENO, HIBRIDO, HIBRIDOENCHUFABLE, GASOLINA, DIESEL
	}
	private Combustible combu;
			
	//constructor
	public Coche() {
		this.matricula ="sin";
		this.marca = "";
		this.combu = Combustible.DIESEL;
	}

	public Coche(String matricula, String marca, Combustible comb) {
		super(matricula, marca);
		this.combu = comb;
	}

	public Coche(Coche c) {
		super(c.matricula, c.marca);
		this.combu = c.combu;
	}
	
	
	/**
	 * @return the comb
	 */
	public Combustible getComb() {
		return combu;
	}

	/**
	 * @param comb the comb to set
	 */
	public void setComb(Combustible comb) {
		this.combu = comb;
	}


	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Coche [comb=");
		builder.append(combu);
		builder.append(", matricula=");
		builder.append(matricula);
		builder.append(", marca=");
		builder.append(marca);
		builder.append(", fechaEntrada=");
		builder.append(fechaEntrada);
		builder.append(", plaza=");
		builder.append(plaza);
		builder.append("]");
		return builder.toString();
	}
	
	/**
	 * metodo que devuelve el descuento
	 */
	@Override
	public double descuento() {
		//descuento minutos
		double descuento=0;
		if (this.calcularMinutos()<120)
			descuento+=0.05;
		if (this.calcularMinutos()>3600)
			descuento+=0.3;
		//descuento de dia sabado o domingo
		if ((this.fechaEntrada.getDayOfWeek().toString().toLowerCase().equals("saturday")) ||
		   (this.fechaEntrada.getDayOfWeek().toString().toLowerCase().equals("sunday"))) {
			descuento+=0.1;
		}
		//descuento segun el conbustible
		if ((this.combu == Combustible.GASOLINA) || (this.combu == Combustible.DIESEL)) {
			descuento-=0.1;
		} else {
			descuento+=0.1;
		}
		
		return descuento;
	}

	@Override
	public double calcularImporte() {
		return  (Parking.PRECIO_BASE_POR_MINUTO*this.calcularMinutos()) - (this.descuento());
	}

}
