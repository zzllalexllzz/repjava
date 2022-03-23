package PooClases;

import java.util.Objects;

import javax.swing.Spring;

public class Hora {

	//atributo
	private int miliSegundos;
	private int segundos;
	private int minutos;
	private int horas;
	
	//constructores
	public Hora() {
		super();
		this.miliSegundos = miliSegundos;
		this.segundos = segundos;
		this.minutos = minutos;
		this.horas = horas;
	}
	public Hora(int miliSegundos, int segundos, int minutos, int horas) {
		super();
		this.miliSegundos = miliSegundos;
		this.segundos = segundos;
		this.minutos = minutos;
		this.horas = horas;
	}
	public Hora(Hora otro) {
		super();
		this.miliSegundos = otro.miliSegundos;
		this.segundos = otro.segundos;
		this.minutos = otro.minutos;
		this.horas = otro.horas;
	}
	/**
	 * pasamos una hora string en formato 12:50:01 
	 * @param horaComp
	 */
	public Hora(String horaComp) {
		this.segundos = Integer.parseInt(horaComp.substring(6, 8));
		this.minutos = Integer.parseInt(horaComp.substring(3, 5));
		this.horas = Integer.parseInt(horaComp.substring(0, 2));
	}
	
	/**
	 * @return the miliSegundos
	 */
	public int getMiliSegundos() {
		return miliSegundos;
	}
	/**
	 * @param miliSegundos the miliSegundos to set
	 */
	public void setMiliSegundos(int miliSegundos) {
		this.miliSegundos = miliSegundos;
	}
	/**
	 * @return the segundos
	 */
	public int getSegundos() {
		return segundos;
	}
	/**
	 * @param segundos the segundos to set
	 */
	public void setSegundos(int segundos) {
		this.segundos = segundos;
	}
	/**
	 * @return the minutos
	 */
	public int getMinutos() {
		return minutos;
	}
	/**
	 * @param minutos the minutos to set
	 */
	public void setMinutos(int minutos) {
		this.minutos = minutos;
	}
	/**
	 * @return the horas
	 */
	public int getHoras() {
		return horas;
	}
	/**
	 * @param horas the horas to set
	 */
	public void setHoras(int horas) {
		this.horas = horas;
	}
	
	//to string
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("[Hora es ");
		builder.append(horas);
		builder.append(":");
		builder.append(minutos);
		builder.append(":");
		builder.append(segundos);
		builder.append("]");
		return builder.toString();
	}
	public boolean horaValida() {
		if (this.horas>=0 && this.horas<=23 && this.minutos>=0 && this.minutos<=59 && segundos>=0 && segundos<=59 && this.miliSegundos>=0 && this.miliSegundos<=999) {
			return true;
		} else {
			return false;
		}
	}
	
	/**
	 * metodo muestra la hora completa con los miliseguntos  integrados
	 */
	public String horaCompleta() {
		StringBuilder builder = new StringBuilder();
		builder.append("[Hora es ");
		builder.append(this.horas);
		builder.append(":");
		builder.append(this.minutos);
		builder.append(":");
		builder.append(this.segundos);
		builder.append(":");
		builder.append(this.miliSegundos);
		builder.append("]");
		return builder.toString();
	}
	
	/**
	 * recorre un segundo a la hora 
	 */
	public void segundoSiguiente() {
		//segundos
		if (this.segundos<59) {
			this.segundos++;
		}else if (this.segundos==59) {
			this.segundos=0;
			//minutos
			if (this.minutos<59) {
				this.minutos++;
			}else if (this.minutos==59) {
					this.minutos=0;
					//horas
					if (this.horas<23) {
						this.horas++;
					}else if (this.horas==23) {
						this.horas=0;
					}
				}
			}
	}
	
	//metodo equals
	@Override
	public int hashCode() {
		return Objects.hash(horas, miliSegundos, minutos, segundos);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Hora other = (Hora) obj;
		return horas == other.horas && miliSegundos == other.miliSegundos && minutos == other.minutos
				&& segundos == other.segundos;
	}
	
	
	
}
