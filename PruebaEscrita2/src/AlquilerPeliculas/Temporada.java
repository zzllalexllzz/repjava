package AlquilerPeliculas;

import java.util.ArrayList;

public class Temporada {
	
	//atributo
	private int numero;
	private ArrayList<Episodio>episodios;
	private Serie serie;
	
	//constructors
	public Temporada() {
		super();
		this.numero = 0;
		this.episodios = new ArrayList<>();
		this.serie = null;
	}
	
	public Temporada(int numero) {
		super();
		this.numero = numero;
		this.episodios = new ArrayList<>();
	}
	/**
	 * @return the numero
	 */
	public int getNumero() {
		return numero;
	}
	/**
	 * @param numero the numero to set
	 */
	public void setNumero(int numero) {
		this.numero = numero;
	}
	/**
	 * @return the episodios
	 */
	public ArrayList<Episodio> getEpisodios() {
		return episodios;
	}
	/**
	 * @param episodios the episodios to set
	 */
	public void setEpisodios(ArrayList<Episodio> episodios) {
		this.episodios = episodios;
	}
	/**
	 * @return the serie
	 */
	public Serie getSerie() {
		return serie;
	}
	/**
	 * @param serie the serie to set
	 */
	public void setSerie(Serie serie) {
		this.serie = serie;
	}
	
	/**
	 * metodo que devuelve el numero de episodio
	 * @return
	 */
	public int getNumeroEpisodios() {
		return episodios.size();
	}
	/**
	 * metodo que añade un episodioa al arrayd e peisodios
	 * @param e
	 */
	public void addEpisodio(Episodio e) {
		e.setTemporadas(this);
		episodios.add(e);
	}
	
	/**
	 * metodo que elimina un episodio del array de episodios
	 */
	public void delEpisodio(Episodio e) {
		episodios.remove(e);
	}
	
}
