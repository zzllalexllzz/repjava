package EjerciciosPoo;
	//FINANZAS 
public class Ejercicio5 {

	//atributos
	private double dolarEuro;
	
	//constrctores
	public Ejercicio5() {
		super();
		this.dolarEuro = 1.36;
	
	}
	
	public Ejercicio5(double cambio) {
		super();
		this.dolarEuro = cambio;
	}

	//getter y setter
	public double getDolarEuro() {
		return dolarEuro;
	}

	public void setDolarEuro(double dolarEuro) {
		this.dolarEuro = dolarEuro;
	}
	
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Ejercicio5 [dolarEuro=");
		builder.append(dolarEuro);
		builder.append("]");
		return builder.toString();
	}
	
	//metodos
	public double dolaresToEuro(double dolar) {
		return dolar*this.dolarEuro;
	}
	

	public double euroToDolar(double euro) {
		return euro/this.dolarEuro;
	}
	
}
