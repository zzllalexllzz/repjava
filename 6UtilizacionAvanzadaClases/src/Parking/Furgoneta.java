 package Parking;

public class Furgoneta extends Vehiculo {

	//atributo
	private float longitud;
	
	//constructor
	public Furgoneta() {
		super();
		this.marca = "";
		this.matricula = "";
		this.longitud = 0;
	}

	public Furgoneta(String matricula, String marca, float longitud) {
		super(matricula, marca);
		this.longitud = longitud;
	}
	
	public Furgoneta(Furgoneta f) {
		this.marca = f.marca;
		this.matricula = f.matricula;
		this.longitud = f.longitud;
	}

	/**
	 * @return the longitud
	 */
	public float getLongitud() {
		return longitud;
	}

	/**
	 * @param longitud the longitud to set
	 */
	public void setLongitud(float longitud) {
		this.longitud = longitud;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Furgoneta [longitud=");
		builder.append(longitud);
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
	
	@Override
	public double descuento() {
		double descuento=0;
		if (this.calcularMinutos()<120)
			descuento+=0.03;
		if (this.calcularMinutos()>3600)
			descuento+=0.2;
		
		if (!(this.fechaEntrada.getDayOfWeek().toString().toLowerCase().equals("saturday")) &&
		   !(this.fechaEntrada.getDayOfWeek().toString().toLowerCase().equals("sunday"))) {
			descuento+=0.1;
		}
		
		return descuento;
	}

	@Override
	public double calcularImporte() {
		return  (Parking.PRECIO_BASE_POR_MINUTO * this.calcularMinutos()) +	(Parking.PRECIO_BASE_POR_METRO * this.longitud) - 
				(this.descuento());
		
	}

}
