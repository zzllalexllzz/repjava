/**
 * 
 */
package IntroduccionProgramacion;

/**
 * @author darge
 *
 */
public class Ejercicio15 {

	/**
	 * @param args
	 * Escriba un programa que escriba en la pantalla cuánto 
	 * le dará su banco después de seis meses si pone 2000€
	 * en una cuenta a plazo fijo al 2, 75% anual. Recuerde
	 * que al pagarle los intereses el banco le retendrá
	 * el 18% para hacienda.
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double intereses, hacienda;
		intereses=((2000)*(2.75/100)/2);
		hacienda=intereses*18/100;
		System.out.println((intereses-hacienda)+"€");
	}

}
