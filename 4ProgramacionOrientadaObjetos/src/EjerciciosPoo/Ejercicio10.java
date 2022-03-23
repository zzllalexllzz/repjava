package EjerciciosPoo;
	//CONSUMO
public class Ejercicio10 {

	//atributos
	private double kms;
	private double litros;
	private double vmed;
	private double pgas;
	
	//constructor
	public Ejercicio10(double kms, double litos, double vmed, double pgas) {
		super();
		this.kms = kms;
		this.litros = litos;
		this.vmed = vmed;
		this.pgas = pgas;
	}
	
	//setters
	public void setKms(double kms) {
		this.kms = kms;
	}
	public void setLitos(double litros) {
		this.litros = litros;
	}
	public void setVmed(double vmed) {
		this.vmed = vmed;
	}
	public void setPgas(double pgas) {
		this.pgas = pgas;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Ejercicio10 [kms=");
		builder.append(kms);
		builder.append(", litros=");
		builder.append(litros);
		builder.append(", vmed=");
		builder.append(vmed);
		builder.append(", pgas=");
		builder.append(pgas);
		builder.append("]");
		return builder.toString();
	}
	
	//metodos
		public double getTiempo() {
			double tiempo = this.vmed/kms;
			return tiempo;
			
		}
		public double consumoMedio() {
			double consMedio = (this.litros*100)/kms;
			return consMedio;
		}
		public double consumoEuros() {
			double consEuros = ((this.litros*100)/kms)*this.pgas;
			return consEuros;
		}
	
}
