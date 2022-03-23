package EjerciciosPoo;
	//COCHE
public class Ejercicio2 {

	//atributo
	private int velocidad;

	//constructor
	public Ejercicio2() {
		super();
		this.velocidad = 0;
	}
	//getter y setter
	public int getVelocidad() {
		return velocidad;
	}
	//to string
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Ejercicio2 [velocidad=");
		builder.append(velocidad);
		builder.append("]");
		return builder.toString();
	}
	
	public void acelera(int mas) {
		velocidad+=mas;
	}
	public void frenar(int menos) {
		velocidad-=menos;
	}
	
	
}
