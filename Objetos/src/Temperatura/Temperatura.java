/**
 * 
 */
package Temperatura;

/**
 * @author darge
 *
 */
public class Temperatura {

	private double farenheit;
	private double celsius;
	private double f;
	private double c;
	
	/**
	 * @param farenheit
	 * @param celsius
	 */
	public Temperatura(double farenheit, double celsius) {
		this.farenheit = farenheit;
		this.celsius = celsius;
	}

	/**
	 * @return the farenheit
	 */
	public double getFarenheit() {
		return farenheit;
	}

	/**
	 * @param farenheit the farenheit to set
	 */
	public void setFarenheit(double farenheit) {
		this.farenheit = farenheit;
	}

	/**
	 * @return the celsius
	 */
	public double getCelsius() {
		return celsius;
	}

	/**
	 * @param celsius the celsius to set
	 */
	public void setCelsius(double celsius) {
		this.celsius = celsius;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Temperatura [");
		builder.append(farenheit);
		builder.append(" farenheit=");
		builder.append(c);
		builder.append( " celsius -- ");
		builder.append(celsius);
		builder.append(" celsius=");
		builder.append(f);
		builder.append(" farenheit");
		builder.append("]");
		return builder.toString();
	}
	
	public void celsiusToFarenheit() {
		f=1.8*this.celsius+32;
	}
	
	public void farenheitToCelsius() {
		c=(this.farenheit-32)/1.8;
	}
}
