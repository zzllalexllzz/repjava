package Jugador;

public class Jugador {

	//propiedades
	private int vida;//1 al 100
	private int mana;//1 al 100
	private int damageFisico;
	private int damageMagico;
	private String nombre;
	private String clase; 
	
	//contructures
	public Jugador() {
		this.vida = 100;
		this.mana = 100;
		this.damageFisico = 2;
		this.damageMagico = 15;
		this.nombre = "Joselito";
		this.clase = "Mago";
	}

	public Jugador(int vida, int mana, int damageFisico, int damageMagico, String nombre, String clase) {
		this.vida = vida;
		this.mana = mana;
		this.damageFisico = damageFisico;
		this.damageMagico = damageMagico;
		this.nombre = nombre;
		this.clase = clase;
	}

	//Getters y Setters
	public int getVida() {
		return vida;
	}

	public void setVida(int vida) {
		this.vida = vida;
	}

	public int getMana() {
		return mana;
	}

	public void setMana(int mana) {
		this.mana = mana;
	}

	public int getDamageFisico() {
		return damageFisico;
	}

	public void setDamageFisico(int damageFisico) {
		this.damageFisico = damageFisico;
	}

	public int getDamageMagico() {
		return damageMagico;
	}

	public void setDamageMagico(int damageMagico) {
		this.damageMagico = damageMagico;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getClase() {
		return clase;
	}

	public void setClase(String clase) {
		this.clase = clase;
	}
//To String
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Jugador [vida=");
		builder.append(vida);
		builder.append(", mana=");
		builder.append(mana);
		builder.append(", damageFisico=");
		builder.append(damageFisico);
		builder.append(", damageMagico=");
		builder.append(damageMagico);
		builder.append(", nombre=");
		builder.append(nombre);
		builder.append(", clase=");
		builder.append(clase);
		builder.append("]");
		return builder.toString();
	}
	
	public void golpear(String tipo, Jugador rival) {
		if (tipo.equals("Magico")) {
			if (this.mana>=5) {
				rival.setVida(rival.getVida()-this.damageMagico);
				this.mana-=5; 
			}
		} else if (tipo.equals("Fisico")) {
			rival.setVida(rival.getVida()-this.damageFisico);
		}
		if (rival.getVida() <= 0) {
			System.out.println(this.nombre+" Win");
		}
		
	}
	
	
	
	
}
