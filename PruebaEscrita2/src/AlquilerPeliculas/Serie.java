package AlquilerPeliculas;

import java.util.ArrayList;

public class Serie extends Multimedia {

	//atributo
	private  ArrayList<Temporada>temporadas;

	//constructor
	public Serie(String titulo, boolean plus, double precio) {
		super(titulo, plus, precio);
		this.temporadas = new ArrayList<>();
	}

	/**
	 * @return the temporadas
	 */
	public ArrayList<Temporada> getTemporadas() {
		return temporadas;
	}

	/**
	 * @param temporadas the temporadas to set
	 */
	public void setTemporadas(ArrayList<Temporada> temporadas) {
		this.temporadas = temporadas;
	}

	/**
	 * metodo to string
	 */
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Serie [temporadas=");
		builder.append(temporadas);
		builder.append(", toString()=");
		builder.append(super.toString());
		builder.append("]");
		return builder.toString();
	}
	
	/**
	 * metodo que devuelve las cantidd de temporadas
	 * @return
	 */
	public int getNumeroTemporadas() {
		return temporadas.size();
	}
	
	/**
	 * metodo que añade una temporada al arraya de temporadas
	 * @param t
	 */
	public void addTemporada(Temporada t) {
		t.setSerie(this);
		temporadas.add(t);
	}
	/**
	 * metodo que alimina un temporada del array de temporda
	 * @param t
	 */
	public void delTemporada(Temporada t) {
		temporadas.remove(t);
	}
	
	
}
