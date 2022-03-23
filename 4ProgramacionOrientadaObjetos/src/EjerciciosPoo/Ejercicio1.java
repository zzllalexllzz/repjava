package EjerciciosPoo;
	//TEMPERATURA 
public class Ejercicio1 {

	
	/**
	 * metrodo conversor de celcius a farenheit
	 * @param celsius
	 * @return
	 */
	public static double celciusToFarenheit(double celsius) {
		return (1.8)*celsius+32;
	}
	/**
	 * metodo conversor de farenheit a celcius
	 * @param farenheit
	 * @return
	 */
	public static double farenheitToCelsius(double farenheit) {
		return (farenheit-32)/1.8;
	}
}
