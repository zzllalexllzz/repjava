/**
 * 
 */
package IntroduccionProgramacion;

/**
 * @author darge
 *
 */
public class Ejercicio13 {

	/**
	 * @param args
	 * Realiza un programa en Java con una variable entera
	 *  t la cual contiene un tiempo en segundos y queremos
	 *   conocer este tiempo, pero expresado en horas,
	 *    minutos y segundos.
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int t=3600;
		int hora;
		int minutos;
		int segundos;
		hora=(int) Math.floor(t/3600);
		minutos=(int)Math.floor(t%3600/60);
		segundos=(t%3600%60);
		System.out.println("la hora es "+hora+":"+minutos+":"+segundos);
	}

}
