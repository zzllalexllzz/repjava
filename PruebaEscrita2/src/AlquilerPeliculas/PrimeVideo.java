package AlquilerPeliculas;

import java.util.ArrayList;

public class PrimeVideo {

	//atributos
	private ArrayList<Multimedia>catalogo;
	private ArrayList<Cliente>suscriptores;
	private double ganancias;
	
	/**
	 * constructores
	 */
	public PrimeVideo() {
		super();
		this.catalogo = new ArrayList<>();
		this.suscriptores = new ArrayList<>();
		this.ganancias = 0;
	}
	
	//metodo que añade un cliente  al array de suscriptores
	public void addSuscriptor(Cliente c) {
		suscriptores.add(c);
	}
	
	//metodo que borra un cliente  al array de suscriptores
	public void delSuscriptor(Cliente c) {
		suscriptores.remove(c);
	}
	//metodo que añade una multimedia  al array de catalogos
	public void addMultimedia(Multimedia m) {
		catalogo.add(m);
	}
	//metodo que borrar una multimedia  al array de catalogos
	public void delMultimedia(Multimedia m) {
		catalogo.remove(m);
	}
	//metodo ver que suma el precio de la multimedia y lo inplemneta a las ganancias
	public void ver(Multimedia m, Cliente c) {
		if (c.esPro()==false) {
			this.ganancias+=m.getPrecio();
		}
	}
	//metodo que devuelve las ganancias *12
	public double getGanancias() {
		
		return ganancias*12;
		
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("PrimeVideo [catalogo=");
		builder.append(catalogo);
		builder.append(", suscriptores=");
		builder.append(suscriptores);
		builder.append(", ganancias=");
		builder.append(ganancias);
		builder.append("]");
		return builder.toString();
	}

	/**
	 * @return the catalogo
	 */
	public ArrayList<Multimedia> getCatalogo() {
		return catalogo;
	}

	/**
	 * @return the suscriptores
	 */
	public ArrayList<Cliente> getSuscriptores() {
		return suscriptores;
	}

	/**
	 * @param ganancias the ganancias to set
	 */
	public void setGanancias(double ganancias) {
		this.ganancias = ganancias;
	}
	
	
	
}
