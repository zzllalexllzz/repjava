package PooClases;

import java.util.Objects;

public class Direccion {

	private String nombreVia;
	private int numero;
	private String poblacion;
	private String provincia;
	private int codigoPostal;
	private String pais;
	private double latitud;
	private double longitud;
	
	//constructores
	public Direccion() {
		super();
		this.nombreVia = nombreVia;
		this.numero = numero;
		this.poblacion = poblacion;
		this.provincia = provincia;
		this.codigoPostal = codigoPostal;
		this.pais = pais;
		this.latitud = latitud;
		this.longitud = longitud;
	}

	public Direccion(String nombreVia, int numero, String poblacion, String provincia, int codigoPostal, String pais,
			double latitud, double longitud) {
		super();
		this.nombreVia = nombreVia;
		this.numero = numero;
		this.poblacion = poblacion;
		this.provincia = provincia;
		this.codigoPostal = codigoPostal;
		this.pais = pais;
		this.latitud = latitud;
		this.longitud = longitud;
	}

	public Direccion(Direccion otro) {
		super();
		this.nombreVia = otro.nombreVia;
		this.numero = otro.numero;
		this.poblacion = otro.poblacion;
		this.provincia = otro.provincia;
		this.codigoPostal = otro.codigoPostal;
		this.pais = otro.pais;
		this.latitud = otro.latitud;
		this.longitud = otro.longitud;
	}

	//SETTERS Y GETTERS
	/**
	 * @return the nombreVia
	 */
	public String getNombreVia() {
		return nombreVia;
	}

	/**
	 * @param nombreVia the nombreVia to set
	 */
	public void setNombreVia(String nombreVia) {
		this.nombreVia = nombreVia;
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
	 * @return the poblacion
	 */
	public String getPoblacion() {
		return poblacion;
	}

	/**
	 * @param poblacion the poblacion to set
	 */
	public void setPoblacion(String poblacion) {
		this.poblacion = poblacion;
	}

	/**
	 * @return the provincia
	 */
	public String getProvincia() {
		return provincia;
	}

	/**
	 * @param provincia the provincia to set
	 */
	public void setProvincia(String provincia) {
		this.provincia = provincia;
	}

	/**
	 * @return the codigoPostal
	 */
	public int getCodigoPostal() {
		return codigoPostal;
	}

	/**
	 * @param codigoPostal the codigoPostal to set
	 */
	public void setCodigoPostal(int codigoPostal) {
		this.codigoPostal = codigoPostal;
	}

	/**
	 * @return the pais
	 */
	public String getPais() {
		return pais;
	}

	/**
	 * @param pais the pais to set
	 */
	public void setPais(String pais) {
		this.pais = pais;
	}

	/**
	 * @return the latitud
	 */
	public double getLatitud() {
		return latitud;
	}

	/**
	 * @param latitud the latitud to set
	 */
	public void setLatitud(double latitud) {
		this.latitud = latitud;
	}

	/**
	 * @return the longitud
	 */
	public double getLongitud() {
		return longitud;
	}

	/**
	 * @param longitud the longitud to set
	 */
	public void setLongitud(double longitud) {
		this.longitud = longitud;
	}

	//METODO TO STRING
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Direccion [nombreVia=");
		builder.append(nombreVia);
		builder.append(", numero=");
		builder.append(numero);
		builder.append(", poblacion=");
		builder.append(poblacion);
		builder.append(", provincia=");
		builder.append(provincia);
		builder.append(", codigoPostal=");
		builder.append(codigoPostal);
		builder.append(", pais=");
		builder.append(pais);
		builder.append(", latitud=");
		builder.append(latitud);
		builder.append(", longitud=");
		builder.append(longitud);
		builder.append("]");
		return builder.toString();
	}
	
	//METODO EQUALS
	@Override
	public int hashCode() {
		return Objects.hash(latitud, longitud);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Direccion other = (Direccion) obj;
		return Double.doubleToLongBits(latitud) == Double.doubleToLongBits(other.latitud)
				&& Double.doubleToLongBits(longitud) == Double.doubleToLongBits(other.longitud);
	}
	
	//METODOS
	public double distanciaKm(Direccion otra) {
		double lat1 = Math.toRadians(this.latitud);
        double lat2 = Math.toRadians(otra.latitud);
        double long1 = Math.toRadians(this.longitud);
        double long2 = Math.toRadians(otra.longitud);
        double r=6378;
        double lat= lat2 - lat1;
        double longg= long2-long1;
        double a= (Math.pow(Math.sin(lat/2), 2)) + Math.cos(lat1) * Math.cos(lat2) * Math.pow(Math.sin(longg/2),2);
        double c = 2 * (Math.atan2(Math.sqrt(a), Math.sqrt(1-a)));
        double distancia = r * c;
            return distancia;
	}
	
	
}
