package Arma;

public class Arma {
	
	//propiedades
	private String nombre;
	private int damage;
	private String tipo;
	
	//constructores
	public Arma() {
		this.nombre ="espada";
		this.damage = 5;
		this.tipo = "fisico";
	}

	public Arma(String nombre, int damage, String tipo) {
		this.nombre = nombre;
		this.damage = damage;
		this.tipo = tipo;
	}
	
	//Gettes y Setters
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getDamage() {
		return damage;
	}

	public void setDamage(int damage) {
		this.damage = damage;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	
	//to string
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Arma [nombre=");
		builder.append(nombre);
		builder.append(", damage=");
		builder.append(damage);
		builder.append(", tipo=");
		builder.append(tipo);
		builder.append("]");
		return builder.toString();
	}
	
	
	
}
